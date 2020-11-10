package Models;

public class Boisson {
    int _id;
    String _nom;
    int _volumeCl;
    double _prix;

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

    public Boisson(int unId, String unNom, int unVolumeCl, double unPrix)
    {
        _id = unId;
        _nom = unNom;
        _volumeCl = unVolumeCl;
        _prix = unPrix;
    }

}
