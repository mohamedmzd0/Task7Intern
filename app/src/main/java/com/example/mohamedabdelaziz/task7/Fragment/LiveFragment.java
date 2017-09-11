package com.example.mohamedabdelaziz.task7.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mohamedabdelaziz.task7.R;
import com.example.mohamedabdelaziz.task7.adapter.LiveFragmentAdapter;

import static com.example.mohamedabdelaziz.task7.R.id.liverecycle;

/**
 * Created by Mohamed Abd ELaziz on 9/9/2017.
 */

public class LiveFragment extends Fragment {
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.livefrgmnt, container, false);
        recyclerView = (RecyclerView) view.findViewById(liverecycle);
        recyclerView.setAdapter(new LiveFragmentAdapter());
        return view;
    }
}
