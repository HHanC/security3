package web.domain.member;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Role {

    MEMBER("ROLE_MEMBER" , "회원"),
    INTERME("ROLE_INTERME" , "중개인"),
    ADMIN("ROLE_ADMIN" , "관리자");

    private final String key;
    private final String title;

}
