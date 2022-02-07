/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B;

/**
 *
 * @author juane
 */
public class Clothes {
    /**
     * Definicion de las variables
     * material de que esta hecho
     * el largo
     * el ancho
     * la talla
     * disponibildad
     */


    public String material;
    public float width;
    public float length;
    public String size;
    protected int id ;
    public boolean avaliable;
    public int quantity;
    
        /**
         *Metodo que me permite saber si una prenda esta disponible o no,
         * con su respectivo mensaje 
         *
         */
   protected void availability(){
        if (avaliable = true){
        
        System.out.println("Prenda disponible");
        
        }else{
        System.out.println("Prenda no Disponible");
        }
    }
   
}
