package dev.el_nico.dam2_ad_p1.excepciones;

public class ExcepcionClienteDuplicado extends Exception {
    private static final long serialVersionUID = 3L;
    
    public ExcepcionClienteDuplicado(String msj) {
        super(msj);
    }
}
