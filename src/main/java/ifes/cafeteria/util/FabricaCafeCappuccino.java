/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafeteria.util;

import ifes.cafeteria.cdp.*;
import java.util.ArrayList;

/**
 *
 * @author 20122bsi0387
 */
public class FabricaCafeCappuccino implements Fabrica {

    @Override
    public Cafe criarCafe() {
        return new Cafe(2.5);
    }

    @Override
    public ArrayList<Ingredientes> criarIngredientes() {
        ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();
        ingredientes.add(new Agua(100));
        ingredientes.add(new CafeSoluvel(50));
        ingredientes.add(new Acucar(200));
        ingredientes.add(new LeiteEmPo(1));        
        ingredientes.add(new Bicabornato(1));        
        ingredientes.add(new LeiteEmPo(1));        
        ingredientes.add(new ChocolateEmPo(50));        
        ingredientes.add(new Canela(1));        
        return ingredientes;
    }
}
