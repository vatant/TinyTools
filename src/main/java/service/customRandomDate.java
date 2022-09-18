package service;

import java.util.GregorianCalendar;

public class customRandomDate {
        public String getrandomDate(){
            GregorianCalendar gc = new GregorianCalendar();
            int year = randBetween(1980, 2021);
            gc.set(gc.YEAR, year);
            int dayOfYear = randBetween(1, gc.getActualMaximum(gc.DAY_OF_YEAR));
            gc.set(gc.DAY_OF_YEAR, dayOfYear);
            String date = gc.get(gc.YEAR) +"/" + (gc.get(gc.MONTH) + 1) +"/" + gc.get(gc.DAY_OF_MONTH);
            return date;
        }
        public static int randBetween(int start, int end) {
            return start + (int)Math.round(Math.random() * (end - start));
        }
}
