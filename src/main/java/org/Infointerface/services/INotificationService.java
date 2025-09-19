package org.Infointerface.services;

import org.Infointerface.entity.Notification;
import org.Infointerface.entity.NotificationDto;

public interface INotificationService {

    Notification createNotification(NotificationDto notiDto);
  
}
