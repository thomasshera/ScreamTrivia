package tshera.screamtrivia;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class QuestionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);
        /* I need to use OnCLickListener here for a lot of objects, surely there must be an easy way?
        When an answer button is preseed, we update hte icon of the answer pressed.
        Use the solid black one if correct, use the solid red one if incorrect.
        I also need the onclicklistener for the back button and the view button.
        After an answer is pressed, I want the buttons to slide up and cover the question, and
        Thus make space for the explanation.
         */
    }

}
