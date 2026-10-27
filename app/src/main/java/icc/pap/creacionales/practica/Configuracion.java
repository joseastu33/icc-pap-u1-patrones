package icc.pap.creacionales.practica;

public enum Configuracion {
    INSTANCIA;
    //el ENUM tambien necesita PERMITIR ACCEDER y GUARDAR el porcentaje de DESCUENTO
    private double porcentajeImpuesto = 0.15; //impuesto DE REFERENCIA
    public double getPorcentajeImpuesto(){ //atributo privado no puedo acceder a él SIN GETTER
        return porcentajeImpuesto;
    }
    //la INSTANCIA TAMBIEN guarda el PORCENTAJE en este caso
    public void setPorcentajeImpuesto(double porcentajeImpuesto){
        this.porcentajeImpuesto = porcentajeImpuesto;
    }

}
