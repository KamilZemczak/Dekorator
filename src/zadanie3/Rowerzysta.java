package zadanie3;

public class Rowerzysta implements UzytkownikDrogiDekorator{
    private UzytkownikDrogi uzytkownikDrogi;
    
    @Override
    public void zmiana(UzytkownikDrogi uzytkownikDrogi) {
        uzytkownikDrogi.setPredkosc(3);
        this.uzytkownikDrogi = uzytkownikDrogi;
        
        uzytkownikDrogi.setZnak('R');
      
    }

    @Override
    public void ruch() {
        
    }

    @Override
    public int getPoziom() {
        return uzytkownikDrogi.getPoziom();
    }

    @Override
    public int getPion() {
        return uzytkownikDrogi.getPion();
    }

    @Override
    public int getStaryPoziom() {
        return uzytkownikDrogi.getStaryPoziom();
    }

    @Override
    public int getStaryPion() {
        return uzytkownikDrogi.getStaryPion();
    }
    
    @Override
    public void setPredkosc(int predkosc) {
        uzytkownikDrogi.setPredkosc(predkosc);
    }

    @Override
    public boolean mozliwoscRuchu() {
        return uzytkownikDrogi.mozliwoscRuchu();
    }

    @Override
    public char getZnak() {
        return uzytkownikDrogi.getZnak();
    }

    @Override
    public void setZnak(char znak) {
        uzytkownikDrogi.setZnak(znak);
    }
}
