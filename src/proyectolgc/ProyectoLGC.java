/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectolgc;

/**
 *
 * @author luis_ version: java 8
 */
public class ProyectoLGC {
    private static String veredicto(String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "Perfecto. Has tenido buen criterio.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
            return "Has mejorado, o te ha llegado el éxito inesperado.";
        }
        return "Te has confiado. Falta realismo.";
        // Si el valor1 es igual a 2 muestra el resultado
    }
       
    
    public static void main(String[] args) {
        String valor1=args[1];
        String valor2=args[2];
        System.out.println("La calificacion de " +args[0]+ ":");
        System.out.println("La calificacion que creo que tengo es: " +args[1]+ ":");
        System.out.println("La calificacion que realmente tengo es: " +args[2]+ ":");
        System.out.println(veredicto(valor1,valor2));
    }
    
}
