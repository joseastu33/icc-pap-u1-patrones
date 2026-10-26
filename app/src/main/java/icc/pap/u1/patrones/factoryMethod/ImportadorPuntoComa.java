package icc.pap.u1.patrones.factoryMethod;

//CREADOR CONCRETO: usa el metodo para crear un objeto conccreto a través de un molde Importador
public class ImportadorPuntoComa extends Importador {
    @Override 
    protected LectorLinea crearLector(){ //devuelve una instancia de LectorLinea, pero ese LectorLinea es de tipo LectorPuntoComa
        return new LectorPuntoComa();
    }
}
