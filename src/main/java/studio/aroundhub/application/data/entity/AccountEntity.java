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

    @ManyToOne
    @JoinColumn(name = "employee_id")
    Integer employee_id;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    Integer branch_id;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "customer_id")
    Integer customer_id;

    Timestamp created_at;

    Timestamp updated_at;
}
