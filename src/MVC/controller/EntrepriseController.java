package MVC.controller;

import MVC.models.Employee;
import MVC.view.EmployeeView;

import java.util.ArrayList;
import java.util.List;

// CLASS CHARGER DE GERE TOUT CE QUI CONCERNE UN EMPLOYE
public class EntrepriseController {

    private List<Employee> listeEmployee;
    private EmployeeView employeeView;

    public EntrepriseController(EmployeeView employeeView) {
        this.employeeView = employeeView;
        this.listeEmployee = new ArrayList<>();
    }

    // A COMPLETE
    public void embaucherEmployee(String nom, int age) {
        Employee nouvelEmployee = new Employee(nom, age);
        listeEmployee.add(nouvelEmployee);
    }

    // A COMPLETE
    public void affichageEmployee() {
        for (Employee employee : listeEmployee) {
            employeeView.afficherEmploye(employee.getNom(), employee.getAge()); // Appel de la méthode afficherEmployee
        }
    }
}