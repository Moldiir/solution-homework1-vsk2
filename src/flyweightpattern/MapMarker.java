package flyweightpattern;

public class MapMarker {
    private final double latitude;
    private final double longitude;
    private final String name;
    private final MarkerStyle style;

    public MapMarker(String name, double lat, double lon, MarkerStyle style) {
        this.name = name;
        this.latitude = lat;
        this.longitude = lon;
        this.style = style;
    }

    public void render() {
        style.draw(name, latitude, longitude);
    }
}