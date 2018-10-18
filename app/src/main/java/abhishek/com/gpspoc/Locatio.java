package abhishek.com.gpspoc;

/**
 * Created by Abhishek on 10/18/2018.
 */

public class Locatio {


    public Locatio(String name, double lat, double lon) {
        this.name = name;
        this.lat = lat;
        this.lon = lon;
    }

    private int id;
    private String name;
    private double lat;
    private double lon;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Locatio(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLon() {
        return lon;
    }

    public void setLon(double lon) {
        this.lon = lon;
    }
}
