public class Geo {
    private double latitude;
    private double longitude;

    public Geo(double umaLatitude, double umaLongitude){
        this.latitude = umaLatitude;
        this.longitude = umaLongitude;
    }

    public double getLatitude(){
        return latitude;
    }

    public double longitude(){
        return longitude;
    }

    public String toString(){
        return "\n Latitude: " + latitude +
                "\n Longitude: " + longitude;
    }
}
    

