import java.util.*;
public class Ethnic
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
            System.out.println("1.Fabindia");
            System.out.println("2.GlobalDesi");
            System.out.println("Kindly enter your choice of brand: ");
            int z = sc.nextInt();
            switch(z)
            {
                case 1:
                
                Fabindia f = new Fabindia();
                f.dis();
                price=f.total;
                break;
                
                case 2:    
                
                GlobalDesi gd = new GlobalDesi();
                gd.dis();
                price = gd.total;
                break;
                default: 
                System.out.println("Invalid Choice! Sorry!Please try again");  
            }
            System.out.println("Do you still want to browse ethnic wear ?(y/n): ");
            ch=sc.next().charAt(0);
            total=total+price;
        }while(ch=='y' || ch=='Y');
        System.out.println("\t\t\t\tYour Ethnic bill: " +total+"\t\t\t\t\t");
        System.out.println("\t\t\t\tThank you for using Myntra!\t\t\t\t\t");
    }
}
