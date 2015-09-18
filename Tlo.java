import greenfoot.*;

/**
 * Write a description of class Tlo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tlo extends World
{

    /**
     * Constructor for objects of class Tlo.
     * 
     */
    public Tlo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        // Tworzymy nowy obiekt typu Guzik o nazwie obiektGuzik.
        Guzik obiektGuzik = new Guzik();
        // Dodajemy obiektGuzik do świata na współrzędne 300 x 200.
        addObject(obiektGuzik, 300, 200);
        // Dodanie licznika z obiektu obiektGuzik do świata.
        addObject(obiektGuzik.licznik, 200, 20);
    }
}
