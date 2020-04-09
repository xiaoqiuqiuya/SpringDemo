package com.nice.serviceImpl;

import com.nice.dao.StuDao;
import com.nice.service.StuService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("stuService")
public class StuServiceImpl implements StuService {
    @Resource(name = "stuDao")
    private StuDao stuDao;

    @Override
    public void save() {
        stuDao.save();
    }
}
