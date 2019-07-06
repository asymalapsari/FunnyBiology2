package asymalaps.funnybiology;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class organism3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organism3);
    }

    public void intent7 (View view) {
        Intent i = new Intent(organism3.this, organism4.class);
        startActivity(i);
    }

}
