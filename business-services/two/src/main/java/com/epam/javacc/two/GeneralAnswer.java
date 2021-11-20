package com.epam.javacc.two;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GeneralAnswer<T> {
    private String result;
    private String error;
    private T object;

    public GeneralAnswer(T object) {
        this.result = "success";
        this.object = object;
    }
}
