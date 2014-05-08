package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the COPTN database table.
 * 
 */
@Entity
@Table(name="COPTN")
@NamedQuery(name="Coptn.findAll", query="SELECT c FROM Coptn c")
public class Coptn implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CoptnPK id;

	@Column(name="COMPANY")
	private String company;

	@Column(name="CREATE_DATE")
	private String createDate;

	@Column(name="CREATOR")
	private String creator;

	@Column(name="FLAG")
	private BigDecimal flag;

	@Column(name="MODI_DATE")
	private String modiDate;

	@Column(name="MODIFIER")
	private String modifier;

	@Column(name="TN003")
	private String tn003;

	@Column(name="TN004")
	private String tn004;

	@Column(name="TN005")
	private String tn005;

	@Column(name="TN006")
	private String tn006;

	@Column(name="TN007")
	private String tn007;

	@Column(name="TN008")
	private String tn008;

	@Column(name="TN009")
	private String tn009;

	@Column(name="TN010")
	private String tn010;

	@Column(name="TN011")
	private String tn011;

	@Column(name="TN012")
	private String tn012;

	@Column(name="TN013")
	private String tn013;

	@Column(name="TN014")
	private BigDecimal tn014;

	@Column(name="TN015")
	private BigDecimal tn015;

	@Column(name="TN016")
	private String tn016;

	@Column(name="TN017")
	private String tn017;

	@Column(name="TN018")
	private String tn018;

	@Column(name="TN019")
	private BigDecimal tn019;

	@Column(name="TN020")
	private BigDecimal tn020;

	@Column(name="TN021")
	private String tn021;

	@Column(name="TN022")
	private String tn022;

	@Column(name="TN023")
	private String tn023;

	@Column(name="TN024")
	private String tn024;

	@Column(name="TN025")
	private String tn025;

	@Column(name="TN026")
	private String tn026;

	@Column(name="TN027")
	private String tn027;

	@Column(name="TN028")
	private String tn028;

	@Column(name="TN029")
	private BigDecimal tn029;

	@Column(name="TN030")
	private BigDecimal tn030;

	@Column(name="TN031")
	private String tn031;

	@Column(name="TN032")
	private String tn032;

	@Column(name="TN033")
	private String tn033;

	@Column(name="TN034")
	private BigDecimal tn034;

	@Column(name="TN035")
	private BigDecimal tn035;

	@Column(name="TN036")
	private BigDecimal tn036;

	@Column(name="TN037")
	private String tn037;

	@Column(name="TN038")
	private String tn038;

	@Column(name="UDF01")
	private String udf01;

	@Column(name="UDF02")
	private String udf02;

	@Column(name="UDF03")
	private String udf03;

	@Column(name="UDF04")
	private String udf04;

	@Column(name="UDF05")
	private String udf05;

	@Column(name="UDF06")
	private String udf06;

	@Column(name="UDF07")
	private String udf07;

	@Column(name="UDF08")
	private String udf08;

	@Column(name="UDF09")
	private String udf09;

	@Column(name="UDF10")
	private String udf10;

	@Column(name="UDF11")
	private String udf11;

	@Column(name="UDF12")
	private String udf12;

	@Column(name="UDF51")
	private BigDecimal udf51;

	@Column(name="UDF52")
	private BigDecimal udf52;

	@Column(name="UDF53")
	private BigDecimal udf53;

	@Column(name="UDF54")
	private BigDecimal udf54;

	@Column(name="UDF55")
	private BigDecimal udf55;

	@Column(name="UDF56")
	private BigDecimal udf56;

	@Column(name="UDF57")
	private BigDecimal udf57;

	@Column(name="UDF58")
	private BigDecimal udf58;

	@Column(name="UDF59")
	private BigDecimal udf59;

	@Column(name="UDF60")
	private BigDecimal udf60;

	@Column(name="UDF61")
	private BigDecimal udf61;

	@Column(name="UDF62")
	private BigDecimal udf62;

	@Column(name="USR_GROUP")
	private String usrGroup;

	public Coptn() {
	}

	public CoptnPK getId() {
		return this.id;
	}

	public void setId(CoptnPK id) {
		this.id = id;
	}

	public String getCompany() {
		return this.company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public BigDecimal getFlag() {
		return this.flag;
	}

	public void setFlag(BigDecimal flag) {
		this.flag = flag;
	}

	public String getModiDate() {
		return this.modiDate;
	}

	public void setModiDate(String modiDate) {
		this.modiDate = modiDate;
	}

	public String getModifier() {
		return this.modifier;
	}

	public void setModifier(String modifier) {
		this.modifier = modifier;
	}

	public String getTn003() {
		return this.tn003;
	}

	public void setTn003(String tn003) {
		this.tn003 = tn003;
	}

	public String getTn004() {
		return this.tn004;
	}

	public void setTn004(String tn004) {
		this.tn004 = tn004;
	}

	public String getTn005() {
		return this.tn005;
	}

	public void setTn005(String tn005) {
		this.tn005 = tn005;
	}

	public String getTn006() {
		return this.tn006;
	}

	public void setTn006(String tn006) {
		this.tn006 = tn006;
	}

	public String getTn007() {
		return this.tn007;
	}

	public void setTn007(String tn007) {
		this.tn007 = tn007;
	}

	public String getTn008() {
		return this.tn008;
	}

	public void setTn008(String tn008) {
		this.tn008 = tn008;
	}

	public String getTn009() {
		return this.tn009;
	}

	public void setTn009(String tn009) {
		this.tn009 = tn009;
	}

	public String getTn010() {
		return this.tn010;
	}

	public void setTn010(String tn010) {
		this.tn010 = tn010;
	}

	public String getTn011() {
		return this.tn011;
	}

	public void setTn011(String tn011) {
		this.tn011 = tn011;
	}

	public String getTn012() {
		return this.tn012;
	}

	public void setTn012(String tn012) {
		this.tn012 = tn012;
	}

	public String getTn013() {
		return this.tn013;
	}

	public void setTn013(String tn013) {
		this.tn013 = tn013;
	}

	public BigDecimal getTn014() {
		return this.tn014;
	}

	public void setTn014(BigDecimal tn014) {
		this.tn014 = tn014;
	}

	public BigDecimal getTn015() {
		return this.tn015;
	}

	public void setTn015(BigDecimal tn015) {
		this.tn015 = tn015;
	}

	public String getTn016() {
		return this.tn016;
	}

	public void setTn016(String tn016) {
		this.tn016 = tn016;
	}

	public String getTn017() {
		return this.tn017;
	}

	public void setTn017(String tn017) {
		this.tn017 = tn017;
	}

	public String getTn018() {
		return this.tn018;
	}

	public void setTn018(String tn018) {
		this.tn018 = tn018;
	}

	public BigDecimal getTn019() {
		return this.tn019;
	}

	public void setTn019(BigDecimal tn019) {
		this.tn019 = tn019;
	}

	public BigDecimal getTn020() {
		return this.tn020;
	}

	public void setTn020(BigDecimal tn020) {
		this.tn020 = tn020;
	}

	public String getTn021() {
		return this.tn021;
	}

	public void setTn021(String tn021) {
		this.tn021 = tn021;
	}

	public String getTn022() {
		return this.tn022;
	}

	public void setTn022(String tn022) {
		this.tn022 = tn022;
	}

	public String getTn023() {
		return this.tn023;
	}

	public void setTn023(String tn023) {
		this.tn023 = tn023;
	}

	public String getTn024() {
		return this.tn024;
	}

	public void setTn024(String tn024) {
		this.tn024 = tn024;
	}

	public String getTn025() {
		return this.tn025;
	}

	public void setTn025(String tn025) {
		this.tn025 = tn025;
	}

	public String getTn026() {
		return this.tn026;
	}

	public void setTn026(String tn026) {
		this.tn026 = tn026;
	}

	public String getTn027() {
		return this.tn027;
	}

	public void setTn027(String tn027) {
		this.tn027 = tn027;
	}

	public String getTn028() {
		return this.tn028;
	}

	public void setTn028(String tn028) {
		this.tn028 = tn028;
	}

	public BigDecimal getTn029() {
		return this.tn029;
	}

	public void setTn029(BigDecimal tn029) {
		this.tn029 = tn029;
	}

	public BigDecimal getTn030() {
		return this.tn030;
	}

	public void setTn030(BigDecimal tn030) {
		this.tn030 = tn030;
	}

	public String getTn031() {
		return this.tn031;
	}

	public void setTn031(String tn031) {
		this.tn031 = tn031;
	}

	public String getTn032() {
		return this.tn032;
	}

	public void setTn032(String tn032) {
		this.tn032 = tn032;
	}

	public String getTn033() {
		return this.tn033;
	}

	public void setTn033(String tn033) {
		this.tn033 = tn033;
	}

	public BigDecimal getTn034() {
		return this.tn034;
	}

	public void setTn034(BigDecimal tn034) {
		this.tn034 = tn034;
	}

	public BigDecimal getTn035() {
		return this.tn035;
	}

	public void setTn035(BigDecimal tn035) {
		this.tn035 = tn035;
	}

	public BigDecimal getTn036() {
		return this.tn036;
	}

	public void setTn036(BigDecimal tn036) {
		this.tn036 = tn036;
	}

	public String getTn037() {
		return this.tn037;
	}

	public void setTn037(String tn037) {
		this.tn037 = tn037;
	}

	public String getTn038() {
		return this.tn038;
	}

	public void setTn038(String tn038) {
		this.tn038 = tn038;
	}

	public String getUdf01() {
		return this.udf01;
	}

	public void setUdf01(String udf01) {
		this.udf01 = udf01;
	}

	public String getUdf02() {
		return this.udf02;
	}

	public void setUdf02(String udf02) {
		this.udf02 = udf02;
	}

	public String getUdf03() {
		return this.udf03;
	}

	public void setUdf03(String udf03) {
		this.udf03 = udf03;
	}

	public String getUdf04() {
		return this.udf04;
	}

	public void setUdf04(String udf04) {
		this.udf04 = udf04;
	}

	public String getUdf05() {
		return this.udf05;
	}

	public void setUdf05(String udf05) {
		this.udf05 = udf05;
	}

	public String getUdf06() {
		return this.udf06;
	}

	public void setUdf06(String udf06) {
		this.udf06 = udf06;
	}

	public String getUdf07() {
		return this.udf07;
	}

	public void setUdf07(String udf07) {
		this.udf07 = udf07;
	}

	public String getUdf08() {
		return this.udf08;
	}

	public void setUdf08(String udf08) {
		this.udf08 = udf08;
	}

	public String getUdf09() {
		return this.udf09;
	}

	public void setUdf09(String udf09) {
		this.udf09 = udf09;
	}

	public String getUdf10() {
		return this.udf10;
	}

	public void setUdf10(String udf10) {
		this.udf10 = udf10;
	}

	public String getUdf11() {
		return this.udf11;
	}

	public void setUdf11(String udf11) {
		this.udf11 = udf11;
	}

	public String getUdf12() {
		return this.udf12;
	}

	public void setUdf12(String udf12) {
		this.udf12 = udf12;
	}

	public BigDecimal getUdf51() {
		return this.udf51;
	}

	public void setUdf51(BigDecimal udf51) {
		this.udf51 = udf51;
	}

	public BigDecimal getUdf52() {
		return this.udf52;
	}

	public void setUdf52(BigDecimal udf52) {
		this.udf52 = udf52;
	}

	public BigDecimal getUdf53() {
		return this.udf53;
	}

	public void setUdf53(BigDecimal udf53) {
		this.udf53 = udf53;
	}

	public BigDecimal getUdf54() {
		return this.udf54;
	}

	public void setUdf54(BigDecimal udf54) {
		this.udf54 = udf54;
	}

	public BigDecimal getUdf55() {
		return this.udf55;
	}

	public void setUdf55(BigDecimal udf55) {
		this.udf55 = udf55;
	}

	public BigDecimal getUdf56() {
		return this.udf56;
	}

	public void setUdf56(BigDecimal udf56) {
		this.udf56 = udf56;
	}

	public BigDecimal getUdf57() {
		return this.udf57;
	}

	public void setUdf57(BigDecimal udf57) {
		this.udf57 = udf57;
	}

	public BigDecimal getUdf58() {
		return this.udf58;
	}

	public void setUdf58(BigDecimal udf58) {
		this.udf58 = udf58;
	}

	public BigDecimal getUdf59() {
		return this.udf59;
	}

	public void setUdf59(BigDecimal udf59) {
		this.udf59 = udf59;
	}

	public BigDecimal getUdf60() {
		return this.udf60;
	}

	public void setUdf60(BigDecimal udf60) {
		this.udf60 = udf60;
	}

	public BigDecimal getUdf61() {
		return this.udf61;
	}

	public void setUdf61(BigDecimal udf61) {
		this.udf61 = udf61;
	}

	public BigDecimal getUdf62() {
		return this.udf62;
	}

	public void setUdf62(BigDecimal udf62) {
		this.udf62 = udf62;
	}

	public String getUsrGroup() {
		return this.usrGroup;
	}

	public void setUsrGroup(String usrGroup) {
		this.usrGroup = usrGroup;
	}

}