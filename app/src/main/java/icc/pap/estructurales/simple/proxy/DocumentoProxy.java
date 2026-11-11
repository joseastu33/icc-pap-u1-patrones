package icc.pap.estructurales.simple.proxy;
/**
 * Proxy que pospone la creacion de un documento REAL
 * hasta que SE LO NECESITE.
 * DocumentoProxy
 */
public class DocumentoProxy implements Documento{
    private final String path;
    private DocumentoReal documento;

    public DocumentoProxy(String path){
        this.path = path;
    }

    @Override
    public void mostrar() {
        
        if(documento == null){
            documento = new DocumentoReal(path); //el documento PROXY no se muestra HASTA QUE YO CREE un documento REAL
        }
        documento.mostrar();
    }
    
}
