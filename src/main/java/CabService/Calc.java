package CabService;

import core.RideTaker;
import core.Rides;

import java.util.List;

public class Calc extends CalcRT{
    public Calc(List<Rides> ridesList) {
        super(ridesList);
    }

    public static boolean check(String taker, String driver){
        for (int i=0;i< ridesList.size();i++){
            if(ridesList.get(i).cd.equals(driver) && ridesList.get(i).rt.equals(taker)){
                if(ridesList.get(i).avgCd==1 || ridesList.get(i).avgRt==1)
                    return false;
            }
        }
        return true;
    }
    public static String CalcDriver(String taker){
        String ans;
        int ch=0;
        float rate=0;
        for (int i=0;i< lrt.size();i++){
            if(lrt.get(i).getName().equals(taker)){
                rate=lrt.get(i).getRating();
                ch=1;
                break;
            }
        }
        if(ch==0){
            System.out.println("Ride Taker not found. User added.");
            RideTaker r=new RideTaker(taker,rate);
            lrt.add(r);
        }
        for (int i=0;i< lcd.size();i++) {
            if (lcd.get(i).getRating() >= rate && check(taker,lcd.get(i).getName())) {
                return lcd.get(i).getName();
            }
        }
        ans=lcd.get(0).getName();
        return ans;
    }
}
