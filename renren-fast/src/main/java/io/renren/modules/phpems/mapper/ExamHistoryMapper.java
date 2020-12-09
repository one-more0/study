package io.renren.modules.phpems.mapper;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import io.renren.modules.phpems.entity.ExamHistoryEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ExamHistoryMapper extends BaseMapper<ExamHistoryEntity> {
    @Select("select * from x2_examhistory where ehid=(select MAX(ehid) from x2_examhistory)")
    ExamHistoryEntity selectOne(@Param(Constants.WRAPPER) Wrapper<ExamHistoryEntity> queryWrapper);
}
