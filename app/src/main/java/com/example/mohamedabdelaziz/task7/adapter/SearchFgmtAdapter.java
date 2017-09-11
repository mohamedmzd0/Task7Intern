package com.example.mohamedabdelaziz.task7.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mohamedabdelaziz.task7.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Mohamed Abd ELaziz on 9/9/2017.
 */

public class SearchFgmtAdapter extends RecyclerView.Adapter<Holder> {
    @Override
    public Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.search_frgmnt_recycle_item, null);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(Holder holder, int position) {
        holder.circleImageView.setImageResource(R.drawable.profileuser);
        holder.name.setText("Ahmed Abd Ellatif");
        holder.address.setText("Cairo health center ,2 old Church Street");
        holder.status.setText("Manual");
        holder.age.setText("30");
    }

    @Override
    public int getItemCount() {
        return 5;
    }
}

class Holder extends RecyclerView.ViewHolder {

    TextView name, address, status, age;
    CircleImageView circleImageView;

    public Holder(View itemView) {
        super(itemView);
        circleImageView = (CircleImageView) itemView.findViewById(R.id.circlerImage);
        name = (TextView) itemView.findViewById(R.id.name);
        address = (TextView) itemView.findViewById(R.id.address);
        status = (TextView) itemView.findViewById(R.id.status);
        age = (TextView) itemView.findViewById(R.id.age);

    }

}
