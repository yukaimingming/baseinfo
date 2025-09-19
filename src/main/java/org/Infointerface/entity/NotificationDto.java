package org.Infointerface.entity;

import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class NotificationDto {
    private String applyId; // 上转诊申请单号
    private String patientId; // 患者标识
    @NotBlank(message = "患者姓名不能为空")
    @Size(max = 50, message = "患者姓名长度不能超过50")
    private String patientName; // 患者姓名
    @NotBlank(message = "证件类型不能为空")
    @Size(max = 30, message = "证件类型长度不能超过30")
    private String patientCardType; // 证件类型 hms.dic.idtp
    @NotBlank(message = "患者证件号码不能为空")
    @Size(max = 50, message = "患者证件号码长度不能超过50")
    private String patientCardNumber; // 患者证件号码
    @NotBlank(message = "手机号码不能为空")
    @Pattern(regexp = "^[1][3-9]\\d{9}$", message = "手机号码格式不正确")
    private String patientMobile; // 手机号码
    @NotBlank(message = "就诊科室不能为空")
    @Size(max = 50, message = "就诊科室长度不能超过50")
    private String applyDepartmentId; // 就诊科室
    private String liveProvince; // 省代码
    private String liveCity; // 市代码
    private String liveCounty; // 区代码
    private String liveStreet; // 街道代码
    private String liveAddress; // 详细地址
    private String healthAdvice; // 康复建议
    @NotBlank(message = "初步诊断不能为空")
    @Size(max = 2000, message = "初步诊断长度不能超过2000")
    private String diseaseDescription; // 初步诊断
    @NotBlank(message = "病历摘要不能为空")
    @Size(max = 2000, message = "病历摘要长度不能超过2000")
    private String diseaseSummary; // 病历摘要
    private String tatmentProcess; // 治疗经过
    private String attachment; // 病例附件
    @NotBlank(message = "申请机构代码不能为空")
    private String applyOrganizationId; // 申请机构代码
    @NotBlank(message = "申请医生不能为空")
    private String applyDoctorId; // 申请医生
    private String applyDocPhone; // 申请联系号码
    @NotBlank(message = "转诊类型不能为空")
    private String businessType; // 转诊类型 hms.dic.referralType
    @NotBlank(message = "转诊方式不能为空")
    @Pattern(regexp = "^[12]$", message = "转诊方式只能为 1（在线预约） 或 2（转诊）")
    private String businessWay; // 转诊方式 1在线预约 2转诊
    private String acceptDocPhone; // 受邀医生的联系方式
    @NotBlank(message = "转入机构代码不能为空")
    private String acceptOrganizationId; // 转入机构代码
    private String acceptDepartmentId; // 转入科室代码
    private String acceptDoctorId; // 接诊医生代码
    private String resourceId; // 号源id
    private String checkClassify; // 检查大项
    private String inspectionCode; // 检查项
    @NotBlank(message = "转诊目的不能为空")
    @Size(max = 2000, message = "转诊目的长度不能超过2000")
    private String turnReason; // 转诊目的
    @NotNull(message = "转诊日期不能为空")
    private Date confirmTime; // 转诊日期 yyyy-MM-dd
    private String remark; // 备注
    private String dicom; // Dicom影像Id 多张以逗号隔开
    private String serialNumber; // 就诊序列号
    private String visitSign; // 门诊住院标识
    private String diagnoseCode; // 诊断编号 多个诊断逗号隔开
    private String diagnoseName; // 诊断名称 多个诊断名称逗号隔开
    private String orderId; // 预约单号
    private String orderSerialNumber; // 号源序号
    private String bedCategory; // 床位类型
    private String bedPosition; // 床位位置
    private String applyOldId; // 原转诊单号
    private String medicalRecordNumber; // 病案号
}
