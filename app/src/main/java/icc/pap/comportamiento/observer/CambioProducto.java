package icc.pap.comportamiento.observer;

public record CambioProducto(
    Producto producto, 
    String atributo, 
    Object anterior, //mandar el codigo anterior
    Object nuevo) { //mandar el codigo nuevo 
    
}
