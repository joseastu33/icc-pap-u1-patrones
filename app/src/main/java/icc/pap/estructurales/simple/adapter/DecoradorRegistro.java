package icc.pap.estructurales.simple.adapter;

public class DecoradorRegistro extends DecoradorCargador { //decorador concreto
    
    protected DecoradorCargador decC;

    public DecoradorRegistro(Cargador cargador){
        super(cargador); //constructor del PADRE
    }

    @Override
    public void cargarCelular(){
        System.out.println("Iniciando carga..."); 
        super.cargarCelular(); //cargar el metodo del HIJO
        System.out.println("Carga finalizada");

    }
    
}
