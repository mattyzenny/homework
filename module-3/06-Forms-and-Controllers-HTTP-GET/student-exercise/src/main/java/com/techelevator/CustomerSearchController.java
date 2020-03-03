package com.techelevator;

import com.techelevator.dao.CustomerDao;
import com.techelevator.dao.model.Customer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class CustomerSearchController {

    @Autowired
    private CustomerDao customerDao;

	@RequestMapping("/customerSearch")
	public String showSearchCustomerForm() {
		return "customerList";
	}

	@RequestMapping("/customerSearchResult")
	public String searchCustomers(HttpServletRequest request) {
		
		String firstLast = request.getParameter("firstLast");
		String sortChoice = request.getParameter("customerSearch");
	
		List<Customer> customers = customerDao.searchAndSortCustomers(firstLast, sortChoice);
	
		request.setAttribute("customers", customers);
		
		return "customerList";
	}
	
}
