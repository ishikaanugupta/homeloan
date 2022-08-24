package com.example.homeloan.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.homeloan.model.Homeloan;

@Repository
public interface HomeloanRepository extends JpaRepository<Homeloan, Integer>{

}
