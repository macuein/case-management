package org.mik.cm.server.domain;

import lombok.Getter;
import lombok.Setter;

public class Organization {

    @Getter @Setter private Integer org_id;
    @Getter @Setter private String org_code;
    @Getter @Setter private String org_description;

    public Organization() {
        super();
    }

    public Organization(Integer id, String code, String description) {
        super();
        this.org_id = id;
        this.org_code = code;
        this.org_description = description;
    }

    @Override
    public String toString() {
        return String.format("Organization [id=%s, code=%s, description=%s]", org_id, org_code, org_description);
    }

}
