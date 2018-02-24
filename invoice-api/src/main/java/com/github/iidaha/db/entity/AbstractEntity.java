package com.github.iidaha.db.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class AbstractEntity {
    @Column(name = "create_datetime")
    @NotNull
    private LocalDateTime createDatetime;

    @Column(name = "update_datetime")
    @NotNull
    private LocalDateTime updateDatetime;

    @Column(name = "del_flg")
    @NotNull
    private String delFlg;

    @PrePersist
    public void onPrePersist() {
        LocalDateTime now = LocalDateTime.now();
        setCreateDatetime(now);
        setUpdateDatetime(now);
        setDelFlg("0");
    }

    @PreUpdate
    public void onPreUpdate() {
        setUpdateDatetime(LocalDateTime.now());
    }

}
