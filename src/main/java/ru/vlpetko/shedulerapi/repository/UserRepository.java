package ru.vlpetko.shedulerapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.vlpetko.shedulerapi.model.DockUser;

@Repository
public interface UserRepository extends JpaRepository<DockUser, Long> {
}
