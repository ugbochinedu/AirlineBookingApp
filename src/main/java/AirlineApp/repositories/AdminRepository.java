package AirlineApp.repositories;

import AirlineApp.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin, Long> {
}
