package org.mik.cm.server.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "cases")
public class Cases {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "case_id", nullable = false)
    @Getter @Setter private Long case_id;

    @Column(name = "org_id", nullable = false)
    @Getter @Setter private Long org_id;

    @Column(name = "case_code", nullable = false)
    @Getter @Setter private String case_code;

    @Column(name = "case_description", nullable = false)
    @Getter @Setter private String case_description;

    @Column(name = "case_reference", nullable = false)
    @Getter @Setter private String case_reference;

    @Column(name = "case_detail_url", nullable = false)
    @Getter @Setter private String case_detail_url;

    @Column(name = "case_callback_url", nullable = false)
    @Getter @Setter private String case_callback_url;

    public Cases() {
        super();
    }

    public Cases(Long id, Long orgid, String code, String desc, String ref, String det_url, String callb_url) {
        super();
        this.case_id = id;
        this.org_id = orgid;
        this.case_code = code;
        this.case_description = desc;
        this.case_reference = ref;
        this.case_detail_url = det_url;
        this.case_callback_url = callb_url;
    }

    @Override
    public String toString() {
        return String.format("Cases [id=%s, org=%s, code=%s, desc=%s]", case_id, org_id, case_code, case_description);
    }


}
