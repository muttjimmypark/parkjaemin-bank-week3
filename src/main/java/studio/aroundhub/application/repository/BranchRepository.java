package studio.aroundhub.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studio.aroundhub.application.data.entity.BranchEntity;

public interface BranchRepository extends JpaRepository<BranchEntity, Integer> {
}
