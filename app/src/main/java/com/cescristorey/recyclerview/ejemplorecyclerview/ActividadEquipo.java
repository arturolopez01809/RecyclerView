package com.cescristorey.recyclerview.ejemplorecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class ActividadEquipo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actividad_equipo);

        Bundle datos = this.getIntent().getExtras();

        String r = datos.getString("variable_nombre");

        TextView nombre_equipo = findViewById(R.id.textViewEquipo);
        TextView nombre_campo = findViewById(R.id.textViewCampo);
        TextView nombre_entrenador = findViewById(R.id.textViewEntrenador);

        nombre_equipo.setText(r);



    }
}