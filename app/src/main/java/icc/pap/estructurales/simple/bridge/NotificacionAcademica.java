package icc.pap.estructurales.simple.bridge;

public class NotificacionAcademica extends Notificacion {

    public NotificacionAcademica(CanalEnvio canalEnvio) {
        super(canalEnvio);
    }

    @Override
    public void notificar(String destinatario, String mensaje) {
        canal.enviar(destinatario, "Not Academico" + mensaje); //llama al meotodo ENVIAR 
    }
    
}
