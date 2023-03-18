package com.example.capston3.entity;

import lombok.NoArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


@NoArgsConstructor
@Getter
@Setter
@ToString
public class User {

    private String id;
    private String name;
    private String email;
    private String pw;

    // firebase timestamp type
    private Date create_dt;
    private Date update_dt;

}