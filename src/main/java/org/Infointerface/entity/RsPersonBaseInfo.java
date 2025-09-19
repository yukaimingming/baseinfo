package org.Infointerface.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 自动生成 getter/setter、equals、hashCode、toString
@NoArgsConstructor // 无参构造
@AllArgsConstructor // 全参构造
@Entity
@Table(name = "rs_person_baseinfo")
public class RsPersonBaseInfo {

    // @Id
    // @Column(name = "ID", length = 100, nullable = false)
    // private String id; // 人员逻辑ID

    // @Column(name = "ZGH", length = 32)
    // private String zgh; // 职工号

    // @Column(name = "XM", length = 30)
    // private String xm; // 姓名

    // @Column(name = "XB", length = 466)
    // private String xb; // 性别

    // @Column(name = "GWLB", length = 466)
    // private String gwlb; // 岗位类别

    // @Column(name = "BMH", length = 32)
    // private String bmh; // 所在部门号

    // @Column(name = "SJ", length = 12)
    // private String sj; // 手机

    // @Column(name = "BGSDH", length = 12)
    // private String bgsdh; // 办公室电话

    // @Column(name = "EMAIL", length = 30)
    // private String email; // 电子邮件

    // @Column(name = "JG", length = 466)
    // private String jg; // 籍贯

    // @Column(name = "ZGXL", length = 466)
    // private String zgxl; // 最高学历

    // @Column(name = "MQZT", length = 466)
    // private String mqzt; // 目前状态

    // @Column(name = "XZZ", length = 80)
    // private String xzz; // 现住址

    // @Column(name = "SFZHM", length = 30)
    // private String sfzhm; // 身份证号码

    // @Column(name = "XXTXDZ", length = 80)
    // private String xxtxdz; // 详细通信地址

    // @Column(name = "CSNY")
    // private LocalDate csny; // 出生日期

    @Id
    @Column(name = "ID", nullable = false, length = 100)
    private String id;

    @Column(name = "ZGH", length = 50)
    private String zgh;

    @Column(name = "XM", length = 40)
    private String xm;

    @Column(name = "XB", length = 1)
    private String xb;

    @Column(name = "XB1", length = 1)
    private String xb1;

    @Column(name = "GWLB", length = 466)
    private String gwlb;

    @Column(name = "GWLB1", length = 200)
    private String gwlb1;

    @Column(name = "BMH", length = 32)
    private String bmh;

    @Column(name = "BMH1", length = 200)
    private String bmh1;

    @Column(name = "KSH", length = 30)
    private String ksh;

    @Column(name = "KSH1", length = 200)
    private String ksh1;

    @Column(name = "SZBMLB", length = 2)
    private String szbmlb;

    @Column(name = "SZBMLB1", length = 200)
    private String szbmlb1;

    @Column(name = "ZWMC", length = 150)
    private String zwmc;

    @Column(name = "ZWSJ")
    private LocalDateTime zwsj;

    @Column(name = "MZ", length = 2)
    private String mz;

    @Column(name = "MZ1", length = 200)
    private String mz1;

    @Column(name = "NL")
    private Integer nl;

    @Column(name = "ZZMM", length = 2)
    private String zzmm;

    @Column(name = "ZZMM1", length = 200)
    private String zzmm1;

    @Column(name = "CJGZRQ", length = 2)
    private String cjgzrq;

    @Column(name = "HYZK", length = 2)
    private String hyzk;

    @Column(name = "HYZK1", length = 200)
    private String hyzk1;

    @Column(name = "SZXQ", length = 2)
    private String szxq;

    @Column(name = "SZXQ1", length = 200)
    private String szxq1;

    @Column(name = "SJ", length = 12)
    private String sj;

    @Column(name = "BGSDH", length = 50)
    private String bgsdh;

    @Column(name = "EMAIL", length = 30)
    private String email;

    @Column(name = "JG", length = 6)
    private String jg;

    @Column(name = "JG1", length = 200)
    private String jg1;

    @Column(name = "ZGXL", length = 466)
    private String zgxl;

    @Column(name = "ZGXL1", length = 200)
    private String zgxl1;

    @Column(name = "ZGXLBYXX", length = 150)
    private String zgxlbyxx;

    @Column(name = "ZGXLBYZY", length = 150)
    private String zgxlbyzy;

    @Column(name = "ZGXLBYSJ")
    private LocalDateTime zgxlbysj;

    @Column(name = "RYLB", length = 3)
    private String rylb;

    @Column(name = "RYLB1", length = 200)
    private String rylb1;

    @Column(name = "XNGWXL", length = 2)
    private String xngwxl;

    @Column(name = "XNGWXL1", length = 200)
    private String xngwxl1;

    @Column(name = "PYGWLB", length = 3)
    private String pygwlb;

    @Column(name = "PYGWLB1", length = 200)
    private String pygwlb1;

    @Column(name = "PYGWDJ", length = 3)
    private String pygwdj;

    @Column(name = "PYGWDJ1", length = 200)
    private String pygwdj1;

    @Column(name = "MQZT", length = 466)
    private String mqzt;

    @Column(name = "MQZT1", length = 200)
    private String mqzt1;

    @Column(name = "XZZ", length = 150)
    private String xzz;

    @Column(name = "ZJLX", length = 2)
    private String zjlx;

    @Column(name = "ZJLX1", length = 200)
    private String zjlx1;

    @Column(name = "SFZHM", length = 30)
    private String sfzhm;

    @Column(name = "XXTXDZ", length = 150)
    private String xxtxdz;

    @Column(name = "CSNY")
    private LocalDate csny;

    @Column(name = "SSXY", length = 100)
    private String ssxy;

    @Column(name = "XZZJ", length = 200)
    private String xzzj;
}
