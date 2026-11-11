package icc.pap.estructurales.simple.bridge;

public abstract class Notificacion {

    protected final CanalEnvio canal;

    //constructor dependiente del CANAL de ENVIO
    public Notificacion(CanalEnvio canal){
        this.canal = canal;
    }

    //metodo ABSTRACTO
    public abstract void notificar(String destinatario, String mensaje);

}
