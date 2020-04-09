package com.nice.daoImpl;

import com.nice.dao.StuDao;
import org.springframework.stereotype.Repository;

@Repository("stuDao")
public class StuDaoImpl implements StuDao {
    @Override
    public void save() {
        System.out.println("StuDaoImpl保存数据");
    }
}
