package icc.pap.comportamiento.observerDos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Estudiante {
    private String codigo;
    private String nombreCompleto;
    private double promedioAcademico;
    private int numeroInasistencias;
    private EstadoMatricula estadoMatricula;
    private final List<Consumer<CambioEstudiante>> listaObservers;

    public Estudiante(String codigo, String nombreCompleto, double promedioAcademico, int numeroInasistencias,
            EstadoMatricula estadoMatricula) {
        this.codigo = codigo;
        this.nombreCompleto = nombreCompleto;
        this.promedioAcademico = promedioAcademico;
        this.numeroInasistencias = numeroInasistencias;
        this.estadoMatricula = estadoMatricula;
        this.listaObservers = new ArrayList<>();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if(this.promedioAcademico == promedioAcademico){
            return;
        }
        String codigoViejo = this.codigo;
        this.codigo = codigo;
        CambioEstudiante cmbEst =new CambioEstudiante(this, "codigo", codigoViejo, codigo);
        notificar(cmbEst);
   }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        if(this.promedioAcademico == promedioAcademico){
            return;
        }
        String nombreOld = this.nombreCompleto;
        this.nombreCompleto = nombreCompleto;
        CambioEstudiante cEst = new CambioEstudiante(this, "nombre", nombreOld, nombreCompleto);
        notificar(cEst);
    }

    public double getPromedioAcademico() {
        return promedioAcademico;
    }

    public void setPromedioAcademico(double promedioAcademico) {
        if(this.promedioAcademico == promedioAcademico){
            return;
        }
        double promOld = this.promedioAcademico;
        this.promedioAcademico = promedioAcademico;
        CambioEstudiante cEst = new CambioEstudiante(this, "promedio", promOld, promedioAcademico);
        notificar(cEst);
    }

    public int getNumeroInasistencias() {
        return numeroInasistencias;
    }

    public void setNumeroInasistencias(int numeroInasistencias) {
        if (this.numeroInasistencias == numeroInasistencias) {
            return;
        }
        int old = this.numeroInasistencias;
        this.numeroInasistencias = numeroInasistencias;
        notificar(new CambioEstudiante(this, "numeroInasistencias",old, numeroInasistencias));
    
    }
    

    public EstadoMatricula getEstadoMatricula() {
        return estadoMatricula;
    }

    public void setEstadoMatricula(EstadoMatricula estadoMatricula) {
        if (this.estadoMatricula == estadoMatricula) {
            return;
        }
        EstadoMatricula estadoOld = this.estadoMatricula;
        this.estadoMatricula = estadoMatricula;
        CambioEstudiante cEst = new CambioEstudiante(this, "estadoMatricula", estadoOld, estadoMatricula);
        notificar(cEst);
    }

    public void suscribir(Consumer<CambioEstudiante> observer){
        listaObservers.add(observer);
    }
    public void notificar(CambioEstudiante estudiante){
        for(Consumer<CambioEstudiante> cambEst : listaObservers){
            cambEst.accept(estudiante);
        }
    }

    @Override
    public String toString() {
        return "Est. [codigo=" + codigo + ", nombreCompleto=" + nombreCompleto + ", promedioAcademico="
                + promedioAcademico + ", numeroInasistencias=" + numeroInasistencias + ", estadoMatricula="
                + estadoMatricula;
    }
    
    
    
}
