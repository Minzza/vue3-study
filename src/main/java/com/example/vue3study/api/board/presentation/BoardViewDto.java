package com.example.vue3study.api.board.presentation;

import com.example.vue3study.api.board.domain.entity.Board;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;



@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BoardViewDto {


    private String writer;


   public Board toEntity(){
       return Board.builder()
               .writer(writer)
               .build();
   }
}
