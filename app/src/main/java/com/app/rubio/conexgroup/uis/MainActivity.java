package com.app.rubio.conexgroup.uis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.rubio.conexgroup.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.img_perfil)
    ImageView img_perfil;
    @BindView(R.id.txt_name)
    TextView txt_name;
    @BindView(R.id.rv_list_chat)
    RecyclerView rv_list_chat;
    @BindView(R.id.btn_send)
    Button btn_send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

    }
}
