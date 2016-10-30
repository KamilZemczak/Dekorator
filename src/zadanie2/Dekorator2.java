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
                    if(!(znak1 == ' ' || znak1 == '\n' || znak1 == '\r' || znak1 == '\t' )) {
                    if((i+1) < line.length()) {
                        char znak2 = line.charAt(i+1);
                        if(!(znak2 == ' ' || znak2 == '\n' || znak2 == '\r' || znak2 == '\t')) {
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
}
