package org.Infointerface.entity;

import java.time.LocalDate;

import lombok.Data;

@Data
public class GyDepartmentDto {

    private String departmentId; // 部门ID编码（学校机构统一编码）

    private String departmentId1; // 所在部门编码中文

    private String bmfqid; // 上级部门ID编码（学校机构统一编码）

    private String bmfqid1; // 上级部门中文

    private Integer subcompanyid1; // 所属分部（上级部门ID编码）

    // private String subcompanyid11; // 所属分部中文

    private String bmmc; // 部门名称

    private String bmh; // 部门编号（院系号）

    private Integer showorder; // 显示顺序

    private String bmdhhm; // 部门电话号码

    private String bmfzr; // 部门负责人

    private LocalDate bmyxkssj; // 部门有效开始时间

    private LocalDate bmyxjssj; // 部门有效结束时间
}
