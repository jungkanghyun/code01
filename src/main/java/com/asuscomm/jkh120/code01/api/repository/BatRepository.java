package com.asuscomm.jkh120.code01.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asuscomm.jkh120.code01.api.domain.Bat;

@Repository
public interface BatRepository extends JpaRepository <Bat, Long> {

}
