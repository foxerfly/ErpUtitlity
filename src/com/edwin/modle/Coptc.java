package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the COPTC database table.
 * 
 */
@Entity
@Table(name="COPTC")
@NamedQuery(name="Coptc.findAll", query="SELECT c FROM Coptc c")
public class Coptc implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CoptcPK id;

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

	@Column(name="TC003")
	private String tc003;

	@Column(name="TC004")
	private String tc004;

	@Column(name="TC005")
	private String tc005;

	@Column(name="TC006")
	private String tc006;

	@Column(name="TC007")
	private String tc007;

	@Column(name="TC008")
	private String tc008;

	@Column(name="TC009")
	private BigDecimal tc009;

	@Column(name="TC010")
	private String tc010;

	@Column(name="TC011")
	private String tc011;

	@Column(name="TC012")
	private String tc012;

	@Column(name="TC013")
	private String tc013;

	@Column(name="TC014")
	private String tc014;

	@Column(name="TC015")
	private String tc015;

	@Column(name="TC016")
	private String tc016;

	@Column(name="TC017")
	private String tc017;

	@Column(name="TC018")
	private String tc018;

	@Column(name="TC019")
	private String tc019;

	@Column(name="TC020")
	private String tc020;

	@Column(name="TC021")
	private String tc021;

	@Column(name="TC022")
	private String tc022;

	@Column(name="TC023")
	private String tc023;

	@Column(name="TC024")
	private String tc024;

	@Column(name="TC025")
	private String tc025;

	@Column(name="TC026")
	private BigDecimal tc026;

	@Column(name="TC027")
	private String tc027;

	@Column(name="TC028")
	private BigDecimal tc028;

	@Column(name="TC029")
	private BigDecimal tc029;

	@Column(name="TC030")
	private BigDecimal tc030;

	@Column(name="TC031")
	private BigDecimal tc031;

	@Column(name="TC032")
	private String tc032;

	@Column(name="TC033")
	private String tc033;

	@Column(name="TC034")
	private String tc034;

	@Column(name="TC035")
	private String tc035;

	@Column(name="TC036")
	private String tc036;

	@Column(name="TC037")
	private String tc037;

	@Column(name="TC038")
	private String tc038;

	@Column(name="TC039")
	private String tc039;

	@Column(name="TC040")
	private String tc040;

	@Column(name="TC041")
	private BigDecimal tc041;

	@Column(name="TC042")
	private String tc042;

	@Column(name="TC043")
	private BigDecimal tc043;

	@Column(name="TC044")
	private BigDecimal tc044;

	@Column(name="TC045")
	private BigDecimal tc045;

	@Column(name="TC046")
	private BigDecimal tc046;

	@Column(name="TC047")
	private String tc047;

	@Column(name="TC048")
	private String tc048;

	@Column(name="TC049")
	private String tc049;

	@Column(name="TC050")
	private String tc050;

	@Column(name="TC051")
	private String tc051;

	@Column(name="TC052")
	private String tc052;

	@Column(name="TC053")
	private String tc053;

	@Column(name="TC054")
	private String tc054;

	@Column(name="TC055")
	private String tc055;

	@Column(name="TC056")
	private String tc056;

	@Column(name="TC057")
	private String tc057;

	@Column(name="TC058")
	private BigDecimal tc058;

	@Column(name="TC059")
	private String tc059;

	@Column(name="TC060")
	private String tc060;

	@Column(name="TC061")
	private String tc061;

	@Column(name="TC062")
	private BigDecimal tc062;

	@Column(name="TC063")
	private BigDecimal tc063;

	@Column(name="TC064")
	private BigDecimal tc064;

	@Column(name="TC065")
	private String tc065;

	@Column(name="TC066")
	private String tc066;

	@Column(name="TC067")
	private String tc067;

	@Column(name="TC068")
	private BigDecimal tc068;

	@Column(name="TC069")
	private BigDecimal tc069;

	@Column(name="TC070")
	private String tc070;

	@Column(name="TC071")
	private String tc071;

	@Column(name="TC072")
	private String tc072;

	@Column(name="TC073")
	private String tc073;

	@Column(name="TC074")
	private String tc074;

	@Column(name="TC075")
	private String tc075;

	@Column(name="TC076")
	private String tc076;

	@Column(name="TC077")
	private String tc077;

	@Column(name="TCI01")
	private String tci01;

	@Column(name="TCI02")
	private String tci02;

	@Column(name="TCI03")
	private BigDecimal tci03;

	@Column(name="TCI04")
	private BigDecimal tci04;

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

	public Coptc() {
	}

	public CoptcPK getId() {
		return this.id;
	}

	public void setId(CoptcPK id) {
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

	public String getTc003() {
		return this.tc003;
	}

	public void setTc003(String tc003) {
		this.tc003 = tc003;
	}

	public String getTc004() {
		return this.tc004;
	}

	public void setTc004(String tc004) {
		this.tc004 = tc004;
	}

	public String getTc005() {
		return this.tc005;
	}

	public void setTc005(String tc005) {
		this.tc005 = tc005;
	}

	public String getTc006() {
		return this.tc006;
	}

	public void setTc006(String tc006) {
		this.tc006 = tc006;
	}

	public String getTc007() {
		return this.tc007;
	}

	public void setTc007(String tc007) {
		this.tc007 = tc007;
	}

	public String getTc008() {
		return this.tc008;
	}

	public void setTc008(String tc008) {
		this.tc008 = tc008;
	}

	public BigDecimal getTc009() {
		return this.tc009;
	}

	public void setTc009(BigDecimal tc009) {
		this.tc009 = tc009;
	}

	public String getTc010() {
		return this.tc010;
	}

	public void setTc010(String tc010) {
		this.tc010 = tc010;
	}

	public String getTc011() {
		return this.tc011;
	}

	public void setTc011(String tc011) {
		this.tc011 = tc011;
	}

	public String getTc012() {
		return this.tc012;
	}

	public void setTc012(String tc012) {
		this.tc012 = tc012;
	}

	public String getTc013() {
		return this.tc013;
	}

	public void setTc013(String tc013) {
		this.tc013 = tc013;
	}

	public String getTc014() {
		return this.tc014;
	}

	public void setTc014(String tc014) {
		this.tc014 = tc014;
	}

	public String getTc015() {
		return this.tc015;
	}

	public void setTc015(String tc015) {
		this.tc015 = tc015;
	}

	public String getTc016() {
		return this.tc016;
	}

	public void setTc016(String tc016) {
		this.tc016 = tc016;
	}

	public String getTc017() {
		return this.tc017;
	}

	public void setTc017(String tc017) {
		this.tc017 = tc017;
	}

	public String getTc018() {
		return this.tc018;
	}

	public void setTc018(String tc018) {
		this.tc018 = tc018;
	}

	public String getTc019() {
		return this.tc019;
	}

	public void setTc019(String tc019) {
		this.tc019 = tc019;
	}

	public String getTc020() {
		return this.tc020;
	}

	public void setTc020(String tc020) {
		this.tc020 = tc020;
	}

	public String getTc021() {
		return this.tc021;
	}

	public void setTc021(String tc021) {
		this.tc021 = tc021;
	}

	public String getTc022() {
		return this.tc022;
	}

	public void setTc022(String tc022) {
		this.tc022 = tc022;
	}

	public String getTc023() {
		return this.tc023;
	}

	public void setTc023(String tc023) {
		this.tc023 = tc023;
	}

	public String getTc024() {
		return this.tc024;
	}

	public void setTc024(String tc024) {
		this.tc024 = tc024;
	}

	public String getTc025() {
		return this.tc025;
	}

	public void setTc025(String tc025) {
		this.tc025 = tc025;
	}

	public BigDecimal getTc026() {
		return this.tc026;
	}

	public void setTc026(BigDecimal tc026) {
		this.tc026 = tc026;
	}

	public String getTc027() {
		return this.tc027;
	}

	public void setTc027(String tc027) {
		this.tc027 = tc027;
	}

	public BigDecimal getTc028() {
		return this.tc028;
	}

	public void setTc028(BigDecimal tc028) {
		this.tc028 = tc028;
	}

	public BigDecimal getTc029() {
		return this.tc029;
	}

	public void setTc029(BigDecimal tc029) {
		this.tc029 = tc029;
	}

	public BigDecimal getTc030() {
		return this.tc030;
	}

	public void setTc030(BigDecimal tc030) {
		this.tc030 = tc030;
	}

	public BigDecimal getTc031() {
		return this.tc031;
	}

	public void setTc031(BigDecimal tc031) {
		this.tc031 = tc031;
	}

	public String getTc032() {
		return this.tc032;
	}

	public void setTc032(String tc032) {
		this.tc032 = tc032;
	}

	public String getTc033() {
		return this.tc033;
	}

	public void setTc033(String tc033) {
		this.tc033 = tc033;
	}

	public String getTc034() {
		return this.tc034;
	}

	public void setTc034(String tc034) {
		this.tc034 = tc034;
	}

	public String getTc035() {
		return this.tc035;
	}

	public void setTc035(String tc035) {
		this.tc035 = tc035;
	}

	public String getTc036() {
		return this.tc036;
	}

	public void setTc036(String tc036) {
		this.tc036 = tc036;
	}

	public String getTc037() {
		return this.tc037;
	}

	public void setTc037(String tc037) {
		this.tc037 = tc037;
	}

	public String getTc038() {
		return this.tc038;
	}

	public void setTc038(String tc038) {
		this.tc038 = tc038;
	}

	public String getTc039() {
		return this.tc039;
	}

	public void setTc039(String tc039) {
		this.tc039 = tc039;
	}

	public String getTc040() {
		return this.tc040;
	}

	public void setTc040(String tc040) {
		this.tc040 = tc040;
	}

	public BigDecimal getTc041() {
		return this.tc041;
	}

	public void setTc041(BigDecimal tc041) {
		this.tc041 = tc041;
	}

	public String getTc042() {
		return this.tc042;
	}

	public void setTc042(String tc042) {
		this.tc042 = tc042;
	}

	public BigDecimal getTc043() {
		return this.tc043;
	}

	public void setTc043(BigDecimal tc043) {
		this.tc043 = tc043;
	}

	public BigDecimal getTc044() {
		return this.tc044;
	}

	public void setTc044(BigDecimal tc044) {
		this.tc044 = tc044;
	}

	public BigDecimal getTc045() {
		return this.tc045;
	}

	public void setTc045(BigDecimal tc045) {
		this.tc045 = tc045;
	}

	public BigDecimal getTc046() {
		return this.tc046;
	}

	public void setTc046(BigDecimal tc046) {
		this.tc046 = tc046;
	}

	public String getTc047() {
		return this.tc047;
	}

	public void setTc047(String tc047) {
		this.tc047 = tc047;
	}

	public String getTc048() {
		return this.tc048;
	}

	public void setTc048(String tc048) {
		this.tc048 = tc048;
	}

	public String getTc049() {
		return this.tc049;
	}

	public void setTc049(String tc049) {
		this.tc049 = tc049;
	}

	public String getTc050() {
		return this.tc050;
	}

	public void setTc050(String tc050) {
		this.tc050 = tc050;
	}

	public String getTc051() {
		return this.tc051;
	}

	public void setTc051(String tc051) {
		this.tc051 = tc051;
	}

	public String getTc052() {
		return this.tc052;
	}

	public void setTc052(String tc052) {
		this.tc052 = tc052;
	}

	public String getTc053() {
		return this.tc053;
	}

	public void setTc053(String tc053) {
		this.tc053 = tc053;
	}

	public String getTc054() {
		return this.tc054;
	}

	public void setTc054(String tc054) {
		this.tc054 = tc054;
	}

	public String getTc055() {
		return this.tc055;
	}

	public void setTc055(String tc055) {
		this.tc055 = tc055;
	}

	public String getTc056() {
		return this.tc056;
	}

	public void setTc056(String tc056) {
		this.tc056 = tc056;
	}

	public String getTc057() {
		return this.tc057;
	}

	public void setTc057(String tc057) {
		this.tc057 = tc057;
	}

	public BigDecimal getTc058() {
		return this.tc058;
	}

	public void setTc058(BigDecimal tc058) {
		this.tc058 = tc058;
	}

	public String getTc059() {
		return this.tc059;
	}

	public void setTc059(String tc059) {
		this.tc059 = tc059;
	}

	public String getTc060() {
		return this.tc060;
	}

	public void setTc060(String tc060) {
		this.tc060 = tc060;
	}

	public String getTc061() {
		return this.tc061;
	}

	public void setTc061(String tc061) {
		this.tc061 = tc061;
	}

	public BigDecimal getTc062() {
		return this.tc062;
	}

	public void setTc062(BigDecimal tc062) {
		this.tc062 = tc062;
	}

	public BigDecimal getTc063() {
		return this.tc063;
	}

	public void setTc063(BigDecimal tc063) {
		this.tc063 = tc063;
	}

	public BigDecimal getTc064() {
		return this.tc064;
	}

	public void setTc064(BigDecimal tc064) {
		this.tc064 = tc064;
	}

	public String getTc065() {
		return this.tc065;
	}

	public void setTc065(String tc065) {
		this.tc065 = tc065;
	}

	public String getTc066() {
		return this.tc066;
	}

	public void setTc066(String tc066) {
		this.tc066 = tc066;
	}

	public String getTc067() {
		return this.tc067;
	}

	public void setTc067(String tc067) {
		this.tc067 = tc067;
	}

	public BigDecimal getTc068() {
		return this.tc068;
	}

	public void setTc068(BigDecimal tc068) {
		this.tc068 = tc068;
	}

	public BigDecimal getTc069() {
		return this.tc069;
	}

	public void setTc069(BigDecimal tc069) {
		this.tc069 = tc069;
	}

	public String getTc070() {
		return this.tc070;
	}

	public void setTc070(String tc070) {
		this.tc070 = tc070;
	}

	public String getTc071() {
		return this.tc071;
	}

	public void setTc071(String tc071) {
		this.tc071 = tc071;
	}

	public String getTc072() {
		return this.tc072;
	}

	public void setTc072(String tc072) {
		this.tc072 = tc072;
	}

	public String getTc073() {
		return this.tc073;
	}

	public void setTc073(String tc073) {
		this.tc073 = tc073;
	}

	public String getTc074() {
		return this.tc074;
	}

	public void setTc074(String tc074) {
		this.tc074 = tc074;
	}

	public String getTc075() {
		return this.tc075;
	}

	public void setTc075(String tc075) {
		this.tc075 = tc075;
	}

	public String getTc076() {
		return this.tc076;
	}

	public void setTc076(String tc076) {
		this.tc076 = tc076;
	}

	public String getTc077() {
		return this.tc077;
	}

	public void setTc077(String tc077) {
		this.tc077 = tc077;
	}

	public String getTci01() {
		return this.tci01;
	}

	public void setTci01(String tci01) {
		this.tci01 = tci01;
	}

	public String getTci02() {
		return this.tci02;
	}

	public void setTci02(String tci02) {
		this.tci02 = tci02;
	}

	public BigDecimal getTci03() {
		return this.tci03;
	}

	public void setTci03(BigDecimal tci03) {
		this.tci03 = tci03;
	}

	public BigDecimal getTci04() {
		return this.tci04;
	}

	public void setTci04(BigDecimal tci04) {
		this.tci04 = tci04;
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