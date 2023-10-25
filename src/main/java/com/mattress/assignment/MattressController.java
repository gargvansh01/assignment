package com.mattress.assignment;

import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class MattressController {
    @RequestMapping("hello")
    public String hello(){
        return "hello world";
    }
    @Autowired
	private MattressService mattressService;

	@RequestMapping("/mattresses")
	public List<Mattress> getMattress() {
		return mattressService.getMattress();

	}
	
	@RequestMapping(method=RequestMethod.POST, value="/mattresses")
	public void addMattress(@RequestBody Mattress mattress) {
		mattressService.addMattress(mattress);
	}
	
	@RequestMapping("/mattresses/{id}")
	public Optional<Mattress> getMattress(@PathVariable String id){
		System.out.println("Inside getMattress");
		return mattressService.getMattress(id);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/mattresses/{id}")
	public void updateMattress(@RequestBody Mattress mattress, @PathVariable String id) {
		System.out.println("inside updateMattress");
		mattressService.updateMattress(id, mattress);
	}


	@RequestMapping(method=RequestMethod.DELETE, value="/mattresses/{id}")
	public void deleteMattress(@PathVariable String id){
		System.out.println("Inside deleteMattress");
		mattressService.deleteMattress(id);
	}
}
