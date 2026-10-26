package icc.pap.creacionales.prototype;

public class PlantillaEmail {

    private String asunto;
    private String mensaje;

    public PlantillaEmail(String asunto, String mensaje){
        this.asunto = asunto;
        this.mensaje = mensaje;
    }
    public PlantillaEmail clone(){ 
        return new PlantillaEmail(asunto, mensaje); //al crear se crea con el asunto y el mensaje de la PRIMERA INSTANCIA
    }   
    //setter del asunto pero con OTRO NOMBRE
    public void cambiarAsunto(String newAsunto){
        this.asunto = newAsunto;
    }

    @Override
    public String toString() {
        return asunto + ": " + mensaje;
    }
    //getter del toString pero con OTRO NOMBRE
    public String contenido(){ // el this del 
        return this.toString();
    }
    
}
