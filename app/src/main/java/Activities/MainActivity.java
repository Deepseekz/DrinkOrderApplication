package Activities;

import Models.Drink;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.gestiondeboissons.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnAdd, btnDelete, btnValid, btnCancel;
    Spinner spDrink;
    TextView tvOrder;
    ListView lvOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnValid = findViewById(R.id.btnValid);
        btnDelete = findViewById(R.id.btnDelete);
        btnCancel = findViewById(R.id.btnCancel);
        btnAdd = findViewById(R.id.btnAdd);

        initialisationSpinner();
        initialisationListView();
    }

    private void initialisationListView()
    {

    }

    public void initialisationSpinner()
    {
        spDrink = findViewById(R.id.spDrinks);
        ArrayList<Drink> drinks = new ArrayList<>();

        drinks.add(new Drink( "Café", 5, 1, 0));
        drinks.add(new Drink( "Thé Vert", 5, 1, 1));
        drinks.add(new Drink( "Thé Noir", 5, 1, 2));
        drinks.add(new Drink( "Cappuccino", 5, 1, 3));
        drinks.add(new Drink( "Chocolat Chaud", 5, 1, 4));
        drinks.add(new Drink( "Tisane", 5, 1, 5));
    }
}