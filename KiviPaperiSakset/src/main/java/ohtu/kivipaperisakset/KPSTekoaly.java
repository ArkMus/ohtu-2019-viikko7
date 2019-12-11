package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSTekoaly extends KPSPeli{

    private static final Scanner scanner = new Scanner(System.in);
    private Tekoaly tekoaly = new Tekoaly();

    @Override
    String initialTokanSiirto() {
        String siirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + siirto);
        return siirto;
    }

    @Override
    String tokanSiirto(String ekanSiirto) {
        String siirto = tekoaly.annaSiirto();
        System.out.println("Tietokone valitsi: " + siirto);
        return siirto;
    }
}