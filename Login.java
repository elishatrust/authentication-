import java.util.*;
public class Login
{
    int[] account = {100100,100200,100300,100400};
    int[] pin = {1111,2222,3333,4444}; 
    
    public Login(String userName,String password)
    {
        this.userName=userName;
        this.password=password;
    }
    
    public String getUserName()
    {
        return this.userName;
    }
    
    public String getPassword()
    {
        return this.password;
    }
    
    public boolean validate()
    {
        if((this.userName).equals("john") && (this.password).equals("123"))
        {
            return true;
        }
        
    return false;
    }
    
    public static void main (String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the username:");
        String name=sc.nextLine();
        
        System.out.println("Enter the password");
        String pass=sc.nextLine();
        
        Login obj=new Login(name, pass);
        if(obj.validate())
        {
            System.out.println("Valid user");
        }
        else
        {
            System.out.println("Invalid user");
        }
    }
}