package com.atzyt.yygh.hosp.service.impl;

import com.atzyt.yygh.common.exception.YyghException;
import com.atzyt.yygh.common.result.ResultCodeEnum;
import com.atzyt.yygh.hosp.mapper.HospitalSetMapper;
import com.atzyt.yygh.hosp.service.HospitalSetService;
import com.atzyt.yygh.model.hosp.HospitalSet;
import com.atzyt.yygh.vo.order.SignInfoVo;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

@Service
public class HospitalSetServiceImpl extends ServiceImpl<HospitalSetMapper, HospitalSet> implements HospitalSetService {

    //2 根据传递过来医院编码，查询数据库，查询签名
    @Override
    public String getSignKey(String hoscode) {
        QueryWrapper<HospitalSet> wrapper = new QueryWrapper<>();
        wrapper.eq("hoscode",hoscode);
        HospitalSet hospitalSet = baseMapper.selectOne(wrapper);
        return hospitalSet.getSignKey();
    }

    @Override
    public SignInfoVo getSignInfoVo(String hoscode) {
        QueryWrapper<HospitalSet> wrapper = new QueryWrapper<>();
        wrapper.eq("hoscode",hoscode);
        HospitalSet hospitalSet = baseMapper.selectOne(wrapper);
        if(null == hospitalSet) {
            throw new YyghException(ResultCodeEnum.HOSPITAL_OPEN);
        }
        SignInfoVo signInfoVo = new SignInfoVo();
        signInfoVo.setApiUrl(hospitalSet.getApiUrl());
        signInfoVo.setSignKey(hospitalSet.getSignKey());
        return signInfoVo;
    }

}
