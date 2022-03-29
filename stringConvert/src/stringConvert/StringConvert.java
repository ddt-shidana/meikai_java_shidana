
/*
 * 『明解Java入門編』柴田望洋
 *
 * 問題:演習14-2 p467
 * 	文字列を読み込んで、その全文字の文字コードを表示するプログラムを作成せよ。
 *
 * パッケージ名:ensyu15_02
 * 作成日:2022/03/28
 * 作成者:ShidaKazuna
 * 修正日:
 * 修正者:
 * ver:1.0.0
 *
 */
//パッケージの宣言
package stringConvert;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StringConvert {

	//----- Scannerメソッド(stdInにキーボードからの入力値を初期設定) -----//
	static Scanner stdIn = new Scanner (System.in);

	//----- mainメソッド -----//
	public static void main(String[] args) {

		//文字列を読み込む
		System.out.print("文字列st：");
		//入力された文字列をst変数に格納
		String st = stdIn.next();


		try {
			//文字コードの変換：ISO-8859-1…ISO 8859-1、ラテンアルファベット No. 1
			String converSt_01 = new String(st.getBytes("ISO8859_1"), "ISO8859_1");
			//文字コードの変換：ISO-8859-2…ラテンアルファベット No. 2
			String converSt_02 = new String(st.getBytes("ISO8859_2"), "ISO8859_2");
			//文字コードの変換：ISO-8859-4…ラテンアルファベット No. 4
			String converSt_03 = new String(st.getBytes("ISO8859_4"), "ISO8859_4");
			//文字コードの変換：ISO-8859-5…ラテン/キリル文字アルファベット
			String converSt_04 = new String(st.getBytes("ISO8859_5"), "ISO8859_5");
			//文字コードの変換：ISO-8859-7…ラテン/ギリシャ文字アルファベット
			String converSt_05 = new String(st.getBytes("ISO8859_7"), "ISO8859_7");
			//文字コードの変換：ISO-8859-9…ラテンアルファベット No. 5
			String converSt_06 = new String(st.getBytes("ISO8859_9"), "ISO8859_9");
			//文字コードの変換：ISO-8859-13…ラテンアルファベット No. 7
			String converSt_07 = new String(st.getBytes("ISO8859_13"), "ISO8859_13");
			//文字コードの変換：ISO-8859-15…ラテンアルファベット No. 9
			String converSt_08 = new String(st.getBytes("ISO8859_15"), "ISO8859_15");
			//文字コードの変換：KOI8-R…KOI8-R、ロシア語
			String converSt_09 = new String(st.getBytes("KOI8_R"), "KOI8_R");
			//文字コードの変換：US-ASCII…American Standard Code for Information Interchange
			String converSt_10 = new String(st.getBytes("ASCII"), "ASCII");
			//文字コードの変換：UTF-8…8 ビット UCS Transformation Format
			String converSt_11 = new String(st.getBytes("UTF8"), "UTF8");
			//文字コードの変換：UTF-16…16 ビット UCS Transformation Format、オプションのバイト順マークによって識別されるバイト順
			String converSt_12 = new String(st.getBytes("UTF-16"), "UTF-16");
			//文字コードの変換：UTF-16BE…16 ビット Unicode Transformation Format、ビッグエンディアンバイト順
			String converSt_13 = new String(st.getBytes("UnicodeBigUnmarked"), "UnicodeBigUnmarked");
			//文字コードの変換：UTF-16LE…16 ビット Unicode Transformation Format、リトルエンディアンバイト順
			String converSt_14 = new String(st.getBytes("UnicodeLittleUnmarked"), "UnicodeLittleUnmarked");
			//文字コードの変換：windows-1250…Windows 東欧
			String converSt_15 = new String(st.getBytes("Cp1250"), "Cp1250");
			//文字コードの変換：windows-1251…Windows キリル文字
			String converSt_16 = new String(st.getBytes("Cp1251"), "Cp1251");
			//文字コードの変換：windows-1252…Windows ラテン文字-1
			String converSt_17 = new String(st.getBytes("Cp1252"), "Cp1252");
			//文字コードの変換：windows-1253…Windows ギリシャ文字
			String converSt_18 = new String(st.getBytes("Cp1253"), "Cp1253");
			//文字コードの変換：windows-1254…Windows トルコ語
			String converSt_19 = new String(st.getBytes("Cp1254"), "Cp1254");
			//文字コードの変換：windows-1257…Windows バルト諸語
			String converSt_20 = new String(st.getBytes("Cp1257"), "Cp1257");
			//文字コードの変換：利用できない…16 ビット Unicode Transformation Format、ビッグエンディアンバイト順、バイト順マーク付き
			String converSt_21 = new String(st.getBytes("UnicodeBig"), "UnicodeBig");
			//文字コードの変換：利用できない…16 ビット Unicode Transformation Format、リトルエンディアンバイト順、バイト順マーク付き
			String converSt_22 = new String(st.getBytes("UnicodeLittle"), "UnicodeLittle");
			//文字コードの変換：Big5…Big5、中国語 (繁体字)
			String converSt_23 = new String(st.getBytes("Big5"), "Big5");
			//文字コードの変換：Big5-HKSCS…Big5 (香港の拡張付き)、中国語 (繁体字、2001 改訂を組み込み)
			String converSt_24 = new String(st.getBytes("Big5_HKSCS"), "Big5_HKSCS");
			//文字コードの変換：EUC-JP…JISX 0201、0208、0212、EUC エンコーディング、日本語
			String converSt_25 = new String(st.getBytes("EUC_JP"), "EUC_JP");
			//文字コードの変換：EUC-KR…KS C 5601、EUC エンコーディング、韓国語
			String converSt_26 = new String(st.getBytes("EUC_KR"), "EUC_KR");
			//文字コードの変換：GB18030…中国語 (簡体字)、中華人民共和国標準
			String converSt_27 = new String(st.getBytes("GB18030"), "GB18030");
			//文字コードの変換：GB2312…GB2312、EUC エンコーディング、中国語 (簡体字)
			String converSt_28 = new String(st.getBytes("EUC_CN"), "EUC_CN");
			//文字コードの変換：GBK…GBK、中国語 (簡体字)
			String converSt_29 = new String(st.getBytes("GBK"), "GBK");
			//文字コードの変換：IBM-Thai…IBM タイ拡張 SBCS
			String converSt_30 = new String(st.getBytes("Cp838"), "Cp838");
			//文字コードの変換：IBM00858…Cp850 の拡張でユーロ文字を含む
			String converSt_31 = new String(st.getBytes("Cp858"), "Cp858");
			//文字コードの変換：IBM01140…Cp037 の拡張でユーロ文字を含む
			String converSt_32 = new String(st.getBytes("Cp1140"), "Cp1140");
			//文字コードの変換：IBM01141…Cp273 の拡張でユーロ文字を含む
			String converSt_33 = new String(st.getBytes("Cp1141"), "Cp1141");
			//文字コードの変換：IBM01142…Cp277 の拡張でユーロ文字を含む
			String converSt_34 = new String(st.getBytes("Cp1142"), "Cp1142");
			//文字コードの変換：IBM01143…Cp278 の拡張でユーロ文字を含む
			String converSt_35 = new String(st.getBytes("Cp1143"), "Cp1143");
			//文字コードの変換：IBM01144…Cp280 の拡張でユーロ文字を含む
			String converSt_36 = new String(st.getBytes("Cp1144"), "Cp1144");
			//文字コードの変換：IBM01145…Cp284 の拡張でユーロ文字を含む
			String converSt_37 = new String(st.getBytes("Cp1145"), "Cp1145");
			//文字コードの変換：IBM01146…Cp285 の拡張でユーロ文字を含む
			String converSt_38 = new String(st.getBytes("Cp1146"), "Cp1146");
			//文字コードの変換：IBM01147…Cp297 の拡張でユーロ文字を含む
			String converSt_39 = new String(st.getBytes("Cp1147"), "Cp1147");
			//文字コードの変換：IBM01148…Cp500 の拡張でユーロ文字を含む
			String converSt_40 = new String(st.getBytes("Cp1148"), "Cp1148");
			//文字コードの変換：IBM01149…Cp871 の拡張でユーロ文字を含む
			String converSt_41 = new String(st.getBytes("Cp1149"), "Cp1149");
			//文字コードの変換：IBM037…米国、カナダ (2 か国語、フランス語)、オランダ、 ポルトガル、ブラジル、オーストラリア
			String converSt_42 = new String(st.getBytes("Cp037"), "Cp037");
			//文字コードの変換：IBM1026…IBM ラテン文字-5、トルコ
			String converSt_43 = new String(st.getBytes("Cp1026"), "Cp1026");
			//文字コードの変換：IBM1047…ラテン文字-1 (EBCDIC ホスト用)
			String converSt_44 = new String(st.getBytes("Cp1047"), "Cp1047");
			//文字コードの変換：IBM273…IBM オーストリア、ドイツ
			String converSt_45 = new String(st.getBytes("Cp273"), "Cp273");
			//文字コードの変換：IBM277…IBM デンマーク、ノルウェー
			String converSt_46 = new String(st.getBytes("Cp277"), "Cp277");
			//文字コードの変換：IBM278…IBM フィンランド、スウェーデン
			String converSt_47 = new String(st.getBytes("Cp278"), "Cp278");
			//文字コードの変換：IBM280…IBM イタリア
			String converSt_48 = new String(st.getBytes("Cp280"), "Cp280");
			//文字コードの変換：IBM284…IBM カタロニア語/スペイン、スペイン語圏ラテンアメリカ
			String converSt_49 = new String(st.getBytes("Cp284"), "Cp284");
			//文字コードの変換：IBM285…IBM 英国、アイルランド
			String converSt_50 = new String(st.getBytes("Cp285"), "Cp285");
			//文字コードの変換：IBM297…IBM フランス
			String converSt_51 = new String(st.getBytes("Cp297"), "Cp297");
			//文字コードの変換：IBM420…IBM アラビア語
			String converSt_52 = new String(st.getBytes("Cp420"), "Cp420");
			//文字コードの変換：IBM424…IBM ヘブライ語
			String converSt_53 = new String(st.getBytes("Cp424"), "Cp424");
			//文字コードの変換：IBM437…MS-DOS 米国、オーストラリア、ニュージーランド、南アフリカ
			String converSt_54 = new String(st.getBytes("Cp437"), "Cp437");
			//文字コードの変換：IBM500…EBCDIC 500V1
			String converSt_55 = new String(st.getBytes("Cp500"), "Cp500");
			//文字コードの変換：IBM775…PC バルト諸語
			String converSt_56 = new String(st.getBytes("Cp775"), "Cp775");
			//文字コードの変換：IBM850…MS-DOS ラテン文字-1
			String converSt_57 = new String(st.getBytes("Cp850"), "Cp850");
			//文字コードの変換：IBM852…MS-DOS ラテン文字-2
			String converSt_58 = new String(st.getBytes("Cp852"), "Cp852");
			//文字コードの変換：IBM855…IBM キリル文字
			String converSt_59 = new String(st.getBytes("Cp855"), "Cp855");
			//文字コードの変換：IBM857…IBM トルコ語
			String converSt_60 = new String(st.getBytes("Cp857"), "Cp857");
			//文字コードの変換：IBM860…MS-DOS ポルトガル語
			String converSt_61 = new String(st.getBytes("Cp860"), "Cp860");
			//文字コードの変換：IBM861…MS-DOS アイスランド語
			String converSt_62 = new String(st.getBytes("Cp861"), "Cp861");
			//文字コードの変換：IBM862…PC ヘブライ語
			String converSt_63 = new String(st.getBytes("Cp862"), "Cp862");
			//文字コードの変換：IBM863…MS-DOS カナダ系フランス語
			String converSt_64 = new String(st.getBytes("Cp863"), "Cp863");
			//文字コードの変換：IBM864…PC アラビア語
			String converSt_65 = new String(st.getBytes("Cp864"), "Cp864");
			//文字コードの変換：IBM865…MS-DOS 北欧
			String converSt_66 = new String(st.getBytes("Cp865"), "Cp865");
			//文字コードの変換：IBM866…MS-DOS ロシア語
			String converSt_67 = new String(st.getBytes("Cp866"), "Cp866");
			//文字コードの変換：IBM868…MS-DOS パキスタン
			String converSt_68 = new String(st.getBytes("Cp868"), "Cp868");
			//文字コードの変換：IBM869…IBM 近代ギリシャ語
			String converSt_69 = new String(st.getBytes("Cp869"), "Cp869");
			//文字コードの変換：IBM870…IBM 多言語ラテン文字-2
			String converSt_70 = new String(st.getBytes("Cp870"), "Cp870");
			//文字コードの変換：IBM871…IBM アイスランド
			String converSt_71 = new String(st.getBytes("Cp871"), "Cp871");
			//文字コードの変換：IBM918…IBM パキスタン (ウルドゥー語)
			String converSt_72 = new String(st.getBytes("Cp918"), "Cp918");
			//文字コードの変換：ISO-2022-CN…ISO 2022 CN 形式の GB2312 および CNS11643、簡体字および繁体字中国語 (Unicode への変換のみ)
			String converSt_73 = new String(st.getBytes("ISO2022CN"), "ISO2022CN");
			//文字コードの変換：ISO-2022-JP…ISO 2022 形式の JIS X 0201、0208、日本語
			String converSt_74 = new String(st.getBytes("ISO2022JP"), "ISO2022JP");
			//文字コードの変換：ISO-2022-KR…ISO 2022 KR、韓国語
			String converSt_75 = new String(st.getBytes("ISO2022KR"), "ISO2022KR");
			//文字コードの変換：ISO-8859-3…ラテンアルファベット No. 3
			String converSt_76 = new String(st.getBytes("ISO8859_3"), "ISO8859_3");
			//文字コードの変換：ISO-8859-6…ラテン/アラビア語アルファベット
			String converSt_77 = new String(st.getBytes("ISO8859_6"), "ISO8859_6");
			//文字コードの変換：ISO-8859-8…ラテン/ヘブライ語アルファベット
			String converSt_78 = new String(st.getBytes("ISO8859_8"), "ISO8859_8");
			//文字コードの変換：Shift_JIS…Shift-JIS、日本語
			String converSt_79 = new String(st.getBytes("SJIS"), "SJIS");
			//文字コードの変換：TIS-620…TIS620、タイ
			String converSt_80 = new String(st.getBytes("TIS620"), "TIS620");
			//文字コードの変換：windows-1255…Windows ヘブライ語
			String converSt_81 = new String(st.getBytes("Cp1255"), "Cp1255");
			//文字コードの変換：windows-1256…Windows アラビア語
			String converSt_82 = new String(st.getBytes("Cp1256"), "Cp1256");
			//文字コードの変換：windows-1258…Windows ベトナム語
			String converSt_83 = new String(st.getBytes("Cp1258"), "Cp1258");
			//文字コードの変換：windows-31j…Windows 日本語
			String converSt_84 = new String(st.getBytes("MS932"), "MS932");
			//文字コードの変換：x-Big5_Solaris…Big5 (Solaris zh_TW.BIG5 ロケール用の 7 つの追加 Hanzi 表意文字マッピング付き)
			String converSt_85 = new String(st.getBytes("Big5_Solaris"), "Big5_Solaris");
			//文字コードの変換：x-euc-jp-linux…JISX 0201、0208、EUC エンコーディング、日本語
			String converSt_86 = new String(st.getBytes("EUC_JP_LINUX"), "EUC_JP_LINUX");
			//文字コードの変換：x-EUC-TW…CNS11643 (Plane 1-7,15)、EUC エンコーディング、中国語 (繁体字)
			String converSt_87 = new String(st.getBytes("EUC_TW"), "EUC_TW");
			//文字コードの変換：x-eucJP-Open…JISX 0201、0208、0212、EUC エンコーディング、日本語
			String converSt_88 = new String(st.getBytes("EUC_JP_Solaris"), "EUC_JP_Solaris");
			//文字コードの変換：x-IBM1006…IBM AIX パキスタン (ウルドゥー語)
			String converSt_89 = new String(st.getBytes("Cp1006"), "Cp1006");
			//文字コードの変換：x-IBM1025…IBM 多言語キリル文字: ブルガリア、ボスニア、ヘルツェゴビナ、マケドニア (旧ユーゴスラビアマケドニア共和国)
			String converSt_90 = new String(st.getBytes("Cp1025"), "Cp1025");
			//文字コードの変換：x-IBM1046…IBM アラビア語 - Windows
			String converSt_91 = new String(st.getBytes("Cp1046"), "Cp1046");
			//文字コードの変換：x-IBM1097…IBM イラン (現代ペルシャ語)/ペルシャ語
			String converSt_92 = new String(st.getBytes("Cp1097"), "Cp1097");
			//文字コードの変換：x-IBM1098…IBM イラン (現代ペルシャ語)/ペルシャ語 (PC)
			String converSt_93 = new String(st.getBytes("Cp1098"), "Cp1098");
			//文字コードの変換：x-IBM1112…IBM ラトビア、リトアニア
			String converSt_94 = new String(st.getBytes("Cp1112"), "Cp1112");
			//文字コードの変換：x-IBM1122…IBM エストニア
			String converSt_95 = new String(st.getBytes("Cp1122"), "Cp1122");
			//文字コードの変換：x-IBM1123…IBM ウクライナ
			String converSt_96 = new String(st.getBytes("Cp1123"), "Cp1123");
			//文字コードの変換：x-IBM1124…IBM AIX ウクライナ
			String converSt_97 = new String(st.getBytes("Cp1124"), "Cp1124");
			//文字コードの変換：x-IBM1381…IBM OS/2、DOS 中国 (中華人民共和国)
			String converSt_98 = new String(st.getBytes("Cp1381"), "Cp1381");
			//文字コードの変換：x-IBM1383…IBM AIX 中国 (中華人民共和国)
			String converSt_99 = new String(st.getBytes("Cp1383"), "Cp1383");
			//文字コードの変換：x-IBM33722…IBM-eucJP - 日本語 (5050 のスーパーセット)
			String converSt_100 = new String(st.getBytes("Cp33722"), "Cp33722");
			//文字コードの変換：x-IBM737…PC ギリシャ文字
			String converSt_101 = new String(st.getBytes("Cp737"), "Cp737");
			//文字コードの変換：x-IBM856…IBM ヘブライ語
			String converSt_102 = new String(st.getBytes("Cp856"), "Cp856");
			//文字コードの変換：x-IBM874…IBM タイ
			String converSt_103 = new String(st.getBytes("Cp874"), "Cp874");
			//文字コードの変換：x-IBM875…IBM ギリシャ語
			String converSt_104 = new String(st.getBytes("Cp875"), "Cp875");
			//文字コードの変換：x-IBM921…IBM ラトビア、リトアニア (AIX、DOS)
			String converSt_105 = new String(st.getBytes("Cp921"), "Cp921");
			//文字コードの変換：x-IBM922…IBM エストニア (AIX、DOS)
			String converSt_106 = new String(st.getBytes("Cp922"), "Cp922");
			//文字コードの変換：x-IBM930…UDC 4370 文字を含む日本語カタカナ漢字、5026 のスーパーセット
			String converSt_107 = new String(st.getBytes("Cp930"), "Cp930");
			//文字コードの変換：x-IBM933…UDC 1880 文字を含む韓国語、5029 のスーパーセット
			String converSt_108 = new String(st.getBytes("Cp933"), "Cp933");
			//文字コードの変換：x-IBM935…UDC 1880 文字を含む簡体字中国語ホスト、5031 のスーパーセット
			String converSt_109 = new String(st.getBytes("Cp935"), "Cp935");
			//文字コードの変換：x-IBM937…UDC 6204 文字を含む繁体字中国語ホスト、5033 のスーパーセット
			String converSt_110 = new String(st.getBytes("Cp937"), "Cp937");
			//文字コードの変換：x-IBM939…UDC 4370 文字を含む日本語ラテン文字漢字、5035 のスーパーセット
			String converSt_111 = new String(st.getBytes("Cp939"), "Cp939");
			//文字コードの変換：x-IBM942…IBM OS/2 日本語、Cp932 のスーパーセット
			String converSt_112 = new String(st.getBytes("Cp942"), "Cp942");
			//文字コードの変換：x-IBM942C…Cp942 の拡張
			String converSt_113 = new String(st.getBytes("Cp942C"), "Cp942C");
			//文字コードの変換：x-IBM943…IBM OS/2 日本語、Cp932 および Shift-JIS のスーパーセット
			String converSt_114 = new String(st.getBytes("Cp943"), "Cp943");
			//文字コードの変換：x-IBM943C…Cp943 の拡張
			String converSt_115 = new String(st.getBytes("Cp943C"), "Cp943C");
			//文字コードの変換：x-IBM948…OS/2 中国語 (台湾)、938 のスーパーセット
			String converSt_116 = new String(st.getBytes("Cp948"), "Cp948");
			//文字コードの変換：x-IBM949…PC 韓国語
			String converSt_117 = new String(st.getBytes("Cp949"), "Cp949");
			//文字コードの変換：x-IBM949C…Cp949 の拡張
			String converSt_118 = new String(st.getBytes("Cp949C"), "Cp949C");
			//文字コードの変換：x-IBM950…PC 中国語 (香港、台湾)
			String converSt_119 = new String(st.getBytes("Cp950"), "Cp950");
			//文字コードの変換：x-IBM964…AIX 中国語 (台湾)
			String converSt_120 = new String(st.getBytes("Cp964"), "Cp964");
			//文字コードの変換：x-IBM970…AIX 韓国語
			String converSt_121 = new String(st.getBytes("Cp970"), "Cp970");
			//文字コードの変換：x-ISCII91…インド語派 ISCII91 エンコーディング
			String converSt_122 = new String(st.getBytes("ISCII91"), "ISCII91");
			//文字コードの変換：x-ISO2022-CN-CNS…ISO 2022 CN 形式の CNS11643、繁体字中国語 (Unicode からの変換のみ)
			String converSt_123 = new String(st.getBytes("ISO2022_CN_CNS"), "ISO2022_CN_CNS");
			//文字コードの変換：x-ISO2022-CN-GB…ISO 2022 CN 形式の GB2312、簡体字中国語 (Unicode からの変換のみ)
			String converSt_124 = new String(st.getBytes("ISO2022_CN_GB"), "ISO2022_CN_GB");
			//文字コードの変換：x-iso-8859-11…ラテン/タイ語アルファベット
			String converSt_125 = new String(st.getBytes("x-iso-8859-11"), "x-iso-8859-11");
			//文字コードの変換：x-JISAutoDetect…Shift-JIS、EUC-JP、ISO 2022 JP の検出および変換 (Unicode への変換のみ)
			String converSt_126 = new String(st.getBytes("JISAutoDetect"), "JISAutoDetect");
			//文字コードの変換：x-Johab…韓国語、Johab 文字セット
			String converSt_127 = new String(st.getBytes("x-Johab"), "x-Johab");
			//文字コードの変換：x-MacArabic…Macintosh アラビア語
			String converSt_128 = new String(st.getBytes("MacArabic"), "MacArabic");
			//文字コードの変換：x-MacCentralEurope…Macintosh ラテン文字-2
			String converSt_129 = new String(st.getBytes("MacCentralEurope"), "MacCentralEurope");
			//文字コードの変換：x-MacCroatian…Macintosh クロアチア語
			String converSt_130 = new String(st.getBytes("MacCroatian"), "MacCroatian");
			//文字コードの変換：x-MacCyrillic…Macintosh キリル文字
			String converSt_131 = new String(st.getBytes("MacCyrillic"), "MacCyrillic");
			//文字コードの変換：x-MacDingbat…Macintosh Dingbat
			String converSt_132 = new String(st.getBytes("MacDingbat"), "MacDingbat");
			//文字コードの変換：x-MacGreek…Macintosh ギリシャ語
			String converSt_133 = new String(st.getBytes("MacGreek"), "MacGreek");
			//文字コードの変換：x-MacHebrew…Macintosh ヘブライ語
			String converSt_134 = new String(st.getBytes("MacHebrew"), "MacHebrew");
			//文字コードの変換：x-MacIceland…Macintosh アイスランド語
			String converSt_135 = new String(st.getBytes("MacIceland"), "MacIceland");
			//文字コードの変換：x-MacRoman…Macintosh Roman
			String converSt_136 = new String(st.getBytes("MacRoman"), "MacRoman");
			//文字コードの変換：x-MacRomania…Macintosh ルーマニア
			String converSt_137 = new String(st.getBytes("MacRomania"), "MacRomania");
			//文字コードの変換：x-MacSymbol…Macintosh シンボル
			String converSt_138 = new String(st.getBytes("MacSymbol"), "MacSymbol");
			//文字コードの変換：x-MacThai…Macintosh タイ
			String converSt_139 = new String(st.getBytes("MacThai"), "MacThai");
			//文字コードの変換：x-MacTurkish…Macintosh トルコ語
			String converSt_140 = new String(st.getBytes("MacTurkish"), "MacTurkish");
			//文字コードの変換：x-MacUkraine…Macintosh ウクライナ
			String converSt_141 = new String(st.getBytes("MacUkraine"), "MacUkraine");
			//文字コードの変換：x-MS950-HKSCS…Windows 繁体字中国語 (香港の拡張付き)
			String converSt_142 = new String(st.getBytes("MS950_HKSCS"), "MS950_HKSCS");
			//文字コードの変換：x-mswin-936…Windows 簡体字中国語
			String converSt_143 = new String(st.getBytes("MS936"), "MS936");
			//文字コードの変換：x-PCK…Solaris 版の Shift_JIS
			String converSt_144 = new String(st.getBytes("PCK"), "PCK");
			//文字コードの変換：x-windows-874…Windows タイ語
			String converSt_145 = new String(st.getBytes("MS874"), "MS874");
			//文字コードの変換：x-windows-949…Windows 韓国語
			String converSt_146 = new String(st.getBytes("MS949"), "MS949");
			//文字コードの変換：x-windows-950…Windows 繁体字中国語
			String converSt_147 = new String(st.getBytes("MS950"), "MS950");

			//変換後のコードで表示
			System.out.println("ISO 8859-1、ラテンアルファベット No. 1：" + converSt_01);
			System.out.println("ラテンアルファベット No. 2：" + converSt_02);
			System.out.println("ラテンアルファベット No. 4：" + converSt_03);
			System.out.println("ラテン/キリル文字アルファベット：" + converSt_04);
			System.out.println("ラテン/ギリシャ文字アルファベット：" + converSt_05);
			System.out.println("ラテンアルファベット No. 5：" + converSt_06);
			System.out.println("ラテンアルファベット No. 7：" + converSt_07);
			System.out.println("ラテンアルファベット No. 9：" + converSt_08);
			System.out.println("KOI8-R、ロシア語：" + converSt_09);
			System.out.println("American Standard Code for Information Interchange：" + converSt_10);
			System.out.println("8 ビット UCS Transformation Format：" + converSt_11);
			System.out.println("16 ビット UCS Transformation Format、オプションのバイト順マークによって識別されるバイト順：" + converSt_12);
			System.out.println("16 ビット Unicode Transformation Format、ビッグエンディアンバイト順：" + converSt_13);
			System.out.println("16 ビット Unicode Transformation Format、リトルエンディアンバイト順：" + converSt_14);
			System.out.println("Windows 東欧：" + converSt_15);
			System.out.println("Windows キリル文字：" + converSt_16);
			System.out.println("Windows ラテン文字-1：" + converSt_17);
			System.out.println("Windows ギリシャ文字：" + converSt_18);
			System.out.println("Windows トルコ語：" + converSt_19);
			System.out.println("Windows バルト諸語：" + converSt_20);
			System.out.println("16 ビット Unicode Transformation Format、ビッグエンディアンバイト順、バイト順マーク付き：" + converSt_21);
			System.out.println("16 ビット Unicode Transformation Format、リトルエンディアンバイト順、バイト順マーク付き：" + converSt_22);
			System.out.println("Big5、中国語 (繁体字)：" + converSt_23);
			System.out.println("Big5 (香港の拡張付き)、中国語 (繁体字、2001 改訂を組み込み)：" + converSt_24);
			System.out.println("JISX 0201、0208、0212、EUC エンコーディング、日本語：" + converSt_25);
			System.out.println("KS C 5601、EUC エンコーディング、韓国語：" + converSt_26);
			System.out.println("中国語 (簡体字)、中華人民共和国標準：" + converSt_27);
			System.out.println("GB2312、EUC エンコーディング、中国語 (簡体字)：" + converSt_28);
			System.out.println("GBK、中国語 (簡体字)：" + converSt_29);
			System.out.println("IBM タイ拡張 SBCS：" + converSt_30);
			System.out.println("Cp850 の拡張でユーロ文字を含む：" + converSt_31);
			System.out.println("Cp037 の拡張でユーロ文字を含む：" + converSt_32);
			System.out.println("Cp273 の拡張でユーロ文字を含む：" + converSt_33);
			System.out.println("Cp277 の拡張でユーロ文字を含む：" + converSt_34);
			System.out.println("Cp278 の拡張でユーロ文字を含む：" + converSt_35);
			System.out.println("Cp280 の拡張でユーロ文字を含む：" + converSt_36);
			System.out.println("Cp284 の拡張でユーロ文字を含む：" + converSt_37);
			System.out.println("Cp285 の拡張でユーロ文字を含む：" + converSt_38);
			System.out.println("Cp297 の拡張でユーロ文字を含む：" + converSt_39);
			System.out.println("Cp500 の拡張でユーロ文字を含む：" + converSt_40);
			System.out.println("Cp871 の拡張でユーロ文字を含む：" + converSt_41);
			System.out.println("米国、カナダ (2 か国語、フランス語)、オランダ、 ポルトガル、ブラジル、オーストラリア：" + converSt_42);
			System.out.println("IBM ラテン文字-5、トルコ：" + converSt_43);
			System.out.println("ラテン文字-1 (EBCDIC ホスト用)：" + converSt_44);
			System.out.println("IBM オーストリア、ドイツ：" + converSt_45);
			System.out.println("IBM デンマーク、ノルウェー：" + converSt_46);
			System.out.println("IBM フィンランド、スウェーデン：" + converSt_47);
			System.out.println("IBM イタリア：" + converSt_48);
			System.out.println("IBM カタロニア語/スペイン、スペイン語圏ラテンアメリカ：" + converSt_49);
			System.out.println("IBM 英国、アイルランド：" + converSt_50);
			System.out.println("IBM フランス：" + converSt_51);
			System.out.println("IBM アラビア語：" + converSt_52);
			System.out.println("IBM ヘブライ語：" + converSt_53);
			System.out.println("MS-DOS 米国、オーストラリア、ニュージーランド、南アフリカ：" + converSt_54);
			System.out.println("EBCDIC 500V1：" + converSt_55);
			System.out.println("PC バルト諸語：" + converSt_56);
			System.out.println("MS-DOS ラテン文字-1：" + converSt_57);
			System.out.println("MS-DOS ラテン文字-2：" + converSt_58);
			System.out.println("IBM キリル文字：" + converSt_59);
			System.out.println("IBM トルコ語：" + converSt_60);
			System.out.println("MS-DOS ポルトガル語：" + converSt_61);
			System.out.println("MS-DOS アイスランド語：" + converSt_62);
			System.out.println("PC ヘブライ語：" + converSt_63);
			System.out.println("MS-DOS カナダ系フランス語：" + converSt_64);
			System.out.println("PC アラビア語：" + converSt_65);
			System.out.println("MS-DOS 北欧：" + converSt_66);
			System.out.println("MS-DOS ロシア語：" + converSt_67);
			System.out.println("MS-DOS パキスタン：" + converSt_68);
			System.out.println("IBM 近代ギリシャ語：" + converSt_69);
			System.out.println("IBM 多言語ラテン文字-2：" + converSt_70);
			System.out.println("IBM アイスランド：" + converSt_71);
			System.out.println("IBM パキスタン (ウルドゥー語)：" + converSt_72);
			System.out.println("ISO 2022 CN 形式の GB2312 および CNS11643、簡体字および繁体字中国語 (Unicode への変換のみ)：" + converSt_73);
			System.out.println("ISO 2022 形式の JIS X 0201、0208、日本語：" + converSt_74);
			System.out.println("ISO 2022 KR、韓国語：" + converSt_75);
			System.out.println("ラテンアルファベット No. 3：" + converSt_76);
			System.out.println("ラテン/アラビア語アルファベット：" + converSt_77);
			System.out.println("ラテン/ヘブライ語アルファベット：" + converSt_78);
			System.out.println("Shift-JIS、日本語：" + converSt_79);
			System.out.println("TIS620、タイ：" + converSt_80);
			System.out.println("Windows ヘブライ語：" + converSt_81);
			System.out.println("Windows アラビア語：" + converSt_82);
			System.out.println("Windows ベトナム語：" + converSt_83);
			System.out.println("Windows 日本語：" + converSt_84);
			System.out.println("Big5 (Solaris zh_TW.BIG5 ロケール用の 7 つの追加 Hanzi 表意文字マッピング付き)：" + converSt_85);
			System.out.println("JISX 0201、0208、EUC エンコーディング、日本語：" + converSt_86);
			System.out.println("CNS11643 (Plane 1-7,15)、EUC エンコーディング、中国語 (繁体字)：" + converSt_87);
			System.out.println("JISX 0201、0208、0212、EUC エンコーディング、日本語：" + converSt_88);
			System.out.println("IBM AIX パキスタン (ウルドゥー語)：" + converSt_89);
			System.out.println("IBM 多言語キリル文字: ブルガリア、ボスニア、ヘルツェゴビナ、マケドニア (旧ユーゴスラビアマケドニア共和国)：" + converSt_90);
			System.out.println("IBM アラビア語 - Windows：" + converSt_91);
			System.out.println("IBM イラン (現代ペルシャ語)/ペルシャ語：" + converSt_92);
			System.out.println("IBM イラン (現代ペルシャ語)/ペルシャ語 (PC)：" + converSt_93);
			System.out.println("IBM ラトビア、リトアニア：" + converSt_94);
			System.out.println("IBM エストニア：" + converSt_95);
			System.out.println("IBM ウクライナ：" + converSt_96);
			System.out.println("IBM AIX ウクライナ：" + converSt_97);
			System.out.println("IBM OS/2、DOS 中国 (中華人民共和国)：" + converSt_98);
			System.out.println("IBM AIX 中国 (中華人民共和国)：" + converSt_99);
			System.out.println("IBM-eucJP - 日本語 (5050 のスーパーセット)：" + converSt_100);
			System.out.println("PC ギリシャ文字：" + converSt_101);
			System.out.println("IBM ヘブライ語：" + converSt_102);
			System.out.println("IBM タイ：" + converSt_103);
			System.out.println("IBM ギリシャ語：" + converSt_104);
			System.out.println("IBM ラトビア、リトアニア (AIX、DOS)：" + converSt_105);
			System.out.println("IBM エストニア (AIX、DOS)：" + converSt_106);
			System.out.println("UDC 4370 文字を含む日本語カタカナ漢字、5026 のスーパーセット：" + converSt_107);
			System.out.println("UDC 1880 文字を含む韓国語、5029 のスーパーセット：" + converSt_108);
			System.out.println("UDC 1880 文字を含む簡体字中国語ホスト、5031 のスーパーセット：" + converSt_109);
			System.out.println("UDC 6204 文字を含む繁体字中国語ホスト、5033 のスーパーセット：" + converSt_110);
			System.out.println("UDC 4370 文字を含む日本語ラテン文字漢字、5035 のスーパーセット：" + converSt_111);
			System.out.println("IBM OS/2 日本語、Cp932 のスーパーセット：" + converSt_112);
			System.out.println("Cp942 の拡張：" + converSt_113);
			System.out.println("IBM OS/2 日本語、Cp932 および Shift-JIS のスーパーセット：" + converSt_114);
			System.out.println("Cp943 の拡張：" + converSt_115);
			System.out.println("OS/2 中国語 (台湾)、938 のスーパーセット：" + converSt_116);
			System.out.println("PC 韓国語：" + converSt_117);
			System.out.println("Cp949 の拡張：" + converSt_118);
			System.out.println("PC 中国語 (香港、台湾)：" + converSt_119);
			System.out.println("AIX 中国語 (台湾)：" + converSt_120);
			System.out.println("AIX 韓国語：" + converSt_121);
			System.out.println("インド語派 ISCII91 エンコーディング：" + converSt_122);
			System.out.println("ISO 2022 CN 形式の CNS11643、繁体字中国語 (Unicode からの変換のみ)：" + converSt_123);
			System.out.println("ISO 2022 CN 形式の GB2312、簡体字中国語 (Unicode からの変換のみ)：" + converSt_124);
			System.out.println("ラテン/タイ語アルファベット：" + converSt_125);
			System.out.println("Shift-JIS、EUC-JP、ISO 2022 JP の検出および変換 (Unicode への変換のみ)：" + converSt_126);
			System.out.println("韓国語、Johab 文字セット：" + converSt_127);
			System.out.println("Macintosh アラビア語：" + converSt_128);
			System.out.println("Macintosh ラテン文字-2：" + converSt_129);
			System.out.println("Macintosh クロアチア語：" + converSt_130);
			System.out.println("Macintosh キリル文字：" + converSt_131);
			System.out.println("Macintosh Dingbat：" + converSt_132);
			System.out.println("Macintosh ギリシャ語：" + converSt_133);
			System.out.println("Macintosh ヘブライ語：" + converSt_134);
			System.out.println("Macintosh アイスランド語：" + converSt_135);
			System.out.println("Macintosh Roman：" + converSt_136);
			System.out.println("Macintosh ルーマニア：" + converSt_137);
			System.out.println("Macintosh シンボル：" + converSt_138);
			System.out.println("Macintosh タイ：" + converSt_139);
			System.out.println("Macintosh トルコ語：" + converSt_140);
			System.out.println("Macintosh ウクライナ：" + converSt_141);
			System.out.println("Windows 繁体字中国語 (香港の拡張付き)：" + converSt_142);
			System.out.println("Windows 簡体字中国語：" + converSt_143);
			System.out.println("Solaris 版の Shift_JIS：" + converSt_144);
			System.out.println("Windows タイ語：" + converSt_145);
			System.out.println("Windows 韓国語：" + converSt_146);
			System.out.println("Windows 繁体字中国語：" + converSt_147);

		} catch (UnsupportedEncodingException e) {
			// TODO 自動生成された catch ブロック
				e.printStackTrace();

		}
	}

}
