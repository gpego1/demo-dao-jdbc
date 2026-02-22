package application;

import model.entities.Department;

public class Program {
    public static void main(String[] args) {
        Department department = new Department(1, "BOOKS");
        System.out.println(department);
    }
}
