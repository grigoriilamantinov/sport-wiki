package com.lamantinov.sportwiki.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class Sport {
    int idSport;
    String strSport;
    String strFormat;
    String strSportThumb;
    String strSportIconGreen;
    String strSportDescription;
}
