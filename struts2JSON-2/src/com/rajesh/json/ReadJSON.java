package com.rajesh.json;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rajesh.json.Report;
import com.opensymphony.xwork2.ActionSupport;

public class ReadJSON extends ActionSupport {

	private static final long serialVersionUID = -6765991741441442190L;

//	private List<Report> data;
	private String data;
	private String campaignId;
	private List<StaffVo> staffGroup;
	private List<TargetCriteriaVO> criteriaList;
	private Map<String,List<TargetDetailVO>> detail;//key la staffId
	private TargetVO target;
	
	
	public String readJSON() {
		System.out.println("getJSON Method Call Before");
		
//		data =  new ArrayList<Report>();	
//		Report obj = new Report();
//		obj.setActive(false);
//		obj.setColor("Green");
//		obj.setDate("05-Sep-2013");
//		obj.setId(1);
//		obj.setName("Rajesh");
//		this.data.add(obj);
//		
//		System.out.println("getJSON Method Call");
//		System.out.println("Length of Data is "+data.size());
//
//		try{
//		for (int i = 0; i < data.size(); i++) {
//			System.out.println("Color is " + data.get(i).getColor());
//			System.out.println("Date  is " + data.get(i).getDate());
//			System.out.println("ID is " + data.get(i).getId());
//			System.out.println("Names is " + data.get(i).getName());
//		}}catch(Exception e)
//		{
//			e.printStackTrace();
//		}
		return SUCCESS;
	}

	public String writeJSON() {
		target = new TargetVO();
		target.setCampaignId(new Long(campaignId));
		target.setStaffGroup(staffGroup);
		target.setCriteriaList(criteriaList);
		target.setDetail(detail);
		try {
			System.out.println("campaignId: " + campaignId);
			System.out.println("Staff Group ");
			for (int i = 0; i < staffGroup.size(); i++){
				System.out.println("\tStaff id: " + staffGroup.get(i).getId());
				System.out.println("\tStaff name: " + staffGroup.get(i).getName());
			}
			System.out.println("Criteria list: ");
			for (int i = 0; i < criteriaList.size(); i++){
				System.out.println("\tCriteria id: " + criteriaList.get(i).getId());
				System.out.println("\tCriteria name: " + criteriaList.get(i).getName());
			}
			System.out.println("Target Detail ");
			for (Object key : detail.keySet()) {
				List<TargetDetailVO> list = detail.get(key);
				for (int i = 0; i < list.size(); i++){
					System.out.println("\tStaff ID: " + key.toString());
					System.out.println("\tCriteria ID: " + list.get(i).geId());
					System.out.println("\tQuantity: " + list.get(i).getQuantity());
				}
			}			
			System.out.println("Execute Method");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return SUCCESS;
	}

	public String getData() {
		System.out.println("Getter Call");
		return data;
	}

	public void setData(String data) {
		System.out.println("Setter Call Flow");
		this.data = data;
	}
	public String getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(String campaignId) {
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