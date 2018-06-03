package com.example.elkay.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private TextView para;
    private EditText amt;
    private Button convert;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        para = findViewById(R.id.displayTextView);
        amt = findViewById(R.id.amountEditText);
        convert = findViewById(R.id.btnConvert);

        convert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Double amount = Double.parseDouble(amt.getText().toString());
                Double result = amount*66.94;
                para.setText(String.valueOf(amount)+" $ = "+"Rs. "+String.valueOf(result));
            }
        });

    }
}
