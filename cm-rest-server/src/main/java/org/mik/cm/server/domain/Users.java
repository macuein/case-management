package org.mik.cm.server.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "user_id", nullable = false)
    @Getter @Setter private Long user_id;

    @Column(name = "org_id", nullable = false)
    @Getter @Setter private Long org_id;

    @Column(name = "user_code", nullable = false)
    @Getter @Setter private String user_code;

    @Column(name = "user_name", nullable = false)
    @Getter @Setter private String user_name;

    public Users() {
        super();
    }

    public Users(Long id, Long orgid, String code, String name) {
        super();
        this.user_id = id;
        this.org_id = orgid;
        this.user_code = code;
        this.user_name = name;
    }

    @Override
    public String toString() {
        return String.format("Users [id=%s, org=%s, code=%s, name=%s]", user_id, org_id, user_code, user_name);
    }

}
