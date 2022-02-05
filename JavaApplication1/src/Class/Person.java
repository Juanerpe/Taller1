/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.Date;

/**
 *
 * @author juane
 */
public class Person {

    /**
     * @return the Name
     */
    public String getName() {
        return name;
    }

    /**
     * @param Name the Name to set
     */
    public void setName(String Name) {
        this.name = Name;
    }
    private String name;
    public String lastName;
    public String lastName2;
    public Date  dateBirth;
    public float height;

    
   public  void Heightcomparation(){
       /*
       creacion de una variable de control
       */
       float averageHeight=170;
       /*
       se procede a la primera condicion del if
       */
       if(averageHeight > height){
           /*
           mensaje por si se cumple la primera condicion
           */
           System.out.println("Esta por Arriba de la altura promedio");
           /*
           una segunda condicion y su posterior mensaje
           */
       } else if(averageHeight < height){
           
           System.out.println("Esta por debajo de la altura promedio");
       
           /*
           Por si las 2 condiciones anteriores no se da
           */
           
       }else{
       
           System.out.println("Esta en la altura promedio");
       }
       
    }
   
   
   
}