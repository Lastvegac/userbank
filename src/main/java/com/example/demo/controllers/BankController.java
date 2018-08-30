package com.example.demo.controllers;

import com.example.demo.dao.models.Bank;
import com.example.demo.dao.models.User;
import com.example.demo.services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/bank")
public class BankController {
@Autowired
private BankService bankService;
    @GetMapping(value = "/")
    public @ResponseBody List<User>getBank(){
        return .list();
    }

    @PostMapping(value = "/")
    public @ResponseBody String addBank(@RequestBody Bank bank){
        return bankService.addBank(bank);
    }

    @PutMapping(value = "/")
    public @ResponseBody String updateBank(@RequestBody Bank bank){

        return bankService.updatebank(bank);
    }

    @DeleteMapping(value = "/{id}")
    public @ResponseBody String deleteBank(@PathVariable(value = "id") long id){
        return bankService.removeBank(id);

    }

}
