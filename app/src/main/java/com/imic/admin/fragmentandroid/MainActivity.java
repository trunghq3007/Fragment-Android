package com.imic.admin.fragmentandroid;


import android.net.Uri;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import com.imic.admin.fragmentandroid.BlankFragment.OnFragmentInteractionListener;

public class MainActivity extends AppCompatActivity implements OnFragmentInteractionListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        BlankFragment blankFragment = BlankFragment.newInstance("1", "2");
        fragmentTransaction.add(R.id.frameArea, blankFragment);
        fragmentTransaction.commit();

    }

    @Override
    public void onFragmentInteraction(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }
}
