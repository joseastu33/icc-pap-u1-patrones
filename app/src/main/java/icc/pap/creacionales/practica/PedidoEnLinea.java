package icc.pap.creacionales.practica;

public class PedidoEnLinea extends Pedido {
    //hereda los ATRIBUTOS de la CLASE PADRE
    public PedidoEnLinea(String codigo, String nombreCliente, double valorCompra){
        super(codigo, nombreCliente, valorCompra); //USA el CONSTRUCTOR de la clase PADRE
    }
    @Override 
    public void procesarPedido(){
        System.out.println("Generando confirmación digital del pedido.");
    }
}
