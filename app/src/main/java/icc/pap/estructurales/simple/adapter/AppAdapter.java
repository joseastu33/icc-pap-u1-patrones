package icc.pap.estructurales.simple.adapter;

public class AppAdapter {
 public static void main(String[] args) {
    //CARGAR EL CELULAR con el CARGADOR 
    //pero como ahora TENGO UN CAntiguo: debo CREAR un ADAPTADOR :define ¿Como yo cargo?
    CargadorAntiguo cantiguo = new CargadorAntiguo();
    Cargador cargadorUno = new AdaptadorCargador(cantiguo); //inyecto al pasarle COMO PARAMETRO
    cargadorUno.cargarCelular();

 }   


}
