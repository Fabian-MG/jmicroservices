package com.fabian.notification;

import com.fabian.clients.notification.NotificationRequest;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NotificationService {

    private final NotificationRepository notificationRepository;

    public NotificationService(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void send(NotificationRequest request) {
        Notification notification = Notification.builder()
                .sender("Fabian")
                .sentAt(LocalDateTime.now())
                .message(request.getMessage())
                .toCustomerId(request.getToCustomerId())
                .toCustomerEmail(request.getToCustomerName())
                .build();

        notificationRepository.save(notification);
    }
}
