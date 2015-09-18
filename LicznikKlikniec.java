import greenfoot.*;
import java.awt.Color;

/**
 * Write a description of class LicznikKlikniec here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LicznikKlikniec extends Actor
{
    // Zmienna reprezentująca ilość kliknięć.
    int licznikKlikniec = 0;
    
    
    /**
     * Act - do whatever the LicznikKlikniec wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Stworzenie obiektu obrazka.
        GreenfootImage licznik = new GreenfootImage("Klik numer: " + licznikKlikniec, 40,
        Color.RED, Color.BLACK);
        // Ustawienie obrazka klasie LicznikKlikniec.
        setImage(licznik);
    }    
}
