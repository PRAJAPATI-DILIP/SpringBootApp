package com.serverApp.ServerApp.Repository;

import com.serverApp.ServerApp.Entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
