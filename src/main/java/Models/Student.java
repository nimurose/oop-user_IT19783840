
package Models;


public class Student {
    public String Name;
    public String Password;
    public String ID;
    public String Reg_Program;
    
    public Student(String Name,String Password,String ID,String Reg_Program){
        this.Name=Name;
        this. Password=Password;
        this.ID=ID;
        this.Reg_Program=Reg_Program;
    }
    @Override
    public String toString()
    {
        return "Name "+this.Name+" Password"+this.Password+" ID"+this.ID+" Reg_Program"+this.Reg_Program;
    }

}