package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the COPTG database table.
 * 
 */
@Entity
@Table(name="COPTG")
@NamedQuery(name="Coptg.findAll", query="SELECT c FROM Coptg c")
public class Coptg implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CoptgPK id;

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

	@Column(name="TG003")
	private String tg003;

	@Column(name="TG004")
	private String tg004;

	@Column(name="TG005")
	private String tg005;

	@Column(name="TG006")
	private String tg006;

	@Column(name="TG007")
	private String tg007;

	@Column(name="TG008")
	private String tg008;

	@Column(name="TG009")
	private String tg009;

	@Column(name="TG010")
	private String tg010;

	@Column(name="TG011")
	private String tg011;

	@Column(name="TG012")
	private BigDecimal tg012;

	@Column(name="TG013")
	private BigDecimal tg013;

	@Column(name="TG014")
	private String tg014;

	@Column(name="TG015")
	private String tg015;

	@Column(name="TG016")
	private String tg016;

	@Column(name="TG017")
	private String tg017;

	@Column(name="TG018")
	private String tg018;

	@Column(name="TG019")
	private String tg019;

	@Column(name="TG020")
	private String tg020;

	@Column(name="TG021")
	private String tg021;

	@Column(name="TG022")
	private BigDecimal tg022;

	@Column(name="TG023")
	private String tg023;

	@Column(name="TG024")
	private String tg024;

	@Column(name="TG025")
	private BigDecimal tg025;

	@Column(name="TG026")
	private String tg026;

	@Column(name="TG027")
	private String tg027;

	@Column(name="TG028")
	private String tg028;

	@Column(name="TG029")
	private String tg029;

	@Column(name="TG030")
	private String tg030;

	@Column(name="TG031")
	private String tg031;

	@Column(name="TG032")
	private BigDecimal tg032;

	@Column(name="TG033")
	private BigDecimal tg033;

	@Column(name="TG034")
	private String tg034;

	@Column(name="TG035")
	private String tg035;

	@Column(name="TG036")
	private String tg036;

	@Column(name="TG037")
	private String tg037;

	@Column(name="TG038")
	private String tg038;

	@Column(name="TG039")
	private String tg039;

	@Column(name="TG040")
	private String tg040;

	@Column(name="TG041")
	private BigDecimal tg041;

	@Column(name="TG042")
	private String tg042;

	@Column(name="TG043")
	private String tg043;

	@Column(name="TG044")
	private BigDecimal tg044;

	@Column(name="TG045")
	private BigDecimal tg045;

	@Column(name="TG046")
	private BigDecimal tg046;

	@Column(name="TG047")
	private String tg047;

	@Column(name="TG048")
	private String tg048;

	@Column(name="TG049")
	private String tg049;

	@Column(name="TG050")
	private String tg050;

	@Column(name="TG051")
	private String tg051;

	@Column(name="TG052")
	private BigDecimal tg052;

	@Column(name="TG053")
	private BigDecimal tg053;

	@Column(name="TG054")
	private BigDecimal tg054;

	@Column(name="TG055")
	private String tg055;

	@Column(name="TG056")
	private String tg056;

	@Column(name="TG057")
	private String tg057;

	@Column(name="TG058")
	private String tg058;

	@Column(name="TG059")
	private String tg059;

	@Column(name="TG060")
	private String tg060;

	@Column(name="TG061")
	private String tg061;

	@Column(name="TG064")
	private String tg064;

	@Column(name="TG065")
	private String tg065;

	@Column(name="TG066")
	private String tg066;

	@Column(name="TG067")
	private BigDecimal tg067;

	@Column(name="TG068")
	private String tg068;

	@Column(name="TG069")
	private String tg069;

	@Column(name="TG070")
	private String tg070;

	@Column(name="TG071")
	private BigDecimal tg071;

	@Column(name="TG072")
	private BigDecimal tg072;

	@Column(name="TG073")
	private BigDecimal tg073;

	@Column(name="TG074")
	private String tg074;

	@Column(name="TG075")
	private String tg075;

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

	public Coptg() {
	}

	public CoptgPK getId() {
		return this.id;
	}

	public void setId(CoptgPK id) {
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

	public String getTg003() {
		return this.tg003;
	}

	public void setTg003(String tg003) {
		this.tg003 = tg003;
	}

	public String getTg004() {
		return this.tg004;
	}

	public void setTg004(String tg004) {
		this.tg004 = tg004;
	}

	public String getTg005() {
		return this.tg005;
	}

	public void setTg005(String tg005) {
		this.tg005 = tg005;
	}

	public String getTg006() {
		return this.tg006;
	}

	public void setTg006(String tg006) {
		this.tg006 = tg006;
	}

	public String getTg007() {
		return this.tg007;
	}

	public void setTg007(String tg007) {
		this.tg007 = tg007;
	}

	public String getTg008() {
		return this.tg008;
	}

	public void setTg008(String tg008) {
		this.tg008 = tg008;
	}

	public String getTg009() {
		return this.tg009;
	}

	public void setTg009(String tg009) {
		this.tg009 = tg009;
	}

	public String getTg010() {
		return this.tg010;
	}

	public void setTg010(String tg010) {
		this.tg010 = tg010;
	}

	public String getTg011() {
		return this.tg011;
	}

	public void setTg011(String tg011) {
		this.tg011 = tg011;
	}

	public BigDecimal getTg012() {
		return this.tg012;
	}

	public void setTg012(BigDecimal tg012) {
		this.tg012 = tg012;
	}

	public BigDecimal getTg013() {
		return this.tg013;
	}

	public void setTg013(BigDecimal tg013) {
		this.tg013 = tg013;
	}

	public String getTg014() {
		return this.tg014;
	}

	public void setTg014(String tg014) {
		this.tg014 = tg014;
	}

	public String getTg015() {
		return this.tg015;
	}

	public void setTg015(String tg015) {
		this.tg015 = tg015;
	}

	public String getTg016() {
		return this.tg016;
	}

	public void setTg016(String tg016) {
		this.tg016 = tg016;
	}

	public String getTg017() {
		return this.tg017;
	}

	public void setTg017(String tg017) {
		this.tg017 = tg017;
	}

	public String getTg018() {
		return this.tg018;
	}

	public void setTg018(String tg018) {
		this.tg018 = tg018;
	}

	public String getTg019() {
		return this.tg019;
	}

	public void setTg019(String tg019) {
		this.tg019 = tg019;
	}

	public String getTg020() {
		return this.tg020;
	}

	public void setTg020(String tg020) {
		this.tg020 = tg020;
	}

	public String getTg021() {
		return this.tg021;
	}

	public void setTg021(String tg021) {
		this.tg021 = tg021;
	}

	public BigDecimal getTg022() {
		return this.tg022;
	}

	public void setTg022(BigDecimal tg022) {
		this.tg022 = tg022;
	}

	public String getTg023() {
		return this.tg023;
	}

	public void setTg023(String tg023) {
		this.tg023 = tg023;
	}

	public String getTg024() {
		return this.tg024;
	}

	public void setTg024(String tg024) {
		this.tg024 = tg024;
	}

	public BigDecimal getTg025() {
		return this.tg025;
	}

	public void setTg025(BigDecimal tg025) {
		this.tg025 = tg025;
	}

	public String getTg026() {
		return this.tg026;
	}

	public void setTg026(String tg026) {
		this.tg026 = tg026;
	}

	public String getTg027() {
		return this.tg027;
	}

	public void setTg027(String tg027) {
		this.tg027 = tg027;
	}

	public String getTg028() {
		return this.tg028;
	}

	public void setTg028(String tg028) {
		this.tg028 = tg028;
	}

	public String getTg029() {
		return this.tg029;
	}

	public void setTg029(String tg029) {
		this.tg029 = tg029;
	}

	public String getTg030() {
		return this.tg030;
	}

	public void setTg030(String tg030) {
		this.tg030 = tg030;
	}

	public String getTg031() {
		return this.tg031;
	}

	public void setTg031(String tg031) {
		this.tg031 = tg031;
	}

	public BigDecimal getTg032() {
		return this.tg032;
	}

	public void setTg032(BigDecimal tg032) {
		this.tg032 = tg032;
	}

	public BigDecimal getTg033() {
		return this.tg033;
	}

	public void setTg033(BigDecimal tg033) {
		this.tg033 = tg033;
	}

	public String getTg034() {
		return this.tg034;
	}

	public void setTg034(String tg034) {
		this.tg034 = tg034;
	}

	public String getTg035() {
		return this.tg035;
	}

	public void setTg035(String tg035) {
		this.tg035 = tg035;
	}

	public String getTg036() {
		return this.tg036;
	}

	public void setTg036(String tg036) {
		this.tg036 = tg036;
	}

	public String getTg037() {
		return this.tg037;
	}

	public void setTg037(String tg037) {
		this.tg037 = tg037;
	}

	public String getTg038() {
		return this.tg038;
	}

	public void setTg038(String tg038) {
		this.tg038 = tg038;
	}

	public String getTg039() {
		return this.tg039;
	}

	public void setTg039(String tg039) {
		this.tg039 = tg039;
	}

	public String getTg040() {
		return this.tg040;
	}

	public void setTg040(String tg040) {
		this.tg040 = tg040;
	}

	public BigDecimal getTg041() {
		return this.tg041;
	}

	public void setTg041(BigDecimal tg041) {
		this.tg041 = tg041;
	}

	public String getTg042() {
		return this.tg042;
	}

	public void setTg042(String tg042) {
		this.tg042 = tg042;
	}

	public String getTg043() {
		return this.tg043;
	}

	public void setTg043(String tg043) {
		this.tg043 = tg043;
	}

	public BigDecimal getTg044() {
		return this.tg044;
	}

	public void setTg044(BigDecimal tg044) {
		this.tg044 = tg044;
	}

	public BigDecimal getTg045() {
		return this.tg045;
	}

	public void setTg045(BigDecimal tg045) {
		this.tg045 = tg045;
	}

	public BigDecimal getTg046() {
		return this.tg046;
	}

	public void setTg046(BigDecimal tg046) {
		this.tg046 = tg046;
	}

	public String getTg047() {
		return this.tg047;
	}

	public void setTg047(String tg047) {
		this.tg047 = tg047;
	}

	public String getTg048() {
		return this.tg048;
	}

	public void setTg048(String tg048) {
		this.tg048 = tg048;
	}

	public String getTg049() {
		return this.tg049;
	}

	public void setTg049(String tg049) {
		this.tg049 = tg049;
	}

	public String getTg050() {
		return this.tg050;
	}

	public void setTg050(String tg050) {
		this.tg050 = tg050;
	}

	public String getTg051() {
		return this.tg051;
	}

	public void setTg051(String tg051) {
		this.tg051 = tg051;
	}

	public BigDecimal getTg052() {
		return this.tg052;
	}

	public void setTg052(BigDecimal tg052) {
		this.tg052 = tg052;
	}

	public BigDecimal getTg053() {
		return this.tg053;
	}

	public void setTg053(BigDecimal tg053) {
		this.tg053 = tg053;
	}

	public BigDecimal getTg054() {
		return this.tg054;
	}

	public void setTg054(BigDecimal tg054) {
		this.tg054 = tg054;
	}

	public String getTg055() {
		return this.tg055;
	}

	public void setTg055(String tg055) {
		this.tg055 = tg055;
	}

	public String getTg056() {
		return this.tg056;
	}

	public void setTg056(String tg056) {
		this.tg056 = tg056;
	}

	public String getTg057() {
		return this.tg057;
	}

	public void setTg057(String tg057) {
		this.tg057 = tg057;
	}

	public String getTg058() {
		return this.tg058;
	}

	public void setTg058(String tg058) {
		this.tg058 = tg058;
	}

	public String getTg059() {
		return this.tg059;
	}

	public void setTg059(String tg059) {
		this.tg059 = tg059;
	}

	public String getTg060() {
		return this.tg060;
	}

	public void setTg060(String tg060) {
		this.tg060 = tg060;
	}

	public String getTg061() {
		return this.tg061;
	}

	public void setTg061(String tg061) {
		this.tg061 = tg061;
	}

	public String getTg064() {
		return this.tg064;
	}

	public void setTg064(String tg064) {
		this.tg064 = tg064;
	}

	public String getTg065() {
		return this.tg065;
	}

	public void setTg065(String tg065) {
		this.tg065 = tg065;
	}

	public String getTg066() {
		return this.tg066;
	}

	public void setTg066(String tg066) {
		this.tg066 = tg066;
	}

	public BigDecimal getTg067() {
		return this.tg067;
	}

	public void setTg067(BigDecimal tg067) {
		this.tg067 = tg067;
	}

	public String getTg068() {
		return this.tg068;
	}

	public void setTg068(String tg068) {
		this.tg068 = tg068;
	}

	public String getTg069() {
		return this.tg069;
	}

	public void setTg069(String tg069) {
		this.tg069 = tg069;
	}

	public String getTg070() {
		return this.tg070;
	}

	public void setTg070(String tg070) {
		this.tg070 = tg070;
	}

	public BigDecimal getTg071() {
		return this.tg071;
	}

	public void setTg071(BigDecimal tg071) {
		this.tg071 = tg071;
	}

	public BigDecimal getTg072() {
		return this.tg072;
	}

	public void setTg072(BigDecimal tg072) {
		this.tg072 = tg072;
	}

	public BigDecimal getTg073() {
		return this.tg073;
	}

	public void setTg073(BigDecimal tg073) {
		this.tg073 = tg073;
	}

	public String getTg074() {
		return this.tg074;
	}

	public void setTg074(String tg074) {
		this.tg074 = tg074;
	}

	public String getTg075() {
		return this.tg075;
	}

	public void setTg075(String tg075) {
		this.tg075 = tg075;
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