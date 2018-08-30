package com.example.demo.services;

import com.example.demo.dao.models.Bank;

import java.util.List;

public interface BankService {
  List<Bank> list();
    String addBank(Bank bank);
    String updatebank(Bank bank);
    String removeBank(long id);

}
