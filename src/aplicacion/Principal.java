package aplicacion;

import mates.Matematicas;

public class Principal{
    public static void main(String [] args){
        System.out.println("El número PI es " + 
        Matematicas.generarNumerosPiIterativo(500000));
    }
}
