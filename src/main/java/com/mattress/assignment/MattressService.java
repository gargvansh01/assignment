package com.mattress.assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MattressService {
	@Autowired
	private MattressDAORepository mattressDAORepository;
	public List<Mattress> getMattress(){
		List<Mattress> mattressList = new ArrayList<Mattress>();
		mattressDAORepository.findAll().forEach(mattressList::add);
		return mattressList;
		
	}
	public Optional<Mattress> getMattress(String id) {
		return mattressDAORepository.findById(id);

}
	public void updateMattress(String id, Mattress Mattress) {
		mattressDAORepository.save(Mattress);
	}

	public void deleteMattress(String id) {
		mattressDAORepository.deleteById(id);
	}

	
	public void addMattress(Mattress mattress) {
		mattressDAORepository.save(mattress);
	}

}

