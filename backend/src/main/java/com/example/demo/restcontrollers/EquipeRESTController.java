package com.example.demo.restcontrollers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.entities.Equipe;
import com.example.demo.repos.EquipeRepository;

@RestController
@RequestMapping("/api/cat")
@CrossOrigin("*")
public class EquipeRESTController {

	@Autowired
	EquipeRepository equipeRepository;
	@RequestMapping(method=RequestMethod.GET)
	public List<Equipe> getAllEquipes()
	{
	 return equipeRepository.findAll();
	}
	@RequestMapping(value="/{id}",method = RequestMethod.GET)
	public Equipe getEquipeById(@PathVariable("id") Long id) {
	  return equipeRepository.findById(id).get();
	}
}
