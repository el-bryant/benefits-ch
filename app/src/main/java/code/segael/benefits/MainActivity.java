package code.segael.benefits;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;

import code.segael.benefits.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.tietCorreo.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    binding.tilCorreo.setError(null);
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        binding.tietClave.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (s.length() > 0) {
                    binding.tilClave.setError(null);
                }
            }
            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        binding.btnAcceder.setOnClickListener(v -> {
            if (binding.tietCorreo.getText().length() == 0) {
                binding.tilCorreo.setError("Este campo es obligatorio");
            }
            if (binding.tietClave.getText().length() == 0) {
                binding.tilClave.setError("Este campo es obligatorio");
            }
        });
        binding.btnCrearCuenta.setOnClickListener(v -> {
            startActivity(new Intent(MainActivity.this, ObjetivoActivity.class));
            finish();
        });
    }
}