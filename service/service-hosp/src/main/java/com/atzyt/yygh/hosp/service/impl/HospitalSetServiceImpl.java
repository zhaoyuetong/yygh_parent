package com.atzyt.yygh.hosp.service.impl;

import com.atzyt.yygh.hosp.mapper.HospitalSetMapper;
import com.atzyt.yygh.hosp.service.HospitalSetService;
import com.atzyt.yygh.model.hosp.HospitalSet;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper,HospitalSet> implements HospitalSetService {

    @Autowired
    private HospitalSetMapper hospitalSetMapper;

}