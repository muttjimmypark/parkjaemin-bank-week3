package studio.aroundhub.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import studio.aroundhub.application.data.entity.AccountEntity;

public interface AccountRepository extends JpaRepository<AccountEntity, String> {
}
