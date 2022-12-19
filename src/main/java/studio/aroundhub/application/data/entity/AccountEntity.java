package studio.aroundhub.application.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "account")
public class AccountEntity {

    @Id
    String id;

    String type;

    String password;

    Integer balance;

    @ManyToOne(targetEntity = EmployeeEntity.class)
    @JoinColumn(name = "employee_id")
    Integer employee_id;

    @ManyToOne(targetEntity = BranchEntity.class)
    @JoinColumn(name = "branch_id")
    Integer branch_id;

    @NotNull
    @ManyToOne(targetEntity = CustomerEntity.class)
    @JoinColumn(name = "customer_id")
    Integer customer_id;

    Timestamp created_at;

    Timestamp updated_at;
}
