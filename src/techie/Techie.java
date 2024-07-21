package techie;

import java.io.*;
import java.util.Arrays;


public class Techie {

    public static void main(String[] args) throws Exception {
       
        new Welcome().setVisible(true);
        
 

    }
    
    
    
        public static void SavingNewDataToFile() throws FileNotFoundException {

       LogIn.users[LogIn.row][4] = "" + LogIn.pointCount;

        PrintWriter outputFile = new PrintWriter("Accounts.txt");

        for (int i = 0; i < LogIn.users.length; i++) {

            if (LogIn.users[i][0] == null) {
                break;
            }
            String[] row = LogIn.users[i];

            outputFile.println(String.join(",", Arrays.asList(row)));

        }

        outputFile.close();

    
    
    }

}


