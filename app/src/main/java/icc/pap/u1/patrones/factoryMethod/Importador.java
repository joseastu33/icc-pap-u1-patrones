package icc.pap.u1.patrones.factoryMethod;

import java.util.ArrayList;
import java.util.List;

//mantener el proceso de importación y delega la creación
public abstract class Importador {
    //FACTORY METHOD

    protected abstract LectorLinea crearLector();
    public final List<Lectura> importacion(List<String> lecturas){ //debo crear el importador de cierta forma
        LectorLinea lector = crearLector();
        List<Lectura> resultado = new ArrayList<>();
        for(String lectura : lecturas){
            if(lectura.isBlank()) continue;
            try{
                resultado.add(lector.leer(lectura)); //el lector no sabe que es leer, solo sabe que lectorPuntoComa sabe leer
            } catch (Exception e){
                throw new IllegalArgumentException("Linea mal formada");
            }
        }
        return resultado;
    }

}
