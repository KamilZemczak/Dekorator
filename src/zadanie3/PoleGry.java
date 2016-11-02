package zadanie3;

import java.util.Random;

public class PoleGry {
    
   /*
    **
    ** Zdefiniowanie zmiennej odpowiadającej za nasze pole gry.
    ** Przypisujemy wartość "pustą" wartość by utworzyć pole. 
    **
    */
    private static final char o = ' ';
    
    private static char[][] pole = {
        {o, o, o, o, o, o, o, o, o, o},
        {o, o, o, o, o, o, o, o, o, o},
        {o, o, o, o, o, o, o, o, o, o},
        {o, o, o, o, o, o, o, o, o, o},
        {o, o, o, o, o, o, o, o, o, o},
        {o, o, o, o, o, o, o, o, o, o},
        {o, o, o, o, o, o, o, o, o, o},
        {o, o, o, o, o, o, o, o, o, o},
        {o, o, o, o, o, o, o, o, o, o},
        {o, o, o, o, o, o, o, o, o, o},
        
    };
    
   /*
    **
    ** Definiujemy zmienną boolowską kolizja.
    ** Przypisujemy do niej wartość false, bo wraz z rozpoczęciem gry nie zakładamy kolizji.
    **
    */
     public static boolean kolizja = false;
    
    public static void ruchPlusKolizja(UzytkownikDrogi uzytkownikDrogi){
        if(!kolizja) {
            int x = uzytkownikDrogi.getPoziom();
            int y = uzytkownikDrogi.getPion();
            int oldX = uzytkownikDrogi.getStaryPoziom();  
            int oldY = uzytkownikDrogi.getStaryPion();
            
            pole[oldY][oldX] = o;
            
            switch(pole[y][x]){
                case o:
                    pole[y][x] = uzytkownikDrogi.getZnak();
                    break;
                case 'k':
                    new Kierowca().zmiana(uzytkownikDrogi);
                    pole[y][x] = uzytkownikDrogi.getZnak();
                    break;
                case 'r':
                    new Rowerzysta().zmiana(uzytkownikDrogi);
                    pole[y][x] = uzytkownikDrogi.getZnak();
                    break;
                default:
                    kolizja = true;
                    pole[y][x] = '#';
                    break;
            }
            drukEkran();
        }
    }
    
    /*
    **
    ** Metoda odpowiadając losowanie pozycji dla kierowcy i rowerzysty.
    **
    */
    public static void losujPozycje(){
        Random losuj = new Random();
        int x = losuj.nextInt(10);
        int y = losuj.nextInt(10);
        
        if(pole[y][x] == o)
            pole[y][x] = losuj.nextInt(2)==0 ? 'R' : 'K';
        else
            losujPozycje();
    }
    
    /*
    **
    ** Metoda odpowiadająca za czyszczenie ekranu.
    **
    */   
    private static void czyscEkran(){
        for(int i=0; i < 10; i++)
            System.out.println();
    }
    
    /*
    **
    ** Metoda odpowiadając za pracę korkową.
    **
    */
    public static void drukEkran(){
        czyscEkran();
        for(int i=0; i < 10; i++)
            System.out.println(new String(pole[i]));
        System.out.println("-----------------------------------------------------");
    }
}
