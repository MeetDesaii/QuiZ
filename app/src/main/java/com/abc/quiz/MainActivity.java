package com.abc.quiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String [] questions = {"Q1. Coca-Cola originally contained Cocaine.",
      "Q2. Marathon was the name of a Greek messenger who ran cross country to report news of Persia's defeat in 490 BC.",
      "Q3. The launch of Sputnik in 1957 inaugurated the space age.",
      "Q4. The biceps muscle in the upper arm is the strongest muscle in the human body.",
      "Q5. Judaism, Christianity, and Islam can all be tied to the same individual.",
      "Q6. The first big hollywood \"Summer Blockbuster\" was Jaws.",
      "Q7. Elephants walk as quietly as Cats.",
      "Q8. Elvis Presley's \"Hound Dog\"(1956) catapulted rock music into mainstream culture worldwide.",
      "Q9. The \"Ring of Fire\" - where most Volcanoes are located and most Earthquakes occur - encircles the Pacific Ocean.",
      "Q10. Trees existed before Sharks.",
      "Q11. Michigan is larger than Great Britain.",
      "Q12. Cumulus Clouds weigh anywhere from 15 to 30 Pounds.",
      "Q13. There are 14 bones in a human foot.",
      "Q14. Lighters were invented before Matches.",
      "Q15. The population of California is larger than the entire population of Canada.",
      "Q16. The World's population tripled in the last 50 years.",
      "Q17. Two 12-inch pizzas have more pizza than a 17-inch pizza.",
      "Q18. Hot and Cold Water sound the same when you pour them",
      "Q19. More people are killed each year by Cows than by Sharks.",
      "Q20. The year 2017, was the Fyre Festival.",
      "Q21. Canada is the origin of the Hawaiian Pizza.",
      "Q22. in Les Misérables, Jean Valjean's prison number is 24601.",
      "Q23. \"Gone with the Wind\" was the first movie to win the Oscar for best picture.",
      "Q24. Unadjusted for Inflation, Avatar is the highest grossing movie of all time.",
      "Q25. Humans glow in the dark. (But it's too faint to see.)",
      "Q26. Oxford University has been around longer than the Aztec Empire.",
      "Q27. The Fax machine was patented in 1943.",
      "Q28. The oldest living organism on earth is a Galapagos Tortoise named Harriet.",
      "Q29. The Darker the Coffee Roast, the less caffeine it contains.",
      "Q30. The first game of Baseball was played with a dried and stitched head of a Wombat, Rather than a ball.",
      "Q31. Australia is the largest producer of wool in the world.",
      "Q32. Zeus is known as the king of Gods.",
      "Q33. Bats always turn left when they are exiting the caves.",
      "Q34. A Slug has 3000 teeth and four noses in total.",
      "Q35. Honeybees are the fastest flying insect.",
      "Q36. Eczema is not a skin disease.",
      "Q37. Australia is both a country and a continent.",
      "Q38. The highest number of shopping malls can be found in New Jersey.",
      "Q39. There is no railway system in Iceland.",
      "Q40. The femur bone is the longest and strongest bone in the body.",
      "Q41. Archimedes is considered as the father of History.",
      "Q42. A group of crows is called a ‘Murder’.",
      "Q43. Robert Brown discovered the cell nucleus.",
      "Q44. Stapes is the smallest bone in the human body.",
      "Q45. Vatican City is the largest city in the world.",
      "Q46. Baby panda is bigger than a mouse after being born.",
      "Q47. Pneumonia is a kind of infection that affects the lungs.",
      "Q48. Penguins are considered to be flightless birds.",
      "Q49. The smallest particle of an element is the molecule.",
      "Q50. On August 6, 1945, the United States dropped an atomic bomb on Hiroshima."};

    public boolean [] answers = {true, false, true, false, true, true, true, false, true,
                                 false, true, false, false, true, true, false, false, false, true,
                                 true, true, true ,false, true, true, true, false, false, true,
                                 false, true, true, false, true, false, false, true, true, true,
                                 true, false, true, true, true, false, false, true, true, false, true};

    public int score = 0;
    public int index = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = findViewById(R.id.textView);
        Button tButton = findViewById(R.id.tButton);
        Button fButton = findViewById(R.id.fButton);
        TextView textView4 = findViewById(R.id.textView4);
        Button rButton = findViewById(R.id.rButton);

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
                        textView4.setText("You have achieved "+score+" Score out of "+questions.length+" Questions.");
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
                        textView4.setText("You have achieved "+score+" Score out of "+questions.length+" Questions.");
                    }
                }
            }
        });

        rButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Main Logic
                index = 0;
                score = 0;
                textView4.setText("");
                textView.setText(questions[index]);
            }
        });

    }
}