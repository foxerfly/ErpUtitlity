package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the COPTI database table.
 * 
 */
@Entity
@Table(name="COPTI")
@NamedQuery(name="Copti.findAll", query="SELECT c FROM Copti c")
public class Copti implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CoptiPK id;

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

	@Column(name="TI003")
	private String ti003;

	@Column(name="TI004")
	private String ti004;

	@Column(name="TI005")
	private String ti005;

	@Column(name="TI006")
	private String ti006;

	@Column(name="TI007")
	private String ti007;

	@Column(name="TI008")
	private String ti008;

	@Column(name="TI009")
	private BigDecimal ti009;

	@Column(name="TI010")
	private BigDecimal ti010;

	@Column(name="TI011")
	private BigDecimal ti011;

	@Column(name="TI012")
	private String ti012;

	@Column(name="TI013")
	private String ti013;

	@Column(name="TI014")
	private String ti014;

	@Column(name="TI015")
	private String ti015;

	@Column(name="TI016")
	private BigDecimal ti016;

	@Column(name="TI017")
	private String ti017;

	@Column(name="TI018")
	private String ti018;

	@Column(name="TI019")
	private String ti019;

	@Column(name="TI020")
	private String ti020;

	@Column(name="TI021")
	private String ti021;

	@Column(name="TI022")
	private String ti022;

	@Column(name="TI023")
	private String ti023;

	@Column(name="TI024")
	private String ti024;

	@Column(name="TI025")
	private String ti025;

	@Column(name="TI026")
	private String ti026;

	@Column(name="TI027")
	private String ti027;

	@Column(name="TI028")
	private BigDecimal ti028;

	@Column(name="TI029")
	private BigDecimal ti029;

	@Column(name="TI030")
	private String ti030;

	@Column(name="TI031")
	private String ti031;

	@Column(name="TI032")
	private String ti032;

	@Column(name="TI033")
	private String ti033;

	@Column(name="TI034")
	private String ti034;

	@Column(name="TI035")
	private String ti035;

	@Column(name="TI036")
	private BigDecimal ti036;

	@Column(name="TI037")
	private BigDecimal ti037;

	@Column(name="TI038")
	private BigDecimal ti038;

	@Column(name="TI039")
	private String ti039;

	@Column(name="TI040")
	private BigDecimal ti040;

	@Column(name="TI041")
	private String ti041;

	@Column(name="TI042")
	private String ti042;

	@Column(name="TI043")
	private String ti043;

	@Column(name="TI044")
	private String ti044;

	@Column(name="TI045")
	private String ti045;

	@Column(name="TI046")
	private BigDecimal ti046;

	@Column(name="TI047")
	private String ti047;

	@Column(name="TI048")
	private String ti048;

	@Column(name="TI049")
	private String ti049;

	@Column(name="TI050")
	private String ti050;

	@Column(name="TI051")
	private String ti051;

	@Column(name="TI052")
	private BigDecimal ti052;

	@Column(name="TI053")
	private BigDecimal ti053;

	@Column(name="TI054")
	private BigDecimal ti054;

	@Column(name="TI055")
	private String ti055;

	@Column(name="TI056")
	private String ti056;

	@Column(name="TI057")
	private String ti057;

	@Column(name="TI058")
	private BigDecimal ti058;

	@Column(name="TI059")
	private BigDecimal ti059;

	@Column(name="TI060")
	private BigDecimal ti060;

	@Column(name="TI061")
	private BigDecimal ti061;

	@Column(name="TI062")
	private BigDecimal ti062;

	@Column(name="TI063")
	private BigDecimal ti063;

	@Column(name="TI064")
	private String ti064;

	@Column(name="TI065")
	private String ti065;

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

	public Copti() {
	}

	public CoptiPK getId() {
		return this.id;
	}

	public void setId(CoptiPK id) {
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

	public String getTi003() {
		return this.ti003;
	}

	public void setTi003(String ti003) {
		this.ti003 = ti003;
	}

	public String getTi004() {
		return this.ti004;
	}

	public void setTi004(String ti004) {
		this.ti004 = ti004;
	}

	public String getTi005() {
		return this.ti005;
	}

	public void setTi005(String ti005) {
		this.ti005 = ti005;
	}

	public String getTi006() {
		return this.ti006;
	}

	public void setTi006(String ti006) {
		this.ti006 = ti006;
	}

	public String getTi007() {
		return this.ti007;
	}

	public void setTi007(String ti007) {
		this.ti007 = ti007;
	}

	public String getTi008() {
		return this.ti008;
	}

	public void setTi008(String ti008) {
		this.ti008 = ti008;
	}

	public BigDecimal getTi009() {
		return this.ti009;
	}

	public void setTi009(BigDecimal ti009) {
		this.ti009 = ti009;
	}

	public BigDecimal getTi010() {
		return this.ti010;
	}

	public void setTi010(BigDecimal ti010) {
		this.ti010 = ti010;
	}

	public BigDecimal getTi011() {
		return this.ti011;
	}

	public void setTi011(BigDecimal ti011) {
		this.ti011 = ti011;
	}

	public String getTi012() {
		return this.ti012;
	}

	public void setTi012(String ti012) {
		this.ti012 = ti012;
	}

	public String getTi013() {
		return this.ti013;
	}

	public void setTi013(String ti013) {
		this.ti013 = ti013;
	}

	public String getTi014() {
		return this.ti014;
	}

	public void setTi014(String ti014) {
		this.ti014 = ti014;
	}

	public String getTi015() {
		return this.ti015;
	}

	public void setTi015(String ti015) {
		this.ti015 = ti015;
	}

	public BigDecimal getTi016() {
		return this.ti016;
	}

	public void setTi016(BigDecimal ti016) {
		this.ti016 = ti016;
	}

	public String getTi017() {
		return this.ti017;
	}

	public void setTi017(String ti017) {
		this.ti017 = ti017;
	}

	public String getTi018() {
		return this.ti018;
	}

	public void setTi018(String ti018) {
		this.ti018 = ti018;
	}

	public String getTi019() {
		return this.ti019;
	}

	public void setTi019(String ti019) {
		this.ti019 = ti019;
	}

	public String getTi020() {
		return this.ti020;
	}

	public void setTi020(String ti020) {
		this.ti020 = ti020;
	}

	public String getTi021() {
		return this.ti021;
	}

	public void setTi021(String ti021) {
		this.ti021 = ti021;
	}

	public String getTi022() {
		return this.ti022;
	}

	public void setTi022(String ti022) {
		this.ti022 = ti022;
	}

	public String getTi023() {
		return this.ti023;
	}

	public void setTi023(String ti023) {
		this.ti023 = ti023;
	}

	public String getTi024() {
		return this.ti024;
	}

	public void setTi024(String ti024) {
		this.ti024 = ti024;
	}

	public String getTi025() {
		return this.ti025;
	}

	public void setTi025(String ti025) {
		this.ti025 = ti025;
	}

	public String getTi026() {
		return this.ti026;
	}

	public void setTi026(String ti026) {
		this.ti026 = ti026;
	}

	public String getTi027() {
		return this.ti027;
	}

	public void setTi027(String ti027) {
		this.ti027 = ti027;
	}

	public BigDecimal getTi028() {
		return this.ti028;
	}

	public void setTi028(BigDecimal ti028) {
		this.ti028 = ti028;
	}

	public BigDecimal getTi029() {
		return this.ti029;
	}

	public void setTi029(BigDecimal ti029) {
		this.ti029 = ti029;
	}

	public String getTi030() {
		return this.ti030;
	}

	public void setTi030(String ti030) {
		this.ti030 = ti030;
	}

	public String getTi031() {
		return this.ti031;
	}

	public void setTi031(String ti031) {
		this.ti031 = ti031;
	}

	public String getTi032() {
		return this.ti032;
	}

	public void setTi032(String ti032) {
		this.ti032 = ti032;
	}

	public String getTi033() {
		return this.ti033;
	}

	public void setTi033(String ti033) {
		this.ti033 = ti033;
	}

	public String getTi034() {
		return this.ti034;
	}

	public void setTi034(String ti034) {
		this.ti034 = ti034;
	}

	public String getTi035() {
		return this.ti035;
	}

	public void setTi035(String ti035) {
		this.ti035 = ti035;
	}

	public BigDecimal getTi036() {
		return this.ti036;
	}

	public void setTi036(BigDecimal ti036) {
		this.ti036 = ti036;
	}

	public BigDecimal getTi037() {
		return this.ti037;
	}

	public void setTi037(BigDecimal ti037) {
		this.ti037 = ti037;
	}

	public BigDecimal getTi038() {
		return this.ti038;
	}

	public void setTi038(BigDecimal ti038) {
		this.ti038 = ti038;
	}

	public String getTi039() {
		return this.ti039;
	}

	public void setTi039(String ti039) {
		this.ti039 = ti039;
	}

	public BigDecimal getTi040() {
		return this.ti040;
	}

	public void setTi040(BigDecimal ti040) {
		this.ti040 = ti040;
	}

	public String getTi041() {
		return this.ti041;
	}

	public void setTi041(String ti041) {
		this.ti041 = ti041;
	}

	public String getTi042() {
		return this.ti042;
	}

	public void setTi042(String ti042) {
		this.ti042 = ti042;
	}

	public String getTi043() {
		return this.ti043;
	}

	public void setTi043(String ti043) {
		this.ti043 = ti043;
	}

	public String getTi044() {
		return this.ti044;
	}

	public void setTi044(String ti044) {
		this.ti044 = ti044;
	}

	public String getTi045() {
		return this.ti045;
	}

	public void setTi045(String ti045) {
		this.ti045 = ti045;
	}

	public BigDecimal getTi046() {
		return this.ti046;
	}

	public void setTi046(BigDecimal ti046) {
		this.ti046 = ti046;
	}

	public String getTi047() {
		return this.ti047;
	}

	public void setTi047(String ti047) {
		this.ti047 = ti047;
	}

	public String getTi048() {
		return this.ti048;
	}

	public void setTi048(String ti048) {
		this.ti048 = ti048;
	}

	public String getTi049() {
		return this.ti049;
	}

	public void setTi049(String ti049) {
		this.ti049 = ti049;
	}

	public String getTi050() {
		return this.ti050;
	}

	public void setTi050(String ti050) {
		this.ti050 = ti050;
	}

	public String getTi051() {
		return this.ti051;
	}

	public void setTi051(String ti051) {
		this.ti051 = ti051;
	}

	public BigDecimal getTi052() {
		return this.ti052;
	}

	public void setTi052(BigDecimal ti052) {
		this.ti052 = ti052;
	}

	public BigDecimal getTi053() {
		return this.ti053;
	}

	public void setTi053(BigDecimal ti053) {
		this.ti053 = ti053;
	}

	public BigDecimal getTi054() {
		return this.ti054;
	}

	public void setTi054(BigDecimal ti054) {
		this.ti054 = ti054;
	}

	public String getTi055() {
		return this.ti055;
	}

	public void setTi055(String ti055) {
		this.ti055 = ti055;
	}

	public String getTi056() {
		return this.ti056;
	}

	public void setTi056(String ti056) {
		this.ti056 = ti056;
	}

	public String getTi057() {
		return this.ti057;
	}

	public void setTi057(String ti057) {
		this.ti057 = ti057;
	}

	public BigDecimal getTi058() {
		return this.ti058;
	}

	public void setTi058(BigDecimal ti058) {
		this.ti058 = ti058;
	}

	public BigDecimal getTi059() {
		return this.ti059;
	}

	public void setTi059(BigDecimal ti059) {
		this.ti059 = ti059;
	}

	public BigDecimal getTi060() {
		return this.ti060;
	}

	public void setTi060(BigDecimal ti060) {
		this.ti060 = ti060;
	}

	public BigDecimal getTi061() {
		return this.ti061;
	}

	public void setTi061(BigDecimal ti061) {
		this.ti061 = ti061;
	}

	public BigDecimal getTi062() {
		return this.ti062;
	}

	public void setTi062(BigDecimal ti062) {
		this.ti062 = ti062;
	}

	public BigDecimal getTi063() {
		return this.ti063;
	}

	public void setTi063(BigDecimal ti063) {
		this.ti063 = ti063;
	}

	public String getTi064() {
		return this.ti064;
	}

	public void setTi064(String ti064) {
		this.ti064 = ti064;
	}

	public String getTi065() {
		return this.ti065;
	}

	public void setTi065(String ti065) {
		this.ti065 = ti065;
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