package icc.pap.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.comportamiento.observerDos.CambioEstudiante;

public class ControlAsistencia implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambioEst) {
        if(!cambioEst.atributoModificado().equals("numeroInasistencias")){
            return;
        }

        int inasistencias = cambioEst.estudianteInvol().getNumeroInasistencias();
        
        if(inasistencias <=2){
            System.out.println("{ASISTENCIAS} Inasistencias de 0 a 2" + "NIVEL: " + "Normal");
        }
        else if(inasistencias <=5){
            System.out.println("{ASISTENCIAS} Inasistencias de 3 a 5" + "NIVEL: " + "Advertencia");
        }
        else{
            System.out.println("{ASISTENCIAS} Inasistencias 6 o +" + "NIVEL: " + "Crítico");
        }
    }
    
}
