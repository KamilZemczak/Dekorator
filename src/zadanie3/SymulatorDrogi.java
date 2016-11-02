package zadanie3;

import java.util.Scanner;

public class SymulatorDrogi {

    public static void main(String[] args) throws InterruptedException {
        
   /*
    **
    ** Przywitanie użytkownika + odliczanie.
    **
    */
   
        System.out.println("Witaj w krótkim symulatorze drogowym...\n");
        System.out.println("Zasady:\n1. Każdy obiekt potrafi się poruszać po polu z różną prędkością.");
        System.out.println("2. K - Kierowca. R - Rowerzysta. P - Pieszy.");
        System.out.println("3. Obiekty poruszają się w sposób losowy, kraksa oznacza znak #.\n");
        System.out.println("Jeśli podobają ci się zasady i chcesz zagrać, naciśnij dowolny klawisz.");
        Scanner input = new Scanner(System.in);
        input.nextLine();
        System.out.println("Nastąpi teraz odliczanie do 10 i gra się rozpocznie...");
       
        for(int i=10; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch(InterruptedException e) {
                
            }
        }
        
         System.out.println("Nastąpiła kraksa! Game Over.");
    }
    
   
}
