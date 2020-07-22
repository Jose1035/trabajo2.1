package GestionEmpleados;

class Person {

    private int id, salario;
    private String firstName, lastName;

    public Person() {}

    public Person(int id, String firstName, String lastName, int salario) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }

    public String toString() {
        return "[" + id + "," + firstName + "," + lastName + "," + salario + "]";
    }
}