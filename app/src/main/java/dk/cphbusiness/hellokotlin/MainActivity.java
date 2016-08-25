package dk.cphbusiness.hellokotlin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button secondButton = (Button)findViewById(R.id.secondButton);
        secondButton.setOnClickListener(this);
        ((Button)findViewById(R.id.thirdButton)).setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(
                                getApplicationContext(),
                                "Tjuhej",
                                Toast.LENGTH_LONG
                                ).show();
                    }
                }
        );
    }

    public void thereWasClicked(View view) {
        TextView greetingText = (TextView)findViewById(R.id.greetingText);
        greetingText.setText("Hello "+R.id.greetingText);

    }

    @Override
    public void onClick(View view) {
        Toast.makeText(this, getText(R.string.app_name), Toast.LENGTH_LONG).show();

    }
}



