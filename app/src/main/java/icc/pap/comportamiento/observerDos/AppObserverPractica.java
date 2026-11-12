package icc.pap.comportamiento.observerDos;

import java.util.function.Consumer;

import icc.pap.comportamiento.observerDos.observers.SeguimientoAcademico;

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
    }
}
