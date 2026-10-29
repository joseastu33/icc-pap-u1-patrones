package icc.pap.estructurales.simple.decorator;
/*
* Decorator: agrega leche a una bebida envolviendo otra bebida
*/
public final class AppDecorator {
    public static void main(String[] args){
        Bebida bebida = new CafeSimple();
        System.out.println(bebida.descripcion() + " $" + bebida.precio());
        //otra bebida
        Bebida bebidaDosP1 = new Leche(new CafeSimple());
        Bebida bebidaDos = new Leche(bebida); //ES AGREGADO CON LECHE
        System.out.println(bebidaDos.descripcion() + " $" + bebidaDos.precio()); 
        ///Leche tiene DOS RESPONSABILIDADES:
        /// SER EL DECORATOR
        /// SER UNA BEBIDA
        //=== INSTANCIAS ===
        Bebida bebidaTres = new Chocolate(new CafeSimple()); //1: CAFE con chocolate
        Bebida bebidaCuatro = new Chocolate(new Leche(new CafeSimple())); //3: CAFE con chocolate y leche
        Bebida bebidaCinco = new Leche(new Chocolate(new CafeSimple())); //2: CAFE con leche y chocolate
        Bebida bebidaSeis = new Leche(new Chocolate(new Chocolate(new CafeSimple()))); //4: CAFE con chocolate y chocolate y leche
        
        System.out.println(bebidaTres.descripcion() + "$" + bebidaTres.precio());
        System.out.println(bebidaCuatro.descripcion() + "$" + bebidaCuatro.precio());
        System.out.println(bebidaCinco.descripcion() + "$" + bebidaCinco.precio());
        System.out.println(bebidaSeis.descripcion() + "$" + bebidaSeis.precio());
    }
}
