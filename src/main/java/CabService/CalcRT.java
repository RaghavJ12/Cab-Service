package CabService;

import core.CabDriver;
import core.RideTaker;
import core.Rides;

import java.util.*;

public class CalcRT {
    public static List<Rides> ridesList;

    public CalcRT(List<Rides> ridesList) {
        this.ridesList=ridesList;
    }

    protected static List<RideTaker> lrt=new ArrayList<>();
    protected static List<CabDriver> lcd=new ArrayList<>();
    public static void calcAvg(){
        Map<String, int[]> mp=new HashMap<>();
        for (int i = 0; i < ridesList.size(); i++){
            int[] np = new int[2];
            if(mp.containsKey(ridesList.get(i).rt))
            {
                np=mp.get(ridesList.get(i).rt);
                np[0]++;
                np[1]+=+ridesList.get(i).avgRt;
                mp.put(ridesList.get(i).rt,np);
            }
            else
            {
                np[0]=1;
                np[1]=ridesList.get(i).avgRt;
                mp.put(ridesList.get(i).rt, np);
            }
        }
        Iterator<Map.Entry<String, int[]>> itr = mp.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry<String, int[]> entry = itr.next();
            float val=(float) entry.getValue()[1]/entry.getValue()[0];
            RideTaker r1=new RideTaker(entry.getKey(),val);
            lrt.add(r1);
        }
    }
    public static void calcAvgDriver(){
        Map<String, int[]> mp=new TreeMap<>();
        for (int i = 0; i < ridesList.size(); i++){
            int[] np=new int[2];
            if(mp.containsKey(ridesList.get(i).cd))
            {
                np=mp.get(ridesList.get(i).cd);
                np[0]++;
                np[1]+=ridesList.get(i).avgCd;
                mp.put(ridesList.get(i).cd,np);
            }
            else
            {
                np[0]=1;
                np[1]=ridesList.get(i).avgCd;
                mp.put(ridesList.get(i).cd, np);
            }
        }
        Iterator<Map.Entry<String, int[]>> itr = mp.entrySet().iterator();
        while(itr.hasNext())
        {
            Map.Entry<String, int[]> entry = itr.next();
            float val=(float) entry.getValue()[1]/entry.getValue()[0];
            CabDriver r1=new CabDriver(entry.getKey(),val);
            lcd.add(r1);
        }
    }
}
