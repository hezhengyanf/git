package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Bu;
 

public interface BuDaoMapper {
List<Bu>Cha();
public Bu UpStudent(@Param("bumenTableid")int bumenTableid);
}
