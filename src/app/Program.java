package app;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;


public class Program {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);

       Client cli = new Client("Maria do Carmo", "maria@gmail.com", sdf.parse("28/06/1968"));
       System.out.println(cli);

        sc.close();
    }
}
