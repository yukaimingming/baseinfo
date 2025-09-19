package org.Infointerface.services;

import org.Infointerface.entity.RsPersonBaseInfo;
import org.Infointerface.entity.RsPersonBaseInfoDto;
import org.Infointerface.repository.RsPersonBaseInfoRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BaseinfoService implements IBaseinfoService {

    @Autowired
    private RsPersonBaseInfoRepository baseinfo;

    /// 获取人员基本信息
    @Override
    public RsPersonBaseInfoDto getPersonDtoById(String personId) {
        RsPersonBaseInfo baseInfos = baseinfo.findById(personId).orElse(null);
        if (baseInfos == null) {
            return null;
        }
        RsPersonBaseInfoDto dto = new RsPersonBaseInfoDto();
        BeanUtils.copyProperties(baseInfos, dto); // 属性名相同的会自动复制
        return dto;
    }
}
