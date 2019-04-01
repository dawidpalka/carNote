package pl.dawidpalka.carnote;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import pl.dawidpalka.carnote.model.Car;

public class MainMenuActivity extends AppCompatActivity {

    public static final String SPECIAL_DATA = "SPECIAL_DATA";
    private Button goToTankFormButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu_layout);
        goToTankFormButton = findViewById(R.id.go_to_tank_form_button);

        goToTankFormButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainMenuActivity.this, RefuelingActivity.class);
                intent.putExtra(SPECIAL_DATA, new Car("Ford", "Focus", "Green"));
                startActivity(intent);
            }
        });
    }
}
