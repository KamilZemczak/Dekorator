package zadanie1;

import java.io.DataInputStream;
import java.io.FileNotFoundException;
import java.io.FileInputStream;
import java.io.IOException;

/*
Napisać program, który pozwoli obliczyć liczbę wierszy tekstu. 
Przeglądane powinny być wszystkie znaki tekstu.
Obliczanie liczby wierszy powinno odbywać się dopiero w momencie zakończenia przeglądania danego wiersza.
*/

public class Dekorator1 {

    public static void main(String[] args) {
        try {
            DataInputStream fstream = new DataInputStream(new FileInputStream("text.txt"));
           
            int character;
            int numberOfRows = 1;
            while ((character = fstream.read()) != -1) {

            if ((char)character=='\n'){
            numberOfRows++;
            }
        }
            System.out.println("Liczba wierszy w Twoim pliku: " +numberOfRows);
            fstream.close();   
        } catch(FileNotFoundException e){
            System.out.println("Niestety, nie znaleziono żądanego pliku.");
        } catch(IOException e){
            System.out.println("Błąd wejścia - wyjścia.");
        }
    }   
}
