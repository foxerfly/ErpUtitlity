package com.edwin.modle;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the COPTF database table.
 * 
 */
@Entity
@Table(name="COPTF")
@NamedQuery(name="Coptf.findAll", query="SELECT c FROM Coptf c")
public class Coptf implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private CoptfPK id;

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

	@Column(name="TF005")
	private String tf005;

	@Column(name="TF006")
	private String tf006;

	@Column(name="TF007")
	private String tf007;

	@Column(name="TF008")
	private String tf008;

	@Column(name="TF009")
	private BigDecimal tf009;

	@Column(name="TF010")
	private String tf010;

	@Column(name="TF011")
	private BigDecimal tf011;

	@Column(name="TF012")
	private String tf012;

	@Column(name="TF013")
	private BigDecimal tf013;

	@Column(name="TF014")
	private BigDecimal tf014;

	@Column(name="TF015")
	private String tf015;

	@Column(name="TF016")
	private String tf016;

	@Column(name="TF017")
	private String tf017;

	@Column(name="TF018")
	private String tf018;

	@Column(name="TF019")
	private String tf019;

	@Column(name="TF020")
	private BigDecimal tf020;

	@Column(name="TF021")
	private BigDecimal tf021;

	@Column(name="TF022")
	private String tf022;

	@Column(name="TF023")
	private String tf023;

	@Column(name="TF024")
	private BigDecimal tf024;

	@Column(name="TF025")
	private BigDecimal tf025;

	@Column(name="TF026")
	private BigDecimal tf026;

	@Column(name="TF027")
	private BigDecimal tf027;

	@Column(name="TF028")
	private String tf028;

	@Column(name="TF029")
	private BigDecimal tf029;

	@Column(name="TF030")
	private BigDecimal tf030;

	@Column(name="TF031")
	private BigDecimal tf031;

	@Column(name="TF032")
	private String tf032;

	@Column(name="TF033")
	private String tf033;

	@Column(name="TF034")
	private String tf034;

	@Column(name="TF035")
	private String tf035;

	@Column(name="TF036")
	private String tf036;

	@Column(name="TF037")
	private BigDecimal tf037;

	@Column(name="TF038")
	private BigDecimal tf038;

	@Column(name="TF039")
	private BigDecimal tf039;

	@Column(name="TF040")
	private String tf040;

	@Column(name="TF041")
	private String tf041;

	@Column(name="TF042")
	private String tf042;

	@Column(name="TF043")
	private String tf043;

	@Column(name="TF044")
	private String tf044;

	@Column(name="TF046")
	private String tf046;

	@Column(name="TF047")
	private BigDecimal tf047;

	@Column(name="TF048")
	private BigDecimal tf048;

	@Column(name="TF049")
	private BigDecimal tf049;

	@Column(name="TF050")
	private BigDecimal tf050;

	@Column(name="TF104")
	private String tf104;

	@Column(name="TF105")
	private String tf105;

	@Column(name="TF106")
	private String tf106;

	@Column(name="TF107")
	private String tf107;

	@Column(name="TF108")
	private String tf108;

	@Column(name="TF109")
	private BigDecimal tf109;

	@Column(name="TF110")
	private String tf110;

	@Column(name="TF111")
	private BigDecimal tf111;

	@Column(name="TF112")
	private String tf112;

	@Column(name="TF113")
	private BigDecimal tf113;

	@Column(name="TF114")
	private BigDecimal tf114;

	@Column(name="TF115")
	private String tf115;

	@Column(name="TF116")
	private String tf116;

	@Column(name="TF117")
	private String tf117;

	@Column(name="TF120")
	private BigDecimal tf120;

	@Column(name="TF121")
	private BigDecimal tf121;

	@Column(name="TF122")
	private String tf122;

	@Column(name="TF123")
	private BigDecimal tf123;

	@Column(name="TF124")
	private BigDecimal tf124;

	@Column(name="TF125")
	private String tf125;

	@Column(name="TF126")
	private BigDecimal tf126;

	@Column(name="TF127")
	private BigDecimal tf127;

	@Column(name="TF128")
	private BigDecimal tf128;

	@Column(name="TF129")
	private BigDecimal tf129;

	@Column(name="TF130")
	private BigDecimal tf130;

	@Column(name="TF131")
	private BigDecimal tf131;

	@Column(name="TF132")
	private String tf132;

	@Column(name="TF133")
	private BigDecimal tf133;

	@Column(name="TF134")
	private BigDecimal tf134;

	@Column(name="TF135")
	private BigDecimal tf135;

	@Column(name="TF136")
	private BigDecimal tf136;

	@Column(name="TF137")
	private BigDecimal tf137;

	@Column(name="TF138")
	private String tf138;

	@Column(name="TF139")
	private String tf139;

	@Column(name="TF140")
	private String tf140;

	@Column(name="TF141")
	private String tf141;

	@Column(name="TF142")
	private String tf142;

	@Column(name="TF143")
	private BigDecimal tf143;

	@Column(name="TF144")
	private BigDecimal tf144;

	@Column(name="TF145")
	private BigDecimal tf145;

	@Column(name="TF146")
	private String tf146;

	@Column(name="TF147")
	private BigDecimal tf147;

	@Column(name="TF148")
	private BigDecimal tf148;

	@Column(name="TF149")
	private BigDecimal tf149;

	@Column(name="TF150")
	private BigDecimal tf150;

	@Column(name="TF151")
	private String tf151;

	@Column(name="TF152")
	private String tf152;

	@Column(name="TF153")
	private String tf153;

	@Column(name="TF154")
	private String tf154;

	@Column(name="TF155")
	private String tf155;

	@Column(name="TFI01")
	private BigDecimal tfi01;

	@Column(name="TFI02")
	private BigDecimal tfi02;

	@Column(name="TFI03")
	private BigDecimal tfi03;

	@Column(name="TFI11")
	private BigDecimal tfi11;

	@Column(name="TFI12")
	private BigDecimal tfi12;

	@Column(name="TFI13")
	private BigDecimal tfi13;

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

	public Coptf() {
	}

	public CoptfPK getId() {
		return this.id;
	}

	public void setId(CoptfPK id) {
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

	public String getTf005() {
		return this.tf005;
	}

	public void setTf005(String tf005) {
		this.tf005 = tf005;
	}

	public String getTf006() {
		return this.tf006;
	}

	public void setTf006(String tf006) {
		this.tf006 = tf006;
	}

	public String getTf007() {
		return this.tf007;
	}

	public void setTf007(String tf007) {
		this.tf007 = tf007;
	}

	public String getTf008() {
		return this.tf008;
	}

	public void setTf008(String tf008) {
		this.tf008 = tf008;
	}

	public BigDecimal getTf009() {
		return this.tf009;
	}

	public void setTf009(BigDecimal tf009) {
		this.tf009 = tf009;
	}

	public String getTf010() {
		return this.tf010;
	}

	public void setTf010(String tf010) {
		this.tf010 = tf010;
	}

	public BigDecimal getTf011() {
		return this.tf011;
	}

	public void setTf011(BigDecimal tf011) {
		this.tf011 = tf011;
	}

	public String getTf012() {
		return this.tf012;
	}

	public void setTf012(String tf012) {
		this.tf012 = tf012;
	}

	public BigDecimal getTf013() {
		return this.tf013;
	}

	public void setTf013(BigDecimal tf013) {
		this.tf013 = tf013;
	}

	public BigDecimal getTf014() {
		return this.tf014;
	}

	public void setTf014(BigDecimal tf014) {
		this.tf014 = tf014;
	}

	public String getTf015() {
		return this.tf015;
	}

	public void setTf015(String tf015) {
		this.tf015 = tf015;
	}

	public String getTf016() {
		return this.tf016;
	}

	public void setTf016(String tf016) {
		this.tf016 = tf016;
	}

	public String getTf017() {
		return this.tf017;
	}

	public void setTf017(String tf017) {
		this.tf017 = tf017;
	}

	public String getTf018() {
		return this.tf018;
	}

	public void setTf018(String tf018) {
		this.tf018 = tf018;
	}

	public String getTf019() {
		return this.tf019;
	}

	public void setTf019(String tf019) {
		this.tf019 = tf019;
	}

	public BigDecimal getTf020() {
		return this.tf020;
	}

	public void setTf020(BigDecimal tf020) {
		this.tf020 = tf020;
	}

	public BigDecimal getTf021() {
		return this.tf021;
	}

	public void setTf021(BigDecimal tf021) {
		this.tf021 = tf021;
	}

	public String getTf022() {
		return this.tf022;
	}

	public void setTf022(String tf022) {
		this.tf022 = tf022;
	}

	public String getTf023() {
		return this.tf023;
	}

	public void setTf023(String tf023) {
		this.tf023 = tf023;
	}

	public BigDecimal getTf024() {
		return this.tf024;
	}

	public void setTf024(BigDecimal tf024) {
		this.tf024 = tf024;
	}

	public BigDecimal getTf025() {
		return this.tf025;
	}

	public void setTf025(BigDecimal tf025) {
		this.tf025 = tf025;
	}

	public BigDecimal getTf026() {
		return this.tf026;
	}

	public void setTf026(BigDecimal tf026) {
		this.tf026 = tf026;
	}

	public BigDecimal getTf027() {
		return this.tf027;
	}

	public void setTf027(BigDecimal tf027) {
		this.tf027 = tf027;
	}

	public String getTf028() {
		return this.tf028;
	}

	public void setTf028(String tf028) {
		this.tf028 = tf028;
	}

	public BigDecimal getTf029() {
		return this.tf029;
	}

	public void setTf029(BigDecimal tf029) {
		this.tf029 = tf029;
	}

	public BigDecimal getTf030() {
		return this.tf030;
	}

	public void setTf030(BigDecimal tf030) {
		this.tf030 = tf030;
	}

	public BigDecimal getTf031() {
		return this.tf031;
	}

	public void setTf031(BigDecimal tf031) {
		this.tf031 = tf031;
	}

	public String getTf032() {
		return this.tf032;
	}

	public void setTf032(String tf032) {
		this.tf032 = tf032;
	}

	public String getTf033() {
		return this.tf033;
	}

	public void setTf033(String tf033) {
		this.tf033 = tf033;
	}

	public String getTf034() {
		return this.tf034;
	}

	public void setTf034(String tf034) {
		this.tf034 = tf034;
	}

	public String getTf035() {
		return this.tf035;
	}

	public void setTf035(String tf035) {
		this.tf035 = tf035;
	}

	public String getTf036() {
		return this.tf036;
	}

	public void setTf036(String tf036) {
		this.tf036 = tf036;
	}

	public BigDecimal getTf037() {
		return this.tf037;
	}

	public void setTf037(BigDecimal tf037) {
		this.tf037 = tf037;
	}

	public BigDecimal getTf038() {
		return this.tf038;
	}

	public void setTf038(BigDecimal tf038) {
		this.tf038 = tf038;
	}

	public BigDecimal getTf039() {
		return this.tf039;
	}

	public void setTf039(BigDecimal tf039) {
		this.tf039 = tf039;
	}

	public String getTf040() {
		return this.tf040;
	}

	public void setTf040(String tf040) {
		this.tf040 = tf040;
	}

	public String getTf041() {
		return this.tf041;
	}

	public void setTf041(String tf041) {
		this.tf041 = tf041;
	}

	public String getTf042() {
		return this.tf042;
	}

	public void setTf042(String tf042) {
		this.tf042 = tf042;
	}

	public String getTf043() {
		return this.tf043;
	}

	public void setTf043(String tf043) {
		this.tf043 = tf043;
	}

	public String getTf044() {
		return this.tf044;
	}

	public void setTf044(String tf044) {
		this.tf044 = tf044;
	}

	public String getTf046() {
		return this.tf046;
	}

	public void setTf046(String tf046) {
		this.tf046 = tf046;
	}

	public BigDecimal getTf047() {
		return this.tf047;
	}

	public void setTf047(BigDecimal tf047) {
		this.tf047 = tf047;
	}

	public BigDecimal getTf048() {
		return this.tf048;
	}

	public void setTf048(BigDecimal tf048) {
		this.tf048 = tf048;
	}

	public BigDecimal getTf049() {
		return this.tf049;
	}

	public void setTf049(BigDecimal tf049) {
		this.tf049 = tf049;
	}

	public BigDecimal getTf050() {
		return this.tf050;
	}

	public void setTf050(BigDecimal tf050) {
		this.tf050 = tf050;
	}

	public String getTf104() {
		return this.tf104;
	}

	public void setTf104(String tf104) {
		this.tf104 = tf104;
	}

	public String getTf105() {
		return this.tf105;
	}

	public void setTf105(String tf105) {
		this.tf105 = tf105;
	}

	public String getTf106() {
		return this.tf106;
	}

	public void setTf106(String tf106) {
		this.tf106 = tf106;
	}

	public String getTf107() {
		return this.tf107;
	}

	public void setTf107(String tf107) {
		this.tf107 = tf107;
	}

	public String getTf108() {
		return this.tf108;
	}

	public void setTf108(String tf108) {
		this.tf108 = tf108;
	}

	public BigDecimal getTf109() {
		return this.tf109;
	}

	public void setTf109(BigDecimal tf109) {
		this.tf109 = tf109;
	}

	public String getTf110() {
		return this.tf110;
	}

	public void setTf110(String tf110) {
		this.tf110 = tf110;
	}

	public BigDecimal getTf111() {
		return this.tf111;
	}

	public void setTf111(BigDecimal tf111) {
		this.tf111 = tf111;
	}

	public String getTf112() {
		return this.tf112;
	}

	public void setTf112(String tf112) {
		this.tf112 = tf112;
	}

	public BigDecimal getTf113() {
		return this.tf113;
	}

	public void setTf113(BigDecimal tf113) {
		this.tf113 = tf113;
	}

	public BigDecimal getTf114() {
		return this.tf114;
	}

	public void setTf114(BigDecimal tf114) {
		this.tf114 = tf114;
	}

	public String getTf115() {
		return this.tf115;
	}

	public void setTf115(String tf115) {
		this.tf115 = tf115;
	}

	public String getTf116() {
		return this.tf116;
	}

	public void setTf116(String tf116) {
		this.tf116 = tf116;
	}

	public String getTf117() {
		return this.tf117;
	}

	public void setTf117(String tf117) {
		this.tf117 = tf117;
	}

	public BigDecimal getTf120() {
		return this.tf120;
	}

	public void setTf120(BigDecimal tf120) {
		this.tf120 = tf120;
	}

	public BigDecimal getTf121() {
		return this.tf121;
	}

	public void setTf121(BigDecimal tf121) {
		this.tf121 = tf121;
	}

	public String getTf122() {
		return this.tf122;
	}

	public void setTf122(String tf122) {
		this.tf122 = tf122;
	}

	public BigDecimal getTf123() {
		return this.tf123;
	}

	public void setTf123(BigDecimal tf123) {
		this.tf123 = tf123;
	}

	public BigDecimal getTf124() {
		return this.tf124;
	}

	public void setTf124(BigDecimal tf124) {
		this.tf124 = tf124;
	}

	public String getTf125() {
		return this.tf125;
	}

	public void setTf125(String tf125) {
		this.tf125 = tf125;
	}

	public BigDecimal getTf126() {
		return this.tf126;
	}

	public void setTf126(BigDecimal tf126) {
		this.tf126 = tf126;
	}

	public BigDecimal getTf127() {
		return this.tf127;
	}

	public void setTf127(BigDecimal tf127) {
		this.tf127 = tf127;
	}

	public BigDecimal getTf128() {
		return this.tf128;
	}

	public void setTf128(BigDecimal tf128) {
		this.tf128 = tf128;
	}

	public BigDecimal getTf129() {
		return this.tf129;
	}

	public void setTf129(BigDecimal tf129) {
		this.tf129 = tf129;
	}

	public BigDecimal getTf130() {
		return this.tf130;
	}

	public void setTf130(BigDecimal tf130) {
		this.tf130 = tf130;
	}

	public BigDecimal getTf131() {
		return this.tf131;
	}

	public void setTf131(BigDecimal tf131) {
		this.tf131 = tf131;
	}

	public String getTf132() {
		return this.tf132;
	}

	public void setTf132(String tf132) {
		this.tf132 = tf132;
	}

	public BigDecimal getTf133() {
		return this.tf133;
	}

	public void setTf133(BigDecimal tf133) {
		this.tf133 = tf133;
	}

	public BigDecimal getTf134() {
		return this.tf134;
	}

	public void setTf134(BigDecimal tf134) {
		this.tf134 = tf134;
	}

	public BigDecimal getTf135() {
		return this.tf135;
	}

	public void setTf135(BigDecimal tf135) {
		this.tf135 = tf135;
	}

	public BigDecimal getTf136() {
		return this.tf136;
	}

	public void setTf136(BigDecimal tf136) {
		this.tf136 = tf136;
	}

	public BigDecimal getTf137() {
		return this.tf137;
	}

	public void setTf137(BigDecimal tf137) {
		this.tf137 = tf137;
	}

	public String getTf138() {
		return this.tf138;
	}

	public void setTf138(String tf138) {
		this.tf138 = tf138;
	}

	public String getTf139() {
		return this.tf139;
	}

	public void setTf139(String tf139) {
		this.tf139 = tf139;
	}

	public String getTf140() {
		return this.tf140;
	}

	public void setTf140(String tf140) {
		this.tf140 = tf140;
	}

	public String getTf141() {
		return this.tf141;
	}

	public void setTf141(String tf141) {
		this.tf141 = tf141;
	}

	public String getTf142() {
		return this.tf142;
	}

	public void setTf142(String tf142) {
		this.tf142 = tf142;
	}

	public BigDecimal getTf143() {
		return this.tf143;
	}

	public void setTf143(BigDecimal tf143) {
		this.tf143 = tf143;
	}

	public BigDecimal getTf144() {
		return this.tf144;
	}

	public void setTf144(BigDecimal tf144) {
		this.tf144 = tf144;
	}

	public BigDecimal getTf145() {
		return this.tf145;
	}

	public void setTf145(BigDecimal tf145) {
		this.tf145 = tf145;
	}

	public String getTf146() {
		return this.tf146;
	}

	public void setTf146(String tf146) {
		this.tf146 = tf146;
	}

	public BigDecimal getTf147() {
		return this.tf147;
	}

	public void setTf147(BigDecimal tf147) {
		this.tf147 = tf147;
	}

	public BigDecimal getTf148() {
		return this.tf148;
	}

	public void setTf148(BigDecimal tf148) {
		this.tf148 = tf148;
	}

	public BigDecimal getTf149() {
		return this.tf149;
	}

	public void setTf149(BigDecimal tf149) {
		this.tf149 = tf149;
	}

	public BigDecimal getTf150() {
		return this.tf150;
	}

	public void setTf150(BigDecimal tf150) {
		this.tf150 = tf150;
	}

	public String getTf151() {
		return this.tf151;
	}

	public void setTf151(String tf151) {
		this.tf151 = tf151;
	}

	public String getTf152() {
		return this.tf152;
	}

	public void setTf152(String tf152) {
		this.tf152 = tf152;
	}

	public String getTf153() {
		return this.tf153;
	}

	public void setTf153(String tf153) {
		this.tf153 = tf153;
	}

	public String getTf154() {
		return this.tf154;
	}

	public void setTf154(String tf154) {
		this.tf154 = tf154;
	}

	public String getTf155() {
		return this.tf155;
	}

	public void setTf155(String tf155) {
		this.tf155 = tf155;
	}

	public BigDecimal getTfi01() {
		return this.tfi01;
	}

	public void setTfi01(BigDecimal tfi01) {
		this.tfi01 = tfi01;
	}

	public BigDecimal getTfi02() {
		return this.tfi02;
	}

	public void setTfi02(BigDecimal tfi02) {
		this.tfi02 = tfi02;
	}

	public BigDecimal getTfi03() {
		return this.tfi03;
	}

	public void setTfi03(BigDecimal tfi03) {
		this.tfi03 = tfi03;
	}

	public BigDecimal getTfi11() {
		return this.tfi11;
	}

	public void setTfi11(BigDecimal tfi11) {
		this.tfi11 = tfi11;
	}

	public BigDecimal getTfi12() {
		return this.tfi12;
	}

	public void setTfi12(BigDecimal tfi12) {
		this.tfi12 = tfi12;
	}

	public BigDecimal getTfi13() {
		return this.tfi13;
	}

	public void setTfi13(BigDecimal tfi13) {
		this.tfi13 = tfi13;
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