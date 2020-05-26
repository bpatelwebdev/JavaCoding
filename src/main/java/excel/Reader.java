package excel;


import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.eventusermodel.XSSFReader;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        String excelFilePath = "C:\\Users\\bhavi\\Documents\\temp.xlsx";
        ExcelReader reader = new ExcelReader(excelFilePath);
        System.out.println(reader.getCellStringData("Sheet1",1,1));
        /*int rows = reader.getRowCount("Sheet1");
        for(int i =0;i<rows;i++){
            int cols = reader.getColumnCount("Sheet1",i);
            for(int j=0;j<cols;j++){
                System.out.print(reader.getCellStringData("Sheet1",i,j) + "\t");
            }
            System.out.println();
        }*/
        reader.close();

    }

    public static void oldMain(String[] args) throws IOException {
        String excelFilePath = "C:\\Users\\bhavi\\Documents\\temp.xlsx";
        FileInputStream finp = new FileInputStream(excelFilePath);
        Workbook workbook = new XSSFWorkbook(finp);
        Sheet mySheet = workbook.getSheet("Sheet1");
        int rows  = mySheet.getLastRowNum();
        for(int i=0;i<rows;i++) {
            Row row = mySheet.getRow(i);
            int lastCellNum = row.getLastCellNum();
            for(int j=0;j<lastCellNum;j++) {
                Cell cell = row.getCell(j);
                String strCell;
                if(cell==null){
                    Cell cell1 = row.createCell(j);
                    cell1.setCellValue("[Empty Cell]");
                    strCell="[No Value]";
                }else{
                    if(cell.getCellType() == CellType.STRING) {
                        strCell = cell.getStringCellValue();
                    }else{

                        strCell = cell.getNumericCellValue()+"";
                    }
                }
                System.out.print(strCell + "\t");
            }
            System.out.println();
        }
        finp.close();
        FileOutputStream fout = new FileOutputStream(excelFilePath);
        workbook.write(fout);
        workbook.close();
        fout.close();


    }
}
