package com.lamantinov.sportwiki.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class Sport {
    int idSport;
    String strSport;
    String strFormat;
    String strSportThumb;
    String strSportIconGreen;
    String strSportDescription;

    @Override
    public String toString() {
        return  "idSport= " + idSport +
            ", strSport= " + strSport + '\'' +
            ", strFormat='" + strFormat + '\'' +
            ", strSportThumb='" + strSportThumb + '\'' +
            ", strSportIconGreen='" + strSportIconGreen + '\'' +
            ", strSportDescription='" + strSportDescription + '\'';
    }
}
