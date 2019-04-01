package pl.dawidpalka.carnote;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;

import pl.dawidpalka.carnote.model.Car;
import pl.dawidpalka.carnote.model.Refueling;

public class RefuelingActivity extends AppCompatActivity {

    private EditText dateEditText;
    private EditText mileageEditText;
    private EditText litersEditText;
    private EditText costEditText;
    private Button confirmButton;
    private Car car;
    private DateFormat dateFormat;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gas_tank_up_layout);
        car = (Car) getIntent().getExtras().getSerializable(MainMenuActivity.SPECIAL_DATA);
        viewInit();
        setTitle("New Refueling");
    }

    private void viewInit() {
        dateEditText = findViewById(R.id.date);
        mileageEditText = findViewById(R.id.mileage);
        litersEditText = findViewById(R.id.liters);
        costEditText = findViewById(R.id.cost);
        confirmButton = findViewById(R.id.confirm);

        dateEditText.setText(getCurrentDate());
        confirmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Refueling tank = new Refueling(getDate(), getMileage(), getLiters(), getCost());
                car.getRefuelings().add(tank);
            }
        });
    }

    private Date getDate() {
        try {
            return dateFormat.parse(dateEditText.getText().toString());
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

    private Integer getLiters() {
        return Integer.valueOf(litersEditText.getText().toString());
    }

    private Integer getMileage() {
        return Integer.valueOf(mileageEditText.getText().toString());
    }

    private Integer getCost() {
        return Integer.valueOf(costEditText.getText().toString());
    }

    private String getCurrentDate() {
        dateFormat = DateFormat.getDateInstance();
        Date date = new Date();
        return dateFormat.format(date);
    }
}
