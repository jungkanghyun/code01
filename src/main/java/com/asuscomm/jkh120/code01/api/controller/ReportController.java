package com.asuscomm.jkh120.code01.api.controller;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.asuscomm.jkh120.code01.api.domain.Report;
import com.asuscomm.jkh120.code01.api.service.ReportService;

@RestController
public class ReportController {

	@Autowired
	private ReportService reportService;
	
	@RequestMapping(value = "report/game/{id}", method = GET)
	public List<Report> findByGameId(@PathVariable("id") Long gameId) {
		return reportService.findByGameId(gameId);
	}
}
