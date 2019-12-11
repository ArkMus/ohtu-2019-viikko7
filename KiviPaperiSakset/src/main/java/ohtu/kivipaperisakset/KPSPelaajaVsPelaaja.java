package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KPSPelaajaVsPelaaja extends KPSPeli{

    private static final Scanner scanner = new Scanner(System.in);

    @Override
    String initialTokanSiirto() {
        return scanner.nextLine();
    }

    @Override
    String tokanSiirto(String ekanSiirtos) {
        System.out.print("Toisen pelaajan siirto: ");
        return scanner.nextLine();
    }
}