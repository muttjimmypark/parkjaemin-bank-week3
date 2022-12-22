package studio.aroundhub.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studio.aroundhub.application.data.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Integer> {
}
