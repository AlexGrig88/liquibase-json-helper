package com.alexgrig.liquibasejsonhelper.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import java.io.Serializable;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Dog implements Serializable {

    @JsonProperty
    private String nickname;

    @JsonProperty
    private String breed;

    @JsonProperty
    private boolean automaticCertificate;
//
    @JsonProperty
    private Integer age;
}
