package icc.pap.creacionales.practica;

public class CreadorPedidoEnLinea extends CreadorPedido {
    @Override 
    public Pedido crearPedido(String codigo, String nombreCliente, double valorCompra){
        return new PedidoEnLinea(codigo, nombreCliente, valorCompra);
    }
}
