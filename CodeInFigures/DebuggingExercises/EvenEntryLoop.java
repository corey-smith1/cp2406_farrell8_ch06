package DebuggingExercises;
import javax.swing.*;

public class EvenEntryLoop {
    public static void main (String args[])
    {
        int num;
        String entry, message;
        final int QUIT = 999;
        entry = JOptionPane.showInputDialog(null,"Enter an even number or " + QUIT + " to quit");
        num =  Integer.parseInt(entry);
        while(num != QUIT)
        {
            if(num % 2 == 0)
                message = "Good job!";
            else
                message = num + " is not an even number";
            JOptionPane.showMessageDialog(null,message);
            entry = JOptionPane.showInputDialog(null, "Enter an even number or " + QUIT + " to quit");
            num =  Integer.parseInt(entry);
        }
    }

}
