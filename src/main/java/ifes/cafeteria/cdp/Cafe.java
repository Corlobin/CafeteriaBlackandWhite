/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafeteria.cdp;

import java.util.ArrayList;

/**
 *
 * @author 20122bsi0387
 */
public class Cafe {
    private static ArrayList<Ingredientes> ingredientes = new ArrayList<Ingredientes>();
    private double preco;
    
    public Cafe() {
    }

    public Cafe(double valor) {
        this.preco = valor;
    }

    public Cafe(double preco, ArrayList<Ingredientes> ingredientes){
        this.preco = preco;
        this.ingredientes = ingredientes;
    }

    public ArrayList<Ingredientes> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingredientes> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        StringBuilder st = new StringBuilder();
        
        for (Ingredientes ingrediente: this.ingredientes) {
            st.append(ingrediente);
            st.append(" ");
        }
        
        return st.toString();
    }
        
}
