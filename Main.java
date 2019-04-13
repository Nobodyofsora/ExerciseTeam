package ExerciseTeam;

import java.util.Scanner;

public class Main {
    public static void main (String []args){
        int choice=0, shirtNumber;
        String name, surname, idCode, dateOfBirth, role;
        Team newTeam =new Team();
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("\n\t\t\tMENU\n\t1. Aggiungi giocatore al team\n\t2. Cerca per nome\n\t3. Cerca per ruolo\n\t0. Esci");
            choice = input.nextInt();
            switch (choice){
                case 1:
                    System.out.println("\t---Inserimento Giocatore---");
                    System.out.println("\tInserisci nome:");
                    name = input.next();
                    System.out.println("\tInserisci cognome:");
                    surname = input.next();
                    System.out.println("\tInserisci CF:");
                    idCode = input.next();
                    System.out.println("\tInserisci data di nascita:");
                    dateOfBirth = input.next();
                    System.out.println("\tInserisci ruolo:");
                    role = input.next();
                    System.out.println("\tInserisci numero della maglia:");
                    shirtNumber = input.nextInt();
                    newTeam.addPlayer(name, surname,idCode,dateOfBirth,shirtNumber,role);
                    System.out.println("\tInserimento riuscito");
                    break;
                case 2:
                    System.out.println("\t---Inserire nome dei giocatori da cercare---");
                    name = input.next();
                    System.out.println("\tGiocatori trovati: \n\t" + newTeam.searchByName(name));
                    break;
                case 3:
                    System.out.println("\t---Inserire ruolo dei giocatori da cercare---");
                    role = input.next();
                    System.out.println("\tGiocatori trovati: \n\t"+
                            newTeam.searchByRole(role));
                    break;
                case 5:
                    System.out.println(newTeam);
                case 0:
                    System.out.println("Grazie ed arrivederci :)");
                    break;
                    default:
                        System.out.println("Scelta non consentita :(");

            }

        }while(choice!=0);
    }
}
