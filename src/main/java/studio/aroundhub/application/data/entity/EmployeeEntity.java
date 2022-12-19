package studio.aroundhub.application.data.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class EmployeeEntity {

    @Id
    Integer id;

    String name;

    @ManyToOne
    @JoinColumn(name = "branch_id")
    Integer branch_id;
}
