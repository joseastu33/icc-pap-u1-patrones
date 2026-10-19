package icc.pap.models;

public class ComputadoraDirector {
    public void construirComputadora(ComputadoraBuilder builder){ //aunque recibe ComputadoraBuilder se puede pasarle una clase que implemente
        //Director: delega el orden de los pasos que se ejecutarán en el builder
        builder.construirProcesador();
        builder.construirRam();
        builder.construirAlmacenamiento();
        builder.construirTarjetaGrafica();
        builder.construirIluminacionRGB();
        //usamos ComputadoraBuilder como parametro porque podemos colocar CUALQUIER objeto que IMPLEMENTE esa INTERFAZ
        //si elegimos ComputadoraConcreteBuilder solo podremos pasar el ConcreteBuilder, ningun otro objeto de ningun otra clase mas
        //por lo cual el Director queda vinculado a una sola clase
        //Java sabe que ese objeto creado (ConcreteBuilder) debe implementar CADA UNO DE LOS METODOS
        
    }
}
