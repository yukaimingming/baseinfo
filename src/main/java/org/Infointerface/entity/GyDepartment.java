package org.Infointerface.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Gy_department")
public class GyDepartment {

    @Id
    @Column(name = "DEPARTMENT_ID", length = 32)
    private String departmentId; // 部门ID编码（学校机构统一编码）

    @Column(name = "DEPARTMENT_ID1", length = 32)
    private String departmentId1; // 所在部门编码中文

    @Column(name = "BMFQID", length = 32)
    private String bmfqid; // 上级部门ID编码（学校机构统一编码）

    @Column(name = "BMFQID1", length = 32)
    private String bmfqid1; // 上级部门中文

    @Column(name = "subcompanyid1")
    private Integer subcompanyid1; // 所属分部（上级部门ID编码）

    // @Column(name = "subcompanyid11", length = 32)
    // private String subcompanyid11; // 所属分部中文

    @Column(name = "BMMC", length = 80)
    private String bmmc; // 部门名称

    @Column(name = "BMH", length = 32)
    private String bmh; // 部门编号（院系号）

    @Column(name = "showorder")
    private Integer showorder; // 显示顺序

    @Column(name = "BMDHHM", length = 32)
    private String bmdhhm; // 部门电话号码

    @Column(name = "BMFZR", length = 32)
    private String bmfzr; // 部门负责人

    @Column(name = "BMYXKSSJ")
    private LocalDate bmyxkssj; // 部门有效开始时间

    @Column(name = "BMYXJSSJ")
    private LocalDate bmyxjssj; // 部门有效结束时间
}
