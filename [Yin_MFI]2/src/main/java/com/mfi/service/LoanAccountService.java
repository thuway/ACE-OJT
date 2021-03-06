package com.mfi.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mfi.model.CurrentAccount;
import com.mfi.model.LoanAccount;
import com.mfi.repository.LoanAccountRepository;

@Service
public class LoanAccountService {
	@Autowired
	LoanAccountRepository repo;
	
	public void save(LoanAccount loanAccount) {
		repo.save(loanAccount);
	}
	
	public List<LoanAccount> selectAll(){
		return repo.findAll();
	}
	
	
	public LoanAccount getLoanAccount(String code) {
		return repo.findbyCode(code);
	}
}
