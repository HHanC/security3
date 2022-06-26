package web.domain.member;

import lombok.*;

import javax.persistence.*;

@Setter @Getter @ToString @Entity @Builder @Table(name = "member")
@AllArgsConstructor
@NoArgsConstructor
public class MemberEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int mno;
    private String mid;
    private String mname;
    private String mpassword;

    @Enumerated(EnumType.STRING)
    private Role role;

    public String getrolekey() {
        return role.getKey();
    }

}
