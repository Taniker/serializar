package com.serieperro;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class SerieDog {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        Dog one=new Dog(5,"Poodle","blanco");
        Dog two=new Dog(10,"Bulldog","marrón");
        Dog three=new Dog(15,"Dalmata","blanco y negro");

        try{
            mapper.writeValue(new File("test.txt"), one);



            //Convert object to JSON string
            String jsonInString = mapper.writeValueAsString(one);
            System.out.println(jsonInString);

            //Convert object to JSON string and pretty print
            //jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(one);
            //System.out.println(jsonInString);

        }catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

