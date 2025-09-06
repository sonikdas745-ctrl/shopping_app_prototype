import java.util.*;
public class SportsWear
{
    int total;
    public void dis()
    {
        int price=0,total=0;
        char ch='y';
        do
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("\t\t\t\t\tEthnic Wear\t\t\t\t\t");
            System.out.println("1.Nike");
            System.out.println("2.Addidas");
            System.out.println("Kindly enter your choice of brand: ");
            int z = sc.nextInt();
            switch(z)
            {
                case 1:
                
                Nike n = new Nike();
                n.dis();
                price=n.total;
                break;
                
                case 2:    
                
                Addidas dd = new Addidas();
                dd.dis();
                price = dd.total;
                break;
                default: 
                System.out.println("Invalid Choice! Sorry!Please try again");  
            }
            System.out.println("Do you still want to browse Sportswear ?(y/n): ");
            ch=sc.next().charAt(0);
            total=total+price;
        }while(ch=='y' || ch=='Y');
        System.out.println("\t\t\t\tYour Sportswear bill: " +total+"\t\t\t\t\t");
        System.out.println("\t\t\t\tThank you for using Myntra!\t\t\t\t\t");
    }
}
