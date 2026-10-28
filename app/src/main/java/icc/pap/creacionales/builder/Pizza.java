package icc.pap.creacionales.builder;

import java.util.List;

/*
 *
 * Pizza: clase INMUTABLE: representa una pizza YA CONFIGURADA
*/
public final class Pizza { //clase final: atributos final
    
    private final String tamanio;
    private final List<String> ingredientes; //final obliga a tener un constructor lleno
    
    public Pizza(String tamanio, List<String> ingredientes){
        this.tamanio = tamanio;
        this.ingredientes = ingredientes;
    }
    
    public String descripcion(){
        return "Pizza " + tamanio + " con: " + ingredientes;
    }

}
