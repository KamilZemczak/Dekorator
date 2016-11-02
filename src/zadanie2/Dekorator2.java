package zadanie2;
 
import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;
 
public class Dekorator2 {
 
    public static void main(String[] args) {
        try{
            DataInputStream fstream = new DataInputStream(new FileInputStream("text.txt"));
           
            int character;
            int numberOfWords = 1;
            while ((character = fstream.read()) != -1) {
            if ( (char)character == '\n' || (char)character == ' '){
            numberOfWords++;
            }
                       
            }
            fstream = new DataInputStream(new FileInputStream("text.txt"));
            if ((character=fstream.read()) != -1) numberOfWords++;  
           
            System.out.println(numberOfWords);
            fstream.close();
        } catch(FileNotFoundException e){
            System.out.println("Niestety, nie znaleziono żądanego pliku.");
        } catch(IOException e){
            System.out.println("Błąd wejścia - wyjścia.");
        }
    }
   
}

/*

Drugi sposób (nie do sprawdzenia):

package zadanie2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Dekorator2 {
    public static void main(String[] args) {
       
    int numberOfRows = 0;
    int numberOfWords = 0;
    
        FileReader fr = null; 
        String line = "";
        
        try {
            fr = new FileReader("text.txt");
            BufferedReader bfr = new BufferedReader(fr);
            
            while((line = bfr.readLine()) != null) {
                for(int i=0; i < line.length(); i++ ) {
                    char znak1 = line.charAt(i);
                    if(!(znak1 == ' ' || znak1 == '\n')) {
                    if((i+1) < line.length()) {
                        char znak2 = line.charAt(i+1);
                        if(!(znak2 == ' ' || znak2 == '\n')) {
                        numberOfWords++; 
                    }
                    } else {
                        numberOfWords++;
                    
                    }
                }
            }
                numberOfRows++;
            }
            fr.close();
            System.out.println("Liczba wierszy w Twoim pliku: " + numberOfRows + "\nLiczba slow w Twoim pliku: " + numberOfWords);
        }
        catch(IOException e) {
            
        }
    }
}*/
