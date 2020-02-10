package service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import entity.Bu;

public interface BuService {
	public List<Bu>Cha1();
	public Bu UpStudent1(@Param("bumenTableid")int bumenTableid);
}
