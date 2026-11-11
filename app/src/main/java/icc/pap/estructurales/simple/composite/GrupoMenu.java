package icc.pap.estructurales.simple.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Composite porque agrupa productos de tipo ElementoMenu
 * y calcula un precio (en este caso siendo la SUMATORIA de todos los ElementoMenu)
 * osea el valor de todos los elementos es sumados, porque es un **Grupo**
 * GrupoMenu
 */
public class GrupoMenu implements ElementoMenu {

    private List<ElementoMenu> listaProductos; //con ElementoMenu la lista puede tener cualquiera que IMPLEMENTE ElementoMenu

    public GrupoMenu(){
        listaProductos = new ArrayList<>(); //le hago no DEPENDIENTE
    }

    //el Listado debe ser de LO GENERICO
    //Queso es un producto pero a la vez es elemento
    //si quiero hacer una hamburguesa que tiene Queso, Pan, Carne es un GrupoMenu
    //El combo es otro GrupoMenu, si pongo List de ProductoMenu, voy a tener una lista de Productos, y Hamburguesa no es un producto
    //ME QUEDO con un LISTADO DE ITEMS
    @Override
    public double precio() { //al final termina siendo un ITEM tambien, entonces implementa
        //calcular sumatoria de todos 
        //double suma = 0;
        //for(ElementoMenu elemento : listaProductos){
            //suma = suma + elemento.precio(); //no se si es un item o un grupoMenu, solamente los sumo
        //}
        //return suma;
        return listaProductos.stream().mapToDouble(ElementoMenu::precio).sum();
        //:: = los cuatro puntos es para referenciar a un metodo
        //getName() -> es llamada
        //getName -> es una referencia de la función, le pasa la referencia a la funcion, pero al hacer el calculo se le ejecuta la funcion
    }

    public void addItem(ElementoMenu _lista){
        this.listaProductos.add(_lista);
    }

    
}
