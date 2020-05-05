
package Models;


public class User {
    public String Name;
    public String Password;
    public String ID;
    
    public User(String Name,String Password,String ID){
        this.Name=Name;
        this.Password=Password;
        this.ID=ID;
    }
    @Override
    public String toString()
    {
        return "Name "+this.Name+" Password"+this.Password+" ID"+this.ID;
    }

}