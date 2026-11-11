package icc.pap.estructurales.simple.proxy;

public class DocumentoReal implements Documento {
    private final String path;
    public DocumentoReal(String path){
        this.path = path;
        System.out.println("Cargando documento desde: " + path);
    }

    @Override 
    public void mostrar(){
        System.out.println("Mostrando documento desde: " + path);
    }
}
