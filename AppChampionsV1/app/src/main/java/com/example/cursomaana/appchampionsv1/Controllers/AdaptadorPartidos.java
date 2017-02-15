package com.example.cursomaana.appchampionsv1.Controllers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.cursomaana.appchampionsv1.Beans.Partido;
import com.example.cursomaana.appchampionsv1.R;

import java.util.ArrayList;

/**
 * Created by curso mañana on 14/02/2017.
 */
class AdaptadorPartidos extends ArrayAdapter<Partido> {
    public AdaptadorPartidos(Context context,ArrayList<Partido> datos) {
        super(context, R.layout.elemento_lista_octavos, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View itenViu=convertView;
        if(itenViu==null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            itenViu = inflater.inflate(R.layout.elemento_lista_octavos , null);
        }

        TextView nombreLocal = (TextView) itenViu.findViewById(R.id.tagEquipoLocal);
        TextView nombreVisitante = (TextView) itenViu.findViewById(R.id.tagEquipoVisitante);
        ImageView imagenLocal = (ImageView) itenViu.findViewById(R.id.tagImagenLocal);
        ImageView imagenVisitante = (ImageView) itenViu.findViewById(R.id.tagEscudoVisitante);
        TextView hora = (TextView) itenViu.findViewById(R.id.tagHora);
        TextView dia = (TextView) itenViu.findViewById(R.id.tagDia);

        nombreLocal.setText(getItem(position).getLocal().getNombre());
        imagenLocal.setImageResource(getItem(position).getLocal().getEscudo());

        hora.setText(getItem(position).getHora());
        dia.setText(getItem(position).getFecha());

        nombreVisitante.setText(getItem(position).getVisitante().getNombre());
        imagenVisitante.setImageResource(getItem(position).getVisitante().getEscudo());


        return (itenViu);
    }
}
