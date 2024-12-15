package org.example.serializationAndDeserialization.Jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Getter;
import lombok.Setter;
import org.example.serializationAndDeserialization.Student;

@Getter
@Setter
public class JacksonClass {
    private String inputJsonString;
    private ObjectMapper objectMapper;
    private Student student;

    public JacksonClass() {
        setInputJsonString("{\"name\":\"Yadav\",\"name2\":\"Deepak\",\"age\":21}");
        setObjectMapper(new ObjectMapper());
    }

    public void deserialization() {
        System.out.println("Deserialization");
        try {
            setStudent(getObjectMapper().readValue(getInputJsonString(), Student.class));
            System.out.println(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void serialization() {
        System.out.println("serialization");
        try {
            String studentString = getObjectMapper().writeValueAsString(getStudent());
            System.out.println(studentString);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
