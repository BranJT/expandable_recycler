package com.example.expandableproject;

import android.view.View;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class NotasBimestreViewHolder extends GroupViewHolder {

    private TextView textView;

    public NotasBimestreViewHolder(View itemView) {
        super(itemView);
        textView = itemView.findViewById(R.id.tv_bimestre);
    }

    public void bind(NotasBimestre notasBimestre){
        textView.setText(notasBimestre.getTitle());
    }
}
