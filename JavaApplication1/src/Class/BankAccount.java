/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

/**
 *
 * @author juane
 */
public class BankAccount {

    /**
     * @return the Activated
     */
    public boolean isActivated() {
        return activated;
    }

    /**
     * @param Activated the Activated to set
     */
    public void setActivated(boolean Activated) {
        this.activated = Activated;
    }
    /*
    Representa el numero de cuenta
    */
    private int accountNumber;
    /*
    Representa el estado de la cuenta bancaria
    */
    private boolean activated;
    /*
    Representa el saldo dela cuenta
    */
    private int balance;
    
    
    /*
    Metodo para desactivar cuenta bancaria
    Y un mensaje de confirmacion
    */
    public void DisableAccount(){
    
    activated = false;
    
    System.out.println("Su cuenta fue desactivada, comuniquese con su banco para mayor informacion");
    
    }
    /*
    Reactivacion de la cuenta 
    Y mensaje de confirmacion
    */
    public void ReactivateAccount(){
        
       activated=true;
       System.out.println("Su cuenta fue reactivada con exito");
    
    }
    /*
    Mensaje de aviso para aquellos que tengan un saldo negativo en su saldo
    */
    public void WarningMessage(){
        
        if (balance>0){
            
            System.out.println("Tiene un balance negativo de"+balance);
        }
        
    }
    
}
        