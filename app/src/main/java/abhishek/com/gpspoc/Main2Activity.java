package abhishek.com.gpspoc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

public class Main2Activity extends AppCompatActivity {

    public static final double RANGE_KM = 10;

    private List<Locatio> locatios = new ArrayList<>();
    private List<Locatio> temp = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Log.e("LocationTAG", "onCreate:" + milesToKm(distance(18.566526, 73.912239, 18.5045902, 73.7654297)));

//        locatios.add(new Locatio("Bavdhan", 18.516610, 73.780760));

        locatios.add(new Locatio("Kothrud", 18.501051, 73.811653));
        locatios.add(new Locatio("Viman Nagar", 18.572390, 73.906548));
        locatios.add(new Locatio("Baner", 18.562120, 73.802544));
        locatios.add(new Locatio("Hinjewadi", 18.589800, 73.743202));
        locatios.add(new Locatio("Balewadi", 18.574739, 73.770889));


        for (int i = 0; i < locatios.size(); i++) {
            if (milesToKm(distance(18.516610, 73.780760, locatios.get(i).getLat(), locatios.get(i).getLon())) <= RANGE_KM) {
                temp.add(new Locatio(locatios.get(i).getName(), locatios.get(i).getLat(), locatios.get(i).getLon()));
            }
        }


        for (int j = 0; j < temp.size(); j++) {
            Log.e("Bavdhan", "onCreate: " + temp.get(j).getName());
        }


    }


    private double distance(double lat1, double lon1, double lat2, double lon2) {
        double theta = lon1 - lon2;
        double dist = Math.sin(deg2rad(lat1))
                * Math.sin(deg2rad(lat2))
                + Math.cos(deg2rad(lat1))
                * Math.cos(deg2rad(lat2))
                * Math.cos(deg2rad(theta));
        dist = Math.acos(dist);
        dist = rad2deg(dist);
        dist = dist * 60 * 1.1515;
        return (dist);
    }

    double milesToKm(double d) {
        double km = d / 0.62137;
        return km;
    }


    private double deg2rad(double deg) {
        return (deg * Math.PI / 180.0);
    }

    private double rad2deg(double rad) {
        return (rad * 180.0 / Math.PI);
    }


}



