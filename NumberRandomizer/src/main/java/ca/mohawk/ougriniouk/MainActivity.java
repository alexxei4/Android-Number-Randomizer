package ca.mohawk.ougriniouk;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import java.text.ParseException;
import java.util.Random;
/// I, Alexei Ougriniouk, 000776331 certify that this material is my original work.
//No other person's work has been used without due
//acknowledgement.
// Demonstration video here ----> https://youtu.be/iHygBTCS7Q0

public class MainActivity extends AppCompatActivity {

    EditText Number;
    Button Generate;
    TextView Output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Values set to blank by default
        EditText Input = findViewById(R.id.NumInput);
        Input.setText("");
        TextView Output = findViewById(R.id.NumOutput);
        Output.setText("");




    }
    public void Calculation( View view){
        try{
            /// Identifies the values
            Number = findViewById(R.id.NumInput);
            Generate = findViewById(R.id.button);
            Output = findViewById(R.id.NumOutput);
            //copy and pasted from the assignment
            int inputValue = Integer.parseInt( "0" + Number.getText().toString() );
            Random Rand = new Random();
            // the + 1 is so that the randomizer can be inclusive ex. 6 would display 5 as the max, if i add + 1 , then 6 will be the max
            int randomnum = Rand.nextInt(inputValue + 1);
            // prints
            Output.setText(Integer.toString(randomnum));
        }
        catch(Exception e) {
            Number = findViewById(R.id.NumInput);
            Generate = findViewById(R.id.button);
            Output = findViewById(R.id.NumOutput);
            Output.setText("Invalid Input");
        }



    }
}