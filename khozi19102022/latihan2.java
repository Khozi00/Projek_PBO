
package khozi19102022;

import javax.swing.JOptionPane;

public class latihan2 {
    public static void main(String[] args) {
        int grade = 0;
        String msg = " ";
        grade = Integer.parseInt(JOptionPane.showInputDialog("Input"));
        
                
        if (grade >= 90){
            msg ="Excellent!";
        }
        else if ((grade < 90) && (grade >= 80)){
            msg="Good Job!";
        }
        else if ((grade < 80) && (grade >= 60)){
            msg="Study Harder!";
        }
        else {
            msg="Sorry You Failed!";
        }
        JOptionPane.showMessageDialog(null, "nilai anda " +grade+"\n "+msg);
    }
}