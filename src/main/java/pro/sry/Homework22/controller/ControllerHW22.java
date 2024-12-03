package pro.sry.Homework22.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sry.Homework22.service.ServiceHW22;

@RestController
public class ControllerHW22 {

    private final ServiceHW22 serviceHW22;

    public ControllerHW22(ServiceHW22 serviceHW22) {
        this.serviceHW22 = serviceHW22;
    }

    @GetMapping(path = "/toString")
    public String toString(@RequestParam(required = false) String firstName,
                           @RequestParam(required = false) String lastName) {
       serviceHW22.setLastName(lastName);
        serviceHW22.setFirstName(firstName);
       return  serviceHW22.toString();


    }

}
