package com.openapi.swagger.mysql;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Place {

    private Long id;
    private String name;
    private String latitude;
    private String longitude;

}
