package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the COPTO database table.
 * 
 */
@Entity
@Table(name="COPTO")
@NamedQuery(name="Copto.findAll", query="SELECT c FROM Copto c")
public class Copto implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CoptoPK id;

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

	@Column(name="TO004")
	private String to004;

	@Column(name="TO005")
	private String to005;

	@Column(name="TO006")
	private String to006;

	@Column(name="TO007")
	private String to007;

	@Column(name="TO008")
	private String to008;

	@Column(name="TO009")
	private String to009;

	@Column(name="TO010")
	private String to010;

	@Column(name="TO011")
	private String to011;

	@Column(name="TO012")
	private BigDecimal to012;

	@Column(name="TO013")
	private BigDecimal to013;

	@Column(name="TO014")
	private String to014;

	@Column(name="TO015")
	private String to015;

	@Column(name="TO016")
	private String to016;

	@Column(name="TO017")
	private BigDecimal to017;

	@Column(name="TO018")
	private String to018;

	@Column(name="TO019")
	private BigDecimal to019;

	@Column(name="TO020")
	private BigDecimal to020;

	@Column(name="TO021")
	private BigDecimal to021;

	@Column(name="TO022")
	private String to022;

	@Column(name="TO023")
	private String to023;

	@Column(name="TO024")
	private BigDecimal to024;

	@Column(name="TO025")
	private BigDecimal to025;

	@Column(name="TO026")
	private String to026;

	@Column(name="TO027")
	private BigDecimal to027;

	@Column(name="TO028")
	private BigDecimal to028;

	@Column(name="TO029")
	private BigDecimal to029;

	@Column(name="TO030")
	private BigDecimal to030;

	@Column(name="TO031")
	private BigDecimal to031;

	@Column(name="TO032")
	private String to032;

	@Column(name="TO033")
	private String to033;

	@Column(name="TO034")
	private BigDecimal to034;

	@Column(name="TO035")
	private BigDecimal to035;

	@Column(name="TO036")
	private BigDecimal to036;

	@Column(name="TO037")
	private String to037;

	@Column(name="TO038")
	private String to038;

	@Column(name="TO039")
	private String to039;

	@Column(name="TO040")
	private String to040;

	@Column(name="TO041")
	private String to041;

	@Column(name="TO042")
	private String to042;

	@Column(name="TO043")
	private BigDecimal to043;

	@Column(name="TO044")
	private BigDecimal to044;

	@Column(name="TO045")
	private BigDecimal to045;

	@Column(name="TO046")
	private String to046;

	@Column(name="TO200")
	private BigDecimal to200;

	@Column(name="TO201")
	private BigDecimal to201;

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

	public Copto() {
	}

	public CoptoPK getId() {
		return this.id;
	}

	public void setId(CoptoPK id) {
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

	public String getTo004() {
		return this.to004;
	}

	public void setTo004(String to004) {
		this.to004 = to004;
	}

	public String getTo005() {
		return this.to005;
	}

	public void setTo005(String to005) {
		this.to005 = to005;
	}

	public String getTo006() {
		return this.to006;
	}

	public void setTo006(String to006) {
		this.to006 = to006;
	}

	public String getTo007() {
		return this.to007;
	}

	public void setTo007(String to007) {
		this.to007 = to007;
	}

	public String getTo008() {
		return this.to008;
	}

	public void setTo008(String to008) {
		this.to008 = to008;
	}

	public String getTo009() {
		return this.to009;
	}

	public void setTo009(String to009) {
		this.to009 = to009;
	}

	public String getTo010() {
		return this.to010;
	}

	public void setTo010(String to010) {
		this.to010 = to010;
	}

	public String getTo011() {
		return this.to011;
	}

	public void setTo011(String to011) {
		this.to011 = to011;
	}

	public BigDecimal getTo012() {
		return this.to012;
	}

	public void setTo012(BigDecimal to012) {
		this.to012 = to012;
	}

	public BigDecimal getTo013() {
		return this.to013;
	}

	public void setTo013(BigDecimal to013) {
		this.to013 = to013;
	}

	public String getTo014() {
		return this.to014;
	}

	public void setTo014(String to014) {
		this.to014 = to014;
	}

	public String getTo015() {
		return this.to015;
	}

	public void setTo015(String to015) {
		this.to015 = to015;
	}

	public String getTo016() {
		return this.to016;
	}

	public void setTo016(String to016) {
		this.to016 = to016;
	}

	public BigDecimal getTo017() {
		return this.to017;
	}

	public void setTo017(BigDecimal to017) {
		this.to017 = to017;
	}

	public String getTo018() {
		return this.to018;
	}

	public void setTo018(String to018) {
		this.to018 = to018;
	}

	public BigDecimal getTo019() {
		return this.to019;
	}

	public void setTo019(BigDecimal to019) {
		this.to019 = to019;
	}

	public BigDecimal getTo020() {
		return this.to020;
	}

	public void setTo020(BigDecimal to020) {
		this.to020 = to020;
	}

	public BigDecimal getTo021() {
		return this.to021;
	}

	public void setTo021(BigDecimal to021) {
		this.to021 = to021;
	}

	public String getTo022() {
		return this.to022;
	}

	public void setTo022(String to022) {
		this.to022 = to022;
	}

	public String getTo023() {
		return this.to023;
	}

	public void setTo023(String to023) {
		this.to023 = to023;
	}

	public BigDecimal getTo024() {
		return this.to024;
	}

	public void setTo024(BigDecimal to024) {
		this.to024 = to024;
	}

	public BigDecimal getTo025() {
		return this.to025;
	}

	public void setTo025(BigDecimal to025) {
		this.to025 = to025;
	}

	public String getTo026() {
		return this.to026;
	}

	public void setTo026(String to026) {
		this.to026 = to026;
	}

	public BigDecimal getTo027() {
		return this.to027;
	}

	public void setTo027(BigDecimal to027) {
		this.to027 = to027;
	}

	public BigDecimal getTo028() {
		return this.to028;
	}

	public void setTo028(BigDecimal to028) {
		this.to028 = to028;
	}

	public BigDecimal getTo029() {
		return this.to029;
	}

	public void setTo029(BigDecimal to029) {
		this.to029 = to029;
	}

	public BigDecimal getTo030() {
		return this.to030;
	}

	public void setTo030(BigDecimal to030) {
		this.to030 = to030;
	}

	public BigDecimal getTo031() {
		return this.to031;
	}

	public void setTo031(BigDecimal to031) {
		this.to031 = to031;
	}

	public String getTo032() {
		return this.to032;
	}

	public void setTo032(String to032) {
		this.to032 = to032;
	}

	public String getTo033() {
		return this.to033;
	}

	public void setTo033(String to033) {
		this.to033 = to033;
	}

	public BigDecimal getTo034() {
		return this.to034;
	}

	public void setTo034(BigDecimal to034) {
		this.to034 = to034;
	}

	public BigDecimal getTo035() {
		return this.to035;
	}

	public void setTo035(BigDecimal to035) {
		this.to035 = to035;
	}

	public BigDecimal getTo036() {
		return this.to036;
	}

	public void setTo036(BigDecimal to036) {
		this.to036 = to036;
	}

	public String getTo037() {
		return this.to037;
	}

	public void setTo037(String to037) {
		this.to037 = to037;
	}

	public String getTo038() {
		return this.to038;
	}

	public void setTo038(String to038) {
		this.to038 = to038;
	}

	public String getTo039() {
		return this.to039;
	}

	public void setTo039(String to039) {
		this.to039 = to039;
	}

	public String getTo040() {
		return this.to040;
	}

	public void setTo040(String to040) {
		this.to040 = to040;
	}

	public String getTo041() {
		return this.to041;
	}

	public void setTo041(String to041) {
		this.to041 = to041;
	}

	public String getTo042() {
		return this.to042;
	}

	public void setTo042(String to042) {
		this.to042 = to042;
	}

	public BigDecimal getTo043() {
		return this.to043;
	}

	public void setTo043(BigDecimal to043) {
		this.to043 = to043;
	}

	public BigDecimal getTo044() {
		return this.to044;
	}

	public void setTo044(BigDecimal to044) {
		this.to044 = to044;
	}

	public BigDecimal getTo045() {
		return this.to045;
	}

	public void setTo045(BigDecimal to045) {
		this.to045 = to045;
	}

	public String getTo046() {
		return this.to046;
	}

	public void setTo046(String to046) {
		this.to046 = to046;
	}

	public BigDecimal getTo200() {
		return this.to200;
	}

	public void setTo200(BigDecimal to200) {
		this.to200 = to200;
	}

	public BigDecimal getTo201() {
		return this.to201;
	}

	public void setTo201(BigDecimal to201) {
		this.to201 = to201;
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