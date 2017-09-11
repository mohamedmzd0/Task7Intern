package com.example.mohamedabdelaziz.task7.adapter;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.mohamedabdelaziz.task7.R;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Mohamed Abd ELaziz on 11-Sep-17.
 */

public class AskFragmentAdapter extends RecyclerView.Adapter<askHolder> {
    @Override
    public askHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.ask_frgmnt_recycle_item, null);
        askHolder holder = new askHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final askHolder holder, int position) {
        holder.circleImageView.setImageResource(R.drawable.profileuser);
        holder.name.setText("Atalogy");
        holder.view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (holder.name.getVisibility() == View.GONE)
                    holder.name.setVisibility(View.VISIBLE);
                else
                    holder.name.setVisibility(View.GONE);
            }
        });

    }

    @Override
    public int getItemCount() {
        return 10;
    }
}

class askHolder extends RecyclerView.ViewHolder {

    TextView name;
    CircleImageView circleImageView;
    View view;

    public askHolder(View itemView) {
        super(itemView);
        view = itemView;
        circleImageView = (CircleImageView) itemView.findViewById(R.id.circlerImage);
        name = (TextView) itemView.findViewById(R.id.name);
    }


}
