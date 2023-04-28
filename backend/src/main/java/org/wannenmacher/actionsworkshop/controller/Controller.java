package org.wannenmacher.actionsworkshop.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wannenmacher.actionsworkshop.model.Model;

@RestController
public class Controller {

    @GetMapping("/")
    public Model get() {
        return Model.builder().content("super content").build();
    }
}
