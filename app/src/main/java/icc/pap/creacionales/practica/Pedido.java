package icc.pap.creacionales.practica;

public abstract class Pedido {
    protected String codigo;
    protected String nombreCliente;
    protected double valorCompra;

    public Pedido(String codigo, String nombreCliente, double valorCompra){
        this.codigo = codigo;
        this.nombreCliente = nombreCliente;
        this.valorCompra = valorCompra;
    }
    //ambos pedidos son PROCESADOS: pero de formas distintas SEGUN EL PEDIDO
    public abstract void procesarPedido();

    //el PORCENTAJE DE IMPUESTO es APLICADO A cualquier PEDIDO: el CALCULO ES COMUN en ambas implementaciones
    public double calcularTotalCompra(){
        double impuesto = valorCompra * Configuracion.INSTANCIA.getPorcentajeImpuesto(); //valor compra * IMPUESTO guardado en la INSTANCIA UNICA
        return valorCompra + impuesto; 
    }
}
