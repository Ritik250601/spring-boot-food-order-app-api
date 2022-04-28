package com.ritik.foodordering.controller;


import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import com.ritik.foodordering.dto.AddMealsDto;
import com.ritik.foodordering.entity.Meals;
import com.ritik.foodordering.service.MealsService;
import com.ritik.foodordering.util.FileHandler;

@Controller
@RequestMapping("/welcome")
public class WelcomeController {
	
	private  Path fileStorageLocation;
	
	@Autowired
	private MealsService mealsService;
	
	@Autowired
	private FileHandler fileHandler;
	
	

    @GetMapping
    public String welcome(Model model){
    	
    	//Create a addMeals object
    	AddMealsDto addMeals = new AddMealsDto();
    	
    	
  model.addAttribute("addMeals", addMeals);

        return "welcome";
    }
    
    
    @PostMapping
    public void addMeals(@ModelAttribute("addMeals") AddMealsDto addmeals, HttpServletRequest request ) throws IOException{
    	//get the input from form
    	
    	String name = addmeals.getName();
        String shortDescription = addmeals.getShortDescription();
        String description = addmeals.getDescription();
        Double price = addmeals.getPrice();
        MultipartFile multipartFile = addmeals.getPic();
        String pic = multipartFile.getOriginalFilename();
       
        
//        //instantionate AppUserDto Clas
      Meals meals = new Meals(name, shortDescription, description, price, pic);
       
      
      //save the new meals to db
      mealsService.save(meals);
    
      //save the pic to new folder    
      
      
      
      //uri of file
      String fileDownloadUri = ServletUriComponentsBuilder.fromCurrentContextPath()
				.path("/files/")
				.path(pic)
				.toUriString();
      
      System.out.println(fileDownloadUri);
      String path = "src" + File.separator + "main" + File.separator + "resources" + File.separator + "static" + File.separator + "image" + File.separator + pic ;
    
      
      //file storage locaiton
      this.fileStorageLocation = Paths.get(path).toAbsolutePath().normalize();
      System.out.println(fileStorageLocation);
      
      fileHandler.saveFile(multipartFile.getInputStream(), path);
    
    }


}
