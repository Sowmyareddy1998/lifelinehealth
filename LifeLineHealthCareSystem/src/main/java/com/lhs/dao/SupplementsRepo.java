package com.lhs.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lhs.entity.Supplements;
@Repository
public interface SupplementsRepo extends JpaRepository<Supplements, Integer> {

}
