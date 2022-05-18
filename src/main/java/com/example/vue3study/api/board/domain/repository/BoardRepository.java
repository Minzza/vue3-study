package com.example.vue3study.api.board.domain.repository;

import com.example.vue3study.api.board.domain.entity.Board;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<Board, Long> {
    // JPA repository를 사용하도록 상속

}
