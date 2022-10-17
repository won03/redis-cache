package com.rediscache.rediscache.dto;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data
//Redis는 byte code로 데이터를 담기 때문에 Serializable을 구현해줘야 한다.
public class Member implements Serializable {
    public enum Gender {
        MALE, FEMALE
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Gender gender;
    private int grade;
}
