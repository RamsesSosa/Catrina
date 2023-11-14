 
package mx.itson.catrina.entities;

 
import com.google.gson.Gson;
import java.util.List;
import mx.itson.catrina.enums.TransactionType;


/**
 *
 * @author Ramsés Sosa
 */
public class Catrina {
    
    private String account;
    private String clabe;
    private String currency;
    private Customer customer;
    private String previous_balance;
    private String start_date;
    private String end_date;
    private List<Transaction> transactions;

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getClabe() {
        return clabe;
    }

    public void setClabe(String clabe) {
        this.clabe = clabe;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(List<Transaction> transactions) {
        this.transactions = transactions;
    }
    
    
    
     public Catrina derealize(String json){
        
        Catrina catrina = new Catrina();
        try{
            catrina = new Gson().fromJson(json, Catrina.class);
        }catch(Exception ex){
            System.err.print("Ocurrió un error: " + ex.getMessage());
        }
           
        return catrina;
    }

 
   

    public String getStart_date() {
        return start_date;
    }

    public void setStart_date(String start_date) {
        this.start_date = start_date;
    }

    public String getEnd_date() {
        return end_date;
    }

    public void setEnd_date(String end_date) {
        this.end_date = end_date;
    }

    public String getPrevious_balance() {
        return previous_balance;
    }

    public void setPrevious_balance(String previous_balance) {
        this.previous_balance = previous_balance;
    }
   
}
