package cn.jiyun.service;

import java.util.List;
import cn.jiyun.pojo.Emp;
import com.baomidou.mybatisplus.extension.service.IService;
public interface EmpService extends IService<Emp>{

    List<Emp> findEmpAll(Emp emp);

}
