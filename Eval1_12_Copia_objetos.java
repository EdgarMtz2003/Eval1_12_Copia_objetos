/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author moviles
 */
public class Eval1_12_Copia_objetos {
    public static void main(String[]args){
        
        int valor, copiaValor;
        
        valor = 100;
        copiaValor = valor;
        System.out.println("Valor: "+valor);
        System.out.println("Copia: "+copiaValor);
        valor++;
        System.out.println("Valor: "+valor);
        System.out.println("Copia: "+copiaValor);
        //Ahora con objetos
        PruebaValor prueba= new PruebaValor();
        prueba.x = 1000;
        PruebaValor pruebaCopia = new PruebaValor();
        pruebaCopia = prueba;
        System.out.println("Ahora con Objetos");
        System.out.println("Prueba: "+ prueba.x);
        System.out.println("Prueba Copia: "+ pruebaCopia.x);
        prueba.x++;
        System.out.println("Prueba: "+ prueba.x);
        System.out.println("Prueba Copia: "+ pruebaCopia.x);
    }
    
}

class PruebaValor{
    int x;
    
}