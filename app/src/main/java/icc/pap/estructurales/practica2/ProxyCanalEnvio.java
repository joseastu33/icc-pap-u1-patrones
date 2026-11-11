package icc.pap.estructurales.practica2;

public class ProxyCanalEnvio implements CanalEnvio {
    
    private CanalEnvio canalR;
    private boolean esAutorizado;

    @Override
    public void enviar(String destinatario, String mensaje) {
        canalR.enviar(destinatario, "Proxy" + mensaje);
    }

}
