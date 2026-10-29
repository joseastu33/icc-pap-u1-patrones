package icc.pap.estructurales.simple.adapter;

public abstract class DecoradorCargador implements Cargador{
    
    protected Cargador cargadorDepende; //dependiente del Cargador

    public DecoradorCargador(Cargador cargadorDepende){
        this.cargadorDepende = cargadorDepende;
    }


    @Override 
    public void cargarCelular(){
        cargadorDepende.cargarCelular(); //implementa el metodo del CARGADOR
    }
    //decorador registro y decorador seguridad son ambos los concretos

}
