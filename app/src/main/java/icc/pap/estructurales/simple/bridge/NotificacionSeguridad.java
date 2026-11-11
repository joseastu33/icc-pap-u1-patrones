package icc.pap.estructurales.simple.bridge;

public class NotificacionSeguridad extends Notificacion{
    
     public NotificacionSeguridad(CanalEnvio canal) {
        super(canal);
    }

    @Override
    public void notificar(String destinatario, String mensaje) {
        canal.enviar(destinatario, "Not Push" + mensaje); //llama al meotodo ENVIAR 
    }
}
