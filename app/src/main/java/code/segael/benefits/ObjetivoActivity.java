package code.segael.benefits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import code.segael.benefits.databinding.ActivityObjetivoBinding;

public class ObjetivoActivity extends AppCompatActivity {
    ActivityObjetivoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityObjetivoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.ivVolver.setOnClickListener(v -> {
            startActivity(new Intent(ObjetivoActivity.this, MainActivity.class));
            finish();
        });
    }
}