
package ohtu.kivipaperisakset;

/**
 *
 * @author markus
 */
public class Peli {
    public static KPSPeli luoKPSPelaajaVsPelaaja(){
        return new KPSPelaajaVsPelaaja();
    }
    
    public static KPSPeli luoKPSTekoaly(){
        return new KPSTekoaly();
    }
    
    public static KPSPeli luoKPSParempiTekoaly(){
        return new KPSParempiTekoaly();
    }
}
