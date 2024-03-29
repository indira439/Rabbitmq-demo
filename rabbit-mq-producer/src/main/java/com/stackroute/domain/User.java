package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * With @Data, Lombok will generate getter and setter methods, toString methods, Equal & Hashcode methods
 */
@Data
/**@NoArgsConstructor will generate constructor with no arguments*/
@NoArgsConstructor
/**@AllArgsConstructor will generate constructor with all properties in the class*/
@AllArgsConstructor

public class User {

    private int userId;
    private String userName;
}
