package icc.pap.estructurales.simple.decorator;
/**
 * 
 * Leche es DECORADOR que ENVUELVE  a una BEBIDA
 * La BEBIDA puede SER CUALQUIERA: café, expreso, chocolate.
 * a todas las bebidas las decoro con LECHE
 */
public final class Leche implements Bebida {
    //EL DECORADOR USA LO QUE ESTÁ ENVOLVIENDO
    protected final Bebida bebida;
    //este constructor con inyeccion de dependencias es lo que hace a Leche como DECORADOR

    public Leche(Bebida bebida){ //inyeccion de dependencias: DEPENDE DE la MISMA BEBIDA
        this.bebida = bebida;
    }

    @Override 
    public String descripcion(){
        return  bebida.descripcion() + "con leche"; //voy a usar el metodo DEL OBJETO QUE ESTOY DEVOLVIENDO
    }

    @Override
    public double precio() {
        return bebida.precio() + 0.5;
    }
}
