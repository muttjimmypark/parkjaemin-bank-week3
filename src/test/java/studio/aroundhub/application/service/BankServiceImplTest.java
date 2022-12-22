package studio.aroundhub.application.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.transaction.annotation.Transactional;
import studio.aroundhub.application.AppConfig;
import studio.aroundhub.application.data.entity.CustomerEntity;
import studio.aroundhub.application.data.entity.CustomerGrade;
import studio.aroundhub.application.repository.*;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Transactional
class BankServiceImplTest {

    //    @Autowired
//    AccountRepository accountRepository;
//    @Autowired
//    BranchRepository branchRepository;
//    @Autowired
//    CustomerRepository customerRepository;
//    @Autowired
//    EmployeeRepository employeeRepository;
//    @Autowired
//    TransactionRepository transactionRepository;
    CustomerRepository customerRepository;
    BankService bankService;


    @BeforeEach
    void setUp() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

        customerRepository = ac.getBean("customerRepository", CustomerRepository.class);
        bankService = ac.getBean("bankService", BankServiceImpl.class);
    }


    @Test
    void createCustomer() {
        CustomerEntity customerEntity
                = CustomerEntity.builder()
                .id(500)
                .name("cusman")
                .social_number("990929-1234567")
                .phone_number("010-7894-5612")
                .organization("companyname")
                .grade(CustomerGrade.GOLD)
                .build();

        bankService.createCustomer(
                500,
                "cusman",
                "990929-1234567",
                "010-7894-5612",
                "companyname",
                CustomerGrade.GOLD
        );

        assertThat(customerRepository.findById(500).get()).isEqualTo(customerEntity);
    }
}