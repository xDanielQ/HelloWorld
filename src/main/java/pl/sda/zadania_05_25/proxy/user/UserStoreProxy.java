package pl.sda.zadania_05_25.proxy.user;

import java.util.Date;

public class UserStoreProxy implements UserStore {

    private final RealUserStore store = new RealUserStore();

    @Override
    public void setUser(User user) {
        System.out.println("Saved user: " + user);
        store.setUser(user);
    }

    @Override
    public User getUser() {
        System.out.println("Get time: " + new Date());
        return store.getUser();
    }
}
