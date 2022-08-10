package br.com.myskout.myskout;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


public class TalentosFragment extends Fragment {

    Button btnMostrarTalentos;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_talentos, container, false);

        btnMostrarTalentos = view.findViewById(R.id.btnMostrarTalentos);

        btnMostrarTalentos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getContext(),"Talentos",
                        Toast.LENGTH_SHORT).show();
            }
        });


        return view;
    }
}