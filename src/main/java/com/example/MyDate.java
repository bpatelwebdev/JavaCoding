package com.example;

import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalField;
import java.util.*;
import java.util.List;

public class MyDate {
    public static void main(String[] args) throws ParseException {
        Date dt1 = new Date();
        for(long i=0;i<999999999;i++){

        }
        // list down all dates which are coming on second sunday of month in 2021

        String weddingDate = "01 Jan 2020";
        SimpleDateFormat dfinput = new SimpleDateFormat("dd MMM yyyy");
        SimpleDateFormat dfoutput = new SimpleDateFormat("E");
        Date eventDate = dfinput.parse(weddingDate);
        String eventDay = dfoutput.format(eventDate);
        System.out.println(eventDay);
        Calendar marriage = Calendar.getInstance();
        marriage.setTime(eventDate);
        marriage.add(Calendar.DATE,4);
        Date marriageDay = marriage.getTime();
        System.out.println("Marriage Day : ");
        System.out.println(marriageDay);
        String marriageYear = marriageDay.toString().substring(24);

        System.out.println(marriageYear);
        marriage.add(Calendar.YEAR,1);
        Date marriageEndDay = marriage.getTime();
        String marriageEndYear = marriageEndDay.toString().substring(24);
        System.out.println("List of sundays: ");
        for (int i=0;i<=52;i++){
            if (!marriageYear.equals(marriageEndYear)){

                Calendar sunday = Calendar.getInstance();
                sunday.setTime(marriageDay);
                sunday.add(Calendar.DATE,7);
                marriageDay = sunday.getTime();
                System.out.println(marriageDay);

            }
        }



        String listSunday = marriageDay.toString();
        System.out.println(listSunday.substring(0,10));

        Date dt2 = new Date();
        System.out.println(dt1);

        SimpleDateFormat df = new SimpleDateFormat("dd MM yyyy");
        SimpleDateFormat df2 = new SimpleDateFormat("yyyy MMM");
        String strDate = "09 03 2015";
        Date newDate = df.parse(strDate);  ///// string to date
        String strMonth = df2.format(newDate); ///// date to string
        System.out.println(strMonth);

        Calendar c1 = Calendar.getInstance();
        c1.setTime(newDate);
        c1.add(Calendar.DATE,5);
        c1.add(Calendar.HOUR,-93);
        c1.set(Calendar.YEAR,1997);

        Date newCalculatedDate = c1.getTime();
        System.out.println(df2.format(newCalculatedDate));

// write program for print start and end date

        String strdate = "March 2019";//first and last date of the month
        SimpleDateFormat df5 = new SimpleDateFormat("MMMM yyyy");
        SimpleDateFormat wf = new SimpleDateFormat("E dd MMM yyyy");
        Date startDate = df5.parse(strdate);
        String monthStartDate = wf.format(startDate);
        System.out.println(monthStartDate);

        Calendar c5 = Calendar.getInstance();
       // GregorianCalendar cal = new GregorianCalendar();

        c5.setTime(startDate);
        c5.add(Calendar.MONTH,1);
        c5.add(Calendar.DATE,-1);
        Date endDate = c5.getTime();
        System.out.println(endDate);


        System.out.println("===========================");
        for (Date dt : getAllSecondSundaysOfMonthFromYear(2022)) {
            System.out.println(dt);
        }

    }


    public static List<Date> getAllSecondSundaysOfMonthFromYear(int year) throws ParseException {
        List<Date> returnDates = new ArrayList<>();
        SimpleDateFormat scannerFmt = new SimpleDateFormat("dd M yyyy");
        SimpleDateFormat weekFmt = new SimpleDateFormat("E");
        Calendar cal = Calendar.getInstance();
        for(int i=1;i<=12;i++){
            Date stMonth = scannerFmt.parse("01 "+i+ " "+year);
            cal.setTime(stMonth);
           // int dayNo = cal.get(Calendar.DAY_OF_WEEK);
           // System.out.println(dayNo + stMonth.toString());
            int days =0;
            String week = weekFmt.format(stMonth);
           // days = dayNo+1;
            switch (week.toLowerCase()){
                case "mon":
                    days = 13;
                    break;
                case "tue":
                    days = 12;
                    break;
                case "wed":
                    days = 11;
                    break;
                case "thu":
                    days = 10;
                    break;
                case "fri":
                    days = 9;
                    break;
                case "sat":
                    days = 8;
                    break;
                case "sun":
                    days = 7;
                    break;
            }

            cal.add(Calendar.DATE,days);
           // System.out.println(days+ stMonth.toString());
            returnDates.add(cal.getTime());
        }
        return returnDates;
    }
}
