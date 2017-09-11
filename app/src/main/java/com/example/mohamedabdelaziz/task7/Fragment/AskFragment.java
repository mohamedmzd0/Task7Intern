package com.example.mohamedabdelaziz.task7.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mohamedabdelaziz.task7.R;
import com.example.mohamedabdelaziz.task7.adapter.AskFragmentAdapter;

/**
 * Created by Mohamed Abd ELaziz on 9/9/2017.
 */

public class AskFragment extends Fragment {
    RecyclerView recyclerView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.askfrgmnt, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycle_ask);
        Display display = getActivity().getWindowManager().getDefaultDisplay();
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), (int) display.getWidth() / 150));
        recyclerView.setHasFixedSize(false);
        recyclerView.setAdapter(new AskFragmentAdapter());
        return view;
    }
}
