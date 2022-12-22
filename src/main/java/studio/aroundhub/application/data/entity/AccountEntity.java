package studio.aroundhub.application.data.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "account")
public class AccountEntity {

    @Id
    String id;

    String password;

    Integer balance;

    @ManyToOne(targetEntity = EmployeeEntity.class)
    Integer employee_id;

    @ManyToOne(targetEntity = BranchEntity.class)
    Integer branch_id;

    @NotNull
    @ManyToOne(targetEntity = CustomerEntity.class)
    Integer customer_id;

    Timestamp created_at;

    Timestamp updated_at;
}
