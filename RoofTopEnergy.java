import java.util.*;
class RoofTopEnergy{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Energy in kWh");
        double energy=sc.nextDouble();
        if(energy>=10) System.out.println("Good Energy Generation");
        else System.out.println("Low Energy Generation");

    }
}