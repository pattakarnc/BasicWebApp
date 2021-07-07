package io.muzoo.ooc.webapp.basic.security;

public class User {

    private long id;
    private String username;
    private String password;
    private String displayName;

    public User() {
    }

    public User(long id, String username, String password, String displayName) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.displayName = displayName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
