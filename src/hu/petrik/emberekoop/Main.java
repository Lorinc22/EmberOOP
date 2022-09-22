package hu.petrik.emberekoop;

import java.io.FileNotFoundException;
import java.io.IOException;
public class Main {
    public static void main(String[] args) {
        ember human = new ember("Gipsz Jakab", "2001-1-1", "Budapest");
        ember human2 = new ember("Teszt Elek", "1985-12-15", "Debrecen");
        ember human3 = new ember("Kovács István", "1999-3-30", "Szeged");
        ember human4 = new ember("Sárosi Roland", "1973-1-1", "Budapest");
        ember human5 = new ember("Róth Nikolett", "1973-2-26", "Veszprém");
        Emberek emberek = new Emberek(new ember[]{human, human2, human3, human4, human5});
        //System.out.println(emberek);
        String fajlNev = "emberek.txt";
        try {
            Emberek emberek2 = new Emberek(fajlNev);
            System.out.println(emberek2);
        } catch (FileNotFoundException e) {
            System.err.printf("Hiba nem található az %s fájl\n", fajlNev);
        } catch (IOException e) {
            System.err.println("Ismeretlen hiba történt a fájl beolvasása során");
        }
    }
}