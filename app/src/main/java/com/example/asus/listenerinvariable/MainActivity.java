package com.example.asus.listenerinvariable;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private Button btnFC, btnCF, btnClear;
    private EditText txtF, txtC;
    private OnClickListener myVarListener = new OnClickListener(){
        public void onClick(View arg0){
            String doF = txtF.getText().toString();
            String doC = txtC.getText().toString();
            if(arg0==btnFC)
            {
                double F = Double.parseDouble(doF);
                double C = (F - 32)*5/9;
                txtC.setText(String.valueOf(C));
            }
            else if(arg0==btnCF){
                double C = Double.parseDouble(doC);
                double F = C*9/5+32;
                txtF.setText(String.valueOf(F));
            }
            else if(arg0==btnClear){
                txtC.setText("");
                txtF.setText("");
                txtF.requestFocus();
            }
        }

    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtF = (EditText) findViewById(R.id.editTextF);
        txtC = (EditText) findViewById(R.id.editTextC);
        btnFC =(Button) findViewById(R.id.buttonFTC);
        btnCF =(Button) findViewById(R.id.buttonCTF);
        btnClear =(Button) findViewById(R.id.buttonClear);
        btnCF.setOnClickListener(myVarListener);
        btnFC.setOnClickListener(myVarListener);
        btnClear.setOnClickListener(myVarListener);
    }
}
