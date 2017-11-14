package dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import pojo.quality;

public interface qualityMapper {
	public List<quality> getall(@Param("i")int begin,@Param("j")int size);
}
