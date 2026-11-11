package icc.pap.estructurales.simple.proxy;

public class AppProxy {
    public static void main(String[] args) {
        Documento doc = new DocumentoProxy("informe.pdf");
        System.out.println("El proxy ya está creado.");

        //ambos deben MOSTRAR
        doc.mostrar(); //solamente deberia MOSTRAR CARGANDO: solo una accion
        doc.mostrar(); //solamente deberia MOSTRAR MOSTRANDO

    }
}
