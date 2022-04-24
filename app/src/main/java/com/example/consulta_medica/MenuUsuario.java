package com.example.consulta_medica;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.FragmentosMenuUsuario.FragmentoCancelar;
import com.example.FragmentosMenuUsuario.FragmentoCita;

public class MenuUsuario extends AppCompatActivity {
    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_usuario);

        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);
    }






    /**
     *Metodo que devuelve el fragmento a mostrar por el adapter
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            if (position == 0) {

                FragmentoCita fs = new FragmentoCita();
                return fs;

            }else{
                FragmentoCancelar fc = new FragmentoCancelar();
                return fc;
            }
            //else{

            //  FragmentoAdmin fa = new FragmentoAdmin();
            //  return fa;
            //}
        }
        @Override
        public int getCount() {
            return 2;
        }
    }
}
