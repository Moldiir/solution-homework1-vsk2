package flyweightpattern;

public class MarkerStyle {
    private final String icon;
    private final String color;
    private final String labelStyle;

    public MarkerStyle(String icon, String color, String labelStyle) {
        this.icon = icon;
        this.color = color;
        this.labelStyle = labelStyle;
    }

    public void draw(String locationName, double lat, double lon) {
        System.out.println("Отображение '" + locationName + "' в (" + lat + ", " + lon + ") с иконкой '" + icon + "', цветом '" + color + "', стиль метки: '" + labelStyle + "'");
    }
}