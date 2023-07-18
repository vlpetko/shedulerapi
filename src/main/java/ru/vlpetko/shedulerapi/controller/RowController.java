package ru.vlpetko.shedulerapi.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.vlpetko.shedulerapi.service.ScheduledService;

@RestController
@RequestMapping({"/api"})
@RequiredArgsConstructor
public class RowController {

    private final ScheduledService scheduledService;

    @GetMapping("/getrowcount")
    public String getRowCount(){
        return scheduledService.getRowCount();
    }
}
