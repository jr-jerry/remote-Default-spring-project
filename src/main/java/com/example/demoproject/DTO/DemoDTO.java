package com.example.demoproject.DTO;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = {"id"}, ignoreUnknown = true)
public class DemoDTO {
    private Long id ;
    @JsonInclude(JsonInclude.Include.NON_DEFAULT)
    private Integer age;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String name;
}
