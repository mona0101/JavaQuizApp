
package techie;
public class UserInfo  {
    
    private String userName ;
    private String name ;
    private String password;
    private String email;
    private int points ;
    public UserInfo(){}

    
   
    public void setName(String name) {
      
        this.name = name;
      
    }

    public void setPassword(String password) throws passwordException {
        if(!password.matches("(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{6,}$")){
             throw new passwordException(password);
        }
         
        this.password = password;
    }

    public void setEmail(String email) throws emailException {
        if(!email.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")){
        throw new emailException(email);
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
         throw new userNameException(userName);
         
         }
        this.userName = userName;
    }

    @Override
    public String toString() {
        return  userName +"," + name +"," + password + "," + email + "," + points+"\n" ;
    }
   
}    
class userNameException extends Exception{

        public userNameException() {
              super("Error: Username should not have any spaces.\n");
        }

        public userNameException(String message) {
            super("Error: in "+message+" ,Username should not have any spaces.\n");
        }
}
class passwordException extends Exception{

        public passwordException() {
              super("Error: Passwords must have upper and lower case letters\n at least 1 number and special character\n and be at least 6 characters long.\n");
        }

        public passwordException(String message) {
            super("Error: in "+message+", Passwords must have upper and lower case letters\n at least 1 number and special character\n and be at least 6 characters long.\n");
        }


    
}
class emailException extends Exception{

        public emailException() {
              super("Error:incorrect email format.");
        }

        public emailException(String message) {
            super("Error: in "+message+", incorrect email format.");
        }


}  