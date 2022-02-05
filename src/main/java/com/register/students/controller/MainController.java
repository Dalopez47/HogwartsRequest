package com.register.students.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.register.students.interfaceService.IuserService;
import com.register.students.model.User;

@Controller
@RequestMapping
public class MainController {
	
	@Autowired
	private IuserService service;
	
	@GetMapping("/list")
	public String list(Model model) {
		List<User>users=service.list();
		model.addAttribute("users", users);
		return "index";
	}
	
	@GetMapping("new")
	public String add(@Valid Model model) {
		model.addAttribute("user", new User());
		return "form";
	}
	
	@PostMapping("/save")
	public String save(@Validated User user, Model model) {
		service.save(user);
		return "redirect:/list";
	}
	
	@GetMapping("/edit/{id}")
	public String edit(Model model, @PathVariable int id) {
		Optional<User>user=service.listId(id);
		model.addAttribute("user" , user);
		return "form";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(Model model, @PathVariable int id) {
		service.delete(id);
		return "redirect:/list";
		
	}

}
