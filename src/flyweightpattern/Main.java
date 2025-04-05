package flyweightpattern;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MapMarker> markers = new ArrayList<>();

        // Создание 1000 заправок с общим стилем
        MarkerStyle gasStyle = MarkerStyleFactory.getStyle("gas", "⛽", "blue", "bold");
        for (int i = 0; i < 1000; i++) {
            markers.add(new MapMarker("Gas Station #" + i, 50.0 + i * 0.01, 30.0 + i * 0.01, gasStyle));
        }

        // Создание 1000 ресторанов с другим стилем
        MarkerStyle foodStyle = MarkerStyleFactory.getStyle("food", "🍽", "red", "italic");
        for (int i = 0; i < 1000; i++) {
            markers.add(new MapMarker("Restaurant #" + i, 40.0 + i * 0.01, 20.0 + i * 0.01, foodStyle));
        }

        // Визуализация некоторых меток
        markers.get(0).render();
        markers.get(1000).render();

        // Статистика
        System.out.println("Всего маркеров: " + markers.size());
        System.out.println("Уникальных стилей: " + MarkerStyleFactory.getStyleCount());
    }
}