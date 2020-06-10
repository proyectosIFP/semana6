package com.example.aplicacinftc.Adapters;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.core.content.res.ResourcesCompat;


import com.example.aplicacinftc.Models.Reunion;
import com.example.aplicacinftc.R;

import java.util.ArrayList;
import java.util.List;

public class GridAdapterGrupos2 extends BaseAdapter {


    private Context context;
    private int layout;
    private List<Reunion> list;

    public GridAdapterGrupos2(Context context, int layout, List<Reunion> list) {
        this.context = context;
        this.layout = layout;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Reunion getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder holder;

        if (convertView == null) {
            // SÃ³lo si estÃ¡ nulo, es decir, primera vez en ser renderizado, inflamos
            // y adjuntamos las referencias del layout en una nueva instancia de nuestro
            // ViewHolder, y lo insertamos dentro del convertView, para reciclar su uso
            convertView = LayoutInflater.from(context).inflate(layout, null);
            holder = new ViewHolder();

            holder.nombreItem = (TextView) convertView.findViewById(R.id.listviewNombreGrupo);
            holder.fechaItem = (TextView) convertView.findViewById(R.id.listviewFechaGrupo);
            holder.horaItem = (TextView) convertView.findViewById(R.id.listviewHoraGrupo);
            convertView.setTag(holder);
        } else {
            // Obtenemos la referencia que posteriormente pusimos dentro del convertView
            // Y asÃ­, reciclamos su uso sin necesidad de buscar de nuevo, referencias con FindViewById
            holder = (ViewHolder) convertView.getTag();
        }
        Resources res = context.getResources();
        Drawable drawable = ResourcesCompat.getDrawable(res, R.drawable.radius, null);
        //holder.shape.setBackground(drawable);

        final Reunion currentUser = getItem(position);

        holder.nombreItem.setText(currentUser.getSolicitado());
        holder.fechaItem.setText(currentUser.getFecha());
        holder.horaItem.setText(currentUser.getHora());




        return convertView;
    }

    public void setFilter(List<Reunion>list){
        this.list=new ArrayList<>();
        this.list.addAll(list);
        notifyDataSetChanged();

    }

    static class ViewHolder {

        private TextView fechaItem;
        private TextView nombreItem;
        private TextView horaItem;
        private LinearLayout shape;

    }
}
