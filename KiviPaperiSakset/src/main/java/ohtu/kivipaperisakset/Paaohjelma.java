package ohtu.kivipaperisakset;

import java.util.Scanner;

public class Paaohjelma {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        KPSPeli KPSPeli;
        Peli peli = new Peli();
        while (true) {
            System.out.println("\nValitse pelataanko"
                    + "\n (a) ihmistä vastaan "
                    + "\n (b) tekoälyä vastaan"
                    + "\n (c) parannettua tekoälyä vastaan"
                    + "\nmuilla valinnoilla lopetataan");

            String vastaus = scanner.nextLine();
            
            if (vastaus.endsWith("a")) {                
                KPSPeli = peli.luoKPSPelaajaVsPelaaja();
            } else if (vastaus.endsWith("b")) {
                KPSPeli = peli.luoKPSTekoaly();
            } else if (vastaus.endsWith("c")) {
                KPSPeli = peli.luoKPSParempiTekoaly();
            } else {
                break;
            }
            System.out.println("peli loppuu kun pelaaja antaa virheellisen siirron eli jonkun muun kuin k, p tai s");
            KPSPeli.pelaa();
        }

    }
}
