import java.util.*;
class RoofTop{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter Panel ID");
        int panel=sc.nextInt();
    System.out.println("Enter Energy in kWh");
        double energy=sc.nextDouble();
    System.out.println("Enter Number of Solar Panels");
        int num=sc.nextInt();
    System.out.println("Enter status");
        char stat=sc.next().charAt(0);
    System.out.println(
       " Panel ID: "+ panel +"\n"+
        "Energy in kWh:" + energy +"\n"+
        "Number of Solar Panels:" + num +"\n"+
        "System status: "+stat);

    }
}