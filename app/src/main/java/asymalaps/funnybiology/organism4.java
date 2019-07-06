package asymalaps.funnybiology;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class organism4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organism4);
    }

    public void intent8 (View view) {
        Intent i = new Intent(organism4.this, organism5.class);
        startActivity(i);
    }

}
