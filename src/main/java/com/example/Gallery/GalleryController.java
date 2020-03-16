package com.example.Gallery;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GalleryController {
    @GetMapping("/")
    public String gallery() {
        return "gallery";
    }
}
