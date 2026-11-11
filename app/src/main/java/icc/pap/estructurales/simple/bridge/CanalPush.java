package icc.pap.estructurales.simple.bridge;

public class CanalPush implements CanalEnvio {
    @Override 
    public void enviar(String destinatario, String mensaje){
        System.out.println("Push: " + mensaje);
    }
}
