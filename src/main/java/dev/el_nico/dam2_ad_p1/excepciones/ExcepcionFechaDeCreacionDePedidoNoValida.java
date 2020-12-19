package dev.el_nico.dam2_ad_p1.excepciones;

public class ExcepcionFechaDeCreacionDePedidoNoValida extends Exception {

    private static final long serialVersionUID = 6L;
    
    public ExcepcionFechaDeCreacionDePedidoNoValida(String msj) {
        super(msj);
    }
}
