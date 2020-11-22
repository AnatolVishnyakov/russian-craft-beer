package ru.russiancraftbeer.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.russiancraftbeer.data.model.Role;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
}
