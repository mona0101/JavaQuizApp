
package techie;

import static techie.LogIn.row;
import static techie.LogIn.users;

public class UserInfo  {
    
    private String userName ;
    private String name ;
    private String password;
    private String email;
    private String checkpassword;
    private int points ;
    
    
    
    
    public UserInfo(){
    
    }

   
    public void setName(String name) {
      
        this.name = name;
      
    }

    public void setPassword(String password) throws passwordException {
        if(!password.matches("(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!_%*#?&])[A-Za-z\\d@$!%*#?&]{6,}$")){
             throw new passwordException(password);
        }
         
        this.password = password;
    }
    
    
    public void setPassword(String checkpassword,String arrayPassword) throws passwordException{
    if(!checkpassword.equals(arrayPassword)){//if password is not correct
         throw new passwordException();
        }
    this.checkpassword=checkpassword;
    
    }
    
    
    

    public void setEmail(String email) throws emailException {
        if(!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
        throw new emailException();
        }
        this.email = email;
        
    }
   

    public void setPoints(int points) {
        this.points = points;
    }

   
   public String getUserName() {
        return userName;
        
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public int getPoints() {
        return points;
    }

    public void setUserName(String userName) throws userNameException  {
         if(userName.contains(" ")){
         throw new userNameException();
         }
        this.userName = userName;
    }

    @Override
    public String toString() {
        return  userName +"," + name +"," + password + "," + email + "," + points+"\n" ;
    }
    
}//end of class
   


