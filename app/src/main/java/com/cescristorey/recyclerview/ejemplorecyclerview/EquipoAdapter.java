package com.cescristorey.recyclerview.ejemplorecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Luis on 23/10/2017.
 */

public class EquipoAdapter
        extends RecyclerView.Adapter<EquipoAdapter.EquipoViewHolder> {

    /*Arraylist donde almaceno los datos que se van a mostrar en el RecylerView*/
    private ArrayList<EquipoFutbol> datos;
    private final OnItemClickListener listener;

    public interface OnItemClickListener{
        void onItemClick(EquipoFutbol item);
    }

    /* Incluyo el Viewholder en el Adapter */
    public static class EquipoViewHolder
            extends RecyclerView.ViewHolder {
        /* Como atributos se incluyen los elementos que van a referenciar a los elementos de la vista*/
        private TextView tvNombre;
        private TextView tvMCampo;
        private TextView tvMEntrenador;

        /*constructor con parámetro de la vista*/
        public EquipoViewHolder(View itemView) {
            super(itemView);
            // Asocia los atributos a los widgets del layout de la vista
            tvNombre = (TextView)itemView.findViewById(R.id.tvNombre);
            tvMCampo = (TextView)itemView.findViewById(R.id.tvCampo);
            tvMEntrenador = (TextView)itemView.findViewById(R.id.tvEntrenador);
        }

        /*Muestra los datos de equipoFutbol en el item*/
        public void bindCoche(final EquipoFutbol equipoFutbol, final OnItemClickListener listener) {
            tvNombre.setText(equipoFutbol.getNombre());
            tvMCampo.setText(equipoFutbol.getCampo());
            tvMEntrenador.setText(equipoFutbol.getEntrenador());

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(equipoFutbol);
                }
            });


        }
    }


    /* Constructor con parámetros*/
    public EquipoAdapter(ArrayList<EquipoFutbol> datos, OnItemClickListener listener) {
        this.datos = datos;
        this.listener = listener;
    }

    @Override
    public EquipoViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        /*Crea la vista de un item y la "pinta"*/
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_coche, viewGroup, false);
        /* Crea un objeto de la clase EquipoViewHolder, pasándole la vista anteriormente creada*/
        EquipoViewHolder cocheVH = new EquipoViewHolder(itemView);
        /* devuelve la vissta*/
        return cocheVH;
    }

    @Override
    public void onBindViewHolder(EquipoViewHolder viewHolder, int pos) {
        EquipoFutbol equipoFutbol = datos.get(pos);
        /* Llama a bindCoche, para que "pinte" los datos del equipoFutbol que se le pasa como parámetro*/
        viewHolder.bindCoche(equipoFutbol, listener);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }


}
