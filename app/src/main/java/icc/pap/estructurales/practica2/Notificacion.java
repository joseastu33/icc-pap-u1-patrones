package icc.pap.estructurales.practica2;

public abstract class Notificacion {
    protected final CanalEnvio canal;

    //constructor dependiente del CANAL de ENVIO
    public Notificacion(CanalEnvio canal2){
        this.canal = canal2;
    }

    //metodo ABSTRACTO
    public abstract void notificar(String destinatario, String mensaje);

    
}
