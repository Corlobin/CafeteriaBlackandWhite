/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafeteria.util;

import ifes.cafeteria.cdp.Cafe;
import ifes.cafeteria.singleton.Builders;
import java.util.HashMap;

/**
 *
 * @author 20122bsi0387
 */


public class FabricaCafe {
    
    public static Cafe criarCafe(String dia) throws Exception {
        Builders builders = Builders.getInstance();
        Vendedor vendedor = new Vendedor();
        Builder builder;
        try{
            builder = builders.getBuilder(dia);
        }catch(Exception e){
            throw new Exception(e.getMessage());
        }   
        Cafe cafe = vendedor.criarCafe(builder);        
        return cafe;
        
    }
}
