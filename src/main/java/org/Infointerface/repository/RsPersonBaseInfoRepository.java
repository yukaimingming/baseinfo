package org.Infointerface.repository;

import org.Infointerface.entity.RsPersonBaseInfo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RsPersonBaseInfoRepository extends CrudRepository<RsPersonBaseInfo, String> {
}
