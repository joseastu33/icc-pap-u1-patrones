package icc.pap.estructurales.simple.composite;

public class AppComposite {
    public static void main(String[] args){
        GrupoMenu combo = new GrupoMenu();
        GrupoMenu hamburguesa = new GrupoMenu();
        hamburguesa.addItem(new ProductoMenu("Queso", 0.5));
        hamburguesa.addItem(new ProductoMenu("Carne", 1.00));
        hamburguesa.addItem(new ProductoMenu("Pan", 0.5));
        hamburguesa.addItem(new ProductoMenu("Lechuga", 0.25));
        ProductoMenu bebida = new ProductoMenu("ColaCola", 1.35);

        //si no tuviesemos interfaz no pudiesemos haber hecho lo de agregar GRUPOS e ITEMS
        combo.addItem(hamburguesa); //AGREGUE un GRUPO MENU de HAMBURGUESA
        combo.addItem(bebida); //AGREGUE un PRODUCTO MENU de BEBIDA
        System.out.println("Total del combo: " +  " $" + combo.precio());



    }
}
