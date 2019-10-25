package pl.sda.zadania_05_25.proxy;


import pl.sda.zadania_05_25.proxy.user.User;
import pl.sda.zadania_05_25.proxy.user.UserStoreProxy;

public class ProxyMain {

    public static void main(String[] args) {
        UserStoreProxy proxy = new UserStoreProxy();
        proxy.setUser(new User("arek@gmail.com", "Arek"));
        User user = proxy.getUser();
        System.out.println(user);
    }
}
