package org.example.serializationAndDeserialization.gson;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import lombok.Getter;
import lombok.Setter;
import org.example.serializationAndDeserialization.Student;

@Setter
@Getter
public class GsonClass {

    private String inputJsonString = "{\"name\":\"Mahesh\"}";
    @Setter
    @Getter
    private static Gson gson;
    private Student student;

    public GsonClass(){
        buildGsonBuilder();
    }

    private void buildGsonBuilder(){
        GsonBuilder builder = new GsonBuilder();
        builder.setPrettyPrinting();
        builder.serializeNulls();
        setGson(builder.create());
    }

    public void deserialization(){

        System.out.println("Deserialization");
        setStudent(getGson().fromJson(getInputJsonString(), Student.class));
        System.out.println(student.getName());
        System.out.println(student.getAge());
    }

    public void serialization(){
        System.out.println("serialization");
        String studentString = getGson().toJson(student);
        System.out.println(studentString);
    }
}
