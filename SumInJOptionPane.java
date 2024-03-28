import javax.swing.JOptionPane;
 
public class SumInJOptionPane {
     public static void main(String[] args) {
        // Declare variables and constants
        int num1,num2,sum; 
        String strNum1,strNum2;
        
        strNum1 = JOptionPane.showInputDialog(null,"Enter num1: ","First number",JOptionPane.PLAIN_MESSAGE);
        num1 = Integer.parseInt(strNum1);
        
        strNum2 = JOptionPane.showInputDialog(null,"Enter num2: ","Second number",JOptionPane.PLAIN_MESSAGE);
        num2 = Integer.parseInt(strNum2);
         
        sum = determineSum(num1,num2);
        display(sum);
      
    }
    public static int determineSum(int num1,int num2){
        // Determine the sum of two numbers
        int sum;  
       
    return sum = num1 + num2; 
    }
    public static void display(int sum){
        // Display the sum of two numbers
        JOptionPane.showMessageDialog(null,"Sum is " + sum);
    }
   
}
