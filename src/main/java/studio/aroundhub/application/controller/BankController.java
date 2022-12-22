package studio.aroundhub.application.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import studio.aroundhub.application.service.BankService;

@RestController
@RequestMapping("/bank")
public class BankController {

    @PostMapping("/customer/create")
    public String createCreate(@RequestBody CustomerDto customerDto) {

    }
}
