package com.everis.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "students")
public class Student implements Serializable {	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer studentId;
	
	@Column(name = "gender", nullable = false, length = 80)
	private String gender;
	
	@Column(name = "first_name", nullable = false, length = 80)
	private String firstName;
	
	@Column(name = "middle_name", nullable = false, length = 80)
	private String middleName;
	
	@Column(name = "last_name", nullable = false, length = 80)
	private String lastName;
	
	@Column(name = "date_of_birth", nullable = false)
	//@Temporal(TemporalType.DATE)
	//private Date dateBirth;
	//
	@JsonFormat(pattern="yyyy-MM-dd")
    private LocalDate dateBirth;
	//
	
	@Column(name = "other_student_details", length = 80)
	private String otherStudentDetails;
	
	//@ManyToMany
	//private Set<Parent> parent;
	// additional properties
	
	@JsonIgnoreProperties("parent")
	@ManyToMany
	@JoinTable(
	  name = "student_parents", 
	  joinColumns = @JoinColumn(name = "student_id"), 
	  inverseJoinColumns = @JoinColumn(name = "parent_id"))
	private Set<Parent> parent;

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
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

	public LocalDate getDateBirth() {
		return dateBirth;
	}

	public void setDateBirth(LocalDate dateBirth) {
		this.dateBirth = dateBirth;
	}

	public String getOtherStudentDetails() {
		return otherStudentDetails;
	}

	public void setOtherStudentDetails(String otherStudentDetails) {
		this.otherStudentDetails = otherStudentDetails;
	}

	public Set<Parent> getParent() {
		return parent;
	}

	public void setParent(Set<Parent> parent) {
		this.parent = parent;
	}

	

	

}
