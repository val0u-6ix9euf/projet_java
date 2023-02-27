package gestion.java;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class clavier {

    public static int toInt(String s) {
        int result = 0;
        try {
            result = Integer.valueOf(s).intValue();
        } catch (NumberFormatException e) {
            System.err.println("Erreur de format: " + e.getMessage());
        }
        return result;
    }

    public static double toDouble(String s) {
        double result = 0;
        try {
            result = Double.valueOf(s).doubleValue();
        } catch (NumberFormatException e) {
            System.err.println("Erreur de format: " + e.getMessage());
        }
        return result;
    }

    public static String lireString() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String result;
        try {
            result = br.readLine();
        } catch (IOException e) {
            System.err.println("Erreur de lecture: " + e.getMessage());
            result = "";
        }
        return result;
    }

    public static int lireInt() {
        return toInt(lireString());
    }

    public static double lireDouble() {
        return toDouble(lireString());
    }

    public static boolean lireBoolean() {
        return Boolean.valueOf(lireString()).booleanValue();
    }

    public static char lireChar() {
        char result = '\u0000';
        try {
            result = lireString().charAt(0);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Erreur de lecture: aucun caractère entré");
        }
        return result;
    }

    public static Date lireDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String dateString = lireString();
        Date date = null;
        try {
            date = sdf.parse(dateString);
        } catch (ParseException e) {
            System.err.println("Erreur de format: " + e.getMessage());
        }
        return date;
    }
}
