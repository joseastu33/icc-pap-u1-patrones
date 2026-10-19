package icc.pap.models;

import icc.pap.models.ComputadoraBuilder;

public class Computadora {

    private String procesador;
    private int ram;
    private int almacenamiento;
    private String tarjetaGrafica;
    private boolean iluminacionRGB;

    public Computadora(){

    }

    //SETTERS
    //como se necesita que el **ConcreteBuilder** configure los valores, se colocan setters
    //lo cual permite que primero se tengan los valores configurados antes de hacer el OBJETO FINAL
    //esa separación de responsabilidad es clave en el patrón **Builder**

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }
    public void setRam(int ram){
        this.ram = ram;
    }

    public void setAlmacenamiento(int almacenamiento){
        this.almacenamiento = almacenamiento;
    }

    public void setTarjetaGrafica(String tarjetaGrafica){
        this.tarjetaGrafica = tarjetaGrafica;
    }
    public void setIluminacionRGB(boolean iluminacionRGB){
        this.iluminacionRGB = iluminacionRGB;
    }

    //GETTERS
    //para CONSULTAR VALORES una vez CONSTRUIDA la COMPUTADORA FINAL
    public String getProcesador(){
        return procesador;
    }
    public int getRam() {
        return ram;
    }
    public int getAlmacenamiento() {
        return almacenamiento;
    }
    public String getTarjetaGrafica() {
        return tarjetaGrafica;
    }
    public boolean isIluminacionRGB() {
        return iluminacionRGB;
    }
    @Override
    public String toString() {
        return "Computadora [procesador=" + procesador + ", ram=" + ram + ", almacenamiento=" + almacenamiento
                + ", tarjetaGrafica=" + tarjetaGrafica + ", iluminacionRGB=" + iluminacionRGB + "]";
    }
    
    
}
