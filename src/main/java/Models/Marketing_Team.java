
package Models;


public class Marketing_Team {
    public String Team_Name;
    public String Password;
    public String ID;
    
     public Marketing_Team(String TeamName,String Password,String ID){
        this.Team_Name=TeamName;
        this.Password=Password;
        this.ID=ID;
        
        
     }

    @Override
    public String toString()
    {
        return "Team_Name "+this.Team_Name+" Password"+this.Password+" ID"+this.ID;
    }
}

