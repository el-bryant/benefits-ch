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
        binding.acvMantener.setOnClickListener(v -> {
            binding.llayMantener.setBackgroundColor(getResources().getColor(R.color.verde));
            binding.tvMantenerTitulo.setTextColor(getResources().getColor(R.color.white));
            binding.tvMantenerContenido.setTextColor(getResources().getColor(R.color.white));

            binding.llaySubir.setBackgroundColor(getResources().getColor(R.color.white));
            binding.tvSubirTitulo.setTextColor(getResources().getColor(R.color.plomo));
            binding.tvSubirContenido.setTextColor(getResources().getColor(R.color.plomo));

            binding.llayBajar.setBackgroundColor(getResources().getColor(R.color.white));
            binding.tvBajarTitulo.setTextColor(getResources().getColor(R.color.plomo));
            binding.tvBajarContenido.setTextColor(getResources().getColor(R.color.plomo));
        });
        binding.acvBajar.setOnClickListener(v -> {
            binding.llayMantener.setBackgroundColor(getResources().getColor(R.color.white));
            binding.tvMantenerTitulo.setTextColor(getResources().getColor(R.color.plomo));
            binding.tvMantenerContenido.setTextColor(getResources().getColor(R.color.plomo));

            binding.llaySubir.setBackgroundColor(getResources().getColor(R.color.white));
            binding.tvSubirTitulo.setTextColor(getResources().getColor(R.color.plomo));
            binding.tvSubirContenido.setTextColor(getResources().getColor(R.color.plomo));

            binding.llayBajar.setBackgroundColor(getResources().getColor(R.color.verde));
            binding.tvBajarTitulo.setTextColor(getResources().getColor(R.color.white));
            binding.tvBajarContenido.setTextColor(getResources().getColor(R.color.white));
        });
        binding.acvSubir.setOnClickListener(v -> {
            binding.llayMantener.setBackgroundColor(getResources().getColor(R.color.white));
            binding.tvMantenerTitulo.setTextColor(getResources().getColor(R.color.plomo));
            binding.tvMantenerContenido.setTextColor(getResources().getColor(R.color.plomo));

            binding.llaySubir.setBackgroundColor(getResources().getColor(R.color.verde));
            binding.tvSubirTitulo.setTextColor(getResources().getColor(R.color.white));
            binding.tvSubirContenido.setTextColor(getResources().getColor(R.color.white));

            binding.llayBajar.setBackgroundColor(getResources().getColor(R.color.white));
            binding.tvBajarTitulo.setTextColor(getResources().getColor(R.color.plomo));
            binding.tvBajarContenido.setTextColor(getResources().getColor(R.color.plomo));
        });
        binding.ivVolver.setOnClickListener(v -> {
            startActivity(new Intent(ObjetivoActivity.this, MainActivity.class));
            finish();
        });
    }
}