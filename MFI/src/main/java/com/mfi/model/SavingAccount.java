package com.mfi.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class SavingAccount {

	@Id
	private String savingAccountNumber;
	private Double balance;
	private Boolean accountStatus;
	private Date openingDate;
	private Date closeDate;
	private Timestamp ts;
	
	private int createdUser;
	private Date createdDate;
	private String updateUser;
	private Date updateDate;	
	public SavingAccount() {
		super();
	}

	
}
