package icc.pap.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.comportamiento.observerDos.CambioEstudiante;
//clase que IMPLEMENTA EL CONSUMER
//metodo está DEBAJO
public class SeguimientoAcademico implements Consumer<CambioEstudiante> {
    
    //observer #2
    @Override 
    public void accept(CambioEstudiante cambioEst){
        if(!cambioEst.atributoModificado().equals("promedio")){
            return;   //si NO ES promedio
        }
        double anterior = (double) cambioEst.atributoOld();
        double nuevo = (double) cambioEst.atributoNuevo();
        if(anterior >= 7 && nuevo < 7){
            System.out.println("{ACADEMICO} Bajo rendimiento" + cambioEst); //notifico
        }
        if(anterior < 7 && nuevo >= 7){ //el promedio es actualizado siempre
            System.out.println("{ACADEMICO} Recuperacion academica: " + cambioEst.estudianteInvol());
        }
            }
}
