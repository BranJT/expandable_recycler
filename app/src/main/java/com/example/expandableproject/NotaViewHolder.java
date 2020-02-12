package com.example.expandableproject;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;

public class NotaViewHolder extends ChildViewHolder {

    private TextView textView;

    public NotaViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv_capacidad);
    }

    public void bind(Nota nota){
        textView.setText(nota.nota);
    }
}
