package com.feba.daily.status.report.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.NoResultException;

import com.feba.daily.status.report.bean.DailyStatusReportBean;
import com.feba.daily.status.report.persistance.DailyStatusReportNFT;

public interface CommonService 
{
	public void saveDailStatusReport(DailyStatusReportBean dailyStatusReportBean) throws Exception;
	
	public List<DailyStatusReportNFT> searchByInsertedDateAndSPDId(Date searchDate, String spdId)  throws NoResultException;
	
	public List<DailyStatusReportNFT> searchBySDPId(String spdId) throws NoResultException;
	
	public void updateDailyStatusReport(DailyStatusReportBean dailyStatusReportBean);
	
	public void deleteDailySatuReport(Long objectId);
	
	public void deleteRaidLogById(Long objectId);
	
	public void deleteTestDesignSummaryById(Long objectId);
	
	public void deleteTestExecutionSummaryById(Long objectId);
	
	public Map<String, Long> getLOBNFSReportDetails(Date reportDate);
}
