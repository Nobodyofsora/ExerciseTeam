package ExerciseTeam;

public class Player extends Person{
    public int shirtNumber;
    public String role;

    public Player(String name, String surname, String idCode, String dateOfBirth, int shirtNumber, String role) {
        super(name, surname, idCode, dateOfBirth);
        this.shirtNumber = shirtNumber;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Giocatore {" +
                "Cognome="+ getSurname() +
                ", Numero maglia=" + shirtNumber +
                ", Ruolo='" + role + '\'' +
                '}';
    }
}
