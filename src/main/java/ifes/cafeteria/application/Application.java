/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafeteria.application;

import ifes.cafeteria.cdp.Cafe;
import ifes.cafeteria.util.FabricaCafe;

/**
 *
 * @author 20122bsi0387
 */
public class Application {
    public static void main(String args[]) {
        Cafe cafe = new Cafe();
        try{
            cafe = FabricaCafe.criarCafe("segunda-feira");
            System.out.println("cafe segunda feira: "+cafe);
        

            Cafe cafe2 = new Cafe();
            cafe2 = FabricaCafe.criarCafe("saado");
            System.out.println("cafe sábado: " +cafe);
        
        } catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
