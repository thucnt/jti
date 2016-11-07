package com.rajesh.json;

import java.util.List;
import java.util.Map;

public class TargetVO {
	Long campaignId;
	List<StaffVo> staffGroup;
	List<TargetCriteriaVO> criteriaList;
	Map<String,List<TargetDetailVO>> detail;//key la staffId
	
	public TargetVO(){};
	public TargetVO(Long campaignId, List<StaffVo> staffGroup, List<TargetCriteriaVO> criteriaList,
			Map<String, List<TargetDetailVO>> detail) {
		super();
		this.campaignId = campaignId;
		this.staffGroup = staffGroup;
		this.criteriaList = criteriaList;
		this.detail = detail;
	}

	public Long getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}

	public List<StaffVo> getStaffGroup() {
		return staffGroup;
	}

	public void setStaffGroup(List<StaffVo> staffGroup) {
		this.staffGroup = staffGroup;
	}

	public List<TargetCriteriaVO> getCriteriaList() {
		return criteriaList;
	}

	public void setCriteriaList(List<TargetCriteriaVO> criteriaList) {
		this.criteriaList = criteriaList;
	}

	public Map<String, List<TargetDetailVO>> getDetail() {
		return detail;
	}

	public void setDetail(Map<String, List<TargetDetailVO>> detail) {
		this.detail = detail;
	}
}
