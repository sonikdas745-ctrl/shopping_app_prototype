import java.util.*;
public class Western
{
    int total;
    public void dis()
    {
        int price=0,total=0;
        char ch='y';
        do
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("\t\t\t\t\tWestern Wear\t\t\t\t\t");
            System.out.println("1.Zara");
            System.out.println("2.Shein");
            System.out.println("Kindly enter your choice of brand: ");
            int z = sc.nextInt();
            switch(z)
            {
                case 1:
                Zara za = new Zara();
                za.dis();
                price=za.total;
                break; 
                case 2: 
                Shein sh = new Shein();
                sh.dis();
                price = sh.total;
                break;
                default: 
                System.out.println("Invalid Choice! Sorry!Please try again");  
            }
            System.out.println("Do you still want to browse Western wear ?(y/n): ");
            ch=sc.next().charAt(0);
            total=total+price;
        }while(ch=='y' || ch=='Y');
        System.out.println("\t\t\t\tYour Western bill: " +total+"\t\t\t\t\t");
        System.out.println("\t\t\t\tThank you for using Myntra!\t\t\t\t\t");
    }
}
