package gestionefile;

import java.io.Console;
import java.util.Arrays;
import java.io.IOException;
import java.util.Scanner;


/**
 *
 * @author Moroni Marco
 * 
 */
public class GestioneFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //1)LETTURA
        Lettore lettore = new Lettore("user.json");
        lettore.start();
        //2)ELABORAZIONE
        Scanner input = new Scanner (Sistem.in);
        System.out.println("Enter username");
        String username = input.nextLine();
        System.out.println("Enter password:");
        String password = input.nextLine();
        
        //3) SCRITTURA
        Scrittore scrittore = new Scrittore("output.csv",username , password);
        Scrittore copia = new Scrittore("copia.csv", username, password);
    
        Thread threadScrittore = new Thread(scrittore);
        threadScrittore.start();
        
        Thread threadScrittore = new Thread(scrittore);
        threadCopia.start();
    }
    
}
