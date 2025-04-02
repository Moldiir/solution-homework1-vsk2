package proxypattern;

import java.util.Set;

public class UploadProtectionProxy {
    private String username;
    private Set<String> authorizedUsers;

    public UploadProtectionProxy(String username, Set<String> authorizedUsers) {
        this.username = username;
        this.authorizedUsers = authorizedUsers;
    }

    public void uploadImage(String filename) {
        if (authorizedUsers.contains(username)) {
            System.out.println("Разрешено --- Агент '" + username + "' загрузил файл '" + filename + "'.");
        } else {
            System.out.println("Запрещено --- Пользователь '" + username + "' не имеет прав на загрузку.");
        }
    }
}