package org.hqu.production_ms.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.hqu.production_ms.domain.DeviceMaintain;
import org.hqu.production_ms.domain.DeviceMaintainExample;

public interface DeviceMaintainMapper {
	//扩展的mapper接口方法
	List<DeviceMaintain> find(DeviceMaintain deviceMaintain);
	
	int deleteBatch(String[] DeviceMaintainIds);
    
	//自动生成的mapper接口方法
    int countByExample(DeviceMaintainExample example);

    int deleteByExample(DeviceMaintainExample example);

    int deleteByPrimaryKey(String deviceMaintainId);

    int insert(DeviceMaintain record);

    int insertSelective(DeviceMaintain record);

    List<DeviceMaintain> selectByExample(DeviceMaintainExample example);

    DeviceMaintain selectByPrimaryKey(String deviceMaintainId);

    int updateByExampleSelective(@Param("record") DeviceMaintain record, @Param("example") DeviceMaintainExample example);

    int updateByExample(@Param("record") DeviceMaintain record, @Param("example") DeviceMaintainExample example);

    int updateByPrimaryKeySelective(DeviceMaintain record);

    int updateByPrimaryKey(DeviceMaintain record);
}