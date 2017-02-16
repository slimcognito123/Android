package com.example.cursomaana.appchampionsv1.Controllers;

import android.content.Context;
import android.content.Intent;
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

    private TextView nombreLocal;
    private TextView nombreVisitante;
    private ImageView imagenLocal;
    private ImageView imagenVisitante;
    private TextView hora;
    private TextView dia;

    public AdaptadorPartidos(Context context, ArrayList<Partido> datos) {
        super(context, R.layout.elemento_lista_octavos, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {

        View itenViu=convertView;
        if(itenViu==null){
            LayoutInflater inflater = LayoutInflater.from(getContext());
            itenViu = inflater.inflate(R.layout.elemento_lista_octavos , null);
        }

        nombreLocal = (TextView) itenViu.findViewById(R.id.tagEquipoLocal);
        nombreVisitante = (TextView) itenViu.findViewById(R.id.tagEquipoVisitante);
        imagenLocal = (ImageView) itenViu.findViewById(R.id.tagImagenLocal);
        imagenVisitante = (ImageView) itenViu.findViewById(R.id.tagEscudoVisitante);
        hora = (TextView) itenViu.findViewById(R.id.tagHora);
        dia = (TextView) itenViu.findViewById(R.id.tagDia);

        final Partido partido = getItem(position);

        nombreLocal.setText(partido.getLocal().getNombre());
        imagenLocal.setImageResource(partido.getLocal().getEscudo());

        hora.setText(partido.getHora());
        dia.setText(partido.getFecha());

        nombreVisitante.setText(partido.getVisitante().getNombre());
        imagenVisitante.setImageResource(partido.getVisitante().getEscudo());

        imagenLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getContext(),DetalleEquipo.class);
                intent.putExtra("equipo",partido.getLocal().getNombre());
                getContext().startActivity(intent);
            }
        });

        imagenVisitante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent (getContext(),DetalleEquipo.class);
                intent.putExtra("equipo",partido.getVisitante().getNombre());
                getContext().startActivity(intent);
            }
        });

        return (itenViu);
    }

}
