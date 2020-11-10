package Activities;

import Models.Boisson;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.gestiondeboissons.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnAjouter, btnSupprimer;
    Spinner spBoissons;
    TextView tvOrder;
    ListView lvOrder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAjouter = findViewById(R.id.btnAjouter);
        btnSupprimer = findViewById(R.id.btnSupprimer);
        btnAjouter = findViewById(R.id.btnAjouter);

        initialisationSpinner();
        initialisationListView();
    }

    private void initialisationListView()
    {

    }

    public void initialisationSpinner()
    {
        spBoissons = findViewById(R.id.spBoissons);
        ArrayList<Boisson> boissons = new ArrayList<>();

        boissons.add(new Boisson(1, "Café", 5, 1));
        boissons.add(new Boisson(2, "Thé Vert", 5, 1));
        boissons.add(new Boisson(3, "Thé Noir", 5, 1));
        boissons.add(new Boisson(4, "Cappuccino", 5, 1));
        boissons.add(new Boisson(5, "Chocolat Chaud", 5, 1));
        boissons.add(new Boisson(6, "Tisane", 5, 1));
    }
}