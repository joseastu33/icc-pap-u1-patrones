package icc.pap.creacionales.builder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/*
 * ObjBuilder
 * PizzaBuilder va a Acumular las opciones de una PIZZA
 * y creará el producto(objeto Pizza) cuando se le pida al metodo construir o build
*/
public final class PizzaBuilder {
    private String size = "mediana";
    private List<String> ingredientes = new ArrayList<>(); //va a depender mucho de las reglas de negocio, uso un LINKEDLIST porque los ingredientes van en orden
    //osea: depende de los ingredientes de negocio

    //setters o agregadores, esta clase si tiene

    //OPC1
    public PizzaBuilder setSize(String size){
        this.size = size;
        return this; //devuelven el mismo builder para acumular informacion 
    }

    //OPC2
    public PizzaBuilder addIng(String ingrediente){
        this.ingredientes.add(ingrediente); //agrego a la lista
        return this; //para acumular informacion, puedo agregar informacion
    }
    ///METODO BUILD
    public Pizza build(){
        return new Pizza(size, ingredientes);
    }
}
