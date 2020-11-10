package Models;

import java.io.Serializable;

public class Boisson implements Serializable {
    private String _nom;
    private int _volumeCl;
    private double _prix;
    private int _imageResourceId;

    public int get_id() {
        return _id;
    }

    public String get_nom() {
        return _nom;
    }

    public int get_volumeCl() {
        return _volumeCl;
    }

    public double get_prix() {
        return _prix;
    }

    public void set_prix(double _prix) {
        this._prix = _prix;
    }

    public Boisson(int unId, String unNom, int unVolumeCl, double unPrix, int uneImageResourceId)
    {
        _id = unId;
        _nom = unNom;
        _volumeCl = unVolumeCl;
        _prix = unPrix;
        _imageResourceId= uneImageResourceId;
    }

    @Override
    public String toString()
    {
        return "Boisson{" +
                "_id=" + _id +
                ", _nom='" + _nom + '\'' +
                ", _volumeCl=" + _volumeCl +
                ", _prix=" + _prix +
                '}';
    }
}
