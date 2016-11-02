package zadanie3;

import java.util.Random;

public class Pieszy implements UzytkownikDrogi {
    private final Random losuj = new Random();
    private int predkosc;
    private int czekanie;
    private char znak;
    private int x;
    private int oldX;
    private int y;
    private int oldY;     

    public Pieszy() {
        predkosc = 4;
        czekanie = 1;
        znak = 'P';
        
        
        x = losuj.nextInt(10);
        y = losuj.nextInt(10);
    }
    
    @Override
    public int getPoziom() {
        return x;
    }
    
    @Override
    public int getPion() {
        return y;
    }
    
    @Override
    public int getStaryPoziom() {
        return oldX;
    }
    
    @Override
    public int getStaryPion() {
        return oldY;
    }
    
    @Override
    public void setZnak(char znak) {
        this.znak = znak;
    }
    
    @Override
    public char getZnak() {
        return znak;
    }
    
    @Override
    public boolean mozliwoscRuchu(){
        czekanie--;
        return (czekanie == 0);
    }
    
    private int kierunek(){
        return losuj.nextInt(4);
    }    

    @Override
    public void setPredkosc(int predkosc) {
        this.predkosc = predkosc;
    }
    
    @Override
    public void ruch() {
        if(mozliwoscRuchu()){
            switch(this.kierunek()) {
    /*
    **
    ** Ruch w prawo.
    **
    */
                case 0: 
                    oldY = y;
                    oldX = x;
                    if(x < 9)
                        x++;
                    break;
    /*
    **
    ** Ruch w lewo.
    **
    */
                case 1: 
                    oldY = y;
                    oldX = x;
                    if(x > 1)
                        x--;
                    break;
    /*
    **
    ** Ruch w górę.
    **
    */             
                case 2: 
                    oldY = y;
                    oldX = x;
                    if(y > 1)
                        y--;
                    break;
                    
    /*
    **
    ** Ruch w dół.
    **
    */    
                case 3: 
                    oldY = y;
                    oldX = x;
                    if(y < 9)
                        y++;
                    break;
            }
            
            PoleGry.ruchPlusKolizja(this);
            czekanie = predkosc;
        }
    } 
}
