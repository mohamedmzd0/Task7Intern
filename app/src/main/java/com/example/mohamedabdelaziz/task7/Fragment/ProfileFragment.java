package com.example.mohamedabdelaziz.task7.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mohamedabdelaziz.task7.R;

/**
 * Created by Mohamed Abd ELaziz on 9/9/2017.
 */

public class ProfileFragment extends Fragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.profilefrgmnt, container, false);

        return view;
    }
}
