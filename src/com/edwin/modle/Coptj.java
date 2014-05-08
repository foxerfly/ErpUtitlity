package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the COPTJ database table.
 * 
 */
@Entity
@Table(name="COPTJ")
@NamedQuery(name="Coptj.findAll", query="SELECT c FROM Coptj c")
public class Coptj implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CoptjPK id;

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

	@Column(name="TJ004")
	private String tj004;

	@Column(name="TJ005")
	private String tj005;

	@Column(name="TJ006")
	private String tj006;

	@Column(name="TJ007")
	private BigDecimal tj007;

	@Column(name="TJ008")
	private String tj008;

	@Column(name="TJ009")
	private BigDecimal tj009;

	@Column(name="TJ010")
	private String tj010;

	@Column(name="TJ011")
	private BigDecimal tj011;

	@Column(name="TJ012")
	private BigDecimal tj012;

	@Column(name="TJ013")
	private String tj013;

	@Column(name="TJ014")
	private String tj014;

	@Column(name="TJ015")
	private String tj015;

	@Column(name="TJ016")
	private String tj016;

	@Column(name="TJ017")
	private String tj017;

	@Column(name="TJ018")
	private String tj018;

	@Column(name="TJ019")
	private String tj019;

	@Column(name="TJ020")
	private String tj020;

	@Column(name="TJ021")
	private String tj021;

	@Column(name="TJ022")
	private String tj022;

	@Column(name="TJ023")
	private String tj023;

	@Column(name="TJ024")
	private String tj024;

	@Column(name="TJ025")
	private String tj025;

	@Column(name="TJ026")
	private String tj026;

	@Column(name="TJ027")
	private String tj027;

	@Column(name="TJ028")
	private String tj028;

	@Column(name="TJ029")
	private String tj029;

	@Column(name="TJ030")
	private String tj030;

	@Column(name="TJ031")
	private BigDecimal tj031;

	@Column(name="TJ032")
	private BigDecimal tj032;

	@Column(name="TJ033")
	private BigDecimal tj033;

	@Column(name="TJ034")
	private BigDecimal tj034;

	@Column(name="TJ035")
	private BigDecimal tj035;

	@Column(name="TJ036")
	private String tj036;

	@Column(name="TJ037")
	private BigDecimal tj037;

	@Column(name="TJ038")
	private String tj038;

	@Column(name="TJ039")
	private BigDecimal tj039;

	@Column(name="TJ040")
	private BigDecimal tj040;

	@Column(name="TJ041")
	private String tj041;

	@Column(name="TJ042")
	private BigDecimal tj042;

	@Column(name="TJ043")
	private BigDecimal tj043;

	@Column(name="TJ044")
	private String tj044;

	@Column(name="TJ045")
	private String tj045;

	@Column(name="TJ046")
	private String tj046;

	@Column(name="TJ047")
	private BigDecimal tj047;

	@Column(name="TJ048")
	private String tj048;

	@Column(name="TJ049")
	private String tj049;

	@Column(name="TJ050")
	private BigDecimal tj050;

	@Column(name="TJ051")
	private BigDecimal tj051;

	@Column(name="TJ052")
	private BigDecimal tj052;

	@Column(name="TJ053")
	private BigDecimal tj053;

	@Column(name="TJ054")
	private BigDecimal tj054;

	@Column(name="TJ055")
	private BigDecimal tj055;

	@Column(name="TJ056")
	private String tj056;

	@Column(name="TJ057")
	private String tj057;

	@Column(name="TJ058")
	private String tj058;

	@Column(name="TJ059")
	private String tj059;

	@Column(name="TJ060")
	private String tj060;

	@Column(name="TJ061")
	private String tj061;

	@Column(name="TJ062")
	private String tj062;

	@Column(name="TJ063")
	private String tj063;

	@Column(name="TJ064")
	private BigDecimal tj064;

	@Column(name="TJ065")
	private BigDecimal tj065;

	@Column(name="TJ066")
	private BigDecimal tj066;

	@Column(name="TJ067")
	private String tj067;

	@Column(name="TJ068")
	private BigDecimal tj068;

	@Column(name="TJ069")
	private BigDecimal tj069;

	@Column(name="TJ070")
	private BigDecimal tj070;

	@Column(name="TJ071")
	private BigDecimal tj071;

	@Column(name="TJ072")
	private BigDecimal tj072;

	@Column(name="TJ073")
	private BigDecimal tj073;

	@Column(name="TJ074")
	private BigDecimal tj074;

	@Column(name="TJ075")
	private BigDecimal tj075;

	@Column(name="TJ076")
	private BigDecimal tj076;

	@Column(name="TJ077")
	private BigDecimal tj077;

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

	public Coptj() {
	}

	public CoptjPK getId() {
		return this.id;
	}

	public void setId(CoptjPK id) {
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

	public String getTj004() {
		return this.tj004;
	}

	public void setTj004(String tj004) {
		this.tj004 = tj004;
	}

	public String getTj005() {
		return this.tj005;
	}

	public void setTj005(String tj005) {
		this.tj005 = tj005;
	}

	public String getTj006() {
		return this.tj006;
	}

	public void setTj006(String tj006) {
		this.tj006 = tj006;
	}

	public BigDecimal getTj007() {
		return this.tj007;
	}

	public void setTj007(BigDecimal tj007) {
		this.tj007 = tj007;
	}

	public String getTj008() {
		return this.tj008;
	}

	public void setTj008(String tj008) {
		this.tj008 = tj008;
	}

	public BigDecimal getTj009() {
		return this.tj009;
	}

	public void setTj009(BigDecimal tj009) {
		this.tj009 = tj009;
	}

	public String getTj010() {
		return this.tj010;
	}

	public void setTj010(String tj010) {
		this.tj010 = tj010;
	}

	public BigDecimal getTj011() {
		return this.tj011;
	}

	public void setTj011(BigDecimal tj011) {
		this.tj011 = tj011;
	}

	public BigDecimal getTj012() {
		return this.tj012;
	}

	public void setTj012(BigDecimal tj012) {
		this.tj012 = tj012;
	}

	public String getTj013() {
		return this.tj013;
	}

	public void setTj013(String tj013) {
		this.tj013 = tj013;
	}

	public String getTj014() {
		return this.tj014;
	}

	public void setTj014(String tj014) {
		this.tj014 = tj014;
	}

	public String getTj015() {
		return this.tj015;
	}

	public void setTj015(String tj015) {
		this.tj015 = tj015;
	}

	public String getTj016() {
		return this.tj016;
	}

	public void setTj016(String tj016) {
		this.tj016 = tj016;
	}

	public String getTj017() {
		return this.tj017;
	}

	public void setTj017(String tj017) {
		this.tj017 = tj017;
	}

	public String getTj018() {
		return this.tj018;
	}

	public void setTj018(String tj018) {
		this.tj018 = tj018;
	}

	public String getTj019() {
		return this.tj019;
	}

	public void setTj019(String tj019) {
		this.tj019 = tj019;
	}

	public String getTj020() {
		return this.tj020;
	}

	public void setTj020(String tj020) {
		this.tj020 = tj020;
	}

	public String getTj021() {
		return this.tj021;
	}

	public void setTj021(String tj021) {
		this.tj021 = tj021;
	}

	public String getTj022() {
		return this.tj022;
	}

	public void setTj022(String tj022) {
		this.tj022 = tj022;
	}

	public String getTj023() {
		return this.tj023;
	}

	public void setTj023(String tj023) {
		this.tj023 = tj023;
	}

	public String getTj024() {
		return this.tj024;
	}

	public void setTj024(String tj024) {
		this.tj024 = tj024;
	}

	public String getTj025() {
		return this.tj025;
	}

	public void setTj025(String tj025) {
		this.tj025 = tj025;
	}

	public String getTj026() {
		return this.tj026;
	}

	public void setTj026(String tj026) {
		this.tj026 = tj026;
	}

	public String getTj027() {
		return this.tj027;
	}

	public void setTj027(String tj027) {
		this.tj027 = tj027;
	}

	public String getTj028() {
		return this.tj028;
	}

	public void setTj028(String tj028) {
		this.tj028 = tj028;
	}

	public String getTj029() {
		return this.tj029;
	}

	public void setTj029(String tj029) {
		this.tj029 = tj029;
	}

	public String getTj030() {
		return this.tj030;
	}

	public void setTj030(String tj030) {
		this.tj030 = tj030;
	}

	public BigDecimal getTj031() {
		return this.tj031;
	}

	public void setTj031(BigDecimal tj031) {
		this.tj031 = tj031;
	}

	public BigDecimal getTj032() {
		return this.tj032;
	}

	public void setTj032(BigDecimal tj032) {
		this.tj032 = tj032;
	}

	public BigDecimal getTj033() {
		return this.tj033;
	}

	public void setTj033(BigDecimal tj033) {
		this.tj033 = tj033;
	}

	public BigDecimal getTj034() {
		return this.tj034;
	}

	public void setTj034(BigDecimal tj034) {
		this.tj034 = tj034;
	}

	public BigDecimal getTj035() {
		return this.tj035;
	}

	public void setTj035(BigDecimal tj035) {
		this.tj035 = tj035;
	}

	public String getTj036() {
		return this.tj036;
	}

	public void setTj036(String tj036) {
		this.tj036 = tj036;
	}

	public BigDecimal getTj037() {
		return this.tj037;
	}

	public void setTj037(BigDecimal tj037) {
		this.tj037 = tj037;
	}

	public String getTj038() {
		return this.tj038;
	}

	public void setTj038(String tj038) {
		this.tj038 = tj038;
	}

	public BigDecimal getTj039() {
		return this.tj039;
	}

	public void setTj039(BigDecimal tj039) {
		this.tj039 = tj039;
	}

	public BigDecimal getTj040() {
		return this.tj040;
	}

	public void setTj040(BigDecimal tj040) {
		this.tj040 = tj040;
	}

	public String getTj041() {
		return this.tj041;
	}

	public void setTj041(String tj041) {
		this.tj041 = tj041;
	}

	public BigDecimal getTj042() {
		return this.tj042;
	}

	public void setTj042(BigDecimal tj042) {
		this.tj042 = tj042;
	}

	public BigDecimal getTj043() {
		return this.tj043;
	}

	public void setTj043(BigDecimal tj043) {
		this.tj043 = tj043;
	}

	public String getTj044() {
		return this.tj044;
	}

	public void setTj044(String tj044) {
		this.tj044 = tj044;
	}

	public String getTj045() {
		return this.tj045;
	}

	public void setTj045(String tj045) {
		this.tj045 = tj045;
	}

	public String getTj046() {
		return this.tj046;
	}

	public void setTj046(String tj046) {
		this.tj046 = tj046;
	}

	public BigDecimal getTj047() {
		return this.tj047;
	}

	public void setTj047(BigDecimal tj047) {
		this.tj047 = tj047;
	}

	public String getTj048() {
		return this.tj048;
	}

	public void setTj048(String tj048) {
		this.tj048 = tj048;
	}

	public String getTj049() {
		return this.tj049;
	}

	public void setTj049(String tj049) {
		this.tj049 = tj049;
	}

	public BigDecimal getTj050() {
		return this.tj050;
	}

	public void setTj050(BigDecimal tj050) {
		this.tj050 = tj050;
	}

	public BigDecimal getTj051() {
		return this.tj051;
	}

	public void setTj051(BigDecimal tj051) {
		this.tj051 = tj051;
	}

	public BigDecimal getTj052() {
		return this.tj052;
	}

	public void setTj052(BigDecimal tj052) {
		this.tj052 = tj052;
	}

	public BigDecimal getTj053() {
		return this.tj053;
	}

	public void setTj053(BigDecimal tj053) {
		this.tj053 = tj053;
	}

	public BigDecimal getTj054() {
		return this.tj054;
	}

	public void setTj054(BigDecimal tj054) {
		this.tj054 = tj054;
	}

	public BigDecimal getTj055() {
		return this.tj055;
	}

	public void setTj055(BigDecimal tj055) {
		this.tj055 = tj055;
	}

	public String getTj056() {
		return this.tj056;
	}

	public void setTj056(String tj056) {
		this.tj056 = tj056;
	}

	public String getTj057() {
		return this.tj057;
	}

	public void setTj057(String tj057) {
		this.tj057 = tj057;
	}

	public String getTj058() {
		return this.tj058;
	}

	public void setTj058(String tj058) {
		this.tj058 = tj058;
	}

	public String getTj059() {
		return this.tj059;
	}

	public void setTj059(String tj059) {
		this.tj059 = tj059;
	}

	public String getTj060() {
		return this.tj060;
	}

	public void setTj060(String tj060) {
		this.tj060 = tj060;
	}

	public String getTj061() {
		return this.tj061;
	}

	public void setTj061(String tj061) {
		this.tj061 = tj061;
	}

	public String getTj062() {
		return this.tj062;
	}

	public void setTj062(String tj062) {
		this.tj062 = tj062;
	}

	public String getTj063() {
		return this.tj063;
	}

	public void setTj063(String tj063) {
		this.tj063 = tj063;
	}

	public BigDecimal getTj064() {
		return this.tj064;
	}

	public void setTj064(BigDecimal tj064) {
		this.tj064 = tj064;
	}

	public BigDecimal getTj065() {
		return this.tj065;
	}

	public void setTj065(BigDecimal tj065) {
		this.tj065 = tj065;
	}

	public BigDecimal getTj066() {
		return this.tj066;
	}

	public void setTj066(BigDecimal tj066) {
		this.tj066 = tj066;
	}

	public String getTj067() {
		return this.tj067;
	}

	public void setTj067(String tj067) {
		this.tj067 = tj067;
	}

	public BigDecimal getTj068() {
		return this.tj068;
	}

	public void setTj068(BigDecimal tj068) {
		this.tj068 = tj068;
	}

	public BigDecimal getTj069() {
		return this.tj069;
	}

	public void setTj069(BigDecimal tj069) {
		this.tj069 = tj069;
	}

	public BigDecimal getTj070() {
		return this.tj070;
	}

	public void setTj070(BigDecimal tj070) {
		this.tj070 = tj070;
	}

	public BigDecimal getTj071() {
		return this.tj071;
	}

	public void setTj071(BigDecimal tj071) {
		this.tj071 = tj071;
	}

	public BigDecimal getTj072() {
		return this.tj072;
	}

	public void setTj072(BigDecimal tj072) {
		this.tj072 = tj072;
	}

	public BigDecimal getTj073() {
		return this.tj073;
	}

	public void setTj073(BigDecimal tj073) {
		this.tj073 = tj073;
	}

	public BigDecimal getTj074() {
		return this.tj074;
	}

	public void setTj074(BigDecimal tj074) {
		this.tj074 = tj074;
	}

	public BigDecimal getTj075() {
		return this.tj075;
	}

	public void setTj075(BigDecimal tj075) {
		this.tj075 = tj075;
	}

	public BigDecimal getTj076() {
		return this.tj076;
	}

	public void setTj076(BigDecimal tj076) {
		this.tj076 = tj076;
	}

	public BigDecimal getTj077() {
		return this.tj077;
	}

	public void setTj077(BigDecimal tj077) {
		this.tj077 = tj077;
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