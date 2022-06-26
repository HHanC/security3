package web.dto;

import lombok.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import web.domain.member.MemberEntity;
import web.domain.member.Role;

@Setter @Getter @ToString @Builder
@AllArgsConstructor
@NoArgsConstructor
public class MemberDto {

    private int mno;
    private String mid;
    private String mname;
    private String mpassword;

    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    public MemberEntity toentity(){

        return MemberEntity.builder()
                .mid(this.mid)
                .mname(this.mname)
                .mpassword(passwordEncoder.encode(this.mpassword))
                .role(Role.MEMBER)
                .build();

    }

}
