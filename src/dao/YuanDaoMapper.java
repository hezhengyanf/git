package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Yuan;
 

public interface YuanDaoMapper {
int Del(int id);
int set(Yuan yuan);
List<Yuan>Cha();
public List<Yuan>getMo(@Param("word")String word,@Param("yuangongname")String yuangongname);//Ä£ºý²éÑ¯1¶Ô1
}
