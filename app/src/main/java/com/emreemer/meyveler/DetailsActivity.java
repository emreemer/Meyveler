package com.emreemer.meyveler;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.emreemer.meyveler.databinding.ActivityDetailsBinding;

public class DetailsActivity extends AppCompatActivity {

    private ActivityDetailsBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailsBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();

        Meyveler selectedMeyveler = (Meyveler) intent.getSerializableExtra("meyveler");

        binding.nameText.setText(selectedMeyveler.name);
        //binding.imageView.setImageResource(selectedMeyveler.image);





    }
}