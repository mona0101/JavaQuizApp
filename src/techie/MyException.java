/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techie;

public class MyException {

}//end of MyException class

class userNameException extends Exception {

    public userNameException() {
        super("Error: Username should not have\nany spaces !\n");
    }
}//end of userNameException class

class passwordException extends Exception {

    public passwordException() {
        super("Error: Incorrect password Please try again");
    }

    public passwordException(String message) {
        super("Error: Password must have upper and\nlower case letters and have at least\none number and special character\nand be at least 6 characters long !\n");
    }
}//end of passwordException class

class emailException extends Exception {

    public emailException() {
        super("Error: Incorrect email format !");
    }
}//end of emailException calss

