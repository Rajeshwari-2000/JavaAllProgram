import java.util.Scanner;

public class TeamServiceTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("1. Add a new Team\n" +
                               "2. Delete the team\n" +
                               "3. Search by Team ID\n" +
                               "4. Search by Player ID\n" +
                               "5. Delete player from the team\n" +
                               "6. Add a new player to the team\n" +
                               "7. Display all teams\n" +
                               "8. Exit\n" +
                               "Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    TeamService.addNewTeam(sc); // Pass the scanner
                    break;
                case 2:
                    System.out.println("Enter team ID to delete:");
                    int tid = sc.nextInt();
                    boolean deleted = TeamService.deleteById(tid);
                    if (deleted) {
                        System.out.println("Team deleted successfully.");
                    } else {
                        System.out.println("Team not found.");
                    }
                    break;
                case 3:
                    System.out.println("Enter team ID to search:");
                    tid = sc.nextInt();
                    Team team = TeamService.findTeamById(tid);
                    if (team != null) {
                        System.out.println("Found team: " + team);
                    } else {
                        System.out.println("Team not found.");
                    }
                    break;
                case 4:
                    System.out.println("Enter player ID to search for team:");
                    int pid = sc.nextInt();
                    team = TeamService.searchByPlayerId(pid);
                    if (team != null) {
                        System.out.println("Found team: " + team);
                    } else {
                        System.out.println("Player not found in any team.");
                    }
                    break;
                case 5:
                    System.out.println("Enter team ID to delete player from:");
                    tid = sc.nextInt();
                    boolean playerDeleted = TeamService.deleteById(tid); // Adjusted method call
                    if (playerDeleted) {
                        System.out.println("Player deleted successfully.");
                    } else {
                        System.out.println("Team or player not found.");
                    }
                    break;
                case 6:
                    System.out.println("Enter team ID to add a new player to:");
                    tid = sc.nextInt();
                    boolean playerAdded = TeamService.addNewPlayer(tid, sc); // Adjusted method call
                    if (playerAdded) {
                        System.out.println("Player added successfully.");
                    } else {
                        System.out.println("Team not found.");
                    }
                    break;
                case 7:
                    Team[] teams = TeamService.findAll();
                    if (teams != null && teams.length > 0) { // Check for null and length
                        for (Team t : teams) {
                            if (t != null) {
                                System.out.println(t);
                            }
                        }
                    } else {
                        System.out.println("No teams found.");
                    }
                    break;
                case 8:
                    System.out.println("Thank you for visiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
                    break;
            }
        } while (choice != 8);

        sc.close();
    }
}
