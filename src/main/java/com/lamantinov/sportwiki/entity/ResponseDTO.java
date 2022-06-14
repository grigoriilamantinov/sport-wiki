package com.lamantinov.sportwiki.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class ResponseDTO {
    List<Sport> sports;

    @Override
    public String toString() {
        return "Sports=" + sports + ";";
    }
}
