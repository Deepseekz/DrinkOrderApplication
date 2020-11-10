package Models;

import android.os.SystemClock;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Order implements Serializable {

    private int _orderNumber;
    private ArrayList<Drink> _theDrinks;

    public int getId() {
        return _orderNumber;
    }

    public Order(int anOrderNumber)
    {
        _orderNumber = anOrderNumber;
        _theDrinks = new ArrayList<>();
    }

    public void ajouterBoisson(Drink aDrink)
    {
        _theDrinks.add(aDrink);
    }

    public void clearOrder()
    {
        _theDrinks.clear();
    }

    @Override
    public String toString() {
        return "Commande{" +
                "_numeroCommande=" + _orderNumber +
                ", _lesBoissons=" + _theDrinks + '}';
    }

    public double prixCommande()
    {
        double price = 0;
        for(Drink aDrink : _theDrinks)
        {
            price += aDrink.get_prix();
        }
        return price;

    }
}
