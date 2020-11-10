package Activities;

import Models.Drink;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.gestiondeboissons.R;
import com.example.gestiondeboissons.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        initSpinner();
        initListView();
    }

    private void initListView()
    {

    }

    public void initSpinner()
    {
        ArrayList<Drink> drinks = new ArrayList<>();

        drinks.add(new Drink( "Coffee", 5, 1.4, 0));
        drinks.add(new Drink( "Green Tea", 5, 3.5, 1));
        drinks.add(new Drink( "Black Tea", 5, 2.6, 2));
        drinks.add(new Drink( "Cappuccino", 5, 3.2, 3));
        drinks.add(new Drink( "Hot Chocolate", 5, 3.4, 4));
        drinks.add(new Drink( "Ice Tea", 5, 2, 5));

        ArrayAdapter<Drink> adapter = new ArrayAdapter<>(getApplicationContext(), R.layout.support_simple_spinner_dropdown_item, drinks);
        adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        binding.spDrinks.setAdapter(adapter);
    }
}