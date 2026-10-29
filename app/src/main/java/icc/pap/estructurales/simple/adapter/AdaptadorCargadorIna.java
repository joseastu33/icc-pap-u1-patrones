package icc.pap.estructurales.simple.adapter;

public class AdaptadorCargadorIna implements Cargador {

    private final CargadorInalambrico cargadorInalambrico;

    public AdaptadorCargadorIna(CargadorInalambrico cargadorInalambrico){
        this.cargadorInalambrico = cargadorInalambrico;
    }

    @Override
    public void cargarCelular() {
        //aqui está TODA la LOGICA del PROYECTO
        //VALIDACIONES
        //TRY CATCH
        //TODO lo que sea DE CARGADOR CELULAR, solo de este
        cargadorInalambrico.cargarBase();
    }
    
}
