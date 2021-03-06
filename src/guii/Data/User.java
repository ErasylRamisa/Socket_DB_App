package guii.Data;

import java.io.Serializable;

public class User implements Serializable {
    private Long id;
    private String name;
    private String number;
    private String role;

    public User() {
    }
    public User(Long id, String name, String number, String role) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.role = role;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number='" + number + '\'' +
                ", role='" + role + '\'' +
                '}';
    }
}
