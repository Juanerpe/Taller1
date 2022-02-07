/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B;

/**
 *
 * @author juane
 */
public class Pant extends Clothes  {

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return the season
     */
    public String getSeason() {
        return season;
    }

    /**
     * @param season the season to set
     */
    public void setSeason(String season) {
        this.season = season;
    }
    
    /**
     * definicion de variables
     * tipo de pantalones
     */
    private String type;
    /**
     * tipo de año o temporada que salieron
     */
    private String season;

    public Pant(String type, String season) {
        this.type = type;
        this.season = season;
    }
    
    
    public void search(){
       
       
        if (avaliable == true){
            }
          System.out.println("quedan "+quantity+" prendas");
        }
    
    }
    

