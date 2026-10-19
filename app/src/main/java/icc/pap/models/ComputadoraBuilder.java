package icc.pap.models;

import icc.pap.models.Computadora;

public interface ComputadoraBuilder {
    //patron GoF Gang-of-Four 
    //El builder contiene los metodos a implementar por el concrete builder
    void construirProcesador();
    void construirRam();
    void construirAlmacenamiento();
    void construirTarjetaGrafica();
    void construirIluminacionRGB();
    
}
