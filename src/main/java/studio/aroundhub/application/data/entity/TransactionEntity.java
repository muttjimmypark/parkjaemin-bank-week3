package studio.aroundhub.application.data.entity;

import javax.persistence.*;

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
    String account_number;
}
