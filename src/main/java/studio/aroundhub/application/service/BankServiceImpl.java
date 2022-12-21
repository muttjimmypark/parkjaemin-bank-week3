package studio.aroundhub.application.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import studio.aroundhub.application.data.entity.*;
import studio.aroundhub.application.repository.*;

import java.sql.Timestamp;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BankServiceImpl implements BankService {

    private static AccountRepository accountRepository;
    private static BranchRepository branchRepository;
    private static CustomerRepository customerRepository;
    private static EmployeeRepository employeeRepository;
    private static TransactionRepository transactionRepository;

    @Override
    public CustomerEntity createCustomer(Integer id, String name, String social_number, String phone_number, String organization, CustomerGrade grade) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        return customerRepository.save(
                CustomerEntity.builder()
                        .id(id)
                        .name(name)
                        .social_number(social_number)
                        .phone_number(phone_number)
                        .organization(organization)
//                        .grade(CustomerGrade.valueOf(grade.toUpperCase()))
                        .grade(grade)
                        .created_at(timestamp)
                        .updated_at(timestamp)
                        .build()
        );
    }

    @Override
    public Optional<CustomerEntity> deleteCustomer(Integer id) {
        Optional<CustomerEntity> customerEntity = customerRepository.findById(id);
        customerRepository.deleteById(id);
        return customerEntity;
    }

    @Override
    public List<CustomerEntity> getAllCustomer() {
        return customerRepository.findAll();
    }

    @Override
    public AccountEntity createAccount(String id, String password, Integer balance, Integer employee_id, Integer branch_id, Integer customer_id) {
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());

        return accountRepository.save(
                AccountEntity.builder()
                        .id(id)
                        .password(password)
                        .balance(balance)
                        .employee_id(employee_id)
                        .branch_id(branch_id)
                        .customer_id(customer_id)
                        .created_at(timestamp)
                        .updated_at(timestamp)
                        .build()
        );
    }

    @Override
    public Optional<AccountEntity> deleteAccount(String id) {
        Optional<AccountEntity> accountEntity = accountRepository.findById(id);
        accountRepository.deleteById(id);
        return accountEntity;
    }

    @Override
    public List<AccountEntity> getAllAccount() {
        return accountRepository.findAll();
    }

    @Override
    public TransactionEntity createTransaction(Integer balance, TransactionType type, Integer balance_after_transaction, String deposit_account_number, String withdraw_account_number) {
        return transactionRepository.save(
                TransactionEntity.builder()
                        .balance(balance)
                        .type(type)
                        .balance_after_transaction(balance_after_transaction)
                        .deposit_account_number(deposit_account_number)
                        .withdraw_account_number(withdraw_account_number)
                        .build()
        );
    }

    @Override
    public List<TransactionEntity> getAllTransaction() {
        return transactionRepository.findAll();
    }
}
