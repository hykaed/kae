package it.innovaway.kae.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Role {
    private Long id;
    private String name;

    private List<User> users;

    public Role(String name) {
        this.name = name;
    }

    public Role() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }


    @OneToMany(mappedBy = "role", cascade = CascadeType.REMOVE)
    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public void setName(String name) {
        this.name = name;
    }

}
