package com.example.vue3study.api.board.domain.entity;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

//@Table( name = "TB_CATEGORY") // 엔티티와 매핑할 테이블 명 지정
@Entity // 테이블과 매핑
@Builder // 빌더 패턴 적용
@Getter
@NoArgsConstructor // 파라미터가 없는 생성자 생성
@AllArgsConstructor // 모든 필드에 대한 생성자 생성
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // 자동 증가(auto increment) => 따로 커스텀 할 수도 있다.
    private Long id;


    // @Column(nullable = false) //DB 컬럼에 매핑되는 제약조건들을 설정한다. name, length, nullable 등
    private String writer;
}
