package com.example.finfun;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.List;

public class SmartAdapter extends SliderViewAdapter<SmartAdapter.MyViewHolder> {

    List<Integer> list;
    SmartAdapter(List<Integer> imageList){

        this.list = imageList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.swipe_layout,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(MyViewHolder viewHolder, int position) {
        viewHolder.swipe_image.setImageResource(list.get(position));
    }

    @Override
    public int getCount() {
        return list.size();
    }

    class MyViewHolder extends SliderViewAdapter.ViewHolder{
        ImageView swipe_image;
        public MyViewHolder(View itemView) {
            super(itemView);
            swipe_image = itemView.findViewById(R.id.swipe_image);
        }

    }

}
