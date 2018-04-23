package com.app.rubio.conexgroup.models;

import java.util.Map;

/**
 * Created by Rubio on 23/04/2018.
 */

public class MsjSend extends Mensaje {
    private Map hora;

    public MsjSend(){

    }
    public MsjSend(Map hora) {
        this.hora = hora;
    }

    public MsjSend(String mensaje, String nombre, String foto_perfil, String type_mensaje, Map hora) {
        super(mensaje, nombre, foto_perfil, type_mensaje);
        this.hora = hora;
    }

    public MsjSend(String mensaje, String urlFoto, String nombre, String foto_perfil, String type_mensaje, Map hora) {
        super(mensaje, urlFoto, nombre, foto_perfil, type_mensaje);
        this.hora = hora;
    }

    public Map getHora() {
        return hora;
    }

    public void setHora(Map hora) {
        this.hora = hora;
    }
}
