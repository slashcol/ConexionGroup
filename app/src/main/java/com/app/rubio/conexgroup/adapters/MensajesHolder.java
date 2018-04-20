package com.app.rubio.conexgroup.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.rubio.conexgroup.R;

/**
 * Created by Rubio on 19/04/2018.
 */

public class MensajesHolder extends RecyclerView.ViewHolder {
    private TextView nombre;
    private TextView mensaje;
    private TextView hora;
    private ImageView image_perfil;
    private ImageView fotoMensaje;
    public MensajesHolder(View itemView) {
        super(itemView);

        nombre = (TextView)itemView.findViewById(R.id.txt_name_item);
        mensaje = (TextView)itemView.findViewById(R.id.txt_msj_item);
        hora = (TextView)itemView.findViewById(R.id.txt_date_item);
        image_perfil = (ImageView)itemView.findViewById(R.id.img_perfil_item);
        fotoMensaje = (ImageView)itemView.findViewById(R.id.img_mensaje);
    }

    public TextView getNombre() {
        return nombre;
    }

    public void setNombre(TextView nombre) {
        this.nombre = nombre;
    }

    public TextView getMensaje() {
        return mensaje;
    }

    public void setMensaje(TextView mensaje) {
        this.mensaje = mensaje;
    }

    public TextView getHora() {
        return hora;
    }

    public void setHora(TextView hora) {
        this.hora = hora;
    }

    public ImageView getImage_perfil() {
        return image_perfil;
    }

    public void setImage_perfil(ImageView image_perfil) {
        this.image_perfil = image_perfil;
    }

    public ImageView getFotoMensaje() {
        return fotoMensaje;
    }

    public void setFotoMensaje(ImageView fotoMensaje) {
        this.fotoMensaje = fotoMensaje;
    }
}
