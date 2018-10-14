package com.example.bijja.flashyflashcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.text_question).setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                (findViewById(R.id.text_question)).setVisibility(View.INVISIBLE);
                (findViewById(R.id.text_answer)).setVisibility(View.VISIBLE);
            }
        });
    }


}
