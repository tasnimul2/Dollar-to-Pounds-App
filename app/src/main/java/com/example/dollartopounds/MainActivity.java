package com.example.dollartopounds;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void DollarToPoundClick(View view){
        EditText DollarInput = (EditText) findViewById(R.id.DollarInputET); //Takes user input of type EditText
        double NumberValue = Double.parseDouble(DollarInput.getText().toString()); //converts DollarInput from EditText to a double
        double InPounds = NumberValue * 0.79;
        String PoundInString = Double.toString(InPounds);

        Log.i("Status","The (Dollar to Pound) Button is Pressed");

        Toast.makeText(this, "$" + DollarInput.getText().toString() + " is "  + " £" + PoundInString , Toast.LENGTH_LONG ).show();

    }
    public void PoundToDollarClick (View view){
        EditText PoundInput = (EditText) findViewById(R.id.DollarInputET); //Takes user input of type EditText
        double NumberValue2 = Double.parseDouble(PoundInput.getText().toString());//converts PoundInput from EditText to a double
        double InDollars = NumberValue2 * 1.26; //Converts pound value to dollar value
        String DollarInString = Double.toString(InDollars); //Converts the dollar value to a string to be put inside to toast

        Log.i("Status","The (Dollar to Pound) Button is Pressed");

        Toast.makeText(this, "£" + PoundInput.getText().toString() + " is " + "$" + DollarInString, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
