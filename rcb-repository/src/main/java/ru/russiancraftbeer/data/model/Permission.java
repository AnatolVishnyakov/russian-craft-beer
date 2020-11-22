package ru.russiancraftbeer.data.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.Collection;

@Entity
public class Permission {
    @Id
    private Long id;
    private String name;
    @ManyToMany(mappedBy = "permissions")
    private Collection<Role> roles;
}
