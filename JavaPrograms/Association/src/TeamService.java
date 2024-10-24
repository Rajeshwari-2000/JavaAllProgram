import java.util.Scanner;

public class TeamService {
    static Team[] tarr;
    static int count;

    static {
        tarr = new Team[30];
        Player[] plist1 = new Player[15];
        plist1[0] = new Player(1, "Yuvraj", "Allrounder");
        plist1[1] = new Player(2, "Rohit Sharma", "Batsman");
        tarr[0] = new Team(10, "CSK", "Dhoni", new Player(1, "Yuvraj", "Allrounder"), plist1);

        Player[] plist2 = new Player[15];
        plist2[0] = new Player(11, "Hardik Pandya", "Allrounder");
        plist2[1] = new Player(12, "Virat Kohali", "Batsman");
        tarr[1] = new Team(11, "MI", "Sachin", new Player(1, "Hardik Pandya", "Allrounder"), plist2);

        count = 2;
    }

    public static void addNewTeam(Scanner sc) {
        System.out.println("Enter Team ID:");
        int tid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Team Name:");
        String tnm = sc.nextLine();

        System.out.println("Enter Coach Name:");
        String cname = sc.nextLine();

        System.out.println("Enter Captain ID:");
        int cpid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Captain Name:");
        String cpname = sc.nextLine();

        System.out.println("Enter Captain Speciality:");
        String speciality = sc.nextLine();

        Player p = new Player(cpid, cpname, speciality);
        Player[] plist = new Player[15];

        int cnt = 0;
        String ans = "y";
        do {
            System.out.println("Enter Player ID:");
            int pid = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Player Name:");
            String pname = sc.nextLine();

            System.out.println("Enter Player Speciality:");
            String pspeciality = sc.nextLine();

            plist[cnt] = new Player(pid, pname, pspeciality);
            cnt++;
            System.out.println("Do you want to continue? (y/n)");
            ans = sc.next();
        } while (ans.equals("y"));

        tarr[count] = new Team(tid, tnm, cname, p, plist);
        count++;
    }

    public static Team[] findAll() {
        Team[] teams = new Team[count];
        System.arraycopy(tarr, 0, teams, 0, count);
        return teams;
    }

    public static Team searchByPlayerId(int pid) {
        for (Team t : tarr) {
            if (t != null) {
                Player[] plst = t.getPlist();
                for (Player p : plst) {
                    if (p != null && p.getPid() == pid) {
                        return t;
                    }
                }
            }
        }
        return null;
    }

    public static boolean addNewPlayer(int tid, Scanner sc) {
        Team t = findTeamById(tid);
        if (t != null) {
            System.out.println("Enter Player ID:");
            int pid = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Player Name:");
            String pname = sc.nextLine();

            System.out.println("Enter Player Speciality:");
            String pspeciality = sc.nextLine();

            Player p = new Player(pid, pname, pspeciality);
            Player[] plst = t.getPlist();

            for (int i = 0; i < plst.length; i++) {
                if (plst[i] == null) {
                    plst[i] = p;
                    return true;
                }
            }
        }
        return false;
    }

    public static Team findTeamById(int tid) {
        for (Team t : tarr) {
            if (t != null && t.getTid() == tid) {
                return t;
            }
        }
        return null;
    }

    public static boolean deleteById(int tid) {
        for (int i = 0; i < count; i++) {
            if (tarr[i] != null && tarr[i].getTid() == tid) {
                for (int j = i; j < count - 1; j++) {
                    tarr[j] = tarr[j + 1]; 
                }
                tarr[count - 1] = null; 
                count--;
                return true;
            }
        }
        return false;
    }
}
