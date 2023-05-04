package com.crack.road1.classz;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CrackReport {
    private int id;
    private String detail;
    private String title;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private BigDecimal speed;
    private BigDecimal accuracy;
    private BigDecimal altitude;
    private BigDecimal verticalAccuracy;
    private BigDecimal horizontalAccuracy;
    private String address;
    private String road_name;
    private String image;




}
