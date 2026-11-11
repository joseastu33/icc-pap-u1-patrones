package icc.pap.estructurales.simple.flyweight;

public final class AppFlyweight {
    public static void main(String[] args) {
        GestorComponentes gestor = new GestorComponentes();
        ComponenteVisual boton1 = gestor.get("boton", "azul", "24px");
        ComponenteVisual boton2 = gestor.get("boton", "azul", "24px");
        ComponenteVisual card = gestor.get("card", "azul", "12px");

        boton1.dibujar("Guardar", 10, 20); //el mismo boton se dibuja en un lado con un texto
        boton2.dibujar("Cancelar", 100, 20); //en otro lado con otro texto
        card.dibujar("Opciones", 5, 25);
        
        System.out.println(boton1 == boton2); //Output: true
        //un HashMap es una implementación de Singleton, por eso al consultar dos objetos del mapa si SON IGUALES da true
    }
}
