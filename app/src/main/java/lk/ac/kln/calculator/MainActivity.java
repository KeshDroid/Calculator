package lk.ac.kln.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

        int numOne=0;
        int numTwo=0;
        int sum=0;
        EditText firstInput;
        EditText secondInput;
        TextView resultView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstInput=findViewById(R.id.editText);
        secondInput=findViewById(R.id.editText2);
        resultView=findViewById(R.id.textView1);
    }

    protected void addNumbers(View view){

        numOne=Integer.parseInt(firstInput.getText().toString());
        numTwo=Integer.parseInt(secondInput.getText().toString());

        int sum = numOne + numTwo;
        resultView.setText(Integer.toString(sum));
    }

    protected void subNum(View view){
        numOne=Integer.parseInt(firstInput.getText().toString());
        numTwo=Integer.parseInt(secondInput.getText().toString());

        int sub = numOne - numTwo;
        resultView.setText(Integer.toString(sub));

    }
}
