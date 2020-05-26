package excel;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
/**********************************
 * Created by Kirtesh Wani on 04-03-2015.
 * for ExcelBasedFramework
 ***********************************/
public class ExcelReader {
    private FileInputStream inputStream;
    private Workbook workbook;
    private final String excelfilepath;


    public ExcelReader(String excelFilePath) throws IOException {
        inputStream = new FileInputStream(excelFilePath);
        workbook = WorkbookFactory.create(inputStream);
        excelfilepath = excelFilePath;
    }

    public ExcelReader(String excelFilePath,String password) throws IOException {
        inputStream = new FileInputStream(new File(excelFilePath));
        workbook = WorkbookFactory.create(inputStream,password);
        excelfilepath = excelFilePath;
    }

    public static void createExcelFile(String fileName,String sheetName){
        Workbook workbook;
        if(fileName.endsWith(".xlsx")) {
            workbook = new XSSFWorkbook();
        }else{
            workbook = new HSSFWorkbook();
        }
        workbook.createSheet(sheetName);
        try (FileOutputStream outputStream = new FileOutputStream(fileName)) {
            workbook.write(outputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void close() throws IOException {
        inputStream.close();
        workbook = null;
    }

    public String getCellStringData(String SheetName,int RowNum,int ColNum){
        try{
            Sheet sheet = workbook.getSheet(SheetName);
            Cell cell = sheet.getRow(RowNum).getCell(ColNum);
            switch(sheet.getRow(RowNum).getCell(ColNum).getCellType()){
                case STRING:
                    return cell.getRichStringCellValue().getString();
                case NUMERIC:
                    if (DateUtil.isCellDateFormatted(cell)) {
                        return cell.getDateCellValue().toString();
                    } else {
                        return Double.toString(cell.getNumericCellValue());
                    }
                case BOOLEAN:
                    return Boolean.toString(cell.getBooleanCellValue());
                case FORMULA:
                    return cell.getCellFormula();
                case BLANK:
                    return "";
                default:
                    return cell.getStringCellValue();
            }
        }
        catch(Exception e){
            return "";
        }
    }

    public void setCellStringValue(String value,String SheetName,int RowNum,int ColNum) throws IOException {
        Sheet sheet = workbook.getSheet(SheetName);
        if(sheet==null){
            createSheet(SheetName);
        }
        Row row = sheet.getRow(RowNum);
        if(row == null){
            row = sheet.createRow(RowNum);
        }
        Cell cell = row.getCell(ColNum);
        if(cell == null){
            cell = row.createCell(ColNum);
        }
        cell.setCellValue(value);

    }

    public void saveWorkBook() throws IOException {
        inputStream.close();
        FileOutputStream outFile = new FileOutputStream(excelfilepath);
        workbook.write(outFile);
        outFile.close();
        ExcelReaderInIt();
    }


    public int getRowCount(String SheetName){
        Sheet sheet;
        try{
            sheet = workbook.getSheet(SheetName);
            return sheet.getPhysicalNumberOfRows();
        }finally{
            sheet=null;
        }
    }
    public int getColumnCount(String SheetName,int RowNum){
        Sheet sheet;
        try{
            sheet = workbook.getSheet(SheetName);
            return sheet.getRow(RowNum).getPhysicalNumberOfCells();
        }finally{
            sheet=null;
        }
    }
    public boolean createSheet(String SheetName){
        try{
            FileOutputStream output = new FileOutputStream(excelfilepath);
            workbook.createSheet(SheetName);
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    public boolean deleteSheet(String SheetName){
        try{
            FileOutputStream output = new FileOutputStream(excelfilepath);
            workbook.removeSheetAt(workbook.getSheetIndex(SheetName));
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    private void ExcelReaderInIt() throws FileNotFoundException, IOException {
        inputStream = new FileInputStream(new File(excelfilepath));
        workbook = new XSSFWorkbook(inputStream);
    }
}