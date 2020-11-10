package Models;

import java.io.Serializable;
import java.util.ArrayList;

public class Commande implements Serializable {
    private int _numeroCommande;
    private ArrayList<Boisson> _lesBoissons;

    public Commande(int unNumeroCommande)
    {
        _numeroCommande = unNumeroCommande;
        _lesBoissons = new ArrayList<>();
    }

    public void ajouterBoisson(Boisson uneBoisson)
    {
        _lesBoissons.add(uneBoisson);
    }

    public void clearOrder()
    {
        _lesBoissons.clear();
    }

    @Override
    public String toString() {
        return "Commande{" +
                "_numeroCommande=" + _numeroCommande +
                ", _lesBoissons=" + _lesBoissons + '}';
    }

    public double prixCommande()
    {
        double prix = 0;
        for(Boisson boisson : _lesBoissons)
        {
            prix += boisson.get_prix();
        }
        return prix;



    }
}
