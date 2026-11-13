package icc.pap.comportamiento.observerDos.observers;

import java.util.function.Consumer;

import icc.pap.comportamiento.observerDos.CambioEstudiante;
import icc.pap.comportamiento.observerDos.EstadoMatricula;
import icc.pap.comportamiento.observerDos.Estudiante;

/**
 * 
 * NotificadorRepresentante: OBSERVADOR NUEVO DEL CASO 8
 */
public class NotificadorRepresentante
        implements Consumer<CambioEstudiante> {

    @Override
    public void accept(CambioEstudiante cambioEst) {
        Estudiante est = cambioEst.estudianteInvol();
        if (est.getPromedioAcademico() < 6.0) {
            System.out.println("{REPRESENTANTE} Notificar debido a bajo rendimiento: "+ est);}

        if (est.getNumeroInasistencias() >= 8) {
            System.out.println("{REPRESENTANTE} Notificar debido a exceso de inasistencias: "+ est);}

        if (cambioEst.atributoModificado().equals("estadoMatricula")&& est.getEstadoMatricula() == EstadoMatricula.SUSPENDIDO) {

            System.out.println( "{REPRESENTANTE} Notificar suspensión de matrícula: "+ est);
        }
    }
}
