package com.epam.rd.autocode.assessment.appliances.model;

public class Employee extends User {

    private String departament;

    public Employee(long id, String name, String email, String password, String departament) {
        super(id, name, email, password);
        this.departament = departament;
    }

    public Employee() {
        super();
        this.departament = "";
    }

    public String getDepartament() {
        return departament;
    }

    public String setDepartament(String departament) {
        return this.departament = departament;
    }

    @Override
    public String toString() {
        return "Employee{" +
                super.toString().replaceFirst("[^\\{]+[\\{]", "").replaceFirst("\\}$", "") +
                ", departament='" + departament + '\'' +
                '}';
    }
}
