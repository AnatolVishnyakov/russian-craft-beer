package ru.russiancraftbeer.data.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
public class User {
    @Id
    private Long id;
    private String firstName;
    private String lastName;
    private String secondName;
    private String email;
    private String password;
    private boolean enabled;
    @ManyToMany
    @JoinTable(
            name = "users_roles",
            joinColumns = @JoinColumn(
                    name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(
                    name = "role_id", referencedColumnName = "id"))
    private Collection<Role> roles;

    public User() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
