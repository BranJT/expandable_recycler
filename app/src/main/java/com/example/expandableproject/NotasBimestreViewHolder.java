package com.example.expandableproject;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.TextView;

import com.thoughtbot.expandablerecyclerview.viewholders.GroupViewHolder;

public class NotasBimestreViewHolder extends GroupViewHolder {

    private ImageView imageView;
    private TextView textView;

    public NotasBimestreViewHolder(View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.iv_arrow);
        textView = itemView.findViewById(R.id.tv_bimestre);
    }

    public void bind(NotasBimestre notasBimestre){
        textView.setText(notasBimestre.getTitle());
    }

    @Override
    public void expand() {
        animateExpand();
    }

    @Override
    public void collapse() {
        animateCollapse();
    }

    private void animateExpand(){
        RotateAnimation rotate = new RotateAnimation
                (360,180, Animation.RELATIVE_TO_SELF, 0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        imageView.setAnimation(rotate);
    }

    private void animateCollapse(){
        RotateAnimation rotate = new RotateAnimation
                (180,360, Animation.RELATIVE_TO_SELF, 0.5f,Animation.RELATIVE_TO_SELF,0.5f);
        rotate.setDuration(300);
        rotate.setFillAfter(true);
        imageView.setAnimation(rotate);
    }
}
