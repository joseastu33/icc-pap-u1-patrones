package icc.pap.comportamiento.observer;

public class AppObserver {
    public static void main(String[] args) {
        Producto p = new Producto("001", 20.5, "Pizza");

        p.suscribir(cp -> System.out.println("Correo:  $" + cp)); //consumer SUSCRITO
        p.suscribir(cp -> System.out.println("Registro: $" + cp)); //consumer SUSCRITO
        
        //p.notifyAll();
        System.out.println("Cambio el PRECIO");
        p.setPrecio(15.50); //hago un cambio en el precio y tengo que notificar a los observers
        //para notificar lo hago en el mismo metodo setPrecio
        System.out.println("Cambio el NOMBRE");
        p.setNombre("PIZZZA"); //no se notifica
        String codigoViejo = p.getCodigo();
        //CUANDO CAMBIE CUALQUIER ATRIBUTO VOY A NOTIFICAR A TODOS LOS CONSUMERS
        //consumers hacen las ACCIONES

        //quiero hacer que el consumer se activa cuando todo cambie pero actue solamente si fue el codigo que cambió
        p.suscribir(producto -> { //consumer
            /// Imprimir el nuevo codigo (solo el codigo)
            /// siempre cuando cambia solo el CODIGO
            /// Algun IF
            if(!producto.atributo().equals("codigo")){
                System.out.printf("El codigo viejo es %: el nuevo es %", producto.anterior(), producto.nuevo());
            }
            System.out.println("Registro: $" + producto);
        });

        //notifica a TODOS los SUSCRITOS: primer Observador
        p.suscribir(cp -> {
            System.out.println("Observador 1");
            System.out.println("Se modifico el: " + cp.atributo());
            System.out.println("Old= " + cp.anterior() + "| New = " + cp.nuevo());
        });  

        p.suscribir(cp -> {
            System.out.println("Observador 2");
            System.out.println("Se modifico el: " + cp.atributo());
            System.out.println("Old= " + cp.anterior() + "| New = " + cp.nuevo());
        });
        
        System.out.println("Cambio el CODIGO");
        p.setCodigo("P-001");
         System.out.println("Cambio el CODIGO");
        p.setCodigo("P-002");

        
    }
}
