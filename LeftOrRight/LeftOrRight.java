import javax.swing.JOptionPane;
public class LeftOrRight{
public static void main(String args[]){
    String leftOrRight = "";
    int rightTotal = 0;
    int leftTotal = 0;

    leftOrRight = JOptionPane.showInputDialog("Enter L if you are left-handed, R if you are right-handed or X to quit.");
    while(!leftOrRight.equals("X")){     
        if (leftOrRight.equals("L")){
            leftTotal++;
        }else if (leftOrRight.equals("R")){
            rightTotal++;
        }else if(leftOrRight.equals("X")){
            break;
        }
        leftOrRight = JOptionPane.showInputDialog("Enter L if you are left-handed, R if you are right-handed or X to quit.");
    }
    // Output number of left or right-handed students.
        System.out.println("Number of left-handed students: " + leftTotal);
        System.out.println("Number of right-handed students: " + rightTotal);
        System.exit(0);
    }
}