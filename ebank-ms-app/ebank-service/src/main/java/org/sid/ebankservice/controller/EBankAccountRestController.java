package org.sid.ebankservice.controller;

import org.sid.ebankservice.entities.BankAccount;
import org.sid.ebankservice.service.EbankService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EBankAccountRestController {
    private EbankService ebankService;
    public EBankAccountRestController(EbankService ebankService){
        this.ebankService=ebankService;
    }
    @GetMapping("/accounts")
    public List<BankAccount> getAllBankAccount(){
        return ebankService.getAllBankAccount();
    }
    @GetMapping("/accounts/{id}")
    public BankAccount getBankAccountById(@PathVariable String id){
        return ebankService.getBankAccountById(id);
    }
    @PostMapping("/accounts")
    public BankAccount save(@RequestBody BankAccount bankAccount) {
        return ebankService.save(bankAccount);
    }
}
