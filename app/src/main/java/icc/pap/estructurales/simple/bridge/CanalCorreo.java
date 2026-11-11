package icc.pap.estructurales.simple.bridge;

public class CanalCorreo implements CanalEnvio {

    @Override
    public void enviar(String destinatario, String mensaje) {
       System.out.println("Correo: " + mensaje);
    }

    
}
