package thiago.calculator.com.calculador;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button bPlus;
    private Button bMultiply;
    private Button bMinus;
    private Button bDivision;
    private Button bClear;
    private EditText edtValue1;
    private EditText edtValue2;
    private int numberOne;
    private int numberTwo;
    private int result;
    private float resultFloat;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bPlus = (Button)      findViewById(R.id.plus);
        bMultiply = (Button)  findViewById(R.id.multiply);
        bMinus = (Button) findViewById(R.id.minus);
        bDivision = (Button) findViewById(R.id.division);
        edtValue1 = (EditText) findViewById(R.id.editText);
        edtValue2 = (EditText)findViewById(R.id.editText2);
        bClear = (Button) findViewById(R.id.clear);

        bPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if( edtValue1.getText().toString().equals("")  && edtValue2.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this, "Enter the value 1 and value 2 to perform the calculation.", Toast.LENGTH_SHORT).show();
               else if( edtValue1.getText().toString().equals("")   || edtValue2.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this, "Fill in the empty field", Toast.LENGTH_SHORT).show();
                else{
                    numberOne = Integer.parseInt(edtValue1.getText().toString());
                    numberTwo = Integer.parseInt(edtValue2.getText().toString());
                    result = numberOne + numberTwo;
                    Toast.makeText(MainActivity.this, "The result is: " + result, Toast.LENGTH_SHORT).show();
                }
            }
        });

        bMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if( edtValue1.getText().toString().equals("")  && edtValue2.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this, "Enter the value 1 and value 2 to perform the calculation.", Toast.LENGTH_SHORT).show();
               else if( edtValue1.getText().toString().equals("")   || edtValue2.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this, "Fill in the empty field", Toast.LENGTH_SHORT).show();
                else{
                    numberOne = Integer.parseInt(edtValue1.getText().toString());
                    numberTwo = Integer.parseInt(edtValue2.getText().toString());
                    result = numberOne - numberTwo;
                    Toast.makeText(MainActivity.this, "The result is: " + result, Toast.LENGTH_SHORT).show();
                }
            }
        });

        bMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( edtValue1.getText().toString().equals("")  && edtValue2.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this, "Enter the value 1 and value 2 to perform the calculation.", Toast.LENGTH_SHORT).show();
               else if( edtValue1.getText().toString().equals("")   || edtValue2.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this, "Fill in the empty field", Toast.LENGTH_SHORT).show();
                else {
                    numberOne = Integer.parseInt(edtValue1.getText().toString());
                    numberTwo = Integer.parseInt(edtValue2.getText().toString());
                    result = numberOne * numberTwo;
                    Toast.makeText(MainActivity.this, "The result is: " + result, Toast.LENGTH_SHORT).show();
                }
            }
        });

        bDivision.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if( edtValue1.getText().toString().equals("")  && edtValue2.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this, "Enter the value 1 and value 2 to perform the calculation.", Toast.LENGTH_SHORT).show();
                else if( edtValue1.getText().toString().equals("")   || edtValue2.getText().toString().equals(""))
                    Toast.makeText(MainActivity.this, "Fill in the empty field", Toast.LENGTH_SHORT).show();
                else {
                    numberOne = Integer.parseInt(edtValue1.getText().toString());
                    numberTwo = Integer.parseInt(edtValue2.getText().toString());

                    if(numberTwo == 0)
                        Toast.makeText(MainActivity.this, "ERROR!", Toast.LENGTH_SHORT).show();
                    else   {
                        resultFloat = (float)numberOne / (float)numberTwo;
                        Toast.makeText(MainActivity.this, "The result is: " + resultFloat, Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

        bClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                edtValue1.setText("");
                edtValue2.setText("");

            }
        });


    }
}
