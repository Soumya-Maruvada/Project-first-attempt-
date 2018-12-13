package com.cg.capstore.ui;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.capstore.bean.Order;
import com.cg.capstore.service.ICapstoreService;

@Controller
public class CapstoreController {
	
	@Autowired
	ICapstoreService capstoneService;
	
	@RequestMapping(value = "orderlist")
	public ModelAndView showAllEmployee() {
		List<Order> order = capstoneService.showAllorders();
		return new ModelAndView("orderlist", "temp", order);
	}
}
