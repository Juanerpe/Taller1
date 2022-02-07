/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B;

import java.util.Scanner;

/**
 *
 * @author juane
 */
public class Taller {
   public String name;
   public int status;
   public String year;
   public String model; 
   public String plate;
    
    
    private void repairStatus(){
        
        status = 0;
        switch (status){
            
            case 1:{
                System.out.println("su carro no tiene reparaciones pendiente");
                break;
            }
            case 2:{
                System.out.println("su carro esta siendo atendido");
                break;
            }
            case 3:
            {
                System.out.println("su carro esta aun no esta siendo atendido");
                break;
            }
        }
    } 
    
   public void registrar(){
      Scanner leer = new Scanner(System.in);
      System.out.println("ingrese nombre del auto");
      name = leer.next();
      System.out.println("ingrese estado del auto");
      status = leer.nextInt();
      System.out.println("ingrese año del auto");
      year = leer.next();
      System.out.println("ingrese las placas");
      plate = leer.next();
     System.out.println("ingrese modelo del auto");
      model = leer.next();
      
   } 
            
}
