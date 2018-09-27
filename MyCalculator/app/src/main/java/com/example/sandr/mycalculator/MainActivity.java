package com.example.sandr.mycalculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private enum Operator {none, add, sub, mul, div, eq}
    private double data1=0;
    private double data2=0;
    private Operator optr = Operator.none;
    private boolean hasDot = false;
    private boolean requiresCleaning = false;

    public void btn01Click(View view) {
        EditText eText = findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "1");
    }

    public void btn02Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "2");
    }
    public void btn03Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "3");
    }
    public void btn04Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "4");
    }
    public void btn05Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "5");
    }
    public void btn06Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "6");
    }
    public void btn07Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "7");
    }
    public void btn08Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "8");
    }
    public void btn09Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "9");
    }
    public void btn00Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + "0");
    }

// ...

    public void btnAddClick(View view) {
        optr = Operator.add;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMinusClick(View view) {
        optr = Operator.sub;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMultiplyClick(View view){
        optr = Operator.mul;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnDivideClick(View view){
        optr = Operator.div;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnClearClick(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);

        eText.setText("");
    }

    public void btnDotClick(View view){
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText() + ".");
    }

    public void btnResultClick(View view) {
        if(optr != Operator.none){
            EditText eText = (EditText) findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(eText.getText().toString());
            double result = 0;
            if(optr == Operator.add) {
                result = data1 + data2;
            } else if (optr == Operator.sub) {
                result = data1 - data2;
            } else if (optr == Operator.mul) {
                result = data1 * data2;
            } else if (optr == Operator.div) {
                result = data1 / data2;
            }
            optr = Operator.none;
            data1 = result;

            if((result - (int) result) != 0)
                eText.setText( String.valueOf(result) );
            else
                eText.setText( String.valueOf( (int) result ) );
        }
    }

    public void onClickNumericalButton (View view) {
        int pressID = view.getId();

        TextView curText = (TextView) findViewById(R.id.resultEdit);

        if (pressID == R.id.btn00) {
            curText.setText(curText.getText() + "0");

        } else if (pressID == R.id.btn01) {
            curText.setText(curText.getText() + "1");

        } else if (pressID == R.id.btn02) {
            curText.setText(curText.getText() + "2");

        } else if (pressID == R.id.btn03) {
            curText.setText(curText.getText() + "3");

        } else if (pressID == R.id.btn04) {
            curText.setText(curText.getText() + "4");

        } else if (pressID == R.id.btn05) {
            curText.setText(curText.getText() + "5");

        } else if (pressID == R.id.btn06) {
            curText.setText(curText.getText() + "6");

        } else if (pressID == R.id.btn07) {
            curText.setText(curText.getText() + "7");

        } else if (pressID == R.id.btn08) {
            curText.setText(curText.getText() + "8");

        } else if (pressID == R.id.btn09) {
            curText.setText(curText.getText() + "9");

        } else if (pressID == R.id.btnDot) {
            curText.setText(curText.getText() + ".");

        } else {
            curText.setText("ERROR");
            //Log.d("Error","Error: Unknown Button pressed!");

        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
