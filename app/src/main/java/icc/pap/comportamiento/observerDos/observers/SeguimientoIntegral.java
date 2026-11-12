package icc.pap.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.comportamiento.observerDos.CambioEstudiante;
import icc.pap.comportamiento.observerDos.EstadoMatricula;
import icc.pap.comportamiento.observerDos.Estudiante;

public class SeguimientoIntegral implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambioEst) {
        //modificacion
        String atMod = cambioEst.atributoModificado();
        if(!atMod.equals("promedio")&& !atMod.equals("numeroInasistencias")&&!atMod.equals("estadoMatricula")){
            return; //no es ningun caso : no hago nada
        }
        Estudiante est1 = cambioEst.estudianteInvol();
        if(est1.getPromedioAcademico() < 7 && est1.getNumeroInasistencias() >= 6 
        && est1.getEstadoMatricula() == EstadoMatricula.ACTIVO){
            System.out.printf("{SEGUIMIENTO} %s cumple simultáneamente con las condiciones de riesgo.%n", est1);
        }
    }
    
}