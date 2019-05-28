package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PlayzoneController {

    @GetMapping("/playzone")
    public String homepage() {
        return "playzone";
    }

    @GetMapping("/play")
    public String testPlay() {
        return "play";
    }

    @GetMapping("/rest")
    public String testRest() {
        return "testRest";
    }

}

