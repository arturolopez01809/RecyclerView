package com.cescristorey.recyclerview.ejemplorecyclerview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //inicialización de la lista de datos de ejemplo
        ArrayList<EquipoFutbol> datos = new ArrayList<EquipoFutbol>();

        datos.add(new EquipoFutbol("Real Madrid" , ""  + "Santiago Bernabeu" ,  "Zidane"));
        datos.add(new EquipoFutbol("Real Betis Balompié" , ""  + "Benito Villamarín" ,  "Manuel Pellegrini"));
        datos.add(new EquipoFutbol("Sevilla" , ""  + "Ramón Sánchez-Pizjuán" ,  "Julen Lopetegui"));
        datos.add(new EquipoFutbol("Villareal" , ""  + "Estadio de la Cerámica" ,  "Fernando Roig Alfonso"));
        datos.add(new EquipoFutbol("Eibar" , ""  + "Estadio Municipal de Ipurúa" ,  "José Luis Mendilibar"));

        //Inicialización RecyclerView
        recyclerView = (RecyclerView) findViewById(R.id.RecView);
        recyclerView.setHasFixedSize(false);

        //Crea el adaptador, pasándole como parámetro los datos
        final EquipoAdapter adaptador = new EquipoAdapter(datos, new EquipoAdapter.OnItemClickListener() {
            @Override
            public void onItemClick(EquipoFutbol item) {
                Toast.makeText(MainActivity.this, "Equipo pulsado: ", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(), ActividadEquipo.class);

                String nombre_equipo = item.getNombre().toString();
                String nombre_campo = item.getCampo().toString();
                

                intent.putExtra("variable_nombre", nombre_equipo);
                intent.putExtra("variable_campo", nombre_campo);
                startActivity(intent);
            }
        });

        //Asocia a recylerView el adaptador
        recyclerView.setAdapter(adaptador);

        //Fija un layout linear al recyclerview
        recyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
    }
}
