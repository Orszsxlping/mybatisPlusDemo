package cn.jiyun.service.impl;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.sql.SQLException;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import cn.jiyun.mapper.EmpMapper;
import cn.jiyun.pojo.Emp;
import cn.jiyun.service.EmpService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements EmpService{

    @Autowired
    EmpMapper empMapper;


    @Override
    public List<Emp> findEmpAll(Emp emp) {
        QueryWrapper<Emp> empQueryWrapper = new QueryWrapper<>();

        //调用mybatisplus 通用mapper中的方法，类似我们以前调用tk mapper中的通用mapper
        return empMapper.selectList(empQueryWrapper);
    }
}
