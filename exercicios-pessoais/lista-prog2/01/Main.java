/*
 * Um empregado recebe R$ 16,78 por cada hora trabalhada em uma semana. Se esse
empregado fizer hora extra, deve receber o valor base acrescido de 50%. Do
pagamento bruto do empregado, 6% são reIdos pela Previdência Social, 14%, pelo
Receita Federal (imposto de renda), 5% pelo estado, e R$ 10 por semana para o
Sindicato. Se o empregado Iver três ou mais dependentes, um adicional de R$ 35
é reIdo para cobrir o custo extra do seguro de saúde.

Com base nessas informações, escreva um programa que receba como entrada o número de horas
trabalhadas em uma semana e o número de dependentes do empregado. 
O programa deve apresentar como saída o pagamento bruto e o pagamento líquido
do empregado, bem como os valores reIdos por impostos.
 */
import java.util.Scanner;

public class Main{
    //Without constructor
    //Without atributes
    //Only main method
    public static void main(String args[]){
        //______________________________________VARIABLES
        final double baseHourValue = 16.78f;
        double workedHours = 0.0f;
        double grossPayment = 0.0f;
        double liquidPayment = 0.0f;
        int dependents = 0;

        //______________________________________GET DATA
        Scanner scannerObj = new Scanner(System.in);

        //Get worked hours
        System.out.println("Insert worked hours: ");
        workedHours = scannerObj.nextFloat();

        //Get dependents
        System.out.println("Insert dependents number");
        dependents = scannerObj.nextInt();

        //______________________________________MATH
        //Gross payment
        if(workedHours <= 120){ //no overtime
            grossPayment = workedHours * baseHourValue;
        }
        else{ //overtime
            double overtime = workedHours - 120;
            grossPayment = overtime * (baseHourValue + baseHourValue * 50/100) + 120 * baseHourValue;
        }

        liquidPayment = grossPayment - (grossPayment * (6f/100f) + grossPayment * (14f/100f) + grossPayment * (5f/100f) + 10);
        if(dependents > 2){
            liquidPayment -= 30;
            System.out.printf("Life insurance: $%f\n", 35.00f);
        }

        //______________________________________OUTPUTS
        
        System.out.printf("Previdencia Taxes: $%f\n", grossPayment * (6f/100f));
        System.out.printf("IRS Taxes: $%f\n", grossPayment * (14f/100f));
        System.out.printf("State Taxes: $%f\n", grossPayment * (5f/100f));
        System.out.printf("Labor union: $%f\n", 10.00f);
        System.out.printf("Gross Payment: $%f\n", grossPayment);
        System.out.printf("Liquid payment: $%f\n", liquidPayment);

        scannerObj.close();
    }
}