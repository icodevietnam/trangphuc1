package com.icoding.trangphuc.domain;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = Role.TABLE)
public class Role {

	public static final String TABLE = "role";
	private static final String PK = "id";
	public static final long serialVersionUID = 0L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = Role.PK)
	private Integer id;

	@Column(name = "name")
	private String name;

	@Column(name = "desription")
	private String description;

	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "listRoles")
	private Collection<Account> listAccounts;

	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(name = "roles_permission", joinColumns = { @JoinColumn(name = "role_id") }, inverseJoinColumns = { @JoinColumn(name = "permission_id") })
	private Collection<Permission> listPermisiions;

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

	public Collection<Account> getListAccounts() {
		return listAccounts;
	}

	public void setListAccounts(Collection<Account> listAccounts) {
		this.listAccounts = listAccounts;
	}

	public Collection<Permission> getListPermisiions() {
		return listPermisiions;
	}

	public void setListPermisiions(Collection<Permission> listPermisiions) {
		this.listPermisiions = listPermisiions;
	}

}
