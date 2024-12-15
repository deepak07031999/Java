package org.example.serializationAndDeserialization;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Student {
    @JsonProperty("name2")
    @JsonAlias({"name_","_name"})
    private String name;

    @JsonProperty("myAge")
    @JsonAlias({"age"})
    private String age;

}
