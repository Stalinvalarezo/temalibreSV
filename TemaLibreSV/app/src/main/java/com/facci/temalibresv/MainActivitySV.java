package com.facci.temalibresv;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivitySV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity_sv);
    }
    public String[][] usuario;
    public String usu,contra;

    public  void error(){ Toast.makeText(MainActivitySV.this,"Campos vacios",Toast.LENGTH_SHORT).show();}
    public boolean vacio(String user, String pass){boolean estado=true; if(user.length()==0 || pass.length()==0){estado=false;}return estado;}

    public  void Ingresar(View v){
        boolean estado=false;
        usu=((EditText)findViewById(R.id.usuarioET)).getText().toString();
        contra=((EditText)findViewById(R.id.contraseñaET)).getText().toString();
        if(vacio(usu, contra)==false){error();}
        if(usuario.length==0){}
        else{
            for (int i=0;i<usuario.length;i++){
                if(usuario[i][0].equals(usu) && usuario[i][1].equals(contra)){
                    Toast.makeText(MainActivitySV.this,"ha ingresado con exito",Toast.LENGTH_SHORT).show();
                    i=usuario.length;
                    estado=true;
                }
            }
            if (estado=false){error();}
        }
        estado=false;
    }
    public void Registrar(View v){
        boolean estado=false;
        int i=0;
        usu=((EditText)findViewById(R.id.usuarioET)).getText().toString();
        contra=((EditText)findViewById(R.id.contraseñaET)).getText().toString();
        if(vacio(usu, contra)==false){
            error();
        }
        else{
            for (i=0;i<usuario.length;i++){
                if(usuario[i][0].equals(usu)){
                    Toast.makeText(MainActivitySV.this,"Usuario ya existe",Toast.LENGTH_SHORT).show();
                    estado=false;
                    i=usuario.length;
                }
                else{
                    estado=true;
                }
            }
            if(estado==true){
                usuario[i][0]=usu;
                usuario[i][1]=contra;
                Toast.makeText(MainActivitySV.this,"Usuario resgitrado con éxito",Toast.LENGTH_SHORT).show();
            }
        }
    }
}
