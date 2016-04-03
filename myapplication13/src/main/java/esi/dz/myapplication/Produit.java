package esi.dz.myapplication;

/**
 * Created by Farid on 3/4/2016.
 */
public class Produit {
    private  String nom;
    private String id;

    private String type ;
    private String details;
    private  float prix ;
    private int  Icon ;



    public Produit(String nom, String id,String type ) {
        this.id = id;
        this.nom = nom;
        this.type = type;
    }

    public int getIcon() {
        return Icon;
    }

    public void setIcon(int icon) {
        Icon = icon;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    @Override
    public String toString() {
        return this.nom +' ' + this.prix;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    }
