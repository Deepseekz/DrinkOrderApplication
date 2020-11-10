package Models;

import java.io.Serializable;
import java.util.ArrayList;

public class Order implements Serializable {
    private int _orderNumber;
    private ArrayList<Drink> _theDrinks;

    public Order(int unNumeroCommande)
    {
        _orderNumber = unNumeroCommande;
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
