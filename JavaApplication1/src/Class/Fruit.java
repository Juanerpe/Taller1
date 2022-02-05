/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;



/**
 * una primera clase para observar lo aprendido en clase  
 * @author juan erasmo perez alvarado
 */
public class Fruit {

    /**
     * @return the Color
     */
    public ArrayList<String> getColor() {
        return Color;
    }

    /**
     * @param Color the Color to set
     */
    public void setColor(ArrayList<String> Color) {
        this.Color = Color;
    }

    
    
    /**
     * Representa el nombre de la fruta
     */
    public String Name ;
    /**
     * Representa el peso de la fruta
     */
   private float averageWeight;
     /**
     * Representa la forma de la fruta
     */
    public String Shape;
     /**
     * Representa la especie o familia a la cual pertenece
     */
    public String genus;
    
    /*
        Representa un array el cual tendra opciones a elegir el color predominante de la fruta
    */
    private ArrayList<String> Color= new ArrayList<String>(); 
    
    /*
        representa el contenido de agua en la parte comestible de una fruta se determina en %
    */
    public float waterContent;
    
            
  
   public void fruitClasification(){
       /*
       Uso del condicional if para comparar la variable
       */
      if(waterContent >50){
          /*
         Si se cumple la condicion se muestra el siguiente mensaje
          */
          System.out.println("Hace parte de las frutas carnosas");
      }else{
          /*
          Por el contrario si no se cumple la condicion del if se le muestra otro mensaje
          */
          System.out.println("Hace parte de los frutos frescos");
      }
    }
}
