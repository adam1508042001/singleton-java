package MVC;

import MVC.controller.EntrepriseController;
import MVC.view.EmployeeView;

public class main {

    public static void main(String[] args) {
        EmployeeView employeView = new EmployeeView();

        // Création du contrôleur
        EntrepriseController entrepriseController = new EntrepriseController(employeView);

        // Ajout des employés
        entrepriseController.embaucherEmployee("toto", 20);
        entrepriseController.embaucherEmployee("titi", 40);
        entrepriseController.embaucherEmployee("kery james", 30);
        entrepriseController.embaucherEmployee("henri", 60);

        // Affichage des employés
        entrepriseController.affichageEmployee();
    }
}
