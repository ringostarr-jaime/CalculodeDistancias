/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculodedistancias;

/**
 *
 * @author Jymmy
 */
public class CalculodeDistancias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double lat0 = 13.6829395;
        double lng0 = -89.1415758;
        double lat1 = 13.6863033;
        double lng1 = -89.1388451;
        double kilometrosTierra = 6371;
        double metrosTierra = 6371000;

        double rlat0 = Math.toRadians(lat0);
        double rlng0 = Math.toRadians(lng0);
        double rlat1 = Math.toRadians(lat1);
        double rlng1 = Math.toRadians(lng1);

        double latDelta = rlat1 - rlat0;
        double lonDelta = rlng1 - rlng0;

        //fórmula de Haversine
        double distance2 = metrosTierra * 2 * Math.asin(
                Math.sqrt(
                        Math.cos(rlat0) * Math.cos(rlat1) * Math.pow(Math.sin(lonDelta / 2), 2)
                        + Math.pow(Math.sin(latDelta / 2), 2)
                )
        );

        double tiempo= distance2/48.28;
        
        System.out.println("Distancia en Kilometros " + Math.round(distance2) + " Metros");
        System.out.println("Tiempo de llegada " +  Math.round(tiempo) + ""+(tiempo<1?" segundos":" minutos"));
    }
}
