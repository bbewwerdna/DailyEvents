package com.example.backend.resource;

import java.io.Console;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.backend.modal.Restaurants;
import com.example.backend.modal.Special;
import com.example.backend.repository.RestaurantRepository;
import com.example.backend.repository.SpecialEventRepository;
import com.example.backend.resource.TestFile;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping(value="/events")
public class RestaurantController {
	
	@Autowired
	private RestaurantRepository repository;
	
	@Autowired
	private SpecialEventRepository specialRepository;
	@Autowired
	public TestFile testFile;
	
	@PostMapping(value="/saveRestaurant")
	public ResponseEntity<Restaurants> saveRestaurant(@RequestBody Restaurants restaurant) {
		Restaurants rest = repository.save(restaurant);
		return new ResponseEntity<>(rest, HttpStatus.CREATED);
	}
	
	
	
	@GetMapping("/getAll")
    public ResponseEntity<List<Restaurants>> getAll() {
		ArrayList<Integer> nums = new ArrayList<>(6);
		nums.add(1);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(8);
		System.out.println(testFile.searchArray(nums, 6));
        return new ResponseEntity<>(repository.findAll(), HttpStatus.OK);
    }
	
	@RequestMapping(value="/getRestaurants", method = RequestMethod.GET)
	public List<Restaurants> getRestaurants(){
		List<Restaurants> rest = repository.findAll();
		System.out.println("hi");
		return rest;
		
	}
	@GetMapping("/getRestaurant/{id}")
	public Optional<Restaurants> getRestaurant(@PathVariable ObjectId id){
		return repository.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteRestaurant(@PathVariable ObjectId id) {
		repository.deleteById(id);
		return "deleted restaurant";
	}
	
	
	// special event
	@GetMapping("/getSpecialEvents")
	public ResponseEntity<List<Special>> getSpecials(){
		return new ResponseEntity<>(specialRepository.findAll(), HttpStatus.OK);
		
	}
	@PostMapping("/addSpecialEvent")
	public ResponseEntity<Special> addSpecial(@RequestBody Special special){
		Special eventSpecial = specialRepository.save(special);
		return new ResponseEntity<>(eventSpecial, HttpStatus.CREATED);
	}
	
}












