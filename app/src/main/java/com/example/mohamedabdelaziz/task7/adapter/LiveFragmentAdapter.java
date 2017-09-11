package com.example.mohamedabdelaziz.task7.adapter;

/**
 * Created by Mohamed Abd ELaziz on 11-Sep-17.
 */

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mohamedabdelaziz.task7.R;

public class LiveFragmentAdapter extends RecyclerView.Adapter<liveHolder> {
    @Override
    public liveHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.live_frgmnt_recycle_item, null);
        liveHolder holder = new liveHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(final liveHolder holder, int position) {
        if (position == 0)
            holder.view.setBackgroundResource(R.drawable.view_selected);
        else
            holder.view.setBackgroundResource(R.drawable.view_nonselected);
    }

    @Override
    public int getItemCount() {
        return 10;
    }
}

class liveHolder extends RecyclerView.ViewHolder {

    View view;

    public liveHolder(View itemView) {
        super(itemView);
        view = itemView.findViewById(R.id.view1);
    }


}
