package zadanie3;

public interface UzytkownikDrogi {
    
    /*
    **
    ** Metoda odpowiadająca za aktualną pozycje pionu.
    ** Obrazowo: z dołu do góry.
    **
    */
    public int getPion();
    
    /*
    **
    ** Metoda odpowiadająca za starą pozycje pionu.
    ** Obrazowo: z dołu do góry.
    **
    */
    public int getStaryPion();
    
    /*
    **
    ** Metoda odpowiadająca za aktualną pozycje poziomu.
    ** Obrazowo: z lewej do prawej.
    **
    */
    public int getPoziom();
    
    /*
    **
    ** Metoda odpowiadająca za starą pozycje poziomu.
    ** Obrazowo: z lewej do prawej.
    **
    */
    public int getStaryPoziom();
    
    /*
    **
    ** Metoda pobierająca znak użytkownika drogi.
    **
    */
    public char getZnak();
    
    /*
    **
    ** Metoda ustawiająca znak użytkownikowi drogi.
    **
    */
    public void setZnak(char znak);
    
    /*
    **
    ** Metoda odpowiadająca za ruch użytkownika drogi.
    **
    */
    public void ruch();
    
    
    /*
    **
    ** Metoda odpowiadająca za prędkość poruszania.
    **
    */
    public void setPredkosc(int predkosc);
    
    /*
    **
    ** Metoda odpowiadająca za sprawdzenie czy jest możliwość ruchu.
    **
    */
    public boolean mozliwoscRuchu();
    
}
