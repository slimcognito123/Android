package com.example.cursomaana.jlistandroidexample;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

/**
 * Created by curso mañana on 14/02/2017.
 */
class AdaptadorTitulares extends ArrayAdapter<Titular> {
    public AdaptadorTitulares(Context context, Titular[] datos) {
        super(context, R.layout.vista_elemento, datos);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View itemView = inflater.inflate(R.layout.vista_elemento , null);

        TextView lblTitulo = (TextView) itemView.findViewById(R.id.tagTitulo);
        TextView lblSubtitulo = (TextView) itemView.findViewById(R.id.tagSubtitulo);

        lblTitulo.setText(getItem(position).getTitular());
        lblSubtitulo.setText(getItem(position).getSubtitulo());
        return (itemView);
    }
}