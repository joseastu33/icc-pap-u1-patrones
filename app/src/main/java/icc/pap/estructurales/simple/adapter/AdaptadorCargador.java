package icc.pap.estructurales.simple.adapter;

public class AdaptadorCargador implements Cargador{ //adaptadorCargador depende del cargador antiguo porque que es lo que voy a adaptar 
    //no se con CUAL CABLE voy a UTILIZAR
    //va a tener dependencia del CARGADOR ANTIGUO
    private final CargadorAntiguo cargadorAntiguo;

    public AdaptadorCargador(CargadorAntiguo cargadorAntiguo){ //no depende del cargador (tiene constructor vacío)
        this.cargadorAntiguo = new CargadorAntiguo();
    }
    //constructor lleno : INYECCION DE DEPENDENCIAS : INYECTO la dependencia en el CONSTRUCTOR DE la CLASE

    @Override 
    public void cargarCelular(){
        cargadorAntiguo.cargarConector();
    }
    
}
