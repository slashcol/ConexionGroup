package com.app.rubio.conexgroup.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.app.rubio.conexgroup.R;
import com.app.rubio.conexgroup.models.Mensaje;
import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rubio on 19/04/2018.
 */

public class MensajesAdapter extends RecyclerView.Adapter<MensajesHolder> {

    private List<Mensaje>mensajeList = new ArrayList<>();
    private Context c;

    public MensajesAdapter(Context c) {
        this.c = c;
    }

    public void addMensaje(Mensaje m){
        mensajeList.add(m);
        notifyItemInserted(mensajeList.size());
    }

    @Override
    public MensajesHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(c).inflate(R.layout.item_chat,parent,false);
        return new MensajesHolder(v);
    }

    @Override
    public void onBindViewHolder(MensajesHolder holder, int position) {
        holder.getNombre().setText(mensajeList.get(position).getNombre());
        holder.getMensaje().setText(mensajeList.get(position).getMensaje());
        holder.getHora().setText(mensajeList.get(position).getHora());
        if (mensajeList.get(position).getType_mensaje().equals("2")) {
            holder.getFotoMensaje().setVisibility(View.VISIBLE);
            holder.getMensaje().setVisibility(View.VISIBLE);
            Glide.with(c).load(mensajeList.get(position).getUrlFoto()).into(holder.getFotoMensaje());
        }else if(mensajeList.get(position).getType_mensaje().equals("1")){
            holder.getFotoMensaje().setVisibility(View.GONE);
            holder.getMensaje().setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return mensajeList.size();
    }
}
