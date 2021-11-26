package com.emreemer.meyveler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.emreemer.meyveler.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;


    ArrayList<Meyveler> ArrayListMeyveler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        ArrayListMeyveler = new ArrayList<>();



        Meyveler elma = new Meyveler("Elma" , R.drawable.elma,"100 Kalori");
        Meyveler armut = new Meyveler("Armut" , R.drawable.armut, "50 Kalori");
        Meyveler karpuz = new Meyveler("Karpuz" , R.drawable.karpuz, "24 Kalori");


        ArrayListMeyveler.add(elma);
        ArrayListMeyveler.add(armut);
        ArrayListMeyveler.add(karpuz);




        MeyvelerAdapter meyvelerAdapter = new MeyvelerAdapter(ArrayListMeyveler);


        binding.recyclerView.setAdapter(meyvelerAdapter);

        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));






    }
}