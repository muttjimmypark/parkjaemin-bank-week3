package studio.aroundhub.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studio.aroundhub.application.data.entity.TransactionEntity;

public interface TransactionRepository extends JpaRepository<TransactionEntity, Integer> {
}
