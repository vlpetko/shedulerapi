package ru.vlpetko.shedulerapi.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import ru.vlpetko.shedulerapi.repository.UserRepository;

@Slf4j
@Service
@RequiredArgsConstructor
public class ScheduledService {

    private final UserRepository userRepository;

    @Scheduled(cron = "0 */5 * * * *")
    public void getTimeEndRequests(){

        log.info(String.valueOf(userRepository.count()));
    }
}
