package org.mik.cm.server.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "organizations")
public class Organizations {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "org_id", nullable = false)
    @Getter @Setter private Long org_id;

    @Column(name = "org_code", nullable = false)
    @Getter @Setter private String org_code;

    @Column(name = "org_description", nullable = false)
    @Getter @Setter private String org_description;

    public Organizations() {
        super();
    }

    public Organizations(Long id, String code, String description) {
        super();
        this.org_id = id;
        this.org_code = code;
        this.org_description = description;
    }

    @Override
    public String toString() {
        return String.format("Organizations [id=%s, code=%s, description=%s]", org_id, org_code, org_description);
    }

}
