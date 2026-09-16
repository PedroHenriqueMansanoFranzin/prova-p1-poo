package br.com.starlog.model;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;

import br.com.starlog.model.Carga;
public class ModuloCarga {
    private String codigoModulo;
    private int capacidadeMaxima;
    private List<Carga> cargas = new ArrayList<>();
    public ModuloCarga(String codigoModulo, int capacidadeMaxima) {
        this.codigoModulo = codigoModulo;
        this.capacidadeMaxima = capacidadeMaxima;
    }
    public void carregarCarga(Carga carga){
        ((Object) cargas).put(carga);

    }
    public double calcularSeguroTotal(){
        public Stream<Carga> stream() {
        return cargas.stream();
       }
    }
    
    public long contarCargasPorCategoria(String categoria){
        return cargas.get(categoria);
    }
    public double calcularSeguroCargasPesadas(String categoria, double pesoMinimo){
        forEach(pesoKg > pesoMinimo && categoria);
        return cargas.get(carga);
    }
}
