package com.abc.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String [] questions = {"Coca-Cola originally contained Cocaine.",
      "Marathon was the name of a Greek messenger who ran cross country to report news of Persia's defeat in 490 BC.",
      "The launch of Sputnik in 1957 inaugurated the space age.",
      "The biceps muscle in the upper arm is the strongest muscle in the human body.",
      "Judaism, Christianity, and Islam can all be tied to the same individual.",
      "Steak ordered \"au poivre\" comes topped with chive butter.",
      "The first big hollywood \"summer blockbuster\" was jaws.",
      "Elephants walk as quietly as cats.",
      "Elvis Presley's \"Hound Dog\"(1956) catapulted rock music into mainstream culture worldwide.",
      "The \"Ring of Fire\" - where most volcanoes are located and most earthquakes occur - encircles the Pacific Ocean."};

    public boolean[] answers = {true, false, true, false, true, false, true, true, false, true};

    public int score = 0;
    public int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        Button tButton = findViewById(R.id.tButton);
        Button fButton = findViewById(R.id.fButton);

        textView.setText(questions[index]);

        tButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Main Logic...
                // If the array is not going out of bounds.

                if(index <= questions.length-1){

                    // if you have given correct answer.

                    if(answers[index] == true){
                        score++;
                    }
                    index++;
                    if(index <= questions.length-1){
                        textView.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        fButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Main Logic...
                // If the array is not going out of bounds.

                if(index <= questions.length-1){

                    // if you have given correct answer.

                    if(answers[index] == false){
                        score++;
                    }
                    index++;
                    if(index <= questions.length-1){
                        textView.setText(questions[index]);
                    }
                    else{
                        Toast.makeText(MainActivity.this, "Your Score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
}