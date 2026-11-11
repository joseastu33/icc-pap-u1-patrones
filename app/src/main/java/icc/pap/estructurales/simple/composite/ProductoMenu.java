package icc.pap.estructurales.simple.composite;

public class ProductoMenu implements ElementoMenu {
    //item tambien tiene atributos

    private final String nombre; //final obliga a inicializarlas
    private final double precio; //final obliga a inicializarlas

    public ProductoMenu(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public double precio() {
        return this.precio;
    }


    @Override 
    public String toString(){
        return nombre;
    }
    
}
