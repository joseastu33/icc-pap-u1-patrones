package icc.pap.comportamiento.observerDos;

import java.util.function.Consumer;

import icc.pap.comportamiento.observerDos.observers.ControlAsistencia;
import icc.pap.comportamiento.observerDos.observers.ControlMatricula;
import icc.pap.comportamiento.observerDos.observers.NotificadorRepresentante;
import icc.pap.comportamiento.observerDos.observers.SeguimientoAcademico;
import icc.pap.comportamiento.observerDos.observers.SeguimientoIntegral;

public class AppObserverPractica {
    public static void main(String[] args){
        Estudiante est001 = new Estudiante("EST001", "Ana Torres", 
        8.5, 1, EstadoMatricula.ACTIVO);
        Estudiante est002 = new Estudiante("EST002", 
        "Luis Pérez", 7.2, 4, EstadoMatricula.ACTIVO);
        Estudiante est003 = new Estudiante("EST003", 
        "María López", 9.1, 0,EstadoMatricula.ACTIVO);
        
        //observador de PRUEBA
        Consumer<CambioEstudiante> auditoria = cEst -> {
        System.out.printf("{AUDITORIA} %s | %s: %s -> %s%n", cEst.estudianteInvol(), cEst.atributoModificado(), cEst.atributoOld(), cEst.atributoNuevo());};

        est001.suscribir(auditoria);
        est002.suscribir(auditoria);
        est003.suscribir(auditoria);
        est001.setCodigo("EST004");
        est001.setNombreCompleto("Ana");
        //observadorDosAcademico
        SeguimientoAcademico segAc = new SeguimientoAcademico(); //tambien tipo consumer
        est001.suscribir(segAc);
        est002.suscribir(segAc);
        est003.suscribir(segAc);
        est001.setPromedioAcademico(6.2);

        //=== CASOS DE PRUEBA ===
        SeguimientoAcademico obsAcademico = new SeguimientoAcademico();
        ControlAsistencia obsAsistencia = new ControlAsistencia(); //observadores
        ControlMatricula obsMatricula = new ControlMatricula();
        SeguimientoIntegral obsRiesgo = new SeguimientoIntegral();

        //SUSCRIPCIONES de cada observador
        est001.suscribir(obsAcademico);
        est002.suscribir(obsAcademico);
        est003.suscribir(obsAcademico);

        est001.suscribir(obsAsistencia);
        est002.suscribir(obsAsistencia);
        est003.suscribir(obsAsistencia);

        est001.suscribir(obsMatricula);
        est002.suscribir(obsMatricula);
        est003.suscribir(obsMatricula);

        est001.suscribir(obsRiesgo);
        est002.suscribir(obsRiesgo);
        est003.suscribir(obsRiesgo);

        //CASO1
        System.out.println("CASO1:");
        est001.setPromedioAcademico(6.5);

        //CASO2
        System.out.println("CASO2:");
        est001.setPromedioAcademico(7.8);

        //CASO3
        System.out.println("CASO3:");
        est002.setNumeroInasistencias(7);
        
        //CASO4
        System.out.println("CASO4:");
        est003.setEstadoMatricula(EstadoMatricula.SUSPENDIDO);
        est003.setEstadoMatricula(EstadoMatricula.ACTIVO);

        //CASO05
        System.out.println("CASO05:");
        est002.setPromedioAcademico(6.4);

        //CASO06
        System.out.println("CASO06:");
        est003.setNombreCompleto("María López");
        est003.setPromedioAcademico(9.1);
        est003.setNumeroInasistencias(0);
        est003.setEstadoMatricula(EstadoMatricula.ACTIVO);

        //CASO07
        System.out.println("CASO07:");
        est001.setPromedioAcademico(6.8);
        est002.setNumeroInasistencias(8);
        est003.setPromedioAcademico(8.7);
        
        //CASO08
        System.out.println("CASO08:");
        NotificadorRepresentante obsRepresentante = new  NotificadorRepresentante();
        est001.suscribir(obsRepresentante);
        est002.suscribir(obsRepresentante);
        //PROMEDIO MENOR A 6
        est001.setPromedioAcademico(5.8);

        //INASISTENCIAS MAYORES o IGUALES A 8
        est002.setNumeroInasistencias(8);
        //SUSPENSION
        est001.setEstadoMatricula(EstadoMatricula.SUSPENDIDO);
        //ESTUDIANTE: María no debe generar avisos
        est003.setPromedioAcademico(5.0);

    }
}
