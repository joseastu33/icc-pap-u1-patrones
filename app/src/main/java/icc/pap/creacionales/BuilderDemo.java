package icc.pap.creacionales;

import icc.pap.models.Computadora;
import icc.pap.models.ComputadoraBuilder;
import icc.pap.models.ComputadoraConcreteBuilder;
import icc.pap.models.ComputadoraDirector;

public class BuilderDemo {

     public static void runBuilder(){
        //se crea el builder encargado de CONFIGURAR los VALORES para la COMPUTADORA y llamar a su creación
        System.out.println("1) Configuracion de valores de Computadora mediante el Constructor: Todavia no configurados");
        System.out.println();
        ComputadoraConcreteBuilder constructorConcreto = new ComputadoraConcreteBuilder();
        System.out.println(constructorConcreto.toString());
        System.out.println("2) Creacion del coordinador de pasos de creación: Director");
        System.out.println();
        //se crea el DIRECTOR: responsable de MANDAR a CONSTRUIR una Computadora mediante un Constructor
        ComputadoraDirector directorComputadora = new ComputadoraDirector();
        //se delega la OPERACION de construccion
        System.out.println(("3) Delegación de construir una computadora del Director al Constructor"));
        System.out.println();
        directorComputadora.construirComputadora(constructorConcreto);

        //se devuelve un objeto FINAL: Computadora
        System.out.println("4) Es devuelto un objeto final: Computadora");
        System.out.println();
        Computadora computadoraFinal = constructorConcreto.getComputadora();
        System.out.println("* Procesador: " + computadoraFinal.getProcesador());
        System.out.println("* RAM: " + computadoraFinal.getRam());
        System.out.println("* Almacenamiento: " + computadoraFinal.getAlmacenamiento());
        System.out.println("* Tarjeta gráfica: " + computadoraFinal.getTarjetaGrafica());
        System.out.println("* Iluminación RGB: " + computadoraFinal.isIluminacionRGB());
    }
}
