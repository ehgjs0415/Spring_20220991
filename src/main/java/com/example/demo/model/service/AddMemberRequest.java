package com.example.demo.model.service;

import com.example.demo.model.domain.Member;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import lombok.*; // 어노테이션 자동 생성


@NoArgsConstructor // 기본 생성자 추가
@AllArgsConstructor // 모든 필드 값을 파라미터로 받는 생성자 추가
@Data // getter, setter, toString, equals 등 자동 생성
@Valid
public class AddMemberRequest {
    // 이름: 공백 x, 특수문자 x
    @NotBlank(message = "이름은 필수 입력 값입니다.")
    @Pattern(
        regexp = "^[가-힣a-zA-Z0-9]+$",
        message = "이름에는 공백이나 특수문자를 포함할 수 없습니다."
    )
    private String name;

    // 이메일: 공백 x, 이메일 형식
    @NotBlank(message = "이메일은 필수 입력 값입니다.")
    @Email(message = "이메일 형식이 올바르지 않습니다.")
    private String email;

     // 패스워드: 패턴 ○ (8글자 이상, 대소문자 포함)
    @NotBlank(message = "패스워드는 필수 입력 값입니다.")
    @Pattern(
        regexp = "^(?=.*[a-z])(?=.*[A-Z]).{8,}$",
        message = "패스워드는 8자 이상이며 대문자와 소문자를 모두 포함해야 합니다."
    )
    private String password;

    // 나이: 패턴 ○, 19이상 ~ 90세 이하 (문자열로 받으니 정규식으로 체크)
    @NotBlank(message = "나이는 필수 입력 값입니다.")
    @Pattern(
        regexp = "^(1[9]|[2-8][0-9]|90)$",
        message = "나이는 19세 이상 90세 이하의 숫자만 입력할 수 있습니다."
    )
    private String age;
    private String mobile;
    private String address;

    public Member toEntity(){ // Member 생성자를 통해 객체 생성
        return Member.builder()
            .name(name)
            .email(email)
            .password(password)
            .age(age)
            .mobile(mobile)
            .address(address)
            .build();
    }
}