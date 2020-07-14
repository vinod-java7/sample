//In Jackson, we can use mapper.readValue(json, Map.class) to convert a JSON string to a Map
package com.vinod;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;


public class JacksonMapExample1 
{
	public static void main(String[] args) {

        ObjectMapper mapper = new ObjectMapper();
        String json = "[{\"name\":\"mkyong\", \"age\":37}, {\"name\":\"fong\", \"age\":38}]";

        try {

            // 1. convert JSON array to Array objects
            Staff [] pp1 = mapper.readValue(json, Staff[].class);

            System.out.println("JSON array to Array objects...");
            for (Staff person : pp1) {
               System.out.println(person.getName()+" " +person.getAge());
            }

            // 2. convert JSON array to List of objects
            List<Staff> ppl2 = Arrays.asList(mapper.readValue(json, Staff[].class));

            System.out.println("\nJSON array to List of objects");
           ppl2.stream().forEach(x -> System.out.println(x.getName()+" "+x.getAge()));

            // 3. alternative
            List<Staff> pp3 = mapper.readValue(json, new TypeReference<List<Staff>>() {});

            System.out.println("\nAlternative...");
            pp3.stream().forEach(x -> System.out.println(x));

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
