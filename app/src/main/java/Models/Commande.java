package Models;

import java.util.ArrayList;

public class Commande {
    private ArrayList<Boisson> _lesBoissons;

    public Commande() {
        _lesBoissons = new ArrayList<>();
    }

    public void ajouterBoisson(Boisson uneBoisson)
    {
        _lesBoissons.add(uneBoisson);
    }

    public double prixCommande()
    {
        double prix = 0;
        for(Boisson boisson : _lesBoissons)
        {
            prix += boisson._prix;
        }
        return prix;
    }
}
