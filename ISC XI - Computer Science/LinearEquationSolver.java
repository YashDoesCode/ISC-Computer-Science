
import java.util.Scanner;

public class LinearEquationSolver
{

    static String LinearEquationSolverOneVar(String equation)
    {
        int n = equation.length(),
                sign = 1, coeff = 0;
        int total = 0, i = 0;


        for (int j = 0; j < n; j++)
        {
            if (equation.charAt(j) == '+' ||
                    equation.charAt(j) == '-')
            {
                if (j > i)
                    total += sign *
                            Integer.parseInt(
                                    equation.substring(i, j));
                i = j;
            }


            else if (equation.charAt(j) == 'x')
            {
                if ((i == j) ||
                        equation.charAt(j - 1) == '+')
                    coeff += sign;

                else if (equation.charAt(j - 1) == '-')
                    coeff -= sign;

                else
                    coeff += sign *
                            Integer.parseInt(
                                    equation.substring(i, j));
                i = j + 1;
            }

            else if (equation.charAt(j) == '=')
            {
                if (j > i)
                    total += sign *
                            Integer.parseInt(
                                    equation.substring(i, j));
                sign = -1;
                i = j + 1;
            }
        }


        if (i < n)
            total = total +
                    sign *
                            Integer.parseInt(
                                    equation.substring(i));

        // For ∞ solutions
        if (coeff == 0 &&
                total == 0)
            return "Infinite solutions";

        // For n(s) = 0
        if (coeff == 0 &&
                total != 0)
            return "No solution";

        int ans = -total / coeff;
        return (Integer.toString(ans));
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the equation:");

        String equation = sc.nextLine();
        System.out.print("x = " +
                LinearEquationSolverOneVar(equation));
    }
}
 