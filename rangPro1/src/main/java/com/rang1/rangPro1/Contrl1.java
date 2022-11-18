package com.rang1.rangPro1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Contrl1 {
	
	
	@GetMapping("/store/{capacity1}")
	public Optional<Store> datafor(@PathVariable  int capacity1) {
		
		List<Store> list=new ArrayList<Store>();
		list.add(new Store("store0", 0));
		list.add(new Store("store1", 1));
		list.add(new Store("store2", 2));
		list.add(new Store("store3", 3));
		list.add(new Store("store3", 3));
		list.add(new Store("store5", 5));
	
		//List<Store> list1=list.stream().filter(x->x.getCapacity()<3).collect(Collectors.toList());
		
	
		
		
			Optional<Store> s= list.stream().filter(x->x.getCapacity()==capacity1).findFirst();
		
			return s;
		
		
		
	}

}
