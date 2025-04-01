package proxypattern;


public class RealEstateImage implements Image {
    private String filename;

    public RealEstateImage(String filename) {
        this.filename = filename;
        loadFromDisk();
    }

    private void loadFromDisk() {
        System.out.println("Загрузка --- Оригинал изображения '" + filename + "' подгружен с диска.");
    }

    @Override
    public void showThumbnail() {
        System.out.println("Превью ---  " + filename + " (низкое разрешение)");
    }

    @Override
    public void showFullImage() {
        System.out.println("Полный размер ---  " + filename + " (высокое разрешение)");
    }
}