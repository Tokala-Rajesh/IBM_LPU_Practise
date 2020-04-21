package com.example.demo;

import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ObjectMapper mapper=new ObjectMapper();
        try {
        	
			Customer obj=mapper.readValue(new File("data/sample.json"), Customer.class);
			
			  System.out.println("First name = " + obj.getFirstName());
			  System.out.println("Last name = " + obj.getLastName());
			  System.out.println("Last name = " + obj.getId());
			  
			  Address address = obj.getAddress(); System.out.println("Street = " +
			  address.getStreet()); System.out.println("City = " + address.getCity());
			  System.out.println("City = " + address.getState());
			  System.out.println("City = " + address.getCountry());
			  
			 // ObjectMapper mapper1=new ObjectMapper();
			   mapper.writeValue(new File("data/sample1.json"),obj);
			 
			
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
