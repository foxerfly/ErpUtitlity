package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the COPTH database table.
 * 
 */
@Entity
@Table(name="COPTH")
@NamedQuery(name="Copth.findAll", query="SELECT c FROM Copth c")
public class Copth implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CopthPK id;

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

	@Column(name="TH004")
	private String th004;

	@Column(name="TH005")
	private String th005;

	@Column(name="TH006")
	private String th006;

	@Column(name="TH007")
	private String th007;

	@Column(name="TH008")
	private BigDecimal th008;

	@Column(name="TH009")
	private String th009;

	@Column(name="TH010")
	private BigDecimal th010;

	@Column(name="TH011")
	private String th011;

	@Column(name="TH012")
	private BigDecimal th012;

	@Column(name="TH013")
	private BigDecimal th013;

	@Column(name="TH014")
	private String th014;

	@Column(name="TH015")
	private String th015;

	@Column(name="TH016")
	private String th016;

	@Column(name="TH017")
	private String th017;

	@Column(name="TH018")
	private String th018;

	@Column(name="TH019")
	private String th019;

	@Column(name="TH020")
	private String th020;

	@Column(name="TH021")
	private String th021;

	@Column(name="TH022")
	private String th022;

	@Column(name="TH023")
	private String th023;

	@Column(name="TH024")
	private BigDecimal th024;

	@Column(name="TH025")
	private BigDecimal th025;

	@Column(name="TH026")
	private String th026;

	@Column(name="TH027")
	private String th027;

	@Column(name="TH028")
	private String th028;

	@Column(name="TH029")
	private String th029;

	@Column(name="TH030")
	private String th030;

	@Column(name="TH031")
	private String th031;

	@Column(name="TH032")
	private String th032;

	@Column(name="TH033")
	private String th033;

	@Column(name="TH034")
	private String th034;

	@Column(name="TH035")
	private BigDecimal th035;

	@Column(name="TH036")
	private BigDecimal th036;

	@Column(name="TH037")
	private BigDecimal th037;

	@Column(name="TH038")
	private BigDecimal th038;

	@Column(name="TH039")
	private BigDecimal th039;

	@Column(name="TH040")
	private BigDecimal th040;

	@Column(name="TH041")
	private String th041;

	@Column(name="TH042")
	private BigDecimal th042;

	@Column(name="TH043")
	private BigDecimal th043;

	@Column(name="TH044")
	private BigDecimal th044;

	@Column(name="TH045")
	private String th045;

	@Column(name="TH046")
	private String th046;

	@Column(name="TH047")
	private String th047;

	@Column(name="TH048")
	private BigDecimal th048;

	@Column(name="TH049")
	private BigDecimal th049;

	@Column(name="TH050")
	private BigDecimal th050;

	@Column(name="TH051")
	private String th051;

	@Column(name="TH052")
	private String th052;

	@Column(name="TH053")
	private String th053;

	@Column(name="TH054")
	private String th054;

	@Column(name="TH055")
	private String th055;

	@Column(name="TH056")
	private String th056;

	@Column(name="TH057")
	private String th057;

	@Column(name="TH058")
	private String th058;

	@Column(name="TH059")
	private String th059;

	@Column(name="TH060")
	private BigDecimal th060;

	@Column(name="TH061")
	private BigDecimal th061;

	@Column(name="TH062")
	private BigDecimal th062;

	@Column(name="TH063")
	private String th063;

	@Column(name="TH064")
	private String th064;

	@Column(name="TH065")
	private String th065;

	@Column(name="TH066")
	private String th066;

	@Column(name="THD01")
	private BigDecimal thd01;

	@Column(name="THH01")
	private String thh01;

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

	public Copth() {
	}

	public CopthPK getId() {
		return this.id;
	}

	public void setId(CopthPK id) {
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

	public String getTh004() {
		return this.th004;
	}

	public void setTh004(String th004) {
		this.th004 = th004;
	}

	public String getTh005() {
		return this.th005;
	}

	public void setTh005(String th005) {
		this.th005 = th005;
	}

	public String getTh006() {
		return this.th006;
	}

	public void setTh006(String th006) {
		this.th006 = th006;
	}

	public String getTh007() {
		return this.th007;
	}

	public void setTh007(String th007) {
		this.th007 = th007;
	}

	public BigDecimal getTh008() {
		return this.th008;
	}

	public void setTh008(BigDecimal th008) {
		this.th008 = th008;
	}

	public String getTh009() {
		return this.th009;
	}

	public void setTh009(String th009) {
		this.th009 = th009;
	}

	public BigDecimal getTh010() {
		return this.th010;
	}

	public void setTh010(BigDecimal th010) {
		this.th010 = th010;
	}

	public String getTh011() {
		return this.th011;
	}

	public void setTh011(String th011) {
		this.th011 = th011;
	}

	public BigDecimal getTh012() {
		return this.th012;
	}

	public void setTh012(BigDecimal th012) {
		this.th012 = th012;
	}

	public BigDecimal getTh013() {
		return this.th013;
	}

	public void setTh013(BigDecimal th013) {
		this.th013 = th013;
	}

	public String getTh014() {
		return this.th014;
	}

	public void setTh014(String th014) {
		this.th014 = th014;
	}

	public String getTh015() {
		return this.th015;
	}

	public void setTh015(String th015) {
		this.th015 = th015;
	}

	public String getTh016() {
		return this.th016;
	}

	public void setTh016(String th016) {
		this.th016 = th016;
	}

	public String getTh017() {
		return this.th017;
	}

	public void setTh017(String th017) {
		this.th017 = th017;
	}

	public String getTh018() {
		return this.th018;
	}

	public void setTh018(String th018) {
		this.th018 = th018;
	}

	public String getTh019() {
		return this.th019;
	}

	public void setTh019(String th019) {
		this.th019 = th019;
	}

	public String getTh020() {
		return this.th020;
	}

	public void setTh020(String th020) {
		this.th020 = th020;
	}

	public String getTh021() {
		return this.th021;
	}

	public void setTh021(String th021) {
		this.th021 = th021;
	}

	public String getTh022() {
		return this.th022;
	}

	public void setTh022(String th022) {
		this.th022 = th022;
	}

	public String getTh023() {
		return this.th023;
	}

	public void setTh023(String th023) {
		this.th023 = th023;
	}

	public BigDecimal getTh024() {
		return this.th024;
	}

	public void setTh024(BigDecimal th024) {
		this.th024 = th024;
	}

	public BigDecimal getTh025() {
		return this.th025;
	}

	public void setTh025(BigDecimal th025) {
		this.th025 = th025;
	}

	public String getTh026() {
		return this.th026;
	}

	public void setTh026(String th026) {
		this.th026 = th026;
	}

	public String getTh027() {
		return this.th027;
	}

	public void setTh027(String th027) {
		this.th027 = th027;
	}

	public String getTh028() {
		return this.th028;
	}

	public void setTh028(String th028) {
		this.th028 = th028;
	}

	public String getTh029() {
		return this.th029;
	}

	public void setTh029(String th029) {
		this.th029 = th029;
	}

	public String getTh030() {
		return this.th030;
	}

	public void setTh030(String th030) {
		this.th030 = th030;
	}

	public String getTh031() {
		return this.th031;
	}

	public void setTh031(String th031) {
		this.th031 = th031;
	}

	public String getTh032() {
		return this.th032;
	}

	public void setTh032(String th032) {
		this.th032 = th032;
	}

	public String getTh033() {
		return this.th033;
	}

	public void setTh033(String th033) {
		this.th033 = th033;
	}

	public String getTh034() {
		return this.th034;
	}

	public void setTh034(String th034) {
		this.th034 = th034;
	}

	public BigDecimal getTh035() {
		return this.th035;
	}

	public void setTh035(BigDecimal th035) {
		this.th035 = th035;
	}

	public BigDecimal getTh036() {
		return this.th036;
	}

	public void setTh036(BigDecimal th036) {
		this.th036 = th036;
	}

	public BigDecimal getTh037() {
		return this.th037;
	}

	public void setTh037(BigDecimal th037) {
		this.th037 = th037;
	}

	public BigDecimal getTh038() {
		return this.th038;
	}

	public void setTh038(BigDecimal th038) {
		this.th038 = th038;
	}

	public BigDecimal getTh039() {
		return this.th039;
	}

	public void setTh039(BigDecimal th039) {
		this.th039 = th039;
	}

	public BigDecimal getTh040() {
		return this.th040;
	}

	public void setTh040(BigDecimal th040) {
		this.th040 = th040;
	}

	public String getTh041() {
		return this.th041;
	}

	public void setTh041(String th041) {
		this.th041 = th041;
	}

	public BigDecimal getTh042() {
		return this.th042;
	}

	public void setTh042(BigDecimal th042) {
		this.th042 = th042;
	}

	public BigDecimal getTh043() {
		return this.th043;
	}

	public void setTh043(BigDecimal th043) {
		this.th043 = th043;
	}

	public BigDecimal getTh044() {
		return this.th044;
	}

	public void setTh044(BigDecimal th044) {
		this.th044 = th044;
	}

	public String getTh045() {
		return this.th045;
	}

	public void setTh045(String th045) {
		this.th045 = th045;
	}

	public String getTh046() {
		return this.th046;
	}

	public void setTh046(String th046) {
		this.th046 = th046;
	}

	public String getTh047() {
		return this.th047;
	}

	public void setTh047(String th047) {
		this.th047 = th047;
	}

	public BigDecimal getTh048() {
		return this.th048;
	}

	public void setTh048(BigDecimal th048) {
		this.th048 = th048;
	}

	public BigDecimal getTh049() {
		return this.th049;
	}

	public void setTh049(BigDecimal th049) {
		this.th049 = th049;
	}

	public BigDecimal getTh050() {
		return this.th050;
	}

	public void setTh050(BigDecimal th050) {
		this.th050 = th050;
	}

	public String getTh051() {
		return this.th051;
	}

	public void setTh051(String th051) {
		this.th051 = th051;
	}

	public String getTh052() {
		return this.th052;
	}

	public void setTh052(String th052) {
		this.th052 = th052;
	}

	public String getTh053() {
		return this.th053;
	}

	public void setTh053(String th053) {
		this.th053 = th053;
	}

	public String getTh054() {
		return this.th054;
	}

	public void setTh054(String th054) {
		this.th054 = th054;
	}

	public String getTh055() {
		return this.th055;
	}

	public void setTh055(String th055) {
		this.th055 = th055;
	}

	public String getTh056() {
		return this.th056;
	}

	public void setTh056(String th056) {
		this.th056 = th056;
	}

	public String getTh057() {
		return this.th057;
	}

	public void setTh057(String th057) {
		this.th057 = th057;
	}

	public String getTh058() {
		return this.th058;
	}

	public void setTh058(String th058) {
		this.th058 = th058;
	}

	public String getTh059() {
		return this.th059;
	}

	public void setTh059(String th059) {
		this.th059 = th059;
	}

	public BigDecimal getTh060() {
		return this.th060;
	}

	public void setTh060(BigDecimal th060) {
		this.th060 = th060;
	}

	public BigDecimal getTh061() {
		return this.th061;
	}

	public void setTh061(BigDecimal th061) {
		this.th061 = th061;
	}

	public BigDecimal getTh062() {
		return this.th062;
	}

	public void setTh062(BigDecimal th062) {
		this.th062 = th062;
	}

	public String getTh063() {
		return this.th063;
	}

	public void setTh063(String th063) {
		this.th063 = th063;
	}

	public String getTh064() {
		return this.th064;
	}

	public void setTh064(String th064) {
		this.th064 = th064;
	}

	public String getTh065() {
		return this.th065;
	}

	public void setTh065(String th065) {
		this.th065 = th065;
	}

	public String getTh066() {
		return this.th066;
	}

	public void setTh066(String th066) {
		this.th066 = th066;
	}

	public BigDecimal getThd01() {
		return this.thd01;
	}

	public void setThd01(BigDecimal thd01) {
		this.thd01 = thd01;
	}

	public String getThh01() {
		return this.thh01;
	}

	public void setThh01(String thh01) {
		this.thh01 = thh01;
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