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
    
    public String QuocGia(String loca) {
        String[] loc = loca.split("-");
        String quocgia = "";
        if (loc[1].trim().equalsIgnoreCase("AF")) {
            quocgia = "AFGHANISTAN";
        } else if (loc[1].trim().equalsIgnoreCase("AX")) {
            quocgia = "ALAND ISLANDS";
        } else if (loc[1].trim().equalsIgnoreCase("AL")) {
            quocgia = "ALBANIA";
        } else if (loc[1].trim().equalsIgnoreCase("DZ")) {
            quocgia = "ALGERIA";
        } else if (loc[1].trim().equalsIgnoreCase("AS")) {
            quocgia = "AMERICAN SAMOA";
        } else if (loc[1].trim().equalsIgnoreCase("AD")) {
            quocgia = "ANDORRA";
        } else if (loc[1].trim().equalsIgnoreCase("AO")) {
            quocgia = "ANGOLA";
        } else if (loc[1].trim().equalsIgnoreCase("AI")) {
            quocgia = "ANGUILLA";
        } else if (loc[1].trim().equalsIgnoreCase("AQ")) {
            quocgia = "ANTARCTICA";
        } else if (loc[1].trim().equalsIgnoreCase("AG")) {
            quocgia = "ANTIGUA AND BARBUDA";
        } else if (loc[1].trim().equalsIgnoreCase("AR")) {
            quocgia = "ARGENTINA";
        } else if (loc[1].trim().equalsIgnoreCase("AM")) {
            quocgia = "ARMENIA";
        } else if (loc[1].trim().equalsIgnoreCase("AW")) {
            quocgia = "ARUBA";
        } else if (loc[1].trim().equalsIgnoreCase("AU")) {
            quocgia = "AUSTRALIA";
        } else if (loc[1].trim().equalsIgnoreCase("AT")) {
            quocgia = "AUSTRIA";
        } else if (loc[1].trim().equalsIgnoreCase("AZ")) {
            quocgia = "AZERBAIJAN";
        } else if (loc[1].trim().equalsIgnoreCase("BS")) {
            quocgia = "BAHAMAS";
        } else if (loc[1].trim().equalsIgnoreCase("BH")) {
            quocgia = "BAHRAIN";
        } else if (loc[1].trim().equalsIgnoreCase("BD")) {
            quocgia = "BANGLADESH";
        } else if (loc[1].trim().equalsIgnoreCase("BB")) {
            quocgia = "BARBADOS";
        } else if (loc[1].trim().equalsIgnoreCase("BY")) {
            quocgia = "BELARUS";
        } else if (loc[1].trim().equalsIgnoreCase("BE")) {
            quocgia = "BELGIUM";
        } else if (loc[1].trim().equalsIgnoreCase("BZ")) {
            quocgia = "BELIZE";
        } else if (loc[1].trim().equalsIgnoreCase("BJ")) {
            quocgia = "BENIN";
        } else if (loc[1].trim().equalsIgnoreCase("BM")) {
            quocgia = "BERMUDA";
        } else if (loc[1].trim().equalsIgnoreCase("BT")) {
            quocgia = "BHUTAN";
        } else if (loc[1].trim().equalsIgnoreCase("BO")) {
            quocgia = "BOLIVIA";
        } else if (loc[1].trim().equalsIgnoreCase("BA")) {
            quocgia = "BOSNIA AND HERZEGOVINA";
        } else if (loc[1].trim().equalsIgnoreCase("BW")) {
            quocgia = "BOTSWANA";
        } else if (loc[1].trim().equalsIgnoreCase("BV")) {
            quocgia = "BOUVET ISLAND";
        } else if (loc[1].trim().equalsIgnoreCase("BR")) {
            quocgia = "BRAZIL";
        } else if (loc[1].trim().equalsIgnoreCase("IO")) {
            quocgia = "BRITISH INDIAN OCEAN TERRITORY";
        } else if (loc[1].trim().equalsIgnoreCase("BN")) {
            quocgia = "BRUNEI DARUSSALAM";
        } else if (loc[1].trim().equalsIgnoreCase("BG")) {
            quocgia = "BULGARIA";
        } else if (loc[1].trim().equalsIgnoreCase("BF")) {
            quocgia = "BURKINA FASO";
        } else if (loc[1].trim().equalsIgnoreCase("BI")) {
            quocgia = "BURUNDI";
        } else if (loc[1].trim().equalsIgnoreCase("KH")) {
            quocgia = "CAMBODIA";
        } else if (loc[1].trim().equalsIgnoreCase("CM")) {
            quocgia = "CAMEROON";
        } else if (loc[1].trim().equalsIgnoreCase("CA")) {
            quocgia = "CANADA";
        } else if (loc[1].trim().equalsIgnoreCase("CV")) {
            quocgia = "CAPE VERDE";
        } else if (loc[1].trim().equalsIgnoreCase("KY")) {
            quocgia = "CAYMAN ISLANDS";
        } else if (loc[1].trim().equalsIgnoreCase("CF")) {
            quocgia = "CENTRAL AFRICAN REPUBLIC";
        } else if (loc[1].trim().equalsIgnoreCase("TD")) {
            quocgia = "CHAD";
        } else if (loc[1].trim().equalsIgnoreCase("CL")) {
            quocgia = "CHILE";
        } else if (loc[1].trim().equalsIgnoreCase("CN")) {
            quocgia = "CHINA";
        } else if (loc[1].trim().equalsIgnoreCase("CX")) {
            quocgia = "CHRISTMAS ISLAND";
        } else if (loc[1].trim().equalsIgnoreCase("CC")) {
            quocgia = "COCOS (KEELING) ISLANDS";
        } else if (loc[1].trim().equalsIgnoreCase("CO")) {
            quocgia = "COLOMBIA";
        } else if (loc[1].trim().equalsIgnoreCase("KM")) {
            quocgia = "COMOROS";
        } else if (loc[1].trim().equalsIgnoreCase("CG")) {
            quocgia = "CONGO";
        } else if (loc[1].trim().equalsIgnoreCase("CD")) {
            quocgia = "CONGO, THE DEMOCRATIC REPUBLIC OF THE";
        } else if (loc[1].trim().equalsIgnoreCase("CK")) {
            quocgia = "COOK ISLANDS";
        } else if (loc[1].trim().equalsIgnoreCase("CR")) {
            quocgia = "COSTA RICA";
        } else if (loc[1].trim().equalsIgnoreCase("CI")) {
            quocgia = "CÔTE D'IVOIRE";
        } else if (loc[1].trim().equalsIgnoreCase("HR")) {
            quocgia = "CROATIA";
        } else if (loc[1].trim().equalsIgnoreCase("CU")) {
            quocgia = "CUBA";
        } else if (loc[1].trim().equalsIgnoreCase("CY")) {
            quocgia = "CYPRUS";
        } else if (loc[1].trim().equalsIgnoreCase("CZ")) {
            quocgia = "CZECH REPUBLIC";
        } else if (loc[1].trim().equalsIgnoreCase("DK")) {
            quocgia = "DENMARK";
        } else if (loc[1].trim().equalsIgnoreCase("DJ")) {
            quocgia = "DJIBOUTI";
        } else if (loc[1].trim().equalsIgnoreCase("DM")) {
            quocgia = "DOMINICA";
        } else if (loc[1].trim().equalsIgnoreCase("DO")) {
            quocgia = "DOMINICAN REPUBLIC";
        } else if (loc[1].trim().equalsIgnoreCase("EC")) {
            quocgia = "ECUADOR";
        } else if (loc[1].trim().equalsIgnoreCase("EG")) {
            quocgia = "EGYPT";
        } else if (loc[1].trim().equalsIgnoreCase("SV")) {
            quocgia = "EL SALVADOR";
        } else if (loc[1].trim().equalsIgnoreCase("GQ")) {
            quocgia = "EQUATORIAL GUINEA";
        } else if (loc[1].trim().equalsIgnoreCase("ER")) {
            quocgia = "ERITREA";
        } else if (loc[1].trim().equalsIgnoreCase("EE")) {
            quocgia = "ESTONIA";
        } else if (loc[1].trim().equalsIgnoreCase("ET")) {
            quocgia = "ETHIOPIA";
        } else if (loc[1].trim().equalsIgnoreCase("FK")) {
            quocgia = "FALKLAND ISLANDS (MALVINAS)";
        } else if (loc[1].trim().equalsIgnoreCase("FO")) {
            quocgia = "FAROE ISLANDS";
        } else if (loc[1].trim().equalsIgnoreCase("FJ")) {
            quocgia = "FIJI";
        } else if (loc[1].trim().equalsIgnoreCase("FI")) {
            quocgia = "FINLAND";
        } else if (loc[1].trim().equalsIgnoreCase("FR")) {
            quocgia = "FRANCE";
        } else if (loc[1].trim().equalsIgnoreCase("GF")) {
            quocgia = "FRENCH GUIANA";
        } else if (loc[1].trim().equalsIgnoreCase("PF")) {
            quocgia = "FRENCH POLYNESIA";
        } else if (loc[1].trim().equalsIgnoreCase("TF")) {
            quocgia = "FRENCH SOUTHERN TERRITORIES";
        } else if (loc[1].trim().equalsIgnoreCase("GA")) {
            quocgia = "GABON";
        } else if (loc[1].trim().equalsIgnoreCase("GM")) {
            quocgia = "GAMBIA";
        } else if (loc[1].trim().equalsIgnoreCase("GE")) {
            quocgia = "GEORGIA";
        } else if (loc[1].trim().equalsIgnoreCase("DE")) {
            quocgia = "GERMANY";
        } else if (loc[1].trim().equalsIgnoreCase("GH")) {
            quocgia = "GHANA";
        } else if (loc[1].trim().equalsIgnoreCase("GI")) {
            quocgia = "GIBRALTAR";
        } else if (loc[1].trim().equalsIgnoreCase("GR")) {
            quocgia = "GREECE";
        } else if (loc[1].trim().equalsIgnoreCase("GL")) {
            quocgia = "GREENLAND";
        } else if (loc[1].trim().equalsIgnoreCase("GD")) {
            quocgia = "GRENADA";
        } else if (loc[1].trim().equalsIgnoreCase("GP")) {
            quocgia = "GUADELOUPE";
        } else if (loc[1].trim().equalsIgnoreCase("GU")) {
            quocgia = "GUAM";
        } else if (loc[1].trim().equalsIgnoreCase("GT")) {
            quocgia = "GUATEMALA";
        } else if (loc[1].trim().equalsIgnoreCase("GN")) {
            quocgia = "GUINEA";
        } else if (loc[1].trim().equalsIgnoreCase("GW")) {
            quocgia = "GUINEA-BISSAU";
        } else if (loc[1].trim().equalsIgnoreCase("GY")) {
            quocgia = "GUYANA";
        } else if (loc[1].trim().equalsIgnoreCase("HT")) {
            quocgia = "HAITI";
        } else if (loc[1].trim().equalsIgnoreCase("HM")) {
            quocgia = "HEARD ISLAND AND MCDONALD ISLANDS";
        } else if (loc[1].trim().equalsIgnoreCase("VA")) {
            quocgia = "HOLY SEE (VATICAN CITY STATE)";
        } else if (loc[1].trim().equalsIgnoreCase("HN")) {
            quocgia = "HONDURAS";
        } else if (loc[1].trim().equalsIgnoreCase("HK")) {
            quocgia = "HONG KONG";
        } else if (loc[1].trim().equalsIgnoreCase("HU")) {
            quocgia = "HUNGARY";
        } else if (loc[1].trim().equalsIgnoreCase("IS")) {
            quocgia = "ICELAND";
        } else if (loc[1].trim().equalsIgnoreCase("IN")) {
            quocgia = "INDIA";
        } else if (loc[1].trim().equalsIgnoreCase("ID")) {
            quocgia = "INDONESIA";
        } else if (loc[1].trim().equalsIgnoreCase("IR")) {
            quocgia = "IRAN, ISLAMIC REPUBLIC OF";
        } else if (loc[1].trim().equalsIgnoreCase("IQ")) {
            quocgia = "IRAQ";
        } else if (loc[1].trim().equalsIgnoreCase("IE")) {
            quocgia = "IRELAND";
        } else if (loc[1].trim().equalsIgnoreCase("IL")) {
            quocgia = "ISRAEL";
        } else if (loc[1].trim().equalsIgnoreCase("IT")) {
            quocgia = "ITALY";
        } else if (loc[1].trim().equalsIgnoreCase("JM")) {
            quocgia = "JAMAICA";
        } else if (loc[1].trim().equalsIgnoreCase("JP")) {
            quocgia = "JAPAN";
        } else if (loc[1].trim().equalsIgnoreCase("JO")) {
            quocgia = "JORDAN";
        } else if (loc[1].trim().equalsIgnoreCase("KZ")) {
            quocgia = "KAZAKHSTAN";
        } else if (loc[1].trim().equalsIgnoreCase("KE")) {
            quocgia = "KENYA";
        } else if (loc[1].trim().equalsIgnoreCase("KI")) {
            quocgia = "KIRIBATI";
        } else if (loc[1].trim().equalsIgnoreCase("KP")) {
            quocgia = "KOREA, DEMOCRATIC PEOPLE'S REPUBLIC OF";
        } else if (loc[1].trim().equalsIgnoreCase("KR")) {
            quocgia = "KOREA, REPUBLIC OF";
        } else if (loc[1].trim().equalsIgnoreCase("KW")) {
            quocgia = "KUWAIT";
        } else if (loc[1].trim().equalsIgnoreCase("KG")) {
            quocgia = "KYRGYZSTAN";
        } else if (loc[1].trim().equalsIgnoreCase("LA")) {
            quocgia = "LAO PEOPLE'S DEMOCRATIC REPUBLIC";
        } else if (loc[1].trim().equalsIgnoreCase("LV")) {
            quocgia = "LATVIA";
        } else if (loc[1].trim().equalsIgnoreCase("LB")) {
            quocgia = "LEBANON";
        } else if (loc[1].trim().equalsIgnoreCase("LS")) {
            quocgia = "LESOTHO";
        } else if (loc[1].trim().equalsIgnoreCase("LR")) {
            quocgia = "LIBERIA";
        } else if (loc[1].trim().equalsIgnoreCase("LY")) {
            quocgia = "LIBYAN ARAB JAMAHIRIYA";
        } else if (loc[1].trim().equalsIgnoreCase("LI")) {
            quocgia = "LIECHTENSTEIN";
        } else if (loc[1].trim().equalsIgnoreCase("LT")) {
            quocgia = "LITHUANIA";
        } else if (loc[1].trim().equalsIgnoreCase("LU")) {
            quocgia = "LUXEMBOURG";
        } else if (loc[1].trim().equalsIgnoreCase("MO")) {
            quocgia = "MACAO";
        } else if (loc[1].trim().equalsIgnoreCase("MK")) {
            quocgia = "MACEDONIA, THE FORMER YUGOSLAV REPUBLIC OF";
        } else if (loc[1].trim().equalsIgnoreCase("MG")) {
            quocgia = "MADAGASCAR";
        } else if (loc[1].trim().equalsIgnoreCase("MW")) {
            quocgia = "MALAWI";
        } else if (loc[1].trim().equalsIgnoreCase("MY")) {
            quocgia = "MALAYSIA";
        } else if (loc[1].trim().equalsIgnoreCase("MV")) {
            quocgia = "MALDIVES";
        } else if (loc[1].trim().equalsIgnoreCase("ML")) {
            quocgia = "MALI";
        } else if (loc[1].trim().equalsIgnoreCase("MT")) {
            quocgia = "MALTA";
        } else if (loc[1].trim().equalsIgnoreCase("MH")) {
            quocgia = "MARSHALL ISLANDS";
        } else if (loc[1].trim().equalsIgnoreCase("MQ")) {
            quocgia = "MARTINIQUE";
        } else if (loc[1].trim().equalsIgnoreCase("MR")) {
            quocgia = "MAURITANIA";
        } else if (loc[1].trim().equalsIgnoreCase("MU")) {
            quocgia = "MAURITIUS";
        } else if (loc[1].trim().equalsIgnoreCase("YT")) {
            quocgia = "MAYOTTE";
        } else if (loc[1].trim().equalsIgnoreCase("MX")) {
            quocgia = "MEXICO";
        } else if (loc[1].trim().equalsIgnoreCase("FM")) {
            quocgia = "MICRONESIA, FEDERATED STATES OF";
        } else if (loc[1].trim().equalsIgnoreCase("MD")) {
            quocgia = "MOLDOVA, REPUBLIC OF";
        } else if (loc[1].trim().equalsIgnoreCase("MC")) {
            quocgia = "MONACO";
        } else if (loc[1].trim().equalsIgnoreCase("MN")) {
            quocgia = "MONGOLIA";
        } else if (loc[1].trim().equalsIgnoreCase("MS")) {
            quocgia = "MONTSERRAT";
        } else if (loc[1].trim().equalsIgnoreCase("MA")) {
            quocgia = "MOROCCO";
        } else if (loc[1].trim().equalsIgnoreCase("MZ")) {
            quocgia = "MOZAMBIQUE";
        } else if (loc[1].trim().equalsIgnoreCase("MM")) {
            quocgia = "MYANMAR";
        } else if (loc[1].trim().equalsIgnoreCase("NA")) {
            quocgia = "NAMIBIA";
        } else if (loc[1].trim().equalsIgnoreCase("NR")) {
            quocgia = "NAURU";
        } else if (loc[1].trim().equalsIgnoreCase("NP")) {
            quocgia = "NEPAL";
        } else if (loc[1].trim().equalsIgnoreCase("NL")) {
            quocgia = "NETHERLANDS";
        } else if (loc[1].trim().equalsIgnoreCase("AN")) {
            quocgia = "NETHERLANDS ANTILLES";
        } else if (loc[1].trim().equalsIgnoreCase("NC")) {
            quocgia = "NEW CALEDONIA";
        } else if (loc[1].trim().equalsIgnoreCase("NZ")) {
            quocgia = "NEW ZEALAND";
        } else if (loc[1].trim().equalsIgnoreCase("NI")) {
            quocgia = "NICARAGUA";
        } else if (loc[1].trim().equalsIgnoreCase("NE")) {
            quocgia = "NIGER";
        } else if (loc[1].trim().equalsIgnoreCase("NG")) {
            quocgia = "NIGERIA";
        } else if (loc[1].trim().equalsIgnoreCase("NU")) {
            quocgia = "NIUE";
        } else if (loc[1].trim().equalsIgnoreCase("NF")) {
            quocgia = "NORFOLK ISLAND";
        } else if (loc[1].trim().equalsIgnoreCase("MP")) {
            quocgia = "NORTHERN MARIANA ISLANDS";
        } else if (loc[1].trim().equalsIgnoreCase("NO")) {
            quocgia = "NORWAY";
        } else if (loc[1].trim().equalsIgnoreCase("OM")) {
            quocgia = "OMAN";
        } else if (loc[1].trim().equalsIgnoreCase("PK")) {
            quocgia = "PAKISTAN";
        } else if (loc[1].trim().equalsIgnoreCase("PW")) {
            quocgia = "PALAU";
        } else if (loc[1].trim().equalsIgnoreCase("PS")) {
            quocgia = "PALESTINIAN TERRITORY, OCCUPIED";
        } else if (loc[1].trim().equalsIgnoreCase("PA")) {
            quocgia = "PANAMA";
        } else if (loc[1].trim().equalsIgnoreCase("PG")) {
            quocgia = "PAPUA NEW GUINEA";
        } else if (loc[1].trim().equalsIgnoreCase("PY")) {
            quocgia = "PARAGUAY";
        } else if (loc[1].trim().equalsIgnoreCase("PE")) {
            quocgia = "PERU";
        } else if (loc[1].trim().equalsIgnoreCase("PH")) {
            quocgia = "PHILIPPINES";
        } else if (loc[1].trim().equalsIgnoreCase("PN")) {
            quocgia = "PITCAIRN";
        } else if (loc[1].trim().equalsIgnoreCase("PL")) {
            quocgia = "POLAND";
        } else if (loc[1].trim().equalsIgnoreCase("PT")) {
            quocgia = "PORTUGAL";
        } else if (loc[1].trim().equalsIgnoreCase("PR")) {
            quocgia = "PUERTO RICO";
        } else if (loc[1].trim().equalsIgnoreCase("QA")) {
            quocgia = "QATAR";
        } else if (loc[1].trim().equalsIgnoreCase("RE")) {
            quocgia = "RÉUNION";
        } else if (loc[1].trim().equalsIgnoreCase("RO")) {
            quocgia = "ROMANIA";
        } else if (loc[1].trim().equalsIgnoreCase("RU")) {
            quocgia = "RUSSIAN FEDERATION";
        } else if (loc[1].trim().equalsIgnoreCase("RW")) {
            quocgia = "RWANDA";
        } else if (loc[1].trim().equalsIgnoreCase("SH")) {
            quocgia = "SAINT HELENA";
        } else if (loc[1].trim().equalsIgnoreCase("KN")) {
            quocgia = "SAINT KITTS AND NEVIS";
        } else if (loc[1].trim().equalsIgnoreCase("LC")) {
            quocgia = "SAINT LUCIA";
        } else if (loc[1].trim().equalsIgnoreCase("PM")) {
            quocgia = "SAINT PIERRE AND MIQUELON";
        } else if (loc[1].trim().equalsIgnoreCase("VC")) {
            quocgia = "SAINT VINCENT AND THE GRENADINES";
        } else if (loc[1].trim().equalsIgnoreCase("WS")) {
            quocgia = "SAMOA";
        } else if (loc[1].trim().equalsIgnoreCase("SM")) {
            quocgia = "SAN MARINO";
        } else if (loc[1].trim().equalsIgnoreCase("ST")) {
            quocgia = "SAO TOME AND PRINCIPE";
        } else if (loc[1].trim().equalsIgnoreCase("SA")) {
            quocgia = "SAUDI ARABIA";
        } else if (loc[1].trim().equalsIgnoreCase("SN")) {
            quocgia = "SENEGAL";
        } else if (loc[1].trim().equalsIgnoreCase("CS")) {
            quocgia = "SERBIA AND MONTENEGRO";
        } else if (loc[1].trim().equalsIgnoreCase("SC")) {
            quocgia = "SEYCHELLES";
        } else if (loc[1].trim().equalsIgnoreCase("SL")) {
            quocgia = "SIERRA LEONE";
        } else if (loc[1].trim().equalsIgnoreCase("SG")) {
            quocgia = "SINGAPORE";
        } else if (loc[1].trim().equalsIgnoreCase("SK")) {
            quocgia = "SLOVAKIA";
        } else if (loc[1].trim().equalsIgnoreCase("SI")) {
            quocgia = "SLOVENIA";
        } else if (loc[1].trim().equalsIgnoreCase("SB")) {
            quocgia = "SOLOMON ISLANDS";
        } else if (loc[1].trim().equalsIgnoreCase("SO")) {
            quocgia = "SOMALIA";
        } else if (loc[1].trim().equalsIgnoreCase("ZA")) {
            quocgia = "SOUTH AFRICA";
        } else if (loc[1].trim().equalsIgnoreCase("GS")) {
            quocgia = "SOUTH GEORGIA AND THE SOUTH SANDWICH ISLANDS";
        } else if (loc[1].trim().equalsIgnoreCase("ES")) {
            quocgia = "SPAIN";
        } else if (loc[1].trim().equalsIgnoreCase("LK")) {
            quocgia = "SRI LANKA";
        } else if (loc[1].trim().equalsIgnoreCase("SD")) {
            quocgia = "SUDAN";
        } else if (loc[1].trim().equalsIgnoreCase("SR")) {
            quocgia = "SURINAME";
        } else if (loc[1].trim().equalsIgnoreCase("SJ")) {
            quocgia = "SVALBARD AND JAN MAYEN";
        } else if (loc[1].trim().equalsIgnoreCase("SZ")) {
            quocgia = "SWAZILAND";
        } else if (loc[1].trim().equalsIgnoreCase("SE")) {
            quocgia = "SWEDEN";
        } else if (loc[1].trim().equalsIgnoreCase("CH")) {
            quocgia = "SWITZERLAND";
        } else if (loc[1].trim().equalsIgnoreCase("SY")) {
            quocgia = "SYRIAN ARAB REPUBLIC";
        } else if (loc[1].trim().equalsIgnoreCase("TW")) {
            quocgia = "TAIWAN, PROVINCE OF CHINA";
        } else if (loc[1].trim().equalsIgnoreCase("TJ")) {
            quocgia = "TAJIKISTAN";
        } else if (loc[1].trim().equalsIgnoreCase("TZ")) {
            quocgia = "TANZANIA, UNITED REPUBLIC OF";
        } else if (loc[1].trim().equalsIgnoreCase("TH")) {
            quocgia = "THAILAND";
        } else if (loc[1].trim().equalsIgnoreCase("TL")) {
            quocgia = "TIMOR-LESTE";
        } else if (loc[1].trim().equalsIgnoreCase("TG")) {
            quocgia = "TOGO";
        } else if (loc[1].trim().equalsIgnoreCase("TK")) {
            quocgia = "TOKELAU";
        } else if (loc[1].trim().equalsIgnoreCase("TO")) {
            quocgia = "TONGA";
        } else if (loc[1].trim().equalsIgnoreCase("TT")) {
            quocgia = "TRINIDAD AND TOBAGO";
        } else if (loc[1].trim().equalsIgnoreCase("TN")) {
            quocgia = "TUNISIA";
        } else if (loc[1].trim().equalsIgnoreCase("TR")) {
            quocgia = "TURKEY";
        } else if (loc[1].trim().equalsIgnoreCase("TM")) {
            quocgia = "TURKMENISTAN";
        } else if (loc[1].trim().equalsIgnoreCase("TC")) {
            quocgia = "TURKS AND CAICOS ISLANDS";
        } else if (loc[1].trim().equalsIgnoreCase("TV")) {
            quocgia = "TUVALU";
        } else if (loc[1].trim().equalsIgnoreCase("UG")) {
            quocgia = "UGANDA";
        } else if (loc[1].trim().equalsIgnoreCase("UA")) {
            quocgia = "UKRAINE";
        } else if (loc[1].trim().equalsIgnoreCase("AE")) {
            quocgia = "UNITED ARAB EMIRATES";
        } else if (loc[1].trim().equalsIgnoreCase("GB")) {
            quocgia = "UNITED KINGDOM";
        } else if (loc[1].trim().equalsIgnoreCase("US")) {
            quocgia = "UNITED STATES";
        } else if (loc[1].trim().equalsIgnoreCase("UM")) {
            quocgia = "UNITED STATES MINOR OUTLYING ISLANDS";
        } else if (loc[1].trim().equalsIgnoreCase("UY")) {
            quocgia = "URUGUAY";
        } else if (loc[1].trim().equalsIgnoreCase("UZ")) {
            quocgia = "UZBEKISTAN";
        } else if (loc[1].trim().equalsIgnoreCase("VU")) {
            quocgia = "VANUATU";
        } else if (loc[1].trim().equalsIgnoreCase("VE")) {
            quocgia = "VENEZUELA";
        } else if (loc[1].trim().equalsIgnoreCase("VN")) {
            quocgia = "VIET NAM";
        } else if (loc[1].trim().equalsIgnoreCase("VG")) {
            quocgia = "VIRGIN ISLANDS, BRITISH";
        } else if (loc[1].trim().equalsIgnoreCase("VI")) {
            quocgia = "VIRGIN ISLANDS, U.S.";
        } else if (loc[1].trim().equalsIgnoreCase("WF")) {
            quocgia = "WALLIS AND FUTUNA";
        } else if (loc[1].trim().equalsIgnoreCase("EH")) {
            quocgia = "WESTERN SAHARA";
        } else if (loc[1].trim().equalsIgnoreCase("YE")) {
            quocgia = "YEMEN";
        } else if (loc[1].trim().equalsIgnoreCase("ZM")) {
            quocgia = "ZAMBIA";
        } else if (loc[1].trim().equalsIgnoreCase("ZW")) {
            quocgia = "ZIMBABWE";
        }else{
            quocgia = "unknow";
        }
        return loc[0].trim() +" - "+quocgia;

    }
    
}
