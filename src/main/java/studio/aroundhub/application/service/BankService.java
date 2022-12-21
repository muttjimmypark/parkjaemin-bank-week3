package studio.aroundhub.application.service;

import studio.aroundhub.application.data.entity.*;

import java.util.List;
import java.util.Optional;

public interface BankService {

    CustomerEntity createCustomer(
            Integer id,
            String name,
            String social_number,
            String phone_number,
            String organization,
            CustomerGrade grade
    );

    Optional<CustomerEntity> deleteCustomer(Integer id);

    List<CustomerEntity> getAllCustomer();

    AccountEntity createAccount(
            String id,
            String password,
            Integer balance,
            Integer employee_id,
            Integer branch_id,
            Integer customer_id
    );

    Optional<AccountEntity> deleteAccount(String id);

    List<AccountEntity> getAllAccount();

    TransactionEntity createTransaction(
            Integer balance,
            TransactionType type,
            Integer balance_after_transaction,
            String deposit_account_number,
            String withdraw_account_number
    );

    List<TransactionEntity> getAllTransaction();

}
