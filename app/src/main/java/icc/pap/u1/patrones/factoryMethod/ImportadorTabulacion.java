package icc.pap.u1.patrones.factoryMethod;

public class ImportadorTabulacion extends Importador {
    @Override 
    protected LectorLinea crearLector(){
        return new LectorTabulacion();
    }
    //@Override (no siempre indica sobreescribir)
    //override si no hay codigo = implementar
    //override si hay codigo = sobreescribir
    

}
