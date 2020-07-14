//Map to JSON string
package com.vinod;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.HashMap;
import java.util.Map;

public class JacksonMapExample2
{
	 public static void main(String[] args) {

	        ObjectMapper mapper = new ObjectMapper();

	        Map<String, String> map = new HashMap<String,String>();
	        map.put("name", "mkyong");
	        map.put("age", "37");

	        try {

	            // convert map to JSON string
	            String json = mapper.writeValueAsString(map);

	            System.out.println(json);   // compact-print

	       String json1 = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(map);

	            System.out.println(json1);   // pretty-print

	        } catch (JsonProcessingException e) {
	            e.printStackTrace();
	        }


	    }

}
