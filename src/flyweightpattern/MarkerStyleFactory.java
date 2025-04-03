package flyweightpattern;

import java.util.HashMap;
import java.util.Map;

public class MarkerStyleFactory {
    private static final Map<String, MarkerStyle> styles = new HashMap<>();

    public static MarkerStyle getStyle(String key, String icon, String color, String labelStyle) {
        if (!styles.containsKey(key)) {
            styles.put(key, new MarkerStyle(icon, color, labelStyle));
        }
        return styles.get(key);
    }

    public static int getStyleCount() {
        return styles.size();
    }
}