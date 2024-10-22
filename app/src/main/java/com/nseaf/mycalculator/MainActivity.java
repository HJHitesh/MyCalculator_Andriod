package com.nseaf.mycalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView tvNumber;
    TextView tvDetails;
    Calculator calculator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calculator = new Calculator();
        tvNumber = findViewById(R.id.tv_number);
        tvDetails = findViewById(R.id.tv_details);
    }

    public void numberClicked(View view) {
        switch (view.getId()) {
            case R.id.b_0: calculator.processNumber(0); break;
            case R.id.b_1: calculator.processNumber(1); break;
            case R.id.b_2: calculator.processNumber(2); break;
            case R.id.b_3: calculator.processNumber(3); break;
            case R.id.b_4: calculator.processNumber(4); break;
            case R.id.b_5: calculator.processNumber(5); break;
            case R.id.b_6: calculator.processNumber(6); break;
            case R.id.b_7: calculator.processNumber(7); break;
            case R.id.b_8: calculator.processNumber(8); break;
            case R.id.b_9: calculator.processNumber(9); break;
        }
        updateCalcUI();
    }

    public void clearClicked(View view) {
        calculator.clearClicked();
        updateCalcUI();
    }

    public void memPlusClicked(View view) {
        calculator.memPlusClicked();
        updateCalcUI();
    }

    public void memMinusClicked(View view) {
        calculator.memMinusClicked();
        updateCalcUI();
    }

    public void memClearClicked(View view) {
        calculator.memClearClicked();
        updateCalcUI();
    }

    public void memRecallClicked(View view) {
        calculator.memRecallClicked();
        updateCalcUI();
    }

    public void eToXClicked(View view) {
        calculator.eToXClicked();
        updateCalcUI();
    }

    public void piClicked(View view) {
        calculator.piClicked();
        updateCalcUI();
    }

    public void divClicked(View view) {
        calculator.divClicked();
        updateCalcUI();
    }

    public void multiplyClicked(View view) {
        calculator.multiplyClicked();
        updateCalcUI();
    }

    public void additionClicked(View view) {
        calculator.addClicked();
        updateCalcUI();
    }

    public void subtractionClicked(View view) {
        calculator.subtractClicked();
        updateCalcUI();
    }

    public void equalsClicked(View view) {
        if (!calculator.lastOperation.isEmpty()) {
            double secondOperand = calculator.isIntNumber ? calculator.intNumber : calculator.realNumber;
            calculator.calculateLastOperation(secondOperand);
            updateCalcUI();
        }
    }

    private void updateCalcUI() {
        tvNumber.setText(calculator.numberString);
        tvDetails.setText(calculator.detailsString);
    }
}
