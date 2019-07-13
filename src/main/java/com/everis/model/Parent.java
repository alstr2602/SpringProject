package com.everis.model;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "parents")
public class Parent implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "parent_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer parentId;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy ="parent")
	private List<Family> family;
	
	
	@Column(name = "gender", nullable = false, length = 80)
	private String gender;
	
	@Column(name = "first_name", nullable = false, length = 80)
	private String firstName;
	
	@Column(name = "middle_name", nullable = false, length = 80)
	private String middleName;
	
	@Column(name = "last_name", nullable = false, length = 80)
	private String lastName;
	
	@Column(name = "other_parent_details", nullable = false, length = 80)
	private String otherParentDetails;
	
	@JsonIgnoreProperties("student")
	@ManyToMany(cascade=CascadeType.ALL,mappedBy = "parent")
	private Set<Student> student;

	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOtherParentDetails() {
		return otherParentDetails;
	}

	public void setOtherParentDetails(String otherParentDetails) {
		this.otherParentDetails = otherParentDetails;
	}

	public Set<Student> getStudent() {
		return student;
	}

	public void setStudent(Set<Student> student) {
		this.student = student;
	}
	
		
}
