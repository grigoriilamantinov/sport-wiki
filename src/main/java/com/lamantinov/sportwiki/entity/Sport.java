package com.lamantinov.sportwiki.entity;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
public class Sport {
    private int idSport;
    private String strSport;
    private String strFormat;
    private String strSportThumb;
    private String strSportIconGreen;
    private String strSportDescription;

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
