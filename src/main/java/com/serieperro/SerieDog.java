package com.serieperro;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class SerieDog {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        Dog[] pets=new Dog[3];

        pets[0]=new Dog(5,"Poodle","blanco");
        pets[1]=new Dog(10,"Bulldog","marrón");
        pets[2]=new Dog(15,"Dalmata","blanco y negro");
        File fileConValoresJson=new File("test.txt");

        try{
            for (int i=0;i<3;i++){
                mapper.writeValue(fileConValoresJson, pets[i]);
                //Convert object to JSON string
                String jsonInString = mapper.writeValueAsString(pets[i]);
                System.out.println(jsonInString);
                //Convert object to JSON string and pretty print
                //jsonInString = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pets[i]);
                //System.out.println(jsonInString);
                //mapper.writeValue(fileConValoresJson, jsonInString);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            // Deserialize JSON file into Java object.
            Dog newDog = mapper.readValue(fileConValoresJson, Dog.class);
            System.out.println("newDog.getEdad= " + newDog.getEdad());
            System.out.println("newDog.getRaza= " + newDog.getRaza());
            System.out.println("newDog.getColor= " + newDog.getColor());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

