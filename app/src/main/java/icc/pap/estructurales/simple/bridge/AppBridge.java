package icc.pap.estructurales.simple.bridge;

public class AppBridge {
    public static void main(String[] args) {
        Notificacion not1 = new NotificacionAcademica(new CanalCorreo());
        Notificacion not2 = new NotificacionAcademica(new CanalPush());

        Notificacion notSeguridad1 = new NotificacionSeguridad(new CanalCorreo());
        Notificacion notSeguridadPush = new NotificacionSeguridad(new CanalPush());

        String mensajeAca = "Solicitud #44 aprobada";
        String mensajeSeg = "Alerta de correos Maliciosos";

        not1.notificar("DESTINATARIO",mensajeAca);
        not2.notificar("DESTINATARIO", mensajeAca); //Llega por ambos CANALES POSIBLES
        
        notSeguridad1.notificar("DESTINATARIO", mensajeSeg);
    }
}
