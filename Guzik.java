import greenfoot.*;

/**
 * Write a description of class Guzik here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guzik extends Actor
{
    // Deklarujemy i tworzymy obiekt klasy LicznikKlikniec o nazwie licznik.
    LicznikKlikniec licznik = new LicznikKlikniec();
    
    /**
     * Act - do whatever the Guzik wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       // Instrukcja warunkowa if (warunek) {kod do wykonania}. 
       if (Greenfoot.mouseClicked(this)) {
           // Za pomocą poniższej instrukcji zwiększamy zastaną liczbę
           // kliknięć o jeden.
           licznik.licznikKlikniec = licznik.licznikKlikniec + 1;
           
           // Pobieramy świat i przypisujemy go do zmiennej tlo.
           World tlo = getWorld();
           // Pobieramy szerokość i wysokość świata.
           int szerokosc = tlo.getWidth();
           int wysokosc = tlo.getHeight();
           // Losujemy nowe współrzędne guzika.
           int wylosowanyX = Greenfoot.getRandomNumber(szerokosc);
           int wylosowanyY = Greenfoot.getRandomNumber(wysokosc);
           // Ustawiamy współrzędne guzikowi.
           setLocation(wylosowanyX, wylosowanyY);
       }       
    }    
}
