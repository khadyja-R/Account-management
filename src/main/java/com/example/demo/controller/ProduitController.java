package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.dao.ProduitRepository;
import com.example.demo.entities.Product;


@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/test")
public class ProduitController {

	@Autowired
	  private ProduitRepository produitrepo;
	  
	  @GetMapping("/prdui")
	  public List<Product> getProducts() {
	    return produitrepo.findAll();
	  }
}
