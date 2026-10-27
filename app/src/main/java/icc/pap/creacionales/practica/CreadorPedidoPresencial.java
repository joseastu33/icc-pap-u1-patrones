package icc.pap.creacionales.practica;

public class CreadorPedidoPresencial extends CreadorPedido{
    @Override 
    public Pedido crearPedido(String codigo, String nombreCliente, double valorCompra){
        return new PedidoPresencial(codigo, nombreCliente, valorCompra);
    }
    
}
