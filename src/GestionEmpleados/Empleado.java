package GestionEmpleados;

class Person implements Comparable {

    private int id, salario;
    private String firstName, lastName;

    //public Person() {}

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
        //return "[" + id + "," + firstName + "," + lastName + "," + salario + "]";
        return id + "\t" + firstName + "\t" + lastName + "\t" + salario + "\n";
    }  
    
    @Override
    public boolean equals(Object obj) {
        return ((Person) obj).getFirstName().equals(getFirstName());
    }
 
    @Override
    public int compareTo(Object o) {
        Person e = (Person) o;
        return getFirstName().compareTo(e.getFirstName());
    }
    
}
