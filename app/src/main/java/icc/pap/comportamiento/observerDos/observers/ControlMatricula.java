package icc.pap.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.comportamiento.observerDos.CambioEstudiante;
import icc.pap.comportamiento.observerDos.EstadoMatricula;

public class ControlMatricula implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambioEst) {
        if(!cambioEst.atributoModificado().equals("estadoMatricula")){
            return;
        }
        EstadoMatricula estadoMat = cambioEst.estudianteInvol().getEstadoMatricula();

        if(estadoMat == EstadoMatricula.ACTIVO){
            System.out.println("{CONTROLMATRICULA} Estado ACTIVO");
        }
        else if (estadoMat == EstadoMatricula.SUSPENDIDO){
            System.out.println("{CONTROLMATRICULA} Estado SUSPENDIDO");
        }
        else if (estadoMat == EstadoMatricula.RETIRADO) {
            System.out.println("{CONTROLMATRICULA} Estado RETIRADO");
        }
        else {
            System.out.println("{CONTROLMATRICULA} Estado REACTIVADO");
        }
    }
    
}
