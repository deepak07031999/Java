package org.example.serializationAndDeserialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.serializationAndDeserialization.Jackson.JacksonClass;
import org.example.serializationAndDeserialization.gson.GsonClass;

public class DisplayClass {
    public static void main(String[] args) {
        GsonClass gsonClass = new GsonClass();
        gsonClass.deserialization();
        gsonClass.serialization();

//        JacksonClass jacksonClass = new JacksonClass();
//        jacksonClass.deserialization();
//        jacksonClass.serialization();
    }
}
