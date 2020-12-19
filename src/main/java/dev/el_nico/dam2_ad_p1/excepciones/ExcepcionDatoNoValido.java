package dev.el_nico.dam2_ad_p1.excepciones;

public class ExcepcionDatoNoValido extends Exception {
    private static final long serialVersionUID = 1L;

    public ExcepcionDatoNoValido(String msj) {
        super(msj);
    }
}
