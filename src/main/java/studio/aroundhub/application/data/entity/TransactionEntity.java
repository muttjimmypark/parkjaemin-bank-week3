package studio.aroundhub.application.data.entity;

import lombok.Builder;

import javax.persistence.*;

@Builder
@Entity
@Table(name = "transaction")
@SequenceGenerator(
        name = "TRANSACTION_ID_GENERATOR",
        sequenceName = "TRANSACTION_ID_GENERATOR",
        allocationSize = 1
)
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TRANSACTION_ID_GENERATOR")
    Integer id;

    Integer balance;

    TransactionType type;

    Integer balance_after_transaction;

    @ManyToOne(targetEntity = AccountEntity.class)
    @JoinColumn(name = "account_id")
    String deposit_account_number;

    @ManyToOne(targetEntity = AccountEntity.class)
    @JoinColumn(name = "account_id")
    String withdraw_account_number;
}
