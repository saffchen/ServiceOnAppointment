package ru.serviceonappointment.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.serviceonappointment.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
