/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosnivel1_2021;

/**
 *
 * @author Gaming JS
 */
public class EjerciciosNivel1_2021 {

    //declaro un array de integers para hacer pruebas   
    int[] listaNumeros = {3, 31, 200, 20, 5, 99};
    
    public int maximo(int[] lista){
        int auxiliar = lista[0]; //el máximo va a ser el primer elemento del array
        for (int i=0; i< lista.length; i++) {
            if (auxiliar < lista[1]){
                auxiliar = lista[1];
            }
        }
        return auxiliar;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EjerciciosNivel1_2021 ejercicio = new EjerciciosNivel1_2021();
        System.out.println (ejercicio.listaNumeros[0]);
        System.out.println(ejercicio.maximo(ejercicio.listaNumeros));
        
    }
    
}
