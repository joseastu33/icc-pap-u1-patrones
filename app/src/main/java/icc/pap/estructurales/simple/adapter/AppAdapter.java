package icc.pap.estructurales.simple.adapter;

public class AppAdapter {
 public static void main(String[] args) {
    //CARGAR EL CELULAR con el CARGADOR 
    //pero como ahora TENGO UN CAntiguo: debo CREAR un ADAPTADOR :define ¿Como yo cargo?
    CargadorAntiguo cantiguo = new CargadorAntiguo();
    CargadorInalambrico cInalambrico = new CargadorInalambrico();
    Cargador cargadorUno = new AdaptadorCargador(cantiguo); //inyecto al pasarle COMO PARAMETRO
    cargadorUno.cargarCelular();
    //sin interfaz: sin el patrón
    /// si el cargador es antiguo
    cantiguo.cargarConector(); //sin el PATRON
    //Si quiero usar el inalambrico
    cInalambrico.cargarBase(); //el CLIENTE decide DISTINTOS METODOS
    //OTRO NOMBRE
    //OTRO NOMBRE 2
    //puedo tener por ejemplo cargadroOtro.cargarBase();
    Cargador cargadorDos = new AdaptadorCargadorIna(cInalambrico);

    cargadorDos.cargarCelular(); //el cliente carga celulares, no tiene IDEA de como CARGÓ

    ///PRACTICA **PATRON DECORATOR** hacia **PATRON ADAPTER**
    //caso: cargador antiguo CON REGISTRO
    Cargador carg1 = new DecoradorRegistro(new AdaptadorCargador(new CargadorAntiguo()));
    System.out.println("=== CASO 1 ===");
    carg1.cargarCelular();
    //caso: cargador inalámbrico CON SEGURIDAD PERMITIDA
    Cargador carg2 = new DecoradorSeguridad(new AdaptadorCargadorIna(new CargadorInalambrico()), true);
    System.out.println("\n=== CASO 2 ===");
    carg2.cargarCelular();
    //caso: cargador antiguo CON SEGURIDAD BLOQUEADA
    Cargador carg3 = new DecoradorSeguridad(new AdaptadorCargador(new CargadorAntiguo()), false);
    System.out.println("\n=== CASO 3 ===");
    //caso: cargador inalámbrico con ambos decoradores
    Cargador carg4 = new DecoradorSeguridad(new DecoradorRegistro(new AdaptadorCargadorIna(new CargadorInalambrico())), true);
    System.out.println("\n=== CASO 4 ===");
    carg4.cargarCelular();





 }   


}
