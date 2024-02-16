package mates;

public class Matematicas {
    /**
     * Genera una aproximación al número pi mediante el método de
     * Montecarlo. El parámetro `pasos` indica el número de puntos
     * generado.
     */
    public static double generarNumerosPiIterativo(long pasos){  
        int aciertos=0;    
        for(int i = 0; i<pasos; i++){
            double x = Math.random();
            double y = Math.random();
            if (Math.pow(x,2)+Math.pow(y,2)<=1){
                aciertos++;
            }
        }
        return 0.4 * (10*aciertos / pasos);
    }
}

