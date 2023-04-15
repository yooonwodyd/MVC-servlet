package hello.servlet.dommin.member;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Member {
    private Long id;
    private String username;
    private int age;
    private Member(){
    }

    public Member(String username, int age) {
        this.username = username;
        this.age = age;
    }
}
