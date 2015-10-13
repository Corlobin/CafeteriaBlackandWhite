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
public class Vendedor implements Director {

    @Override
    public Cafe criarCafe(Builder pessoa) {
        
        Cafe cafe;
        pessoa.prepararIngredientes();
        cafe = pessoa.montarCafe();
        return cafe;
    }
}
