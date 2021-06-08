/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package News;

import Controller.XuLy.RemoveDuplicate;
import Model.VisiterDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ShacoJX
 */
public class GetNuoc {
    
    public ArrayList<String> list_quocgia(){
        try {
            VisiterDAO vidao = new VisiterDAO();
            RemoveDuplicate rem = new RemoveDuplicate();
            ArrayList<String> list1 = vidao.getAllNuoc();
            ArrayList<String> list2 = rem.removeDuplicates(list1);
            return list2;
        } catch (SQLException ex) {
            Logger.getLogger(GetNuoc.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public String QuocGia(String loc) {
        String quocgia = "";
        if (loc.equalsIgnoreCase("AF")) {
            quocgia = "AFGHANISTAN";
        } else if (loc.equalsIgnoreCase("AX")) {
            quocgia = "ALAND ISLANDS";
        } else if (loc.equalsIgnoreCase("AL")) {
            quocgia = "ALBANIA";
        } else if (loc.equalsIgnoreCase("DZ")) {
            quocgia = "ALGERIA";
        } else if (loc.equalsIgnoreCase("AS")) {
            quocgia = "AMERICAN SAMOA";
        } else if (loc.equalsIgnoreCase("AD")) {
            quocgia = "ANDORRA";
        } else if (loc.equalsIgnoreCase("AO")) {
            quocgia = "ANGOLA";
        } else if (loc.equalsIgnoreCase("AI")) {
            quocgia = "ANGUILLA";
        } else if (loc.equalsIgnoreCase("AQ")) {
            quocgia = "ANTARCTICA";
        } else if (loc.equalsIgnoreCase("AG")) {
            quocgia = "ANTIGUA AND BARBUDA";
        } else if (loc.equalsIgnoreCase("AR")) {
            quocgia = "ARGENTINA";
        } else if (loc.equalsIgnoreCase("AM")) {
            quocgia = "ARMENIA";
        } else if (loc.equalsIgnoreCase("AW")) {
            quocgia = "ARUBA";
        } else if (loc.equalsIgnoreCase("AU")) {
            quocgia = "AUSTRALIA";
        } else if (loc.equalsIgnoreCase("AT")) {
            quocgia = "AUSTRIA";
        } else if (loc.equalsIgnoreCase("AZ")) {
            quocgia = "AZERBAIJAN";
        } else if (loc.equalsIgnoreCase("BS")) {
            quocgia = "BAHAMAS";
        } else if (loc.equalsIgnoreCase("BH")) {
            quocgia = "BAHRAIN";
        } else if (loc.equalsIgnoreCase("BD")) {
            quocgia = "BANGLADESH";
        } else if (loc.equalsIgnoreCase("BB")) {
            quocgia = "BARBADOS";
        } else if (loc.equalsIgnoreCase("BY")) {
            quocgia = "BELARUS";
        } else if (loc.equalsIgnoreCase("BE")) {
            quocgia = "BELGIUM";
        } else if (loc.equalsIgnoreCase("BZ")) {
            quocgia = "BELIZE";
        } else if (loc.equalsIgnoreCase("BJ")) {
            quocgia = "BENIN";
        } else if (loc.equalsIgnoreCase("BM")) {
            quocgia = "BERMUDA";
        } else if (loc.equalsIgnoreCase("BT")) {
            quocgia = "BHUTAN";
        } else if (loc.equalsIgnoreCase("BO")) {
            quocgia = "BOLIVIA";
        } else if (loc.equalsIgnoreCase("BA")) {
            quocgia = "BOSNIA AND HERZEGOVINA";
        } else if (loc.equalsIgnoreCase("BW")) {
            quocgia = "BOTSWANA";
        } else if (loc.equalsIgnoreCase("BV")) {
            quocgia = "BOUVET ISLAND";
        } else if (loc.equalsIgnoreCase("BR")) {
            quocgia = "BRAZIL";
        } else if (loc.equalsIgnoreCase("IO")) {
            quocgia = "BRITISH INDIAN OCEAN TERRITORY";
        } else if (loc.equalsIgnoreCase("BN")) {
            quocgia = "BRUNEI DARUSSALAM";
        } else if (loc.equalsIgnoreCase("BG")) {
            quocgia = "BULGARIA";
        } else if (loc.equalsIgnoreCase("BF")) {
            quocgia = "BURKINA FASO";
        } else if (loc.equalsIgnoreCase("BI")) {
            quocgia = "BURUNDI";
        } else if (loc.equalsIgnoreCase("KH")) {
            quocgia = "CAMBODIA";
        } else if (loc.equalsIgnoreCase("CM")) {
            quocgia = "CAMEROON";
        } else if (loc.equalsIgnoreCase("CA")) {
            quocgia = "CANADA";
        } else if (loc.equalsIgnoreCase("CV")) {
            quocgia = "CAPE VERDE";
        } else if (loc.equalsIgnoreCase("KY")) {
            quocgia = "CAYMAN ISLANDS";
        } else if (loc.equalsIgnoreCase("CF")) {
            quocgia = "CENTRAL AFRICAN REPUBLIC";
        } else if (loc.equalsIgnoreCase("TD")) {
            quocgia = "CHAD";
        } else if (loc.equalsIgnoreCase("CL")) {
            quocgia = "CHILE";
        } else if (loc.equalsIgnoreCase("CN")) {
            quocgia = "CHINA";
        } else if (loc.equalsIgnoreCase("CX")) {
            quocgia = "CHRISTMAS ISLAND";
        } else if (loc.equalsIgnoreCase("CC")) {
            quocgia = "COCOS (KEELING) ISLANDS";
        } else if (loc.equalsIgnoreCase("CO")) {
            quocgia = "COLOMBIA";
        } else if (loc.equalsIgnoreCase("KM")) {
            quocgia = "COMOROS";
        } else if (loc.equalsIgnoreCase("CG")) {
            quocgia = "CONGO";
        } else if (loc.equalsIgnoreCase("CD")) {
            quocgia = "CONGO, THE DEMOCRATIC REPUBLIC OF THE";
        } else if (loc.equalsIgnoreCase("CK")) {
            quocgia = "COOK ISLANDS";
        } else if (loc.equalsIgnoreCase("CR")) {
            quocgia = "COSTA RICA";
        } else if (loc.equalsIgnoreCase("CI")) {
            quocgia = "CÔTE D'IVOIRE";
        } else if (loc.equalsIgnoreCase("HR")) {
            quocgia = "CROATIA";
        } else if (loc.equalsIgnoreCase("CU")) {
            quocgia = "CUBA";
        } else if (loc.equalsIgnoreCase("CY")) {
            quocgia = "CYPRUS";
        } else if (loc.equalsIgnoreCase("CZ")) {
            quocgia = "CZECH REPUBLIC";
        } else if (loc.equalsIgnoreCase("DK")) {
            quocgia = "DENMARK";
        } else if (loc.equalsIgnoreCase("DJ")) {
            quocgia = "DJIBOUTI";
        } else if (loc.equalsIgnoreCase("DM")) {
            quocgia = "DOMINICA";
        } else if (loc.equalsIgnoreCase("DO")) {
            quocgia = "DOMINICAN REPUBLIC";
        } else if (loc.equalsIgnoreCase("EC")) {
            quocgia = "ECUADOR";
        } else if (loc.equalsIgnoreCase("EG")) {
            quocgia = "EGYPT";
        } else if (loc.equalsIgnoreCase("SV")) {
            quocgia = "EL SALVADOR";
        } else if (loc.equalsIgnoreCase("GQ")) {
            quocgia = "EQUATORIAL GUINEA";
        } else if (loc.equalsIgnoreCase("ER")) {
            quocgia = "ERITREA";
        } else if (loc.equalsIgnoreCase("EE")) {
            quocgia = "ESTONIA";
        } else if (loc.equalsIgnoreCase("ET")) {
            quocgia = "ETHIOPIA";
        } else if (loc.equalsIgnoreCase("FK")) {
            quocgia = "FALKLAND ISLANDS (MALVINAS)";
        } else if (loc.equalsIgnoreCase("FO")) {
            quocgia = "FAROE ISLANDS";
        } else if (loc.equalsIgnoreCase("FJ")) {
            quocgia = "FIJI";
        } else if (loc.equalsIgnoreCase("FI")) {
            quocgia = "FINLAND";
        } else if (loc.equalsIgnoreCase("FR")) {
            quocgia = "FRANCE";
        } else if (loc.equalsIgnoreCase("GF")) {
            quocgia = "FRENCH GUIANA";
        } else if (loc.equalsIgnoreCase("PF")) {
            quocgia = "FRENCH POLYNESIA";
        } else if (loc.equalsIgnoreCase("TF")) {
            quocgia = "FRENCH SOUTHERN TERRITORIES";
        } else if (loc.equalsIgnoreCase("GA")) {
            quocgia = "GABON";
        } else if (loc.equalsIgnoreCase("GM")) {
            quocgia = "GAMBIA";
        } else if (loc.equalsIgnoreCase("GE")) {
            quocgia = "GEORGIA";
        } else if (loc.equalsIgnoreCase("DE")) {
            quocgia = "GERMANY";
        } else if (loc.equalsIgnoreCase("GH")) {
            quocgia = "GHANA";
        } else if (loc.equalsIgnoreCase("GI")) {
            quocgia = "GIBRALTAR";
        } else if (loc.equalsIgnoreCase("GR")) {
            quocgia = "GREECE";
        } else if (loc.equalsIgnoreCase("GL")) {
            quocgia = "GREENLAND";
        } else if (loc.equalsIgnoreCase("GD")) {
            quocgia = "GRENADA";
        } else if (loc.equalsIgnoreCase("GP")) {
            quocgia = "GUADELOUPE";
        } else if (loc.equalsIgnoreCase("GU")) {
            quocgia = "GUAM";
        } else if (loc.equalsIgnoreCase("GT")) {
            quocgia = "GUATEMALA";
        } else if (loc.equalsIgnoreCase("GN")) {
            quocgia = "GUINEA";
        } else if (loc.equalsIgnoreCase("GW")) {
            quocgia = "GUINEA-BISSAU";
        } else if (loc.equalsIgnoreCase("GY")) {
            quocgia = "GUYANA";
        } else if (loc.equalsIgnoreCase("HT")) {
            quocgia = "HAITI";
        } else if (loc.equalsIgnoreCase("HM")) {
            quocgia = "HEARD ISLAND AND MCDONALD ISLANDS";
        } else if (loc.equalsIgnoreCase("VA")) {
            quocgia = "HOLY SEE (VATICAN CITY STATE)";
        } else if (loc.equalsIgnoreCase("HN")) {
            quocgia = "HONDURAS";
        } else if (loc.equalsIgnoreCase("HK")) {
            quocgia = "HONG KONG";
        } else if (loc.equalsIgnoreCase("HU")) {
            quocgia = "HUNGARY";
        } else if (loc.equalsIgnoreCase("IS")) {
            quocgia = "ICELAND";
        } else if (loc.equalsIgnoreCase("IN")) {
            quocgia = "INDIA";
        } else if (loc.equalsIgnoreCase("ID")) {
            quocgia = "INDONESIA";
        } else if (loc.equalsIgnoreCase("IR")) {
            quocgia = "IRAN, ISLAMIC REPUBLIC OF";
        } else if (loc.equalsIgnoreCase("IQ")) {
            quocgia = "IRAQ";
        } else if (loc.equalsIgnoreCase("IE")) {
            quocgia = "IRELAND";
        } else if (loc.equalsIgnoreCase("IL")) {
            quocgia = "ISRAEL";
        } else if (loc.equalsIgnoreCase("IT")) {
            quocgia = "ITALY";
        } else if (loc.equalsIgnoreCase("JM")) {
            quocgia = "JAMAICA";
        } else if (loc.equalsIgnoreCase("JP")) {
            quocgia = "JAPAN";
        } else if (loc.equalsIgnoreCase("JO")) {
            quocgia = "JORDAN";
        } else if (loc.equalsIgnoreCase("KZ")) {
            quocgia = "KAZAKHSTAN";
        } else if (loc.equalsIgnoreCase("KE")) {
            quocgia = "KENYA";
        } else if (loc.equalsIgnoreCase("KI")) {
            quocgia = "KIRIBATI";
        } else if (loc.equalsIgnoreCase("KP")) {
            quocgia = "KOREA, DEMOCRATIC PEOPLE'S REPUBLIC OF";
        } else if (loc.equalsIgnoreCase("KR")) {
            quocgia = "KOREA, REPUBLIC OF";
        } else if (loc.equalsIgnoreCase("KW")) {
            quocgia = "KUWAIT";
        } else if (loc.equalsIgnoreCase("KG")) {
            quocgia = "KYRGYZSTAN";
        } else if (loc.equalsIgnoreCase("LA")) {
            quocgia = "LAO PEOPLE'S DEMOCRATIC REPUBLIC";
        } else if (loc.equalsIgnoreCase("LV")) {
            quocgia = "LATVIA";
        } else if (loc.equalsIgnoreCase("LB")) {
            quocgia = "LEBANON";
        } else if (loc.equalsIgnoreCase("LS")) {
            quocgia = "LESOTHO";
        } else if (loc.equalsIgnoreCase("LR")) {
            quocgia = "LIBERIA";
        } else if (loc.equalsIgnoreCase("LY")) {
            quocgia = "LIBYAN ARAB JAMAHIRIYA";
        } else if (loc.equalsIgnoreCase("LI")) {
            quocgia = "LIECHTENSTEIN";
        } else if (loc.equalsIgnoreCase("LT")) {
            quocgia = "LITHUANIA";
        } else if (loc.equalsIgnoreCase("LU")) {
            quocgia = "LUXEMBOURG";
        } else if (loc.equalsIgnoreCase("MO")) {
            quocgia = "MACAO";
        } else if (loc.equalsIgnoreCase("MK")) {
            quocgia = "MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF";
        } else if (loc.equalsIgnoreCase("MG")) {
            quocgia = "MADAGASCAR";
        } else if (loc.equalsIgnoreCase("MW")) {
            quocgia = "MALAWI";
        } else if (loc.equalsIgnoreCase("MY")) {
            quocgia = "MALAYSIA";
        } else if (loc.equalsIgnoreCase("MV")) {
            quocgia = "MALDIVES";
        } else if (loc.equalsIgnoreCase("ML")) {
            quocgia = "MALI";
        } else if (loc.equalsIgnoreCase("MT")) {
            quocgia = "MALTA";
        } else if (loc.equalsIgnoreCase("MH")) {
            quocgia = "MARSHALL ISLANDS";
        } else if (loc.equalsIgnoreCase("MQ")) {
            quocgia = "MARTINIQUE";
        } else if (loc.equalsIgnoreCase("MR")) {
            quocgia = "MAURITANIA";
        } else if (loc.equalsIgnoreCase("MU")) {
            quocgia = "MAURITIUS";
        } else if (loc.equalsIgnoreCase("YT")) {
            quocgia = "MAYOTTE";
        } else if (loc.equalsIgnoreCase("MX")) {
            quocgia = "MEXICO";
        } else if (loc.equalsIgnoreCase("FM")) {
            quocgia = "MICRONESIA, FEDERATED STATES OF";
        } else if (loc.equalsIgnoreCase("MD")) {
            quocgia = "MOLDOVA, REPUBLIC OF";
        } else if (loc.equalsIgnoreCase("MC")) {
            quocgia = "MONACO";
        } else if (loc.equalsIgnoreCase("MN")) {
            quocgia = "MONGOLIA";
        } else if (loc.equalsIgnoreCase("MS")) {
            quocgia = "MONTSERRAT";
        } else if (loc.equalsIgnoreCase("MA")) {
            quocgia = "MOROCCO";
        } else if (loc.equalsIgnoreCase("MZ")) {
            quocgia = "MOZAMBIQUE";
        } else if (loc.equalsIgnoreCase("MM")) {
            quocgia = "MYANMAR";
        } else if (loc.equalsIgnoreCase("NA")) {
            quocgia = "NAMIBIA";
        } else if (loc.equalsIgnoreCase("NR")) {
            quocgia = "NAURU";
        } else if (loc.equalsIgnoreCase("NP")) {
            quocgia = "NEPAL";
        } else if (loc.equalsIgnoreCase("NL")) {
            quocgia = "NETHERLANDS";
        } else if (loc.equalsIgnoreCase("AN")) {
            quocgia = "NETHERLANDS ANTILLES";
        } else if (loc.equalsIgnoreCase("NC")) {
            quocgia = "NEW CALEDONIA";
        } else if (loc.equalsIgnoreCase("NZ")) {
            quocgia = "NEW ZEALAND";
        } else if (loc.equalsIgnoreCase("NI")) {
            quocgia = "NICARAGUA";
        } else if (loc.equalsIgnoreCase("NE")) {
            quocgia = "NIGER";
        } else if (loc.equalsIgnoreCase("NG")) {
            quocgia = "NIGERIA";
        } else if (loc.equalsIgnoreCase("NU")) {
            quocgia = "NIUE";
        } else if (loc.equalsIgnoreCase("NF")) {
            quocgia = "NORFOLK ISLAND";
        } else if (loc.equalsIgnoreCase("MP")) {
            quocgia = "NORTHERN MARIANA ISLANDS";
        } else if (loc.equalsIgnoreCase("NO")) {
            quocgia = "NORWAY";
        } else if (loc.equalsIgnoreCase("OM")) {
            quocgia = "OMAN";
        } else if (loc.equalsIgnoreCase("PK")) {
            quocgia = "PAKISTAN";
        } else if (loc.equalsIgnoreCase("PW")) {
            quocgia = "PALAU";
        } else if (loc.equalsIgnoreCase("PS")) {
            quocgia = "PALESTINIAN TERRITORY, OCCUPIED";
        } else if (loc.equalsIgnoreCase("PA")) {
            quocgia = "PANAMA";
        } else if (loc.equalsIgnoreCase("PG")) {
            quocgia = "PAPUA NEW GUINEA";
        } else if (loc.equalsIgnoreCase("PY")) {
            quocgia = "PARAGUAY";
        } else if (loc.equalsIgnoreCase("PE")) {
            quocgia = "PERU";
        } else if (loc.equalsIgnoreCase("PH")) {
            quocgia = "PHILIPPINES";
        } else if (loc.equalsIgnoreCase("PN")) {
            quocgia = "PITCAIRN";
        } else if (loc.equalsIgnoreCase("PL")) {
            quocgia = "POLAND";
        } else if (loc.equalsIgnoreCase("PT")) {
            quocgia = "PORTUGAL";
        } else if (loc.equalsIgnoreCase("PR")) {
            quocgia = "PUERTO RICO";
        } else if (loc.equalsIgnoreCase("QA")) {
            quocgia = "QATAR";
        } else if (loc.equalsIgnoreCase("RE")) {
            quocgia = "RÉUNION";
        } else if (loc.equalsIgnoreCase("RO")) {
            quocgia = "ROMANIA";
        } else if (loc.equalsIgnoreCase("RU")) {
            quocgia = "RUSSIAN FEDERATION";
        } else if (loc.equalsIgnoreCase("RW")) {
            quocgia = "RWANDA";
        } else if (loc.equalsIgnoreCase("SH")) {
            quocgia = "SAINT HELENA";
        } else if (loc.equalsIgnoreCase("KN")) {
            quocgia = "SAINT KITTS AND NEVIS";
        } else if (loc.equalsIgnoreCase("LC")) {
            quocgia = "SAINT LUCIA";
        } else if (loc.equalsIgnoreCase("PM")) {
            quocgia = "SAINT PIERRE AND MIQUELON";
        } else if (loc.equalsIgnoreCase("VC")) {
            quocgia = "SAINT VINCENT AND THE GRENADINES";
        } else if (loc.equalsIgnoreCase("WS")) {
            quocgia = "SAMOA";
        } else if (loc.equalsIgnoreCase("SM")) {
            quocgia = "SAN MARINO";
        } else if (loc.equalsIgnoreCase("ST")) {
            quocgia = "SAO TOME AND PRINCIPE";
        } else if (loc.equalsIgnoreCase("SA")) {
            quocgia = "SAUDI ARABIA";
        } else if (loc.equalsIgnoreCase("SN")) {
            quocgia = "SENEGAL";
        } else if (loc.equalsIgnoreCase("CS")) {
            quocgia = "SERBIA AND MONTENEGRO";
        } else if (loc.equalsIgnoreCase("SC")) {
            quocgia = "SEYCHELLES";
        } else if (loc.equalsIgnoreCase("SL")) {
            quocgia = "SIERRA LEONE";
        } else if (loc.equalsIgnoreCase("SG")) {
            quocgia = "SINGAPORE";
        } else if (loc.equalsIgnoreCase("SK")) {
            quocgia = "SLOVAKIA";
        } else if (loc.equalsIgnoreCase("SI")) {
            quocgia = "SLOVENIA";
        } else if (loc.equalsIgnoreCase("SB")) {
            quocgia = "SOLOMON ISLANDS";
        } else if (loc.equalsIgnoreCase("SO")) {
            quocgia = "SOMALIA";
        } else if (loc.equalsIgnoreCase("ZA")) {
            quocgia = "SOUTH AFRICA";
        } else if (loc.equalsIgnoreCase("GS")) {
            quocgia = "SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS";
        } else if (loc.equalsIgnoreCase("ES")) {
            quocgia = "SPAIN";
        } else if (loc.equalsIgnoreCase("LK")) {
            quocgia = "SRI LANKA";
        } else if (loc.equalsIgnoreCase("SD")) {
            quocgia = "SUDAN";
        } else if (loc.equalsIgnoreCase("SR")) {
            quocgia = "SURINAME";
        } else if (loc.equalsIgnoreCase("SJ")) {
            quocgia = "SVALBARD AND JAN MAYEN";
        } else if (loc.equalsIgnoreCase("SZ")) {
            quocgia = "SWAZILAND";
        } else if (loc.equalsIgnoreCase("SE")) {
            quocgia = "SWEDEN";
        } else if (loc.equalsIgnoreCase("CH")) {
            quocgia = "SWITZERLAND";
        } else if (loc.equalsIgnoreCase("SY")) {
            quocgia = "SYRIAN ARAB REPUBLIC";
        } else if (loc.equalsIgnoreCase("TW")) {
            quocgia = "TAIWAN, PROVINCE OF CHINA";
        } else if (loc.equalsIgnoreCase("TJ")) {
            quocgia = "TAJIKISTAN";
        } else if (loc.equalsIgnoreCase("TZ")) {
            quocgia = "TANZANIA, UNITED REPUBLIC OF";
        } else if (loc.equalsIgnoreCase("TH")) {
            quocgia = "THAILAND";
        } else if (loc.equalsIgnoreCase("TL")) {
            quocgia = "TIMOR-LESTE";
        } else if (loc.equalsIgnoreCase("TG")) {
            quocgia = "TOGO";
        } else if (loc.equalsIgnoreCase("TK")) {
            quocgia = "TOKELAU";
        } else if (loc.equalsIgnoreCase("TO")) {
            quocgia = "TONGA";
        } else if (loc.equalsIgnoreCase("TT")) {
            quocgia = "TRINIDAD AND TOBAGO";
        } else if (loc.equalsIgnoreCase("TN")) {
            quocgia = "TUNISIA";
        } else if (loc.equalsIgnoreCase("TR")) {
            quocgia = "TURKEY";
        } else if (loc.equalsIgnoreCase("TM")) {
            quocgia = "TURKMENISTAN";
        } else if (loc.equalsIgnoreCase("TC")) {
            quocgia = "TURKS AND CAICOS ISLANDS";
        } else if (loc.equalsIgnoreCase("TV")) {
            quocgia = "TUVALU";
        } else if (loc.equalsIgnoreCase("UG")) {
            quocgia = "UGANDA";
        } else if (loc.equalsIgnoreCase("UA")) {
            quocgia = "UKRAINE";
        } else if (loc.equalsIgnoreCase("AE")) {
            quocgia = "UNITED ARAB EMIRATES";
        } else if (loc.equalsIgnoreCase("GB")) {
            quocgia = "UNITED KINGDOM";
        } else if (loc.equalsIgnoreCase("US")) {
            quocgia = "UNITED STATES";
        } else if (loc.equalsIgnoreCase("UM")) {
            quocgia = "UNITED STATES MINOR OUTLYING ISLANDS";
        } else if (loc.equalsIgnoreCase("UY")) {
            quocgia = "URUGUAY";
        } else if (loc.equalsIgnoreCase("UZ")) {
            quocgia = "UZBEKISTAN";
        } else if (loc.equalsIgnoreCase("VU")) {
            quocgia = "VANUATU";
        } else if (loc.equalsIgnoreCase("VE")) {
            quocgia = "VENEZUELA";
        } else if (loc.equalsIgnoreCase("VN")) {
            quocgia = "VIET NAM";
        } else if (loc.equalsIgnoreCase("VG")) {
            quocgia = "VIRGIN ISLANDS, BRITISH";
        } else if (loc.equalsIgnoreCase("VI")) {
            quocgia = "VIRGIN ISLANDS, U.S.";
        } else if (loc.equalsIgnoreCase("WF")) {
            quocgia = "WALLIS AND FUTUNA";
        } else if (loc.equalsIgnoreCase("EH")) {
            quocgia = "WESTERN SAHARA";
        } else if (loc.equalsIgnoreCase("YE")) {
            quocgia = "YEMEN";
        } else if (loc.equalsIgnoreCase("ZM")) {
            quocgia = "ZAMBIA";
        } else if (loc.equalsIgnoreCase("ZW")) {
            quocgia = "ZIMBABWE";
        }else{
            quocgia = "unknow";
        }
        return quocgia;

    }
    
}
