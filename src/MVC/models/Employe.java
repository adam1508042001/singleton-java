package MVC.models;

public class Employe {

    // PROPRIETE : UNE ERREUR ?
    public String nom;
    public int age;

    public Employe(String nom, int age){
        this.nom = nom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
