package pl.sda.zadania_05_25.proxy.user;

class RealUserStore implements UserStore {

    private User user;

    @Override
    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public User getUser() {
        return user;
    }
}
