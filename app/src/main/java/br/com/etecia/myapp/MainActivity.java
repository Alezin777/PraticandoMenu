package br.com.etecia.myapp;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavView;
    MaterialToolbar TopBar;

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
        TopBar = findViewById(R.id.TopBar);
        TopBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),
                        "Voltando",Toast.LENGTH_SHORT).show();
            }
        });

        //criando evento de click nos item de menu
        TopBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                if (item.getItemId() == R.id.mFavorite) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em Favorite", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mExplore) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em Explore", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mCloud) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em Cloud", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mArrow) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em Arrow", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mSearch) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em Search", Toast.LENGTH_SHORT).show();
                }
                if (item.getItemId() == R.id.mNewspaper) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em Newspaper", Toast.LENGTH_SHORT).show();
                }

                return false;
            }
        });
        bottomNavView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                if (menuItem.getItemId() == R.id.mNews) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em News", Toast.LENGTH_SHORT).show();

                }
                if (menuItem.getItemId() == R.id.mAdd) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em Add", Toast.LENGTH_SHORT).show();

                }
                if (menuItem.getItemId() == R.id.mNewspaper) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em Newspaper", Toast.LENGTH_SHORT).show();

                }
                if (menuItem.getItemId() == R.id.mPhone) {
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em Phone", Toast.LENGTH_SHORT).show();

                }

                return false;
            }


        });
    }
}