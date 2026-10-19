package icc.pap.models;
import icc.pap.models.Computadora;

public class ComputadoraConcreteBuilder implements ComputadoraBuilder{
    private Computadora computadora = new Computadora();
    //implementar los metodos de la INTERFAZ para configurar cada uno de los valores

    @Override 
    public void construirProcesador(){
        computadora.setProcesador("Intel Core i7 Gen 3");
    }

    @Override
    public void construirRam(){
        computadora.setRam(64);
    }

    @Override 
    public void construirAlmacenamiento(){
        computadora.setAlmacenamiento(724);
    }

    @Override 
    public void construirTarjetaGrafica(){
        computadora.setTarjetaGrafica("RTX 5030");
    }

    @Override 
    public void construirIluminacionRGB(){
        computadora.setIluminacionRGB(true);
    }
    public Computadora getComputadora(){
        return computadora;
    }

    @Override
    public String toString() {
        return "ComputadoraConcreteBuilder [computadora=" + computadora + "]";
    }
    
    
}
