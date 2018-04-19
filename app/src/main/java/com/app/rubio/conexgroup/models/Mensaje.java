package com.app.rubio.conexgroup.models;

/**
 * Created by Rubio on 19/04/2018.
 */

public class Mensaje {
    private String mensaje;
    private String nombre;
    private String foto_perfil;
    private String type_mensaje;
    private String hora;

    public Mensaje() {
    }

    public Mensaje(String mensaje, String nombre, String foto_perfil, String type_mensaje, String hora) {
        this.mensaje = mensaje;
        this.nombre = nombre;
        this.foto_perfil = foto_perfil;
        this.type_mensaje = type_mensaje;
        this.hora = hora;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFoto_perfil() {
        return foto_perfil;
    }

    public void setFoto_perfil(String foto_perfil) {
        this.foto_perfil = foto_perfil;
    }

    public String getType_mensaje() {
        return type_mensaje;
    }

    public void setType_mensaje(String type_mensaje) {
        this.type_mensaje = type_mensaje;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }
}
