package esi.dz.myapplication;

import java.util.ArrayList;

/**
 * Created by Farid on 26/3/2016.
 */
public class Commande {


    private ArrayList<LigneCommande> ligneCommandes ;
    private enum  Etat {EnPreparation,EnLivraison} ;


    public Commande(ArrayList<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }

    public ArrayList<LigneCommande> getLigneCommandes() {
        return ligneCommandes;
    }

    public void setLigneCommandes(ArrayList<LigneCommande> ligneCommandes) {
        this.ligneCommandes = ligneCommandes;
    }


}
