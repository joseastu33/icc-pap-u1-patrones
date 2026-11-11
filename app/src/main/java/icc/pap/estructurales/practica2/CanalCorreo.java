package icc.pap.estructurales.practica2;

public class CanalCorreo implements CanalEnvio {
    @Override 
    public void enviar(String destinatario, String mensaje){
        System.out.println("Correo destinatario: " + " " + destinatario );
        System.out.println("Mensaje: " + mensaje);
    }
    
}
