package com.asuscomm.jkh120.code01.api.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.asuscomm.jkh120.code01.api.domain.Report;

@Repository
public interface ReportRepository extends JpaRepository <Report, Long> {
	
	public List<Report> findByGameId(Long gameId);

}
