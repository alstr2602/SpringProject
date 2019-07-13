package com.everis.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "families")
public class Family implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "family_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer familyId;
	
	//
	//@ManyToOne(fetch = FetchType.LAZY)
	//@JoinColumn(name = "head_of_family_parent_id")
	//private Parent parent;
	//2//@ManyToOne(fetch = FetchType.LAZY)
    //2//@JoinColumn(name = "head_of_family_parent_id")
    //2//private Parent parent;
	@ManyToOne(optional = false)
	@JoinColumn(name="head_of_family_parent_id")
	private Parent parent;
	//
	
	//@Column(name = "head_of_family_parent_id")
	//private Integer headFamilyParentId;
	
	@Column(name = "family_name", nullable = false, length = 80)
	private String familyName;
	
	public Family() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getFamilyId() {
		return familyId;
	}

	public void setFamilyId(Integer familyId) {
		this.familyId = familyId;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public String getFamilyName() {
		return familyName;
	}

	public void setFamilyName(String familyName) {
		this.familyName = familyName;
	}

	
	
	
	
}
