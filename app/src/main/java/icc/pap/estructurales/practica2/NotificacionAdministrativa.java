package icc.pap.estructurales.practica2;

public class NotificacionAdministrativa extends Notificacion{

    public NotificacionAdministrativa(CanalEnvio canalEnv){
        super(canalEnv);
    }

    @Override
    public void notificar(String destinatario, String mensaje) {
        canal.enviar(destinatario, "Administrativo" + mensaje);
    }
}
