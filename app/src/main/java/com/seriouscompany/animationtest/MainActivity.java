package com.seriouscompany.animationtest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButtonListener();
    }

    private void addButtonListener() {
        Button button = (Button) findViewById(R.id.animate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animate();
            }
        });
    }

    private void animate() {

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.animate().translationX(100).withStartAction(new Runnable() {


            @Override
            public void run() {
                Toast.makeText(MainActivity.this, "애니메이션 시작", Toast.LENGTH_SHORT).show();
            }
        });


        textView.animate().alpha(0.3f).withEndAction(new Runnable() {
            @Override
            public void run() {
           Toast.makeText(MainActivity.this, "애니메이션 종료", Toast.LENGTH_SHORT).show();

            }
        });



    }
}
