package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Scanner;

public class MainActivity extends AppCompatActivity {

    public void convertCurrency(View view) {

        EditText editText = (EditText) findViewById(R.id.editText);
        TextView textView2 = (TextView) findViewById(R.id.textView2);

        try{
            String rs = "1.00";
            rs = editText.getText().toString();
            double dl, eu, pd, yn;
            pd = (Double.parseDouble(rs) / (92.4223));
            dl = (Double.parseDouble(rs) / (71.0437));
            eu = (Double.parseDouble(rs) / (78.8271));
            yn = (Double.parseDouble(rs) / (0.6453));
            textView2.setText("Dollar = " + dl + "\nPound = " + pd + "\nEuro = " + eu + "\nYen = " + yn);
        }catch (Exception e) { textView2.setText("Please Enter a value"); }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
