package com.crack.road1.mapper;

import com.crack.road1.classz.CrackReport;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

@Mapper
public interface CrackMapper {
    @Insert("insert into road1.cracks (detail, title, latitude, longitude, speed, accuracy, altitude, verticalAccuracy, horizontalAccuracy, address, road_name, image) " +
            "values (#{detail},#{title},#{latitude},#{longitude},#{speed},#{accuracy},#{altitude},#{verticalAccuracy},#{horizontalAccuracy},#{address},#{road_name},#{image})")
    void crackReportList(CrackReport crackReport);
}
