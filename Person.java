package ExerciseTeam;

public class Person {
    private String name;
    private String surname;
    public String idCode;
    public String dateOfBirth = new String();

    public Person(String name, String surname, String idCode, String dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.idCode = idCode;
        this.dateOfBirth = dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getIdCode() {
        return idCode;
    }

    public void setIdCode(String idCode) {
        this.idCode = idCode;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
}
