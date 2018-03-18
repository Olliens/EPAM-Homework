package main;

import main.CrazyLogger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] argv) throws IOException {

        CrazyLogger log = new CrazyLogger();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String c = null;
        while (!"exit".equals(c)) {
            c = reader.readLine();
            log.putEvent(c);
        }
        log.view();
        System.out.println ("Найденные строки");
        log.find("happend");
    }
}
