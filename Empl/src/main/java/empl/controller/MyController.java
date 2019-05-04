package empl.controller;

import empl.bean.Empl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import empl.service.IEmplService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Autowired
    private IEmplService emplService;

    @RequestMapping("/emp")
    public List<Empl> findCities() {
        
        return emplService.findAll();
    }

    @RequestMapping("/emp/{userId}")
    public Empl findEmpl(@PathVariable Long userId) {
        
        return emplService.findById(userId);
    }
}