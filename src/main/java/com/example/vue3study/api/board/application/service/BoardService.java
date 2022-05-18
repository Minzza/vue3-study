package com.example.vue3study.api.board.application.service;

import com.example.vue3study.api.board.domain.repository.BoardRepository;
import com.example.vue3study.api.board.presentation.BoardViewDto;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class BoardService {

    private BoardRepository repository;

    public BoardService(BoardRepository repository){
        this.repository = repository;
    }

    @Transactional
    public Long create(BoardViewDto request){
        return repository.save(request.toEntity()).getId();
    }

}
