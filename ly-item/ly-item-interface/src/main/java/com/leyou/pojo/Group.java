package com.leyou.pojo;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
@Data
@Table(name = "tb_spec_group")
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cid;
    private String name;
    @Transient
    private List<Param> specParam;
}
