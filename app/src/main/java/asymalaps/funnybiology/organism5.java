package asymalaps.funnybiology;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class organism5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organism5);
    }

    public void intent8 (View view) {
        Intent i = new Intent(organism5.this, pembahasan.class);
        startActivity(i);
    }
}
