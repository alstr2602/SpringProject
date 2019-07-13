package com.everis.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Family_Member")
public class FamilyMember implements Serializable {
	@Id
	@Column(name = "family_member_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer family_member_id;
	
	//@ManyToOne(optional = false)
	@ManyToOne(optional = false)
	@JoinColumn(name="family_id",referencedColumnName="family_id")
	private Family family;	
	
	@Column(name = "parent_or_student_member", nullable = false, length = 80)
	private String parentStudentMember;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="parent_id",referencedColumnName="parent_id")
	private Parent parent;
	
	@ManyToOne(optional = false)
	@JoinColumn(name="student_id",referencedColumnName="student_id")
	private Student student;
	
	public FamilyMember() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getFamily_member_id() {
		return family_member_id;
	}

	public void setFamily_member_id(Integer family_member_id) {
		this.family_member_id = family_member_id;
	}

	public Family getFamily() {
		return family;
	}

	public void setFamily(Family family) {
		this.family = family;
	}

	public String getParentStudentMember() {
		return parentStudentMember;
	}

	public void setParentStudentMember(String parentStudentMember) {
		this.parentStudentMember = parentStudentMember;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}	

}
