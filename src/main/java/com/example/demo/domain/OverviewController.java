package com.example.demo.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class OverviewController {
	
	@Autowired
	AlienDao aDao;
	
	@RequestMapping("/")
	public String name(Aliens aliens) {
		return "home.jsp";
	}
	
	@PostMapping("/addAlien/{aliens}")
	public Aliens addAlien(@PathVariable("aliens") Aliens alens) {
		aDao.save(alens);
		return alens;
	}
	@RequestMapping(value = "/getAlien")
	@ResponseBody
	public Aliens getAliens(@RequestParam Integer aid) {
	  Aliens al = aDao.findById(aid).orElse(new Aliens());
	  ModelAndView mv = new ModelAndView("seeAlien.jsp");
	  mv.addObject("kutts", al);
	  return al;
	}
}
