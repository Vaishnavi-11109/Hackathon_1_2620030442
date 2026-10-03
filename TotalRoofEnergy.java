import java.util.*;
class TotalRoofEnergy{
    static double calculateTotalEnergy(double morningEnergy,double eveningEnergy){
        return (morningEnergy+eveningEnergy);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
     System.out.println("Enter Morning Energy");
        double morningEnergy=sc.nextDouble();
    System.out.println("Enter Evening Energy");
        double eveningEnergy=sc.nextDouble();
    double totalEnergy= calculateTotalEnergy(morningEnergy,eveningEnergy);
        System.out.println("Total Energy Generated:"+ totalEnergy);

        }
    }
