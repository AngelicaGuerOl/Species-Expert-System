/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

/**
 *
 * @author Angelica Guerrero
 */
public class Animal {
    public static void main(String[] args){
    animalBR obr=new animalBR();
        String aux;
        aux=obr.getReino("si","no","no","si","no","si","no","si");
        
        System.out.println("V1= "+aux);
        
        aux=obr.getFilo("ANIMALIA","si","si","si","si","si","si","no","si");
        
        System.out.println("FILO= "+aux);
    }
}
