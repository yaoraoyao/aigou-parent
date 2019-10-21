package cn.itsource.aigou;

/**
 * @author solargen
 * @version 1.0
 * @description TODO
 * @date 2019/10/14 11:30
 */
public class User {

    private Long id;
    private String username;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                '}';
    }

    public User(Long id, String username) {
        this.id = id;
        this.username = username;
    }

    public User() {
    }
}
