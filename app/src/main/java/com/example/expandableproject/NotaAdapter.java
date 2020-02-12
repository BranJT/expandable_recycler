package com.example.expandableproject;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thoughtbot.expandablerecyclerview.ExpandableRecyclerViewAdapter;
import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;
import com.thoughtbot.expandablerecyclerview.viewholders.ChildViewHolder;
import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

import java.util.List;

public class NotaAdapter extends ExpandableRecyclerViewAdapter<NotasBimestreViewHolder,NotaViewHolder> {

    public NotaAdapter(List<? extends ExpandableGroup> groups){
        super(groups);
    }

    @Override
    public NotasBimestreViewHolder onCreateGroupViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.expandable_recyclerview_notas_bimestre,parent,false);
        return new NotasBimestreViewHolder(view);
    }

    @Override
    public NotaViewHolder onCreateChildViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.expandable_recyclerview_notas_capacidad,parent,false);
        return new NotaViewHolder(view);
    }

    @Override
    public void onBindChildViewHolder(NotaViewHolder holder, int flatPosition, ExpandableGroup group, int childIndex) {
        final Nota nota = (Nota) group.getItems().get(childIndex);
        holder.bind(nota);
    }

    @Override
    public void onBindGroupViewHolder(NotasBimestreViewHolder holder, int flatPosition, ExpandableGroup group) {
        final NotasBimestre notasBimestre = (NotasBimestre) group;
        holder.bind(notasBimestre);
    }
}
