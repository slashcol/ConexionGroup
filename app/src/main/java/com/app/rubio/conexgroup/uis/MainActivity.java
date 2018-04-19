package com.app.rubio.conexgroup.uis;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.app.rubio.conexgroup.R;
import com.app.rubio.conexgroup.adapters.MensajesAdapter;
import com.app.rubio.conexgroup.models.Mensaje;
import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.img_perfil)
    ImageView img_perfil;
    @BindView(R.id.txt_name)
    TextView txt_name;
    @BindView(R.id.rv_list_chat)
    RecyclerView rv_list_chat;
    @BindView(R.id.edt_in_chat)
    EditText edt_msj;
    @BindView(R.id.btn_send)
    Button btn_send;
    @BindView(R.id.btn_send_img)
    ImageButton btn_send_img;

    private MensajesAdapter adapter;

    private FirebaseDatabase database;
    private DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        initializeViews();
        configDatabse();
        eventsChat();
    }
    private void initializeViews(){
        adapter = new MensajesAdapter(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        rv_list_chat.setLayoutManager(linearLayoutManager);
        rv_list_chat.setAdapter(adapter);
        btn_send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //adapter.addMensaje(new Mensaje(edt_msj.getText().toString(),txt_name.getText().toString(),"","1","00:00"));
                databaseReference.push().setValue(new Mensaje(edt_msj.getText().toString(),txt_name.getText().toString(),"","1","00:00"));
                edt_msj.setText("");
            }
        });
        adapter.registerAdapterDataObserver(new RecyclerView.AdapterDataObserver() {
            @Override
            public void onItemRangeInserted(int positionStart, int itemCount) {
                super.onItemRangeInserted(positionStart, itemCount);
                setScrollbar();
            }
        });
    }
    private void configDatabse(){
        database = FirebaseDatabase.getInstance();
        databaseReference = database.getReference("chat");
    }
    private void eventsChat(){
        databaseReference.addChildEventListener(new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                Mensaje m = dataSnapshot.getValue(Mensaje.class);
                adapter.addMensaje(m);
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });
    }
    private void setScrollbar(){
        rv_list_chat.scrollToPosition(adapter.getItemCount()-1);
    }
}
