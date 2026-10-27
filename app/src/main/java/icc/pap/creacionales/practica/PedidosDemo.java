package icc.pap.creacionales.practica;

public class PedidosDemo {
    public static void run(){
        //creacion DE LOS CREADORES
        CreadorPedido creadorPedidoPresencial = new CreadorPedidoPresencial();
        CreadorPedido creadorPedidoEnLinea = new CreadorPedidoEnLinea();
        //creacion DE LOS PEDIDOS
        Pedido pedidoPresencial1 = creadorPedidoPresencial.crearPedido("P001", "Ana", 100.00);
        Pedido pedidoEnLinea1 = creadorPedidoEnLinea.crearPedido("P002", "Luis", 200.00);
        System.out.println("=== PEDIDO PRESENCIAL ===");
        System.out.println("Codigo: P001");
        System.out.println("Cliente: Ana");
        System.out.printf("Total: $%.2f%n", pedidoPresencial1.calcularTotalCompra());
        pedidoPresencial1.procesarPedido();

        System.out.println("\n=== PEDIDO EN LINEA ===");
        System.out.println("Codigo: P002");
        System.out.println("Cliente: Luis");
        System.out.printf("Total: $%.2f%n", pedidoEnLinea1.calcularTotalCompra());
        pedidoEnLinea1.procesarPedido();

        //comprobacion DEL PATRON SINGLETON
        Configuracion conf1 = Configuracion.INSTANCIA;
        Configuracion conf2 = Configuracion.INSTANCIA;
        System.out.println("\n=== CONFIGURACION ===");
        System.out.println("Impuesto: " + (conf1.getPorcentajeImpuesto() * 100) + "%");
        System.out.println("¿Son la MISMA INSTANCIA?" + (conf1 == conf2));

    }
}
