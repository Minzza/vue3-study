package com.example.vue3study.api.board.presentation;

import com.example.vue3study.api.board.application.service.BoardService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(BoardController.URL_PREFIX)
public class BoardController {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    public static final String URL_PREFIX = "/api/board";

    private BoardService service;

    public  BoardController (BoardService service) {
        this.service = service;
    }

    @PostMapping("/create")
    public Long create(@RequestBody BoardViewDto request){
        return service.create(request);
    }
}
