package singleton;

import javax.swing.*;

public class main {
    public static void main(String[] args){
        // LE SINGLETON VISE A RENVOYER TOUJOURS LA MÊME INSTANCE DE NOTRE OBJET POUR TOUTE L'APPLICATION
        //modification de ma variable  quantité dans la classe avec this.quantite

        System.out.println("la voici une application directe de singleton");
        TomateSingleton tomata1 =  TomateSingleton.getInstance();
        System.out.println(tomata1.getQuantite());
        TomateSingleton tomata2 =  TomateSingleton.getInstance();
        System.out.println(tomata2.getQuantite());
        TomateSingleton tomata3 =  TomateSingleton.getInstance();
        System.out.println(tomata3.getQuantite());
        TomateSingleton tomate4 = TomateSingleton.getInstance();
        System.out.println(tomate4.getQuantite());
    }
}
