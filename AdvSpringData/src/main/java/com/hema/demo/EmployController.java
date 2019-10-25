package com.hema.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
@RestController
public class EmployController {
	
	@Autowired
	EmployRepository dao;
	
	int noOfRecords=5;
	int noOfPages;
	
	@RequestMapping("/")
	public ModelAndView displayByPageSize() {
		ModelAndView mv=new ModelAndView();
		List<Employ> lstEmp=(List<Employ>)dao.findAll();
		noOfPages=(lstEmp.size() / noOfRecords) + (lstEmp.size() % noOfRecords);
		mv.addObject("pages",noOfPages);
		mv.addObject("employeeList",lstEmp);
		mv.setViewName("home");
		return mv;
	}
	
	@RequestMapping("/displayAll/Page/{pageno}")
	public ModelAndView displayAllSortByDesig(@PathVariable("pageno")int pageno) {
		ModelAndView mv=new ModelAndView();
		Page<Employ> pages=dao.findAll(PageRequest.of(pageno, noOfRecords));
		mv.addObject("pages",noOfPages);
		mv.addObject("employeeList",(pages).getContent());
		mv.setViewName("home");
		return mv;
	}
	
	/*
	 * @RequestMapping("/") public ModelAndView getEmployees() { ModelAndView mv=new
	 * ModelAndView(); mv.addObject("employeeList", dao.findAll());
	 * mv.setViewName("home"); return mv; }
	 * 
	 * @RequestMapping("/displayjavacontractors") public ModelAndView
	 * getJavaContractors() { ModelAndView mv=new ModelAndView();
	 * mv.addObject("employeeList", dao.findByDeptAndDesig("Java", "C"));
	 * mv.setViewName("home"); return mv; }
	 * 
	 * 
	 * @RequestMapping("/displayjavaemployees") public ModelAndView
	 * getJavaEmployees() { ModelAndView mv=new ModelAndView();
	 * mv.addObject("employeeList", dao.findByDeptAndDesig("Java", "E"));
	 * mv.setViewName("home"); return mv; }
	 * 
	 * @RequestMapping("/displayjavamanagers") public ModelAndView getJavaManagers()
	 * { ModelAndView mv=new ModelAndView(); mv.addObject("employeeList",
	 * dao.findByDeptAndDesig("Java", "M")); mv.setViewName("home"); return mv; }
	 * 
	 * @RequestMapping("/displaymgerabv20000") public ModelAndView getMgrAbv20000()
	 * { ModelAndView mv=new ModelAndView(); mv.addObject("employeeList",
	 * dao.findByBasicabv20000("Java", "M",20000)); mv.setViewName("home"); return
	 * mv; }
	 * 
	 * @RequestMapping("/displayByStarting") public ModelAndView getJavaStartWith()
	 * { ModelAndView mv=new ModelAndView(); mv.addObject("employeeList",
	 * dao.findByStarting("Java", "E", 40000, "S")); mv.setViewName("home"); return
	 * mv; }
	 * 
	 * @RequestMapping("/displayAllSortByDesig") public ModelAndView
	 * displayAllSortByDesig() { ModelAndView mv=new ModelAndView();
	 * mv.addObject("employeeList", dao.findAll(Sort.by("desig")));
	 * mv.setViewName("home"); return mv; }
	 * 
	 * @RequestMapping("/displayAllSortByDesigDesc") public ModelAndView
	 * displayAllSortByDesigDesc() { ModelAndView mv=new ModelAndView();
	 * mv.addObject("employeeList", dao.findAll(Sort.by("desig").descending()));
	 * mv.setViewName("home"); return mv; }
	 * 
	 * @RequestMapping("/disSortByBasicDescDeptByDesc") public ModelAndView
	 * disSortByBasicDescDeptByDesc() { ModelAndView mv=new ModelAndView();
	 * mv.addObject("employeeList",
	 * dao.findAll(Sort.by("basic","desig").descending())); mv.setViewName("home");
	 * return mv; }
	 * 
	 * @RequestMapping("/disJavaEmpSortBySalDesc") public ModelAndView
	 * disJavaEmpSortBySalDesc() { ModelAndView mv=new ModelAndView();
	 * mv.addObject("employeeList", dao.findByDeptDesigBasicSortByDesc("Java", "E",
	 * "basic")); mv.setViewName("home"); return mv; }
	 * 
	 * @RequestMapping("/disSort") public ModelAndView disSort() { ModelAndView
	 * mv=new ModelAndView(); mv.addObject("employeeList", dao.findSort("Java", "E",
	 * "basic","S")); mv.setViewName("home"); return mv; }
	 */
}
