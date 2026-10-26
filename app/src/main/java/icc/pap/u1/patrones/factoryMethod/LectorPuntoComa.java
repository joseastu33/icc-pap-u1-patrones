package icc.pap.u1.patrones.factoryMethod;

public class LectorPuntoComa implements LectorLinea {
    @Override 
    public Lectura leer(String linea){
        //dividir la línea por el separador ";" 
        //devolver una instancia de lectura
        String[] lineaSeparada = linea.split("\t");
        return new Lectura(lineaSeparada[0], Double.parseDouble(lineaSeparada[1]), lineaSeparada[2]);
    }
}
