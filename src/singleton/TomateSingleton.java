package singleton;

public class TomateSingleton {
    private static int quantite;
    private static TomateSingleton tomateSingleton;

    private String nom;



    //creation d'un  constructeur singleton
    //private pour qu'une seule instance d'objet se cree et utilisée

    // SAUVEGARDE DE NOTRE INSTANCE POUR RESTITUER A CHAQUE DEMANDE
    private  TomateSingleton() {
        quantite = 40;
    }



    // CONSTRUCTEUR QUI INSTANCIE NOTRE SINGLETON ET LA QUANTITE

    // METHODE POUR OBTENIR NOTRE INSTANCE DE NOTRE SINGLETON
    public static TomateSingleton getInstance() {
        if (tomateSingleton == null) {
            tomateSingleton = new TomateSingleton();
        }
        quantite = quantite - 1 ;
        return tomateSingleton;
    }
    public String getName(){
        return nom;
    }


    // GETTER DE LA QUANTITE
    public int getQuantite() {
        return quantite;
    }


    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }
}