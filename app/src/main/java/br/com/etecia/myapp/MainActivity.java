package br.com.etecia.myapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView  bottomNavView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //apresentando o xml para o java
        bottomNavView = findViewById(R.id.bottomNavView);
        //criando evento de click nos item de menu
        bottomNavView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.mNews) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em News",Toast.LENGTH_SHORT).show();

                }if (menuItem.getItemId() == R.id.mAdd) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em Add",Toast.LENGTH_SHORT).show();

                }if (menuItem.getItemId() == R.id.mNewspaper) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em Newspaper",Toast.LENGTH_SHORT).show();

                }if (menuItem.getItemId() == R.id.mPhone) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em Phone",Toast.LENGTH_SHORT).show();

                }

                return false;
            }


        });
    }
}