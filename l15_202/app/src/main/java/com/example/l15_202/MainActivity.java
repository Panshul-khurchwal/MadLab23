package com.example.l15_202;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    boolean isEgg=true;

    public void change(View view) {
        ImageView iv = findViewById(R.id.imageView);

        if(isEgg) {


            iv.setImageResource(R.drawable.issac);
            isEgg = false;
        }else{
            iv.setImageResource(R.drawable.fly);
            isEgg=true;
        }
        }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}