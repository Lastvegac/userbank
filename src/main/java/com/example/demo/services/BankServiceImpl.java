package com.example.demo.services;

import com.example.demo.dao.models.Bank;
import com.example.demo.dao.repositories.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BankServiceImpl implements BankService {
@Autowired
private BankRepository bankRepository;
    @Override
    public List<Bank> list() {
        return bankRepository.findAll();
    }

    @Override
    public String addBank(Bank bank) {
        bankRepository.save(bank);
        return "ok";
    }

    @Override
    public String updatebank(Bank bank) {
        bankRepository.save(bank);
        return "OK";
    }

    @Override
    public String removeBank(long id) {
        bankRepository.deleteById(id);
        return "Ok!";
    }
}
