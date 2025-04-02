package proxypattern;

public class ImageProxy implements Image {
    private String filename;
    private RealEstateImage realImage;

    public ImageProxy(String filename) {
        this.filename = filename;
    }

    @Override
    public void showThumbnail() {
        System.out.println("Показ миниатюры через прокси --- " + filename + " (низкое качество)");
    }

    @Override
    public void showFullImage() {
        if (realImage == null) {
            realImage = new RealEstateImage(filename);
        }
        realImage.showFullImage();
    }
}