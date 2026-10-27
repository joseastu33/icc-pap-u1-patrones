package icc.pap.creacionales.practica;

public abstract class CreadorPedido {
    public abstract Pedido crearPedido(String codigo, String nombreCliente, double valorCompra);
    
}
