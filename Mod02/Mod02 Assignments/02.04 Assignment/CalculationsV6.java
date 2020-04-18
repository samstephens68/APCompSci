
/**
 * The Calculations class performs addition, subtraction,
 * multiplication, division, and modulus operations on integers and
 * decimals.
 *  
 * @author Sam Stephens
 * @version 08/28/19
 */
public class CalculationsV6
{
    public static void main(String[ ] args)
    {
        // Declare integer variables
        int iNum1 = 25;
        int iNum2 = 9;
        
        // Declare double variables
        double dNum1 = 43.21; 
        double dNum2 = 3.14;
        
        // Addition 
        System.out.println("Addition");
        System.out.println(iNum1 + " + " + iNum2 + " = " + (iNum1 + iNum2));
        System.out.println(dNum1 + " + " + dNum2 + " = " + (dNum1 + dNum2));
        System.out.println();
        
        // Subtraction
        int iNum3 = 11;
        int iNum4 = 9;
        int iNum5 = 25;
        
        double dNum3 = 3.14;
        double dNum4 = 10.0;
        
        System.out.println("Subtraction");
        System.out.print(iNum3 + " - " + iNum4 + " - " + iNum5 + " = ");
        System.out.println(iNum3 - iNum4 - iNum5);
        System.out.println(dNum3 + " - " + dNum4 + " = " + ( dNum3 - dNum4 ));
        System.out.println(" ");
        
        // Multiplication
        int iNum6 = 25;
        int iNum7 = 9;
        
        double dNum5 = 3.14;
        double dNum6 = 10.0;
        double dNum7 = 10.0;
        
        System.out.println("Multiplication");
        System.out.println(iNum6 + " *  " + iNum7 + " = " + ( 25 * 9 )); 
        System.out.print(dNum5 + " * " + dNum6 + " * " + dNum7 + " = ");
        System.out.println( dNum5 * dNum6 * dNum7 );
        System.out.println(" ");
        
        // Division
        int iNum8 = 9;
        int iNum9 = 25;
        
        double dNum8 = 43.21;
        double dNum9 = 10.0;
        System.out.println("Division");
        System.out.println(iNum8 + " / " + iNum9 + " = " + (iNum8 / iNum9));
        System.out.println( dNum8 + " / " + dNum9 + " = " + ( dNum8 / dNum9 ));
        System.out.println(" ");
         
        // Modulus operator
        int iNum10 = 11;
        int iNum11 = 9;
        
        double dNum10 = 10.0;
        double dNum11 = 3.14;
        
        System.out.println("Modulus");
        System.out.println(iNum10 + " % " + iNum11 + " = " + (iNum10 % iNum11));
        System.out.println( dNum10 + " % " + dNum11 + " = " + ( dNum10 % dNum11 ));
        System.out.println(" ");
        
        // 2.03 Additional int Equations
        System.out.println("Additional Int Equations");
        int samnum1 = 8;
        int samnum2 = 4;
        int samnum3 = 62;
        System.out.print(samnum1 + " + " + samnum2 + " / " + samnum3 + " = ");
        System.out.println(samnum1 + samnum2 / samnum3);
        int samnum4 = 13;
        int samnum5 = 100;
        int samnum6 = 46;
        System.out.print(samnum4 + " - " + samnum5 + " * " + samnum6 + " = ");
        System.out.println(samnum4 - samnum5 * samnum6);
        int samnum7 = 79;
        int samnum8 = 3;
        int samnum9 = 92;
        System.out.print(samnum7 + " - " + samnum8 + " % " + samnum9 + " = ");
        System.out.println(samnum7 - samnum8 % samnum9);
        System.out.println(" ");
        
        //2.04 Additional double Equations
        System.out.println("Additional Double Equations");
        double samdouble1 = 32.3;
        double samdouble2 = 66.5;
        double samdouble3 = 5.2;
        System.out.print(samdouble1 + " * " + samdouble2 + " / " + samdouble3 + " = ");
        System.out.println(samdouble1 * samdouble2 / samdouble3);
        double samdouble4 = 7.3;
        double samdouble5 = 10.5;
        double samdouble6 = 85.4;
        System.out.print(samdouble4 + " % " + samdouble5 + " + " + samdouble6 + " = ");
        System.out.println(samdouble4 % samdouble5 + samdouble6);
        double samdouble7 = 3.54;
        double samdouble8 = 32.2;
        double samdouble9 = 65.2;
        System.out.print(samdouble7 + " - " + samdouble8 + " * " + samdouble9 + " = ");
        System.out.println(samdouble7 - samdouble8 * samdouble9);
        System.out.println(" ");       
    } // end of main method
} // end of class
