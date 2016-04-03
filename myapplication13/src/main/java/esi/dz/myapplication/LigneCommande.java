package esi.dz.myapplication;

/**
 * Created by Farid on 26/3/2016.
 */
public class LigneCommande {

    private Produit produit ;
    private int     quantite ;



    public LigneCommande(Produit produit, int quantite) {
        this.produit = produit;
        this.quantite = quantite;
    }


    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}
