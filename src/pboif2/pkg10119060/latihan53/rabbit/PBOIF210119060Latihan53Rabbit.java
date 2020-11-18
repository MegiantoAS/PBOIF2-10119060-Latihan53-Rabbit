/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119060.latihan53.rabbit;

/**
 *
@author Megianto Adi saputra
 Nama         : Megianto Adi Saputra
 Kelas        : IF-2
 NIM          : 10119060
 Deskripsi    : Program Rabbit
 */
public class PBOIF210119060Latihan53Rabbit {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Rabbit objRabbit = new Rabbit("peter", false, "grass", 4, "grey");
        System.out.println("Hello, his name is "+ objRabbit.getName());
        System.out.println(objRabbit.getName()+" is vegetarian? "+objRabbit.isVegetarian());
        System.out.println(objRabbit.getName()+" eats "+objRabbit.getEats());
        System.out.println(objRabbit.getName()+" has "+objRabbit.getNoOfLegs()+" legs");
        System.out.println(objRabbit.getName()+" color is "+objRabbit.getColor());
        
        
        
        
    }
    
}
