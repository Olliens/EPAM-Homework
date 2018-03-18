package main;

import java.text.SimpleDateFormat;
import java.util.Date;


public class CrazyLogger {

    private StringBuilder log;
    private SimpleDateFormat dateFormater;

    CrazyLogger() {
        this.dateFormater = new SimpleDateFormat("dd-mm-YYYY:HH-mm");
        this.log = new StringBuilder();
    }

    public void putEvent(String event) {
        log.append(dateFormater.format(new Date()) + " - " + event + "\n");
        //System.out.println(log);
    }

    public void view() {
        for (String partOfLog : log.toString().split("\n")) {
            System.out.println(partOfLog);
        }
    }

    public void find(String str) {

         for(String s: log.toString().split("\n")){

            if (s.contains(str)){
                System.out.println(s);
            }

        }


    }

}
