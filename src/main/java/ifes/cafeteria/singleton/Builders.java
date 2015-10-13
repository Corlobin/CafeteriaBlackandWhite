/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.cafeteria.singleton;

import ifes.cafeteria.util.Builder;
import ifes.cafeteria.util.FabricaCafeCappuccinoBuilder;
import ifes.cafeteria.util.FabricaCafeNormalBuilder;
import ifes.cafeteria.util.FabricaCafeSemCafeinaBuilder;
import java.util.HashMap;

/**
 *
 * @author Ricardo
 */
public class Builders {
    private static Builders builders;
    private HashMap<String, Builder> dias;
    private Builders(){
        dias = new HashMap<>();
        dias.put("segunda-feira", new FabricaCafeNormalBuilder());
        dias.put("quarta-feira", new FabricaCafeNormalBuilder());
        dias.put("sexta-feira", new FabricaCafeNormalBuilder());        
        dias.put("terça-feira", new FabricaCafeSemCafeinaBuilder());
        dias.put("quinta-feira", new FabricaCafeSemCafeinaBuilder());
        dias.put("sábado", new FabricaCafeSemCafeinaBuilder());       
        dias.put("domingo", new FabricaCafeCappuccinoBuilder());
    }
    public synchronized static Builders getInstance() {
        if(builders == null) {
            builders = new Builders();
        }
        return builders;
    }
    public Builder getBuilder(String dia) throws Exception {
        Builder build;
        try { 
            build = dias.get(dia);
        } catch(Exception e) {
            System.out.println("Erro");
            throw new Exception("Erro ao tentar pegar o build do dia...");
        }
        
        return build;
    }

}
