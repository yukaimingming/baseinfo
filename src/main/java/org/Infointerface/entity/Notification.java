package org.Infointerface.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // 自动生成 getter/setter、equals、hashCode、toString
@NoArgsConstructor // 无参构造
@AllArgsConstructor // 全参构造
@Entity
@Table(name = "SXZZ_ZZQRTZ")
public class Notification {

    @Column(name = "APPLYID", length = 50)
    private String applyId; // 上转诊申请单号

    @Column(name = "PATIENTID", length = 50)
    private String patientId; // 患者标识

    @Column(name = "PATIENTNAME", length = 50, nullable = false)
    private String patientName; // 患者姓名

    @Column(name = "PATIENTCARDTYPE", length = 30, nullable = false)
    private String patientCardType; // 证件类型 hms.dic.idtp

    @Id
    @Column(name = "PATIENTCARDNUMBER", length = 50, nullable = false)
    private String patientCardNumber; // 患者证件号码

    @Column(name = "PATIENTMOBILE", length = 50, nullable = false)
    private String patientMobile; // 手机号码

    @Column(name = "APPLYDEPARTMENTID", length = 50, nullable = false)
    private String applyDepartmentId; // 就诊科室

    @Column(name = "LIVEPROVINCE", length = 50)
    private String liveProvince; // 省代码

    @Column(name = "LIVECITY", length = 50)
    private String liveCity; // 市代码

    @Column(name = "LIVECOUNTY", length = 50)
    private String liveCounty; // 区代码

    @Column(name = "LIVESTREET", length = 50)
    private String liveStreet; // 街道代码

    @Column(name = "LIVEADDRESS", length = 100)
    private String liveAddress; // 详细地址

    @Column(name = "HEALTHADVICE", length = 2000)
    private String healthAdvice; // 康复建议

    @Column(name = "DISEASEDESCRIPTION", length = 2000, nullable = false)
    private String diseaseDescription; // 初步诊断

    @Column(name = "DISEASESUMMARY", length = 2000, nullable = false)
    private String diseaseSummary; // 病历摘要

    @Column(name = "TATMENTPROCESS", length = 2000)
    private String tatmentProcess; // 治疗经过

    @Column(name = "ATTACHMENT", length = 100)
    private String attachment; // 病例附件

    @Column(name = "APPLYORGANIZATIONID", length = 50, nullable = false)
    private String applyOrganizationId; // 申请机构代码

    @Column(name = "APPLYDOCTORID", length = 36, nullable = false)
    private String applyDoctorId; // 申请医生

    @Column(name = "APPLYDOCPHONE", length = 50)
    private String applyDocPhone; // 申请联系号码

    @Column(name = "BUSINESSTYPE", length = 2, nullable = false)
    private String businessType; // 转诊类型 hms.dic.referralType

    @Column(name = "BUSINESSWAY", length = 2, nullable = false)
    private String businessWay; // 转诊方式 1在线预约 2转诊

    @Column(name = "ACCEPTDOCPHONE", length = 50)
    private String acceptDocPhone; // 受邀医生的联系方式

    @Column(name = "ACCEPTORGANIZATIONID", length = 50, nullable = false)
    private String acceptOrganizationId; // 转入机构代码

    @Column(name = "ACCEPTDEPARTMENTID", length = 50)
    private String acceptDepartmentId; // 转入科室代码

    @Column(name = "ACCEPTDOCTORID", length = 50)
    private String acceptDoctorId; // 接诊医生代码

    @Column(name = "RESOURCEID", length = 50)
    private String resourceId; // 号源id

    @Column(name = "CHECKCLASSIFY", length = 50)
    private String checkClassify; // 检查大项

    @Column(name = "INSPECTIONCODE", length = 50)
    private String inspectionCode; // 检查项

    @Column(name = "TURNREASON", length = 2000, nullable = false)
    private String turnReason; // 转诊目的

    @Column(name = "CONFIRMTIME")
    @Temporal(TemporalType.DATE)
    private Date confirmTime; // 转诊日期 yyyy-MM-dd

    @Column(name = "REMARK", length = 2000)
    private String remark; // 备注

    @Column(name = "DICOM", length = 200)
    private String dicom; // Dicom影像Id 多张以逗号隔开

    @Column(name = "SERIALNUMBER", length = 50)
    private String serialNumber; // 就诊序列号

    @Column(name = "VISITSIGN", length = 50)
    private String visitSign; // 门诊住院标识

    @Column(name = "DIAGNOSECODE", length = 200)
    private String diagnoseCode; // 诊断编号 多个诊断逗号隔开

    @Column(name = "DIAGNOSENAME", length = 200)
    private String diagnoseName; // 诊断名称 多个诊断名称逗号隔开

    @Column(name = "ORDERID", length = 50)
    private String orderId; // 预约单号

    @Column(name = "ORDERSERIALNUMBER", length = 50)
    private String orderSerialNumber; // 号源序号

    @Column(name = "BEDCATEGORY", length = 50)
    private String bedCategory; // 床位类型

    @Column(name = "BEDPOSITION", length = 50)
    private String bedPosition; // 床位位置

    @Column(name = "APPLYOLDID", length = 50)
    private String applyOldId; // 原转诊单号

    @Column(name = "MEDICALRECORDNUMBER", length = 50)
    private String medicalRecordNumber; // 病案号

    // 生成所有字段的get和set

    // public String getOrderSerialNumber() {
    // return orderSerialNumber;
    // }

    // public void setOrderSerialNumber(String orderSerialNumber) {
    // this.orderSerialNumber = orderSerialNumber;
    // }

    // public String getBedCategory() {
    // return bedCategory;
    // }

    // public void setBedCategory(String bedCategory) {
    // this.bedCategory = bedCategory;
    // }

    // public String getBedPosition() {
    // return bedPosition;
    // }

    // public void setBedPosition(String bedPosition) {
    // this.bedPosition = bedPosition;
    // }

    // public String getApplyOldId() {
    // return applyOldId;
    // }

    // public void setApplyOldId(String applyOldId) {
    // this.applyOldId = applyOldId;
    // }

    // public String getMedicalRecordNumber() {
    // return medicalRecordNumber;
    // }

    // public void setMedicalRecordNumber(String medicalRecordNumber) {
    // this.medicalRecordNumber = medicalRecordNumber;
    // }

}
