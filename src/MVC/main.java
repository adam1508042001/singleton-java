package MVC;

import MVC.controller.EntrepriseController;
import MVC.view.EmployeView;

public class main {

    public static void main(String[] args) {
        EmployeView employeView = new EmployeView();
        EntrepriseController entrepriseController = new EntrepriseController(employeView);
        entrepriseController.presentationEmployer();
        /*
        PROMT ATTENDU
         age : 20, nom : toto
         aage : 40, nom : titi
         */

    }
}
