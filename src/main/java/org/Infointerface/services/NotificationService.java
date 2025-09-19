package org.Infointerface.services;

import javax.transaction.Transactional;

import org.Infointerface.entity.Notification;
import org.Infointerface.entity.NotificationDto;
import org.Infointerface.repository.NotificationRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService implements INotificationService {

    @Autowired
    private NotificationRepository notificationRepository;

    // 保存实体到数据库
    @Override
    @Transactional
    public Notification createNotification(NotificationDto notiDto) {

        // 保存前查重，避免 Hibernate 一级缓存问题
        // 使用更精确的查重条件
        String patientCardNumber = notiDto.getPatientCardNumber();

        if (notificationRepository.existsById(patientCardNumber)) {
            throw new IllegalArgumentException("患者卡号 " + patientCardNumber + " 已存在");
        }
        // dto转entity
        Notification saved = new Notification();
        BeanUtils.copyProperties(notiDto, saved);

        return notificationRepository.save(saved);
    }

    // 根据ID查询实体
    public Notification getNotificationById(String id) {
        return notificationRepository.findById(id).orElse(null);
    }

    // 查询所有实体
    public Iterable<Notification> getAllNotifications() {
        return notificationRepository.findAll();
    }

    public boolean existsById(String patientCardNumber) {
        return notificationRepository.existsById(patientCardNumber);
    }

}
