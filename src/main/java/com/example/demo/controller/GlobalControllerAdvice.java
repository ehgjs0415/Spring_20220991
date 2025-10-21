package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

/**
 * 화면용(@Controller) 컨트롤러에서 발생하는 공통 예외 처리
 * 기존 BlogController 코드는 수정하지 않음.
 */
@ControllerAdvice(annotations = Controller.class)
public class GlobalControllerAdvice {

    // /article_edit/6444fff 처럼 Long 변환 실패 → 400으로 보고 에러 페이지 렌더
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public String handleTypeMismatch(MethodArgumentTypeMismatchException ex, Model model) {
        // 필요시 화면 메시지 추가 가능
        // model.addAttribute("title", "블로그 게시판 - 잘못된 접근(문자열 변환 에러)");
        return "/error_page/article_error";   // 프로젝트의 에러 뷰 이름 그대로
    }
}
