package icc.pap.estructurales.simple.adapter;

public class DecoradorSeguridad extends DecoradorCargador{
    private boolean permitido;

    public DecoradorSeguridad(Cargador cargadorDepende, boolean permitido){
        super(cargadorDepende);
        this.permitido = permitido;
    }

    @Override 
    public void cargarCelular(){
        System.out.println("Verificando seguridad...");

        if(permitido){
            super.cargarCelular();
        } else {
            System.out.println("Carga bloqueda"); //no se carga sin un permiso
        }
    }
}