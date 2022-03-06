import CabService.Calc;
import core.Rides;
import CabService.CalcRT;
import core.CabDriver;
import core.RideTaker;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class cab2 {

    public static void main(String args[]){
        List<Rides> ridesList= new ArrayList<Rides>();
        ridesList.add(new Rides("Ram",3,"Bheem",5));
        ridesList.add(new Rides("Laxman",5,"Nakul",2));
        ridesList.add(new Rides("Ram",4,"Sahdev",2));
        ridesList.add(new Rides("Bharat",3,"Bheem",5));
        ridesList.add(new Rides("Ram",3,"Bheem",1));
        ridesList.add(new Rides("Laxman",5,"Sahdev",3));
        ridesList.add(new Rides("Bharat",5,"Nakul",5));

        CalcRT calcRT=new CalcRT(ridesList);
        calcRT.calcAvg();
        calcRT.calcAvgDriver();

        Scanner sc=new Scanner(System.in);
        String inp=sc.next();
        String ans=Calc.CalcDriver(inp);
        System.out.println(ans);
    }
}
