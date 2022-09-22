package hu.petrik.emberekoop;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class Emberek {
    private List<ember> emberek;

    public Emberek(ember[] emberTomb) {
        this.emberek = new ArrayList<>();
        this.emberek.addAll(Arrays.asList(emberTomb));
        /*
        for (Ember e: emberTomb) {
            this.emberek.add(e);
        }
         */
    }

    public Emberek(String fajlNev) throws IOException {
        this.emberek = new ArrayList<>();
        FileReader fr = new FileReader(fajlNev);
        BufferedReader br = new BufferedReader(fr);
        String sor = br.readLine();
        while (sor != null && !sor.equals("")){
            String[] adatok = sor.split(";");
            ember ember = new ember(adatok[0], adatok[1], adatok[2]);
            this.emberek.add(ember);
            sor = br.readLine();
        }
        br.close();
        fr.close();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (ember e: this.emberek){
            sb.append(e.toString()).append(System.lineSeparator());
        }
        return sb.toString();
    }
}
