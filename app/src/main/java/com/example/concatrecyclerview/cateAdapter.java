package com.example.concatrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class cateAdapter extends RecyclerView.Adapter<cateAdapter.cateViewHolDer> {
    private List<category>mCategories;

    public void setdata(List<category> list){
        this.mCategories=list;
        notifyDataSetChanged();
    }
    @NonNull
    @Override
    public cateViewHolDer onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_category,parent,false);

        return new cateViewHolDer(view);
    }

    @Override
    public void onBindViewHolder(@NonNull cateViewHolDer holder, int position) {

        category category=mCategories.get(position);
        if(category==null){
            return;
        }
        holder.imgcate.setImageResource(category.getAnhcate());
        holder.txtname.setText(category.getName());
    }

    @Override
    public int getItemCount() {
        if(mCategories!=null){
            return mCategories.size();
        }
        return 0;
    }

    public class cateViewHolDer extends RecyclerView.ViewHolder{
        private ImageView imgcate;
        private TextView txtname;
        public cateViewHolDer(@NonNull View itemView) {
            super(itemView);
            imgcate=(ImageView) itemView.findViewById(R.id.immganhcate);
            txtname=(TextView) itemView.findViewById(R.id.txtnamecate);
        }
    }
}
