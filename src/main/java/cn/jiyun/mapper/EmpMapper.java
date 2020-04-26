package cn.jiyun.mapper;

import cn.jiyun.pojo.Emp;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
@Mapper
public interface EmpMapper extends BaseMapper<Emp> {

}