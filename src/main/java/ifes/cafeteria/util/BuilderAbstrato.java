/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafeteria.util;

import ifes.cafeteria.cdp.Cafe;

/**
 *
 * @author Ricardo
 */
public abstract class BuilderAbstrato implements Builder {
    private Cafe cafe;
    protected Fabrica fabrica;
    
    
    @Override
    public void prepararIngredientes() {        
        cafe = new Cafe();
        cafe.setIngredientes(fabrica.criarIngredientes());
    }
        
    @Override
    public Cafe montarCafe() {  
        return fabrica.criarCafe();
    }

}
