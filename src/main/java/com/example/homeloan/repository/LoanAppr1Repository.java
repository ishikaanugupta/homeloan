
package com.example.homeloan.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.homeloan.model.LoanAppr1;


@Repository
public interface LoanAppr1Repository extends JpaRepository<LoanAppr1, Integer> {

}