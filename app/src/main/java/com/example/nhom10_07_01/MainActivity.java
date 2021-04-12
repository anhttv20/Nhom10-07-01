package com.example.nhom10_07_01;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.example.nhom10_07_01.fragment.FargmentNavigationAdapter;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {
    private BottomNavigationView navigationView;
    private ViewPager viewPager;
    private FargmentNavigationAdapter adapter;
    private FloatingActionButton bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewPager);
        navigationView=findViewById(R.id.navigation);
        bt=findViewById(R.id.fab);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Ban da click toi",Toast.LENGTH_SHORT).show();
            }
        });
        adapter=new FargmentNavigationAdapter(getSupportFragmentManager(),
                FargmentNavigationAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager.setAdapter(adapter);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case R.id.mHome:viewPager.setCurrentItem(0);
                     break;
                    case R.id.mSearch:viewPager.setCurrentItem(1);
                        break;
                    case R.id.mNoti:viewPager.setCurrentItem(2);
                        break;
                    case R.id.mCafe:viewPager.setCurrentItem(3);
                        break;
                }
                return true;
            }
        });

    }
}
