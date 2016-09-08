package com.asuscomm.jkh120.code01.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.asuscomm.jkh120.code01.api.domain.Report;
import com.asuscomm.jkh120.code01.api.repository.ReportRepository;

@Service
public class ReportService {

	@Autowired
	private ReportRepository reportRepository;
	
	public List<Report> findByGameId(Long id) {
		return reportRepository.findByGameId(id);
	}
}
