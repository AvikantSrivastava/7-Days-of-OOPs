import java.util.*;


// import org.graalvm.compiler.hotspot.stubs.NewInstanceStub;

// Player class 
class Player { 
  
    private int id ;
    private String team ;
    private String name ;

    Player( int newId , String newName, String newTeam){
        id = newId ;
        team = newTeam ;
        name = newName ;
    }

    void getDetails(){
        System.out.println("Name : " + name) ;
        System.out.println("Team : " + team) ;
        System.out.println("ID : " + id ) ;

    }
  
} 
  
/* Team class contains a list of Player
Objects.*/
class Team { 
  
    // Complete the implementation
    private List<Player> players;
    String teamname ;

    Team(String newTeamname ,List<Player> newPlayers  ){
        players = newPlayers ;
        teamname = newTeamname ;
    }

    List<Player> getPlayers(){
        return players ;
    }
  
} 
  
/* School class contains a list of Team 
Objects.*/
class School { 
  
    // Complete the implementation
    List<Team> teams ;
    String schoolName ;

    School(String newSchoolName , List<Team> newTeams ){
        teams = newTeams ;
        schoolName = newSchoolName ;
    }

    public int getTotalPlayersInSchool(){
        int total = 0 ;
        List<Player> players;

        for(Team team : teams) { 
            players = team.getPlayers(); 
            for(Player p : players) { 
                total++; 
            } 
        } 
        
        

        return total ;

    }

  
}  
  
// Main class
class demo { 
  
    public static void main (String[] args) { 
        // Write your code here
        
        Player p1 = new Player(1, "Harris" , "Red" ) ;
        Player p2 = new Player(2, "Carol" , "Red" ) ;
        Player p3 = new Player(1, "Johnny" , "Blue" ) ;
        Player p4 = new Player(2, "Sarah" , "Blue" ) ;

        List <Player> red_players = new ArrayList<Player>();
        red_players.add(p1);
        red_players.add(p2);

        List <Player> blue_players = new ArrayList<Player>();
        blue_players.add(p3);
        blue_players.add(p4);

        Team red = new Team("Red" , red_players) ;
        Team blue = new Team("Blue" , blue_players) ;

        List <Team> teams = new ArrayList<Team>();
        teams.add(red);
        teams.add(blue) ;

        School myschool = new School("MVIT" , teams );


        System.out.println(myschool.getTotalPlayersInSchool()); 


    } 
  
} 