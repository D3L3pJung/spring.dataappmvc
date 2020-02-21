package customer.dataapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import customer.dataapp.models.Customer;
import customer.dataapp.services.CustomerService;

@Controller
public class CustomerController {
	private CustomerService cs;

	@RequestMapping(value = "/customer", method = RequestMethod.GET)
	public ModelAndView showCustomerForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("create-customer");

		Customer c = new Customer();
		mv.addObject("custFormObj", c);

		return mv;

	}

	@RequestMapping(value = "/customer", method = RequestMethod.POST)
	public String processSignupCus(Customer cust) throws Exception {
		 cs.addCustomerById(cust);
		return "success";

	}

	public CustomerService getCs() {
		return cs;
	}

	public void setCs(CustomerService cs) {
		this.cs = cs;
	}

}
