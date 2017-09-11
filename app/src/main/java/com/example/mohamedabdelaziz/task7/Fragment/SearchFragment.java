package com.example.mohamedabdelaziz.task7.Fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.example.mohamedabdelaziz.task7.R;
import com.example.mohamedabdelaziz.task7.adapter.SearchFgmtAdapter;

/**
 * Created by Mohamed Abd ELaziz on 9/9/2017.
 */

public class SearchFragment extends Fragment {
    RecyclerView recyclerView;
    ImageButton doctor ,user;
    ImageView cleartext;
    EditText textv;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
         View view = inflater.inflate(R.layout.searchfrgmnt, container, false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycle_search_view);
        recyclerView.setAdapter(new SearchFgmtAdapter());
        doctor= (ImageButton) view.findViewById(R.id.doctor) ;
        user= (ImageButton) view.findViewById(R.id.user) ;
        doctor.setImageResource(R.drawable.btn_dr_select);
        user.setImageResource(R.drawable.btn_member);
        cleartext= (ImageView) view.findViewById(R.id.cleartext) ;
        textv= (EditText) view.findViewById(R.id.textv);
        cleartext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textv.setText("");
            }
        });
        doctor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doctor.setImageResource(R.drawable.btn_dr_select);
                user.setImageResource(R.drawable.btn_member);
            }
        });
        user.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                doctor.setImageResource(R.drawable.btn_dr);
                user.setImageResource(R.drawable.btn_member_select);
            }
        });

        return view;
    }


}
