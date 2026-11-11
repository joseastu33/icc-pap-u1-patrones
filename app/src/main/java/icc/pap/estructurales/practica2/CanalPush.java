package icc.pap.estructurales.practica2;

public class CanalPush implements CanalEnvio {

    @Override
    public void enviar(String destinatario, String mensaje) {
        System.out.println("Push: " + destinatario);
        System.out.println("Mensaje: " + mensaje);
    }
    
}
