
package Models;


public class Postgraduate_Programs {
    public String ID;
    public String Title;
    public String Duration;
    
    public Postgraduate_Programs(String ID,String Title,String Duration){
        this.ID=ID;
        this.Title=Title;
        this.Duration=Duration;
  
    }
   @Override
   public String toString()
   {
       return "ID "+this.ID+" Title"+this.Title+" Duration"+this.Duration;
   }

}