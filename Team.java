package ExerciseTeam;

import java.util.ArrayList;

public class Team {
    ArrayList<Player> players= new ArrayList<Player>();
    private int maxPlayer=15;

    public void addPlayer(String name, String surname, String idCode, String dateOfBirth, int shirtNumber, String role){
        if (players.size()==maxPlayer){
            System.out.println("Nessuno spazio disponibile");
        }
        else {
            Player player1 = new Player(name,surname, idCode, dateOfBirth, shirtNumber, role);
            players.add(player1);
        }
    }
    public ArrayList<Player> searchByName (String name){
        ArrayList<Player> playersFound = new ArrayList<Player>();
        for (int i=0; i<players.size(); i++){
            if (players.get(i).getName().equals(name)){
                playersFound.add(players.get(i));
            }
        }
        return playersFound;
    }

    public ArrayList searchByRole (String role){
        ArrayList<Player> playersFound = new ArrayList<Player>();
        for (int i=0; i<players.size(); i++){
            if (players.get(i).role.equals(role)){
                playersFound.add(players.get(i));
            }
        }
        return playersFound;
    }

}
