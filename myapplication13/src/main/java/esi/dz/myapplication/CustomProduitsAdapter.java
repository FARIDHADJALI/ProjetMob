package esi.dz.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Farid on 31/3/2016.
 */
public class CustomProduitsAdapter extends BaseAdapter {


    private ArrayList<Produit> produits;
    private Context context;
    private LayoutInflater layoutInflater;
    private ListView listView;


    public CustomProduitsAdapter(Context context) {
        this.context = context;
        this.layoutInflater = layoutInflater.from(context);
        produits = new ArrayList<Produit>();


    }


    public void ajouterProduit(Produit produit) {
        produits.add(produit);
        notifyDataSetChanged();
    }


    public void supprimerProduit(Produit produit) {
        produits.remove(produit);
        notifyDataSetChanged();
    }

    public ArrayList<Produit> getProduits() {

        return produits;
    }

    public void setProduits(ArrayList<Produit> produits) {
        this.produits = produits;
    }


    public ListView getListView() {
        return listView;
    }

    public void setListView(ListView listView) {
        this.listView = listView;
    }

    @Override
    public int getCount() {
        return produits.size();
    }

    @Override
    public Produit getItem(int position) {

        return produits.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ProduitViewHolder produitViewHolder ;
        if(convertView==null ) {

            convertView = layoutInflater.inflate(R.layout.item_list_produit, parent, false);
             produitViewHolder = new ProduitViewHolder();


            produitViewHolder.textView = (TextView) convertView.findViewById(R.id.textView);
            produitViewHolder.imageView = (ImageView) convertView.findViewById(R.id.imageView);
        convertView.setTag(produitViewHolder);
        }
else{

produitViewHolder= (ProduitViewHolder) convertView.getTag() ;

            convertView.clearAnimation();

            float trans_x ;

            if(listView.isItemChecked(position))
            {
                trans_x = MainActivity.Select_translation_x ;
            }
            else
            {
                trans_x = 0 ;
            }
            convertView.setTranslationX(trans_x);
        }
         produitViewHolder.textView.setText(this.getItem(position).getNom());
         produitViewHolder.imageView.setImageResource(this.getItem(position).getIcon());

        return convertView;
    }

private  class ProduitViewHolder
    {
        public TextView textView ;
        public  ImageView imageView ;

    }




}