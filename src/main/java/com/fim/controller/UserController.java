package com.fim.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("/get")
	public String heartBeat() {
		return "Application Started Successfully remotely updated.............";
		
		
		//Task done
		
		//Feature code added
		
		
	}

	//commit-1
	@GetMapping("/get")
	public void get()
	{
		
		//String name = "SOMU";
		
		//added method
		
		//festure/01
		//fsda
		//fsgs
	}
	
	//commit-2
		@PostMapping("/save")
		public void save()
		{
			
			//String name = "SOMU";
			
			//added method
			
			//festure/01
			//fsda
			//fsgs
		}

			//commit-3
				@PutMapping("/update")
				public void update()
				{
					//feature/02 is added by Ganesh
				}

}
