package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the COPTE database table.
 * 
 */
@Entity
@Table(name="COPTE")
@NamedQuery(name="Copte.findAll", query="SELECT c FROM Copte c")
public class Copte implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CoptePK id;

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

	@Column(name="TE004")
	private String te004;

	@Column(name="TE005")
	private String te005;

	@Column(name="TE006")
	private String te006;

	@Column(name="TE007")
	private String te007;

	@Column(name="TE008")
	private String te008;

	@Column(name="TE009")
	private String te009;

	@Column(name="TE010")
	private String te010;

	@Column(name="TE011")
	private String te011;

	@Column(name="TE012")
	private BigDecimal te012;

	@Column(name="TE013")
	private String te013;

	@Column(name="TE014")
	private String te014;

	@Column(name="TE015")
	private String te015;

	@Column(name="TE016")
	private String te016;

	@Column(name="TE017")
	private String te017;

	@Column(name="TE018")
	private String te018;

	@Column(name="TE019")
	private String te019;

	@Column(name="TE020")
	private String te020;

	@Column(name="TE021")
	private String te021;

	@Column(name="TE022")
	private String te022;

	@Column(name="TE023")
	private String te023;

	@Column(name="TE024")
	private String te024;

	@Column(name="TE025")
	private String te025;

	@Column(name="TE026")
	private String te026;

	@Column(name="TE027")
	private String te027;

	@Column(name="TE028")
	private BigDecimal te028;

	@Column(name="TE029")
	private String te029;

	@Column(name="TE030")
	private BigDecimal te030;

	@Column(name="TE031")
	private String te031;

	@Column(name="TE032")
	private String te032;

	@Column(name="TE033")
	private String te033;

	@Column(name="TE034")
	private String te034;

	@Column(name="TE035")
	private String te035;

	@Column(name="TE036")
	private String te036;

	@Column(name="TE037")
	private String te037;

	@Column(name="TE038")
	private String te038;

	@Column(name="TE039")
	private String te039;

	@Column(name="TE040")
	private BigDecimal te040;

	@Column(name="TE041")
	private String te041;

	@Column(name="TE042")
	private BigDecimal te042;

	@Column(name="TE043")
	private String te043;

	@Column(name="TE044")
	private String te044;

	@Column(name="TE045")
	private String te045;

	@Column(name="TE046")
	private String te046;

	@Column(name="TE047")
	private String te047;

	@Column(name="TE048")
	private String te048;

	@Column(name="TE049")
	private BigDecimal te049;

	@Column(name="TE050")
	private BigDecimal te050;

	@Column(name="TE051")
	private BigDecimal te051;

	@Column(name="TE052")
	private String te052;

	@Column(name="TE053")
	private String te053;

	@Column(name="TE054")
	private String te054;

	@Column(name="TE055")
	private String te055;

	@Column(name="TE056")
	private String te056;

	@Column(name="TE057")
	private String te057;

	@Column(name="TE058")
	private String te058;

	@Column(name="TE059")
	private String te059;

	@Column(name="TE060")
	private String te060;

	@Column(name="TE061")
	private String te061;

	@Column(name="TE062")
	private String te062;

	@Column(name="TE063")
	private String te063;

	@Column(name="TE064")
	private String te064;

	@Column(name="TE065")
	private String te065;

	@Column(name="TE066")
	private String te066;

	@Column(name="TE107")
	private String te107;

	@Column(name="TE108")
	private String te108;

	@Column(name="TE109")
	private String te109;

	@Column(name="TE110")
	private String te110;

	@Column(name="TE111")
	private String te111;

	@Column(name="TE112")
	private BigDecimal te112;

	@Column(name="TE113")
	private String te113;

	@Column(name="TE114")
	private String te114;

	@Column(name="TE115")
	private String te115;

	@Column(name="TE116")
	private String te116;

	@Column(name="TE117")
	private String te117;

	@Column(name="TE118")
	private String te118;

	@Column(name="TE119")
	private String te119;

	@Column(name="TE120")
	private String te120;

	@Column(name="TE121")
	private String te121;

	@Column(name="TE122")
	private String te122;

	@Column(name="TE123")
	private String te123;

	@Column(name="TE124")
	private String te124;

	@Column(name="TE125")
	private String te125;

	@Column(name="TE126")
	private String te126;

	@Column(name="TE127")
	private String te127;

	@Column(name="TE128")
	private BigDecimal te128;

	@Column(name="TE129")
	private String te129;

	@Column(name="TE130")
	private String te130;

	@Column(name="TE131")
	private String te131;

	@Column(name="TE132")
	private String te132;

	@Column(name="TE133")
	private String te133;

	@Column(name="TE134")
	private String te134;

	@Column(name="TE135")
	private String te135;

	@Column(name="TE136")
	private BigDecimal te136;

	@Column(name="TE137")
	private String te137;

	@Column(name="TE138")
	private BigDecimal te138;

	@Column(name="TE139")
	private String te139;

	@Column(name="TE140")
	private String te140;

	@Column(name="TE141")
	private String te141;

	@Column(name="TE142")
	private String te142;

	@Column(name="TE143")
	private String te143;

	@Column(name="TE144")
	private String te144;

	@Column(name="TE145")
	private BigDecimal te145;

	@Column(name="TE146")
	private String te146;

	@Column(name="TE147")
	private String te147;

	@Column(name="TE148")
	private String te148;

	@Column(name="TE149")
	private BigDecimal te149;

	@Column(name="TE150")
	private BigDecimal te150;

	@Column(name="TE151")
	private BigDecimal te151;

	@Column(name="TE152")
	private String te152;

	@Column(name="TE153")
	private String te153;

	@Column(name="TE154")
	private String te154;

	@Column(name="TE155")
	private String te155;

	@Column(name="TE156")
	private String te156;

	@Column(name="TE157")
	private String te157;

	@Column(name="TE158")
	private String te158;

	@Column(name="TE159")
	private String te159;

	@Column(name="TE160")
	private String te160;

	@Column(name="TE161")
	private String te161;

	@Column(name="TE162")
	private String te162;

	@Column(name="TE163")
	private String te163;

	@Column(name="TEI01")
	private String tei01;

	@Column(name="TEI02")
	private String tei02;

	@Column(name="TEI03")
	private BigDecimal tei03;

	@Column(name="TEI04")
	private BigDecimal tei04;

	@Column(name="TEI11")
	private String tei11;

	@Column(name="TEI12")
	private String tei12;

	@Column(name="TEI13")
	private BigDecimal tei13;

	@Column(name="TEI14")
	private BigDecimal tei14;

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

	public Copte() {
	}

	public CoptePK getId() {
		return this.id;
	}

	public void setId(CoptePK id) {
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

	public String getTe004() {
		return this.te004;
	}

	public void setTe004(String te004) {
		this.te004 = te004;
	}

	public String getTe005() {
		return this.te005;
	}

	public void setTe005(String te005) {
		this.te005 = te005;
	}

	public String getTe006() {
		return this.te006;
	}

	public void setTe006(String te006) {
		this.te006 = te006;
	}

	public String getTe007() {
		return this.te007;
	}

	public void setTe007(String te007) {
		this.te007 = te007;
	}

	public String getTe008() {
		return this.te008;
	}

	public void setTe008(String te008) {
		this.te008 = te008;
	}

	public String getTe009() {
		return this.te009;
	}

	public void setTe009(String te009) {
		this.te009 = te009;
	}

	public String getTe010() {
		return this.te010;
	}

	public void setTe010(String te010) {
		this.te010 = te010;
	}

	public String getTe011() {
		return this.te011;
	}

	public void setTe011(String te011) {
		this.te011 = te011;
	}

	public BigDecimal getTe012() {
		return this.te012;
	}

	public void setTe012(BigDecimal te012) {
		this.te012 = te012;
	}

	public String getTe013() {
		return this.te013;
	}

	public void setTe013(String te013) {
		this.te013 = te013;
	}

	public String getTe014() {
		return this.te014;
	}

	public void setTe014(String te014) {
		this.te014 = te014;
	}

	public String getTe015() {
		return this.te015;
	}

	public void setTe015(String te015) {
		this.te015 = te015;
	}

	public String getTe016() {
		return this.te016;
	}

	public void setTe016(String te016) {
		this.te016 = te016;
	}

	public String getTe017() {
		return this.te017;
	}

	public void setTe017(String te017) {
		this.te017 = te017;
	}

	public String getTe018() {
		return this.te018;
	}

	public void setTe018(String te018) {
		this.te018 = te018;
	}

	public String getTe019() {
		return this.te019;
	}

	public void setTe019(String te019) {
		this.te019 = te019;
	}

	public String getTe020() {
		return this.te020;
	}

	public void setTe020(String te020) {
		this.te020 = te020;
	}

	public String getTe021() {
		return this.te021;
	}

	public void setTe021(String te021) {
		this.te021 = te021;
	}

	public String getTe022() {
		return this.te022;
	}

	public void setTe022(String te022) {
		this.te022 = te022;
	}

	public String getTe023() {
		return this.te023;
	}

	public void setTe023(String te023) {
		this.te023 = te023;
	}

	public String getTe024() {
		return this.te024;
	}

	public void setTe024(String te024) {
		this.te024 = te024;
	}

	public String getTe025() {
		return this.te025;
	}

	public void setTe025(String te025) {
		this.te025 = te025;
	}

	public String getTe026() {
		return this.te026;
	}

	public void setTe026(String te026) {
		this.te026 = te026;
	}

	public String getTe027() {
		return this.te027;
	}

	public void setTe027(String te027) {
		this.te027 = te027;
	}

	public BigDecimal getTe028() {
		return this.te028;
	}

	public void setTe028(BigDecimal te028) {
		this.te028 = te028;
	}

	public String getTe029() {
		return this.te029;
	}

	public void setTe029(String te029) {
		this.te029 = te029;
	}

	public BigDecimal getTe030() {
		return this.te030;
	}

	public void setTe030(BigDecimal te030) {
		this.te030 = te030;
	}

	public String getTe031() {
		return this.te031;
	}

	public void setTe031(String te031) {
		this.te031 = te031;
	}

	public String getTe032() {
		return this.te032;
	}

	public void setTe032(String te032) {
		this.te032 = te032;
	}

	public String getTe033() {
		return this.te033;
	}

	public void setTe033(String te033) {
		this.te033 = te033;
	}

	public String getTe034() {
		return this.te034;
	}

	public void setTe034(String te034) {
		this.te034 = te034;
	}

	public String getTe035() {
		return this.te035;
	}

	public void setTe035(String te035) {
		this.te035 = te035;
	}

	public String getTe036() {
		return this.te036;
	}

	public void setTe036(String te036) {
		this.te036 = te036;
	}

	public String getTe037() {
		return this.te037;
	}

	public void setTe037(String te037) {
		this.te037 = te037;
	}

	public String getTe038() {
		return this.te038;
	}

	public void setTe038(String te038) {
		this.te038 = te038;
	}

	public String getTe039() {
		return this.te039;
	}

	public void setTe039(String te039) {
		this.te039 = te039;
	}

	public BigDecimal getTe040() {
		return this.te040;
	}

	public void setTe040(BigDecimal te040) {
		this.te040 = te040;
	}

	public String getTe041() {
		return this.te041;
	}

	public void setTe041(String te041) {
		this.te041 = te041;
	}

	public BigDecimal getTe042() {
		return this.te042;
	}

	public void setTe042(BigDecimal te042) {
		this.te042 = te042;
	}

	public String getTe043() {
		return this.te043;
	}

	public void setTe043(String te043) {
		this.te043 = te043;
	}

	public String getTe044() {
		return this.te044;
	}

	public void setTe044(String te044) {
		this.te044 = te044;
	}

	public String getTe045() {
		return this.te045;
	}

	public void setTe045(String te045) {
		this.te045 = te045;
	}

	public String getTe046() {
		return this.te046;
	}

	public void setTe046(String te046) {
		this.te046 = te046;
	}

	public String getTe047() {
		return this.te047;
	}

	public void setTe047(String te047) {
		this.te047 = te047;
	}

	public String getTe048() {
		return this.te048;
	}

	public void setTe048(String te048) {
		this.te048 = te048;
	}

	public BigDecimal getTe049() {
		return this.te049;
	}

	public void setTe049(BigDecimal te049) {
		this.te049 = te049;
	}

	public BigDecimal getTe050() {
		return this.te050;
	}

	public void setTe050(BigDecimal te050) {
		this.te050 = te050;
	}

	public BigDecimal getTe051() {
		return this.te051;
	}

	public void setTe051(BigDecimal te051) {
		this.te051 = te051;
	}

	public String getTe052() {
		return this.te052;
	}

	public void setTe052(String te052) {
		this.te052 = te052;
	}

	public String getTe053() {
		return this.te053;
	}

	public void setTe053(String te053) {
		this.te053 = te053;
	}

	public String getTe054() {
		return this.te054;
	}

	public void setTe054(String te054) {
		this.te054 = te054;
	}

	public String getTe055() {
		return this.te055;
	}

	public void setTe055(String te055) {
		this.te055 = te055;
	}

	public String getTe056() {
		return this.te056;
	}

	public void setTe056(String te056) {
		this.te056 = te056;
	}

	public String getTe057() {
		return this.te057;
	}

	public void setTe057(String te057) {
		this.te057 = te057;
	}

	public String getTe058() {
		return this.te058;
	}

	public void setTe058(String te058) {
		this.te058 = te058;
	}

	public String getTe059() {
		return this.te059;
	}

	public void setTe059(String te059) {
		this.te059 = te059;
	}

	public String getTe060() {
		return this.te060;
	}

	public void setTe060(String te060) {
		this.te060 = te060;
	}

	public String getTe061() {
		return this.te061;
	}

	public void setTe061(String te061) {
		this.te061 = te061;
	}

	public String getTe062() {
		return this.te062;
	}

	public void setTe062(String te062) {
		this.te062 = te062;
	}

	public String getTe063() {
		return this.te063;
	}

	public void setTe063(String te063) {
		this.te063 = te063;
	}

	public String getTe064() {
		return this.te064;
	}

	public void setTe064(String te064) {
		this.te064 = te064;
	}

	public String getTe065() {
		return this.te065;
	}

	public void setTe065(String te065) {
		this.te065 = te065;
	}

	public String getTe066() {
		return this.te066;
	}

	public void setTe066(String te066) {
		this.te066 = te066;
	}

	public String getTe107() {
		return this.te107;
	}

	public void setTe107(String te107) {
		this.te107 = te107;
	}

	public String getTe108() {
		return this.te108;
	}

	public void setTe108(String te108) {
		this.te108 = te108;
	}

	public String getTe109() {
		return this.te109;
	}

	public void setTe109(String te109) {
		this.te109 = te109;
	}

	public String getTe110() {
		return this.te110;
	}

	public void setTe110(String te110) {
		this.te110 = te110;
	}

	public String getTe111() {
		return this.te111;
	}

	public void setTe111(String te111) {
		this.te111 = te111;
	}

	public BigDecimal getTe112() {
		return this.te112;
	}

	public void setTe112(BigDecimal te112) {
		this.te112 = te112;
	}

	public String getTe113() {
		return this.te113;
	}

	public void setTe113(String te113) {
		this.te113 = te113;
	}

	public String getTe114() {
		return this.te114;
	}

	public void setTe114(String te114) {
		this.te114 = te114;
	}

	public String getTe115() {
		return this.te115;
	}

	public void setTe115(String te115) {
		this.te115 = te115;
	}

	public String getTe116() {
		return this.te116;
	}

	public void setTe116(String te116) {
		this.te116 = te116;
	}

	public String getTe117() {
		return this.te117;
	}

	public void setTe117(String te117) {
		this.te117 = te117;
	}

	public String getTe118() {
		return this.te118;
	}

	public void setTe118(String te118) {
		this.te118 = te118;
	}

	public String getTe119() {
		return this.te119;
	}

	public void setTe119(String te119) {
		this.te119 = te119;
	}

	public String getTe120() {
		return this.te120;
	}

	public void setTe120(String te120) {
		this.te120 = te120;
	}

	public String getTe121() {
		return this.te121;
	}

	public void setTe121(String te121) {
		this.te121 = te121;
	}

	public String getTe122() {
		return this.te122;
	}

	public void setTe122(String te122) {
		this.te122 = te122;
	}

	public String getTe123() {
		return this.te123;
	}

	public void setTe123(String te123) {
		this.te123 = te123;
	}

	public String getTe124() {
		return this.te124;
	}

	public void setTe124(String te124) {
		this.te124 = te124;
	}

	public String getTe125() {
		return this.te125;
	}

	public void setTe125(String te125) {
		this.te125 = te125;
	}

	public String getTe126() {
		return this.te126;
	}

	public void setTe126(String te126) {
		this.te126 = te126;
	}

	public String getTe127() {
		return this.te127;
	}

	public void setTe127(String te127) {
		this.te127 = te127;
	}

	public BigDecimal getTe128() {
		return this.te128;
	}

	public void setTe128(BigDecimal te128) {
		this.te128 = te128;
	}

	public String getTe129() {
		return this.te129;
	}

	public void setTe129(String te129) {
		this.te129 = te129;
	}

	public String getTe130() {
		return this.te130;
	}

	public void setTe130(String te130) {
		this.te130 = te130;
	}

	public String getTe131() {
		return this.te131;
	}

	public void setTe131(String te131) {
		this.te131 = te131;
	}

	public String getTe132() {
		return this.te132;
	}

	public void setTe132(String te132) {
		this.te132 = te132;
	}

	public String getTe133() {
		return this.te133;
	}

	public void setTe133(String te133) {
		this.te133 = te133;
	}

	public String getTe134() {
		return this.te134;
	}

	public void setTe134(String te134) {
		this.te134 = te134;
	}

	public String getTe135() {
		return this.te135;
	}

	public void setTe135(String te135) {
		this.te135 = te135;
	}

	public BigDecimal getTe136() {
		return this.te136;
	}

	public void setTe136(BigDecimal te136) {
		this.te136 = te136;
	}

	public String getTe137() {
		return this.te137;
	}

	public void setTe137(String te137) {
		this.te137 = te137;
	}

	public BigDecimal getTe138() {
		return this.te138;
	}

	public void setTe138(BigDecimal te138) {
		this.te138 = te138;
	}

	public String getTe139() {
		return this.te139;
	}

	public void setTe139(String te139) {
		this.te139 = te139;
	}

	public String getTe140() {
		return this.te140;
	}

	public void setTe140(String te140) {
		this.te140 = te140;
	}

	public String getTe141() {
		return this.te141;
	}

	public void setTe141(String te141) {
		this.te141 = te141;
	}

	public String getTe142() {
		return this.te142;
	}

	public void setTe142(String te142) {
		this.te142 = te142;
	}

	public String getTe143() {
		return this.te143;
	}

	public void setTe143(String te143) {
		this.te143 = te143;
	}

	public String getTe144() {
		return this.te144;
	}

	public void setTe144(String te144) {
		this.te144 = te144;
	}

	public BigDecimal getTe145() {
		return this.te145;
	}

	public void setTe145(BigDecimal te145) {
		this.te145 = te145;
	}

	public String getTe146() {
		return this.te146;
	}

	public void setTe146(String te146) {
		this.te146 = te146;
	}

	public String getTe147() {
		return this.te147;
	}

	public void setTe147(String te147) {
		this.te147 = te147;
	}

	public String getTe148() {
		return this.te148;
	}

	public void setTe148(String te148) {
		this.te148 = te148;
	}

	public BigDecimal getTe149() {
		return this.te149;
	}

	public void setTe149(BigDecimal te149) {
		this.te149 = te149;
	}

	public BigDecimal getTe150() {
		return this.te150;
	}

	public void setTe150(BigDecimal te150) {
		this.te150 = te150;
	}

	public BigDecimal getTe151() {
		return this.te151;
	}

	public void setTe151(BigDecimal te151) {
		this.te151 = te151;
	}

	public String getTe152() {
		return this.te152;
	}

	public void setTe152(String te152) {
		this.te152 = te152;
	}

	public String getTe153() {
		return this.te153;
	}

	public void setTe153(String te153) {
		this.te153 = te153;
	}

	public String getTe154() {
		return this.te154;
	}

	public void setTe154(String te154) {
		this.te154 = te154;
	}

	public String getTe155() {
		return this.te155;
	}

	public void setTe155(String te155) {
		this.te155 = te155;
	}

	public String getTe156() {
		return this.te156;
	}

	public void setTe156(String te156) {
		this.te156 = te156;
	}

	public String getTe157() {
		return this.te157;
	}

	public void setTe157(String te157) {
		this.te157 = te157;
	}

	public String getTe158() {
		return this.te158;
	}

	public void setTe158(String te158) {
		this.te158 = te158;
	}

	public String getTe159() {
		return this.te159;
	}

	public void setTe159(String te159) {
		this.te159 = te159;
	}

	public String getTe160() {
		return this.te160;
	}

	public void setTe160(String te160) {
		this.te160 = te160;
	}

	public String getTe161() {
		return this.te161;
	}

	public void setTe161(String te161) {
		this.te161 = te161;
	}

	public String getTe162() {
		return this.te162;
	}

	public void setTe162(String te162) {
		this.te162 = te162;
	}

	public String getTe163() {
		return this.te163;
	}

	public void setTe163(String te163) {
		this.te163 = te163;
	}

	public String getTei01() {
		return this.tei01;
	}

	public void setTei01(String tei01) {
		this.tei01 = tei01;
	}

	public String getTei02() {
		return this.tei02;
	}

	public void setTei02(String tei02) {
		this.tei02 = tei02;
	}

	public BigDecimal getTei03() {
		return this.tei03;
	}

	public void setTei03(BigDecimal tei03) {
		this.tei03 = tei03;
	}

	public BigDecimal getTei04() {
		return this.tei04;
	}

	public void setTei04(BigDecimal tei04) {
		this.tei04 = tei04;
	}

	public String getTei11() {
		return this.tei11;
	}

	public void setTei11(String tei11) {
		this.tei11 = tei11;
	}

	public String getTei12() {
		return this.tei12;
	}

	public void setTei12(String tei12) {
		this.tei12 = tei12;
	}

	public BigDecimal getTei13() {
		return this.tei13;
	}

	public void setTei13(BigDecimal tei13) {
		this.tei13 = tei13;
	}

	public BigDecimal getTei14() {
		return this.tei14;
	}

	public void setTei14(BigDecimal tei14) {
		this.tei14 = tei14;
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