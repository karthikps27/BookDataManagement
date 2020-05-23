package org.karthikps.bookdata;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.karthikps.bookdata.models.BookDataReadModel;
import org.karthikps.bookdata.repository.BookDataAccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class BookDataPump {
	
	@Autowired
	private BookDataAccessRepository bookDataAccessRepository;
	
	@Scheduled(fixedDelay = 5000)
	@Async
	public void readJsonDataFromResourceFile() {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			BookDataReadModel readValue = objectMapper.readValue(new File("D:\\projects\\Resources\\BookResponse.json"), BookDataReadModel.class);
			System.out.println(readValue.items.get(0).getId());			
			
			bookDataAccessRepository.saveAll(readValue.items);	
			Files.move(Paths.get("D:\\projects\\Resources\\BookResponse.json"), 
					Paths.get("D:\\projects\\ResourcesReadComplete\\BookResponse.json"));			
		} 
		catch (JsonParseException e) {
			e.printStackTrace();
		} 
		catch (JsonMappingException e) {
			e.printStackTrace();
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
