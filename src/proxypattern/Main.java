package proxypattern;


import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        System.out.println("--- Просмотр изображений недвижимости ---");
        Image img1 = new ImageProxy("cottage_view.jpg");
        Image img2 = new ImageProxy("loft_top.jpg");

        img1.showThumbnail();
        img2.showThumbnail();

        System.out.println("\n--- Пользователь увеличивает картинку ---");
        img1.showFullImage();

        System.out.println("\n--- Проверка прав на загрузку ---");
        Set<String> allowedUsers = new HashSet<>();
        allowedUsers.add("agent_molya");
        allowedUsers.add("agent_alina");

        UploadProtectionProxy uploader1 = new UploadProtectionProxy("guest_molkish", allowedUsers);
        uploader1.uploadImage("new_building.jpg");

        UploadProtectionProxy uploader2 = new UploadProtectionProxy("agent_karina", allowedUsers);
        uploader2.uploadImage("penthouse.jpg");
    }
}