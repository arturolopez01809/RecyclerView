package com.cescristorey.recyclerview.ejemplorecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Luis on 23/10/2017.
 */

public class EquipoAdapter
        extends RecyclerView.Adapter<EquipoAdapter.CocheViewHolder> {

    /*Arraylist donde almaceno los datos que se van a mostrar en el RecylerView*/
    private ArrayList<EquipoFutbol> datos;

    /* Incluyo el Viewholder en el Adapter */
    public static class CocheViewHolder
            extends RecyclerView.ViewHolder {
        /* Como atributos se incluyen los elementos que van a referenciar a los elementos de la vista*/
        private TextView tvNombre;
        private TextView tvMCampo;
        private TextView tvMEntrenador;

        /*constructor con parámetro de la vista*/
        public CocheViewHolder(View itemView) {
            super(itemView);
            // Asocia los atributos a los widgets del layout de la vista
            tvNombre = (TextView)itemView.findViewById(R.id.tvNombre);
            tvMCampo = (TextView)itemView.findViewById(R.id.tvCampo);
            tvMEntrenador = (TextView)itemView.findViewById(R.id.tvEntrenador);
        }

        /*Muestra los datos de equipoFutbol en el item*/
        public void bindCoche(EquipoFutbol equipoFutbol) {
            tvNombre.setText(equipoFutbol.getNombre());
            tvMCampo.setText(equipoFutbol.getCampo());
            tvMEntrenador.setText(equipoFutbol.getEntrenador());
        }
    }


    /* Constructor con parámetros*/
    public EquipoAdapter(ArrayList<EquipoFutbol> datos) {
        this.datos = datos;
    }

    @Override
    public CocheViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        /*Crea la vista de un item y la "pinta"*/
        View itemView = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.item_coche, viewGroup, false);
        /* Crea un objeto de la clase CocheViewHolder, pasándole la vista anteriormente creada*/
        CocheViewHolder cocheVH = new CocheViewHolder(itemView);
        /* devuelve la vissta*/
        return cocheVH;
    }

    @Override
    public void onBindViewHolder(CocheViewHolder viewHolder, int pos) {
        EquipoFutbol equipoFutbol = datos.get(pos);
        /* Llama a bindCoche, para que "pinte" los datos del equipoFutbol que se le pasa como parámetro*/
        viewHolder.bindCoche(equipoFutbol);
    }

    @Override
    public int getItemCount() {
        return datos.size();
    }


}
