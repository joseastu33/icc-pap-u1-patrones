package icc.pap.creacionales.practica;

public class PedidoPresencial extends Pedido {
    //los atributos NO NECESITAN ser ESCRITOS de NUEVO: porque PUEDEN OCUPAR de la clase PADRE
    //es decir HEREDAN LOS ATRIBUTOS

    public PedidoPresencial(String codigo, String nombreCliente, double valorCompra){
        super(codigo, nombreCliente, valorCompra); //
    }
    @Override
    public void procesarPedido(){
        System.out.println("Generando comprobante de compra presencial.");
    }
}
