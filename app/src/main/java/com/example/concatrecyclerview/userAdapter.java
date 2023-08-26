package com.example.concatrecyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class userAdapter extends RecyclerView.Adapter<userAdapter.userViewHolDer>{
    private List<user> mUserList;

    public void setdata(List<user> list){
        this.mUserList=list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public userViewHolDer onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_user,parent,false);
        return new userViewHolDer(view);
    }

    @Override
    public void onBindViewHolder(@NonNull userViewHolDer holder, int position) {

        user user=mUserList.get(position);
        if(user==null){
            return;
        }
        holder.imganh.setImageResource(user.getAnhuser());
        holder.txtname.setText(user.getName());
        holder.txtaddress.setText(user.getAddress());
    }

    @Override
    public int getItemCount() {
        if(mUserList!=null){
            return mUserList.size();
        }
        return 0;
    }

    public class userViewHolDer extends RecyclerView.ViewHolder{
        private ImageView imganh;
        private TextView txtname;
        private TextView txtaddress;
        public userViewHolDer(@NonNull View itemView) {
            super(itemView);
            imganh=(ImageView) itemView.findViewById(R.id.immguser);
            txtname=(TextView) itemView.findViewById(R.id.txtnameuser);
            txtaddress=(TextView) itemView.findViewById(R.id.txtaddress);
        }
    }
}
