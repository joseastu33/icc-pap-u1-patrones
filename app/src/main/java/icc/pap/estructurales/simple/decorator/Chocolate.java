package icc.pap.estructurales.simple.decorator;

public final class Chocolate implements Bebida{
    protected final Bebida bebida;

    public Chocolate(Bebida bebida){
        this.bebida = bebida;
    }

    @Override
    public String descripcion() {
        return bebida.descripcion() + "con chocolate";
    }

    @Override
    public double precio() {
        return bebida.precio() + 0.75;
    }
    //DECORATOR que agrega "Chocolate" a la descripción
    //agrega 0.75 al precio

    //EN APP necesito 
    //1: CAFE con chocolate
    //2: CAFE con leche y chocolate
    //3: CAFE con chocolate y leche
    //4: CAFE con chocolate y chocolate y leche

    //DECORADOR ABSTRACTO: DecoradorCargador
    //1 implementar Cargador
    //2 depender de un Cargador

    //DECORADORES CONCRETOS
    //DecoradorRegistro
        //antes de la carga, imprimir "Iniciando carga con ..."
        //cargar metodo del hijo
        //imprimir carga finalizada
    //DecoradorSeguridad atributo booleano permitido
        //antes de la carga, imprimir "Verificando seguridad"
        //preguntar si es permitido
        //si es permitido: entonces cargar con el metodo del hijo
        //si no es permitido: mostrar "Carga bloqueada"



}
