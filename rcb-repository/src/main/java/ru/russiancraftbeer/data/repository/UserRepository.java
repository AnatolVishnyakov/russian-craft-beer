package ru.russiancraftbeer.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.russiancraftbeer.data.model.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
