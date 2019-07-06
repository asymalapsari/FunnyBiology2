package asymalaps.funnybiology;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;


public class quiztype extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiztype);}

    public void intent2 (View view) {
        Intent i = new Intent(quiztype.this, biotechnology.class);
        startActivity(i);
    }

    public void intent3 (View view) {
        Intent i = new Intent(quiztype.this, organism.class);
        startActivity(i);
    }

    public void intent4 (View view) {
        Intent i = new Intent(quiztype.this, genetics.class);
        startActivity(i);
    }
}

