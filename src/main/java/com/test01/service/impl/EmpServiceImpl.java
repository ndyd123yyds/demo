package com.test01.service.impl;

import com.test01.entity.Emp;
import com.test01.mapper.EmpMapper;
import com.test01.service.IEmpService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 员工表 服务实现类
 * </p>
 *
 * @author me
 * @since 2023-04-11
 */
@Service
public class EmpServiceImpl extends ServiceImpl<EmpMapper, Emp> implements IEmpService {

}
