import java.util.*;
public class Myntra
{    int total, price;
    public static void main()
    {   int price=0,total=0;
        Scanner sc=new Scanner (System.in);
        char ch='y';
        do
        { "\t\t\t\t\t------------------Myntra------------------\t\t\t\t\t");
            System.out.println("1.Ethnic Wear");
            System.out.println("2.Western Wear");
            System.out.println("3.Sports Wear");
            System.out.println("KINDLY ENTER YOUR CHOICE");
            int x=sc.nextInt();
            switch(x)
            {   case 1:
                    Ethnic e = new Ethnic();
                    e.dis();
                    price = e.total;
                    break;
                case 2:
                    Western w = new Western();
                    w.dis();
                    price = w.total;
                    break;
                case 3:
                    SportsWear sw = new SportsWear();
                    sw.dis();
                    price = sw.total;
                    break;    
                default:
                    System.out.println("Invalid Choice! Sorry!Please try again");    
            }
            System.out.println("\t\t\t\tDo you still want to continue the Mobile Main Menu?(y/n): \t\t\t\t\t");
            ch=sc.next().charAt(0);
            total=total+price;
        }while(ch=='y' || ch=='Y');
        
        System.out.println("\t\t\t\tYour Final bill is: " +total+"\t\t\t\t\t");
        System.out.println("\t\t\t\tThank you for visiting Myntra!\t\t\t\t\t");
    } 
}   
