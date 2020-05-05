
package Models;


public class Programs {
    public String Title;
    public String Payment_Details;
    public String ID;
    
    public Programs(String Title,String Payment_Details,String ID){
        this.Title=Title;
        this.Payment_Details=Payment_Details;
        this.ID=ID;
        
    }
    @Override
    public String toString()
    {
        return "Title "+this.Title+" Payment_Details"+this.Payment_Details+" ID"+this.ID;
    }
}