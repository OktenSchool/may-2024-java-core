package org.okten;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
public class Person {

    private int id;

    private String name;

    private int age;

    private List<String> hobbies;
}
