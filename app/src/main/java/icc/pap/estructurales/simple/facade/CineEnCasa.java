package icc.pap.estructurales.simple.facade;
/**
 * CineEnCasa: clase Facade porque es una clase que coordina los componentes necesarios 
 * los componentes necesarios para una acción determinada
 * en este caso poder ver una Pelicula
 * CineEnCasa
 */
public class CineEnCasa {
    private final Proyector proyector;
    private final Reproductor reproductor; //los componentes son las instancias, valores

    public CineEnCasa(){
        this.proyector = new Proyector();
        this.reproductor = new Reproductor();
    }

    public void iniciarPelicula(String nombrePelicula){
        proyector.encender(); //ordenar los pasos 
        reproductor.reproducir(nombrePelicula);
    }


}
