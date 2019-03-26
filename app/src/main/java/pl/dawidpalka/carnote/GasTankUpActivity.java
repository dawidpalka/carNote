package pl.dawidpalka.carnote;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.Date;

public class GasTankUpActivity extends AppCompatActivity {

    private EditText dateEditText;
    private EditText mileagEditText;
    private EditText litersEditText;
    private EditText costEditText;
    private Button confirmButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gas_tank_up_layout);
        findViewById(R.id.date);
        dateEditText = findViewById(R.id.date);
        mileagEditText = findViewById(R.id.mileage);
        litersEditText = findViewById(R.id.liters);
        costEditText = findViewById(R.id.cost);

        dateEditText.setText(getCurrentDate());

        confirmButton = findViewById(R.id.confirm);

        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(GasTankUpActivity.this, getOneLiterCost(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    private String getOneLiterCost() {
        return String.valueOf(Double.valueOf(costEditText.getText().toString()) / Double.valueOf(litersEditText.getText().toString()));
    }

    private String getCurrentDate() {
        DateFormat dateFormat = DateFormat.getDateInstance();
        Date date = new Date();
        return dateFormat.format(date);
    }
}
