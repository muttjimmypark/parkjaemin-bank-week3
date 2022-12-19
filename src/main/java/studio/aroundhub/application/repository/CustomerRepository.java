package studio.aroundhub.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studio.aroundhub.application.data.entity.CustomerEntity;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
}
