package com.example.expandableproject;

import com.thoughtbot.expandablerecyclerview.models.ExpandableGroup;

import java.util.List;

public class NotasBimestre extends ExpandableGroup<Nota> {

    public NotasBimestre(String title, List<Nota> items) {
        super(title, items);
    }
}
