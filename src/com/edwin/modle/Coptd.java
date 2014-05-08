package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the COPTD database table.
 * 
 */
@Entity
@Table(name="COPTD")
@NamedQuery(name="Coptd.findAll", query="SELECT c FROM Coptd c")
public class Coptd implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CoptdPK id;

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

	@Column(name="TD004")
	private String td004;

	@Column(name="TD005")
	private String td005;

	@Column(name="TD006")
	private String td006;

	@Column(name="TD007")
	private String td007;

	@Column(name="TD008")
	private BigDecimal td008;

	@Column(name="TD009")
	private BigDecimal td009;

	@Column(name="TD010")
	private String td010;

	@Column(name="TD011")
	private BigDecimal td011;

	@Column(name="TD012")
	private BigDecimal td012;

	@Column(name="TD013")
	private String td013;

	@Column(name="TD014")
	private String td014;

	@Column(name="TD015")
	private String td015;

	@Column(name="TD016")
	private String td016;

	@Column(name="TD017")
	private String td017;

	@Column(name="TD018")
	private String td018;

	@Column(name="TD019")
	private String td019;

	@Column(name="TD020")
	private String td020;

	@Column(name="TD021")
	private String td021;

	@Column(name="TD022")
	private BigDecimal td022;

	@Column(name="TD023")
	private String td023;

	@Column(name="TD024")
	private BigDecimal td024;

	@Column(name="TD025")
	private BigDecimal td025;

	@Column(name="TD026")
	private BigDecimal td026;

	@Column(name="TD027")
	private String td027;

	@Column(name="TD028")
	private String td028;

	@Column(name="TD029")
	private String td029;

	@Column(name="TD030")
	private BigDecimal td030;

	@Column(name="TD031")
	private BigDecimal td031;

	@Column(name="TD032")
	private BigDecimal td032;

	@Column(name="TD033")
	private BigDecimal td033;

	@Column(name="TD034")
	private BigDecimal td034;

	@Column(name="TD035")
	private BigDecimal td035;

	@Column(name="TD036")
	private String td036;

	@Column(name="TD037")
	private BigDecimal td037;

	@Column(name="TD038")
	private BigDecimal td038;

	@Column(name="TD039")
	private BigDecimal td039;

	@Column(name="TD040")
	private BigDecimal td040;

	@Column(name="TD041")
	private BigDecimal td041;

	@Column(name="TD042")
	private BigDecimal td042;

	@Column(name="TD043")
	private BigDecimal td043;

	@Column(name="TD044")
	private BigDecimal td044;

	@Column(name="TD045")
	private BigDecimal td045;

	@Column(name="TD046")
	private String td046;

	@Column(name="TD047")
	private String td047;

	@Column(name="TD048")
	private String td048;

	@Column(name="TD049")
	private String td049;

	@Column(name="TD050")
	private BigDecimal td050;

	@Column(name="TD051")
	private BigDecimal td051;

	@Column(name="TD052")
	private BigDecimal td052;

	@Column(name="TD053")
	private String td053;

	@Column(name="TD054")
	private BigDecimal td054;

	@Column(name="TD055")
	private BigDecimal td055;

	@Column(name="TD056")
	private BigDecimal td056;

	@Column(name="TD057")
	private BigDecimal td057;

	@Column(name="TD058")
	private BigDecimal td058;

	@Column(name="TD059")
	private BigDecimal td059;

	@Column(name="TD060")
	private String td060;

	@Column(name="TD061")
	private String td061;

	@Column(name="TD062")
	private String td062;

	@Column(name="TD200")
	private BigDecimal td200;

	@Column(name="TD201")
	private BigDecimal td201;

	@Column(name="TD202")
	private BigDecimal td202;

	@Column(name="TDD01")
	private String tdd01;

	@Column(name="TDD02")
	private String tdd02;

	@Column(name="TDD03")
	private String tdd03;

	@Column(name="TDD04")
	private String tdd04;

	@Column(name="TDD05")
	private String tdd05;

	@Column(name="TDI01")
	private BigDecimal tdi01;

	@Column(name="TDI02")
	private BigDecimal tdi02;

	@Column(name="TDI03")
	private BigDecimal tdi03;

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

	public Coptd() {
	}

	public CoptdPK getId() {
		return this.id;
	}

	public void setId(CoptdPK id) {
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

	public String getTd004() {
		return this.td004;
	}

	public void setTd004(String td004) {
		this.td004 = td004;
	}

	public String getTd005() {
		return this.td005;
	}

	public void setTd005(String td005) {
		this.td005 = td005;
	}

	public String getTd006() {
		return this.td006;
	}

	public void setTd006(String td006) {
		this.td006 = td006;
	}

	public String getTd007() {
		return this.td007;
	}

	public void setTd007(String td007) {
		this.td007 = td007;
	}

	public BigDecimal getTd008() {
		return this.td008;
	}

	public void setTd008(BigDecimal td008) {
		this.td008 = td008;
	}

	public BigDecimal getTd009() {
		return this.td009;
	}

	public void setTd009(BigDecimal td009) {
		this.td009 = td009;
	}

	public String getTd010() {
		return this.td010;
	}

	public void setTd010(String td010) {
		this.td010 = td010;
	}

	public BigDecimal getTd011() {
		return this.td011;
	}

	public void setTd011(BigDecimal td011) {
		this.td011 = td011;
	}

	public BigDecimal getTd012() {
		return this.td012;
	}

	public void setTd012(BigDecimal td012) {
		this.td012 = td012;
	}

	public String getTd013() {
		return this.td013;
	}

	public void setTd013(String td013) {
		this.td013 = td013;
	}

	public String getTd014() {
		return this.td014;
	}

	public void setTd014(String td014) {
		this.td014 = td014;
	}

	public String getTd015() {
		return this.td015;
	}

	public void setTd015(String td015) {
		this.td015 = td015;
	}

	public String getTd016() {
		return this.td016;
	}

	public void setTd016(String td016) {
		this.td016 = td016;
	}

	public String getTd017() {
		return this.td017;
	}

	public void setTd017(String td017) {
		this.td017 = td017;
	}

	public String getTd018() {
		return this.td018;
	}

	public void setTd018(String td018) {
		this.td018 = td018;
	}

	public String getTd019() {
		return this.td019;
	}

	public void setTd019(String td019) {
		this.td019 = td019;
	}

	public String getTd020() {
		return this.td020;
	}

	public void setTd020(String td020) {
		this.td020 = td020;
	}

	public String getTd021() {
		return this.td021;
	}

	public void setTd021(String td021) {
		this.td021 = td021;
	}

	public BigDecimal getTd022() {
		return this.td022;
	}

	public void setTd022(BigDecimal td022) {
		this.td022 = td022;
	}

	public String getTd023() {
		return this.td023;
	}

	public void setTd023(String td023) {
		this.td023 = td023;
	}

	public BigDecimal getTd024() {
		return this.td024;
	}

	public void setTd024(BigDecimal td024) {
		this.td024 = td024;
	}

	public BigDecimal getTd025() {
		return this.td025;
	}

	public void setTd025(BigDecimal td025) {
		this.td025 = td025;
	}

	public BigDecimal getTd026() {
		return this.td026;
	}

	public void setTd026(BigDecimal td026) {
		this.td026 = td026;
	}

	public String getTd027() {
		return this.td027;
	}

	public void setTd027(String td027) {
		this.td027 = td027;
	}

	public String getTd028() {
		return this.td028;
	}

	public void setTd028(String td028) {
		this.td028 = td028;
	}

	public String getTd029() {
		return this.td029;
	}

	public void setTd029(String td029) {
		this.td029 = td029;
	}

	public BigDecimal getTd030() {
		return this.td030;
	}

	public void setTd030(BigDecimal td030) {
		this.td030 = td030;
	}

	public BigDecimal getTd031() {
		return this.td031;
	}

	public void setTd031(BigDecimal td031) {
		this.td031 = td031;
	}

	public BigDecimal getTd032() {
		return this.td032;
	}

	public void setTd032(BigDecimal td032) {
		this.td032 = td032;
	}

	public BigDecimal getTd033() {
		return this.td033;
	}

	public void setTd033(BigDecimal td033) {
		this.td033 = td033;
	}

	public BigDecimal getTd034() {
		return this.td034;
	}

	public void setTd034(BigDecimal td034) {
		this.td034 = td034;
	}

	public BigDecimal getTd035() {
		return this.td035;
	}

	public void setTd035(BigDecimal td035) {
		this.td035 = td035;
	}

	public String getTd036() {
		return this.td036;
	}

	public void setTd036(String td036) {
		this.td036 = td036;
	}

	public BigDecimal getTd037() {
		return this.td037;
	}

	public void setTd037(BigDecimal td037) {
		this.td037 = td037;
	}

	public BigDecimal getTd038() {
		return this.td038;
	}

	public void setTd038(BigDecimal td038) {
		this.td038 = td038;
	}

	public BigDecimal getTd039() {
		return this.td039;
	}

	public void setTd039(BigDecimal td039) {
		this.td039 = td039;
	}

	public BigDecimal getTd040() {
		return this.td040;
	}

	public void setTd040(BigDecimal td040) {
		this.td040 = td040;
	}

	public BigDecimal getTd041() {
		return this.td041;
	}

	public void setTd041(BigDecimal td041) {
		this.td041 = td041;
	}

	public BigDecimal getTd042() {
		return this.td042;
	}

	public void setTd042(BigDecimal td042) {
		this.td042 = td042;
	}

	public BigDecimal getTd043() {
		return this.td043;
	}

	public void setTd043(BigDecimal td043) {
		this.td043 = td043;
	}

	public BigDecimal getTd044() {
		return this.td044;
	}

	public void setTd044(BigDecimal td044) {
		this.td044 = td044;
	}

	public BigDecimal getTd045() {
		return this.td045;
	}

	public void setTd045(BigDecimal td045) {
		this.td045 = td045;
	}

	public String getTd046() {
		return this.td046;
	}

	public void setTd046(String td046) {
		this.td046 = td046;
	}

	public String getTd047() {
		return this.td047;
	}

	public void setTd047(String td047) {
		this.td047 = td047;
	}

	public String getTd048() {
		return this.td048;
	}

	public void setTd048(String td048) {
		this.td048 = td048;
	}

	public String getTd049() {
		return this.td049;
	}

	public void setTd049(String td049) {
		this.td049 = td049;
	}

	public BigDecimal getTd050() {
		return this.td050;
	}

	public void setTd050(BigDecimal td050) {
		this.td050 = td050;
	}

	public BigDecimal getTd051() {
		return this.td051;
	}

	public void setTd051(BigDecimal td051) {
		this.td051 = td051;
	}

	public BigDecimal getTd052() {
		return this.td052;
	}

	public void setTd052(BigDecimal td052) {
		this.td052 = td052;
	}

	public String getTd053() {
		return this.td053;
	}

	public void setTd053(String td053) {
		this.td053 = td053;
	}

	public BigDecimal getTd054() {
		return this.td054;
	}

	public void setTd054(BigDecimal td054) {
		this.td054 = td054;
	}

	public BigDecimal getTd055() {
		return this.td055;
	}

	public void setTd055(BigDecimal td055) {
		this.td055 = td055;
	}

	public BigDecimal getTd056() {
		return this.td056;
	}

	public void setTd056(BigDecimal td056) {
		this.td056 = td056;
	}

	public BigDecimal getTd057() {
		return this.td057;
	}

	public void setTd057(BigDecimal td057) {
		this.td057 = td057;
	}

	public BigDecimal getTd058() {
		return this.td058;
	}

	public void setTd058(BigDecimal td058) {
		this.td058 = td058;
	}

	public BigDecimal getTd059() {
		return this.td059;
	}

	public void setTd059(BigDecimal td059) {
		this.td059 = td059;
	}

	public String getTd060() {
		return this.td060;
	}

	public void setTd060(String td060) {
		this.td060 = td060;
	}

	public String getTd061() {
		return this.td061;
	}

	public void setTd061(String td061) {
		this.td061 = td061;
	}

	public String getTd062() {
		return this.td062;
	}

	public void setTd062(String td062) {
		this.td062 = td062;
	}

	public BigDecimal getTd200() {
		return this.td200;
	}

	public void setTd200(BigDecimal td200) {
		this.td200 = td200;
	}

	public BigDecimal getTd201() {
		return this.td201;
	}

	public void setTd201(BigDecimal td201) {
		this.td201 = td201;
	}

	public BigDecimal getTd202() {
		return this.td202;
	}

	public void setTd202(BigDecimal td202) {
		this.td202 = td202;
	}

	public String getTdd01() {
		return this.tdd01;
	}

	public void setTdd01(String tdd01) {
		this.tdd01 = tdd01;
	}

	public String getTdd02() {
		return this.tdd02;
	}

	public void setTdd02(String tdd02) {
		this.tdd02 = tdd02;
	}

	public String getTdd03() {
		return this.tdd03;
	}

	public void setTdd03(String tdd03) {
		this.tdd03 = tdd03;
	}

	public String getTdd04() {
		return this.tdd04;
	}

	public void setTdd04(String tdd04) {
		this.tdd04 = tdd04;
	}

	public String getTdd05() {
		return this.tdd05;
	}

	public void setTdd05(String tdd05) {
		this.tdd05 = tdd05;
	}

	public BigDecimal getTdi01() {
		return this.tdi01;
	}

	public void setTdi01(BigDecimal tdi01) {
		this.tdi01 = tdi01;
	}

	public BigDecimal getTdi02() {
		return this.tdi02;
	}

	public void setTdi02(BigDecimal tdi02) {
		this.tdi02 = tdi02;
	}

	public BigDecimal getTdi03() {
		return this.tdi03;
	}

	public void setTdi03(BigDecimal tdi03) {
		this.tdi03 = tdi03;
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