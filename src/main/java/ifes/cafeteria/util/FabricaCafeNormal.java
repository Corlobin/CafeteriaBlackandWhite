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
public class FabricaCafeNormal implements Fabrica {

    @Override
    public Cafe criarCafe() {
        return new Cafe(1);
    }

    @Override
    public ArrayList<Ingredientes> criarIngredientes() {
        ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();
        ingredientes.add(new Agua(100));
        ingredientes.add(new CafeSoluvel(50));
        ingredientes.add(new Acucar(2));
        ingredientes.add(new LeiteNormal(1));        
        return ingredientes;
    }


}
