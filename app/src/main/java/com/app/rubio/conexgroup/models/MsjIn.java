package com.app.rubio.conexgroup.models;

/**
 * Created by Rubio on 23/04/2018.
 */

public class MsjIn extends Mensaje {
    private Long hora;

    public MsjIn(){

    }

    public MsjIn(Long hora) {
        this.hora = hora;
    }

    public MsjIn(String mensaje, String nombre, String foto_perfil, String type_mensaje, Long hora) {
        super(mensaje, nombre, foto_perfil, type_mensaje);
        this.hora = hora;
    }

    public MsjIn(String mensaje, String urlFoto, String nombre, String foto_perfil, String type_mensaje, Long hora) {
        super(mensaje, urlFoto, nombre, foto_perfil, type_mensaje);
        this.hora = hora;
    }

    public Long getHora() {
        return hora;
    }

    public void setHora(Long hora) {
        this.hora = hora;
    }
}
