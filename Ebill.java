import java.util.Scanner;
public class Ebill {
     public static void main(String[] args)
    {
        String consumername ;
        double phonenumber ;
        double units, totalunitcost=0.0 ,totalcost=0.0 ; 
        {
            Scanner sc = new Scanner (System.in) ;
            System.out.println("Enter Consumer name") ;
            String Consumername=sc.nextLine() ;
            System.out.println("Enter Phone number") ;
            double Phonenumber = sc.nextDouble() ;
            System.out.println("Enter Number of units consumed");
            units = sc.nextDouble();
            if (units>0 && units <=50)
            totalunitcost = (7.00*units);
            else if (units>50 && units <=100)
            totalunitcost = 50*7.00 + ((units-50)*8.50);
            else if (units>100 && units <=300)
            totalunitcost = 50*7.00 + 50*8.50 + ((units-100)*9.90);
            else if (units>300 && units<=500)
            totalunitcost = 50*7.00 + 50*8.50 + 200*9.90+ ((units-300)*10.40);
            else if (units>500)
            totalunitcost = 50*7.00 + 50*8.50 + 200*9.90+ 200*10.40+ ((units-500)*11.00);
            totalcost=totalunitcost+65;
            System.out.println(Consumername);
            System.out.println(Phonenumber);
            System.out.println(units);
            System.out.println(totalcost);  
            System.out.println("Monthly minimum energy charges: Rs.65/month for single phase supply");
        }
    }
}   
