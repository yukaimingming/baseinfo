package org.Infointerface.services;

import org.Infointerface.entity.RsPersonBaseInfoDto;

public interface IBaseinfoService {
    //返回人员DTO
    RsPersonBaseInfoDto getPersonDtoById(String personId);
}
