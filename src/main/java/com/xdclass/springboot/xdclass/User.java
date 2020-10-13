package com.xdclass.springboot.xdclass;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
public class User {
    private String name;
    private String sex;
    private String brith;
    private String nickName;
    private String age;
}
