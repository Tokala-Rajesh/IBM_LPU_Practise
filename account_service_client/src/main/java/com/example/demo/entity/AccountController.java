package com.example.demo.entity;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.Service.AccountService;

@Controller
public class AccountController 
{
	private AccountService accountService;

	public AccountController(AccountService accountService) {
		super();
		this.accountService = accountService;
	}
	@GetMapping("/accounts")
	public String getAccounts(Model model) 
	{
		model.addAttribute("accounts", accountService.getAllAccounts());
		return "accounts";
	}
	 @RequestMapping("/account/{id}")
	  public String getProduct(@PathVariable Integer id, Model model)
	   {
	        model.addAttribute("account", accountService.getAccountById(id));
	        return "account";
	    }
	 @RequestMapping("/account/new")
	    public String newAccount(Model model)
	    {
	        model.addAttribute("account", new Account());
	        return "accountform";
	    }
	    
	    @RequestMapping(value = "/account", method = RequestMethod.POST)
	    public String saveProduct(Account account)
	    {
	        accountService.addAcccount(account);
	        return "redirect:/accounts/";
	    }
	    

}
