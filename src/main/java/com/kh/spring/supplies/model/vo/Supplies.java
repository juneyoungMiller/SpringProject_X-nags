package com.kh.spring.supplies.model.vo;

import java.sql.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Supplies {
	
	

	private int suppliesNo;
	private String suppliesCode;
	private String empId;
	private String suppliesName;
	private String counts;
	
	//@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date startDate;
	
	//@DateTimeFormat(pattern ="yyyy-MM-dd")
	private Date endDate;
	private String status;
	
	public Supplies(String suppliesCode, String empId, String suppliesName, String counts, Date startDate, Date endDate,
			String status) {
		super();
		this.suppliesCode = suppliesCode;
		this.empId = empId;
		this.suppliesName = suppliesName;
		this.counts = counts;
		this.startDate = startDate;
		this.endDate = endDate;
		this.status = status;
	}
	

	
	
}
