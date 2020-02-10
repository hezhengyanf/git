package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Yuan;

public interface YuanService {
	int Del1(int id);
	int set1(Yuan yuan);
	List<Yuan>Cha1();
	public List<Yuan>getMo1(@Param("word")String word,@Param("yuangongname")String yuangongname);//Ä£ºý²éÑ¯1¶Ô1
}
