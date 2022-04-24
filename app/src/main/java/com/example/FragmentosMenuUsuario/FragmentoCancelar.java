package com.example.FragmentosMenuUsuario;




import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;


import com.example.FragmentosMenuUsuario.FragmentoCancelar;
import com.example.consulta_medica.CancelarCita;
import com.example.consulta_medica.MainActivity;
import com.example.consulta_medica.R;
import com.example.consulta_medica.SacarCita;

public class FragmentoCancelar extends Fragment {

    Button botonCancelarCita;
    Button botonSalirMenu;



    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;

    public FragmentoCancelar() {


    }

    public static FragmentoCancelar newInstance(String param1, String param2) {
        FragmentoCancelar fragment = new FragmentoCancelar();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;


    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);


        }





            botonSalirMenu.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {


                    Intent intent = new Intent(v.getContext(), MainActivity.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);

                }
            });

            botonCancelarCita.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    Intent intent = new Intent(v.getContext(), CancelarCita.class);
                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intent);
                }
            });

        }

        public Button getBotonCancelarCita() {
            return botonCancelarCita;
        }

        public void setBotonCancelarCita(Button botonCancelarCita) {
            this.botonCancelarCita = botonCancelarCita;
        }
    }


