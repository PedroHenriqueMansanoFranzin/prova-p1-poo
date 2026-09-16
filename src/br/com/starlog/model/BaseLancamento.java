package br.com.starlog.model;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

import br.com.starlog.model.Carga;
import br.com.starlog.model.ModuloCarga;
public class BaseLancamento {
    private  Map<String, ModuloCarga> modulos;

    public BaseLancamento(Map<String, ModuloCarga> modulos) {
        this.modulos = modulos;
    }
     public String modulos() {
        return modulos;
    }
    public ModuloCarga cadastrarModulo(String codigoModulo, ModuloCarga modulo){
        return modulos.put(codigoModulo, modulo);
    }
    public ModuloCarga buscarModulo(String codigoModulo){
        return modulos.get(codigoModulo);
    }
    public Map<String, ModuloCarga> getModulos() {
        return modulos;
    }
    
}
