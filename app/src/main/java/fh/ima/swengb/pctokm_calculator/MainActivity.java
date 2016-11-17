package fh.ima.swengb.pctokm_calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private EditText editTextInput;
    private TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        editTextInput = (EditText) findViewById(R.id.editTextInputNumber);
        textViewResult = (TextView) findViewById(R.id.textViewResult);
    }

    public void calcPC(View view){

        String numInputString = editTextInput.getText().toString();

        double input = 0;

        try {
            input = Double.parseDouble(numInputString);

            double result = input * 0.000000000000032408;
            textViewResult.setText(result + " parsec");

        } catch (NumberFormatException e) {
            textViewResult.setText("WRONG INPUT!!!");
            e.printStackTrace();
        }
    }

    public void calcKM(View view){

        String numInputString = editTextInput.getText().toString();

        double input = 0;

        try {
            input = Double.parseDouble(numInputString);

            double result = input / 0.000000000000032408;
            textViewResult.setText(result + " kilometer");

        } catch (NumberFormatException e) {
            textViewResult.setText("WRONG INPUT!!!");
            e.printStackTrace();
        }
    }
    public void showAbout(View view){
        Intent intent = new Intent(this,MainActivityShowAbout.class);
        String message = textViewResult.getText().toString();
        intent.putExtra("data", message);
        startActivity(intent);
    }
}
