package com.ankuran.wages.resource;

import com.ankuran.wages.model.CentreDao;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/centre")
public interface CentreResource {

    @GetMapping("/{centreName}")
    public ResponseEntity<CentreDao> getCentreId(@PathVariable("centreName") String centreName);


}

