package com.example.cursomaana.appchampionsv1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by curso mañana on 14/02/2017.
 */
class AdaptadorPartidos extends ArrayAdapter<Partido> {
    public AdaptadorPartidos(Context context,ArrayList<Partido> datos) {
        super(context, R.layout.elemento_lista_octavos, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View itemView = inflater.inflate(R.layout.elemento_lista_octavos , null);

        TextView nombreLocal = (TextView) itemView.findViewById(R.id.tagEquipoLocal);
        TextView nombreVisitante = (TextView) itemView.findViewById(R.id.tagEquipoVisitante);
        TextView hora = (TextView) itemView.findViewById(R.id.tagHora);
        TextView dia = (TextView) itemView.findViewById(R.id.tagDia);

        nombreLocal.setText(getItem(position).getLocal().getNombre());
        hora.setText(getItem(position).getHora());
        dia.setText(getItem(position).getFecha());
        nombreVisitante.setText(getItem(position).getVisitante().getNombre());

        return (itemView);
    }
}
