package com.icoding.trangphuc.domain;

import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = Permission.TABLE)
public class Permission {

	public static final String TABLE = "permission";
	private static final String PK = "id";
	public static final long serialVersionUID = 0L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = Permission.PK)
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "description")
	private String description;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "listPermisiions")
	private Collection<Role> listRoles;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Collection<Role> getListRoles() {
		return listRoles;
	}

	public void setListRoles(Collection<Role> listRoles) {
		this.listRoles = listRoles;
	}

}
