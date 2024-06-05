package in.ashokit.controller;

import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import in.ashokit.entity.Book;
import in.ashokit.repository.BookRepository;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class BookController {
	 private static final Logger logger = LogManager.getLogger(BookController.class);
	@Autowired
	private BookRepository repo;
	
	@GetMapping("/book")
	private String getBookById(@RequestParam("id")Integer id,Model model) {//user se hum data le rahai hai user will send one id and it will take the id and process further and it will send response to user..
		logger.info("rishab");
		try {
			System.out.println("Id::"+id);
			
		ModelAndView mav=new ModelAndView();
	Optional<Book>findById=repo.findById(id);
		
		if(findById.isPresent()) {
			Book bookObj=findById.get();
			model.addAttribute("book",bookObj);
			
		}
		
		
		return "index";
		}catch(Exception e){
			logger.error("saddam",e);
			return null;

		}
		}
		
}
