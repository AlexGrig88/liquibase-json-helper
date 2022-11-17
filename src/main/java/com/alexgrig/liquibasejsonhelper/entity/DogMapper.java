package com.alexgrig.liquibasejsonhelper.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DogMapper extends Dog implements Serializable {

    @JsonProperty
    private Integer age;
}
