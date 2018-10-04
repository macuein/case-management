package org.mik.cm.server.domain;

import lombok.Getter;
import lombok.Setter;

public class User {
    @Getter @Setter private Integer user_id;
    @Getter @Setter private Integer org_id;
    @Getter @Setter private String user_code;
    @Getter @Setter private String user_name;

    public User() {
        super();
    }

    public User(Integer id, Integer orgid, String code, String name) {
        super();
        this.user_id = id;
        this.org_id = orgid;
        this.user_code = code;
        this.user_name = name;
    }

    @Override
    public String toString() {
        return String.format("User [id=%s, org=%s, code=%s, name=%s]", user_id, org_id, user_code, user_name);
    }

}
