/*
 * Copyright (c) 2024-2025 OnixByte
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */

package com.onixbyte.region;

import java.util.*;

/**
 * Region is an enum class saving all regions defined by ISO 3166-1.
 *
 * @author siujamo
 */
public enum Region {
    ASCENSION_ISLAND("AC", "ASC", "247", "en_AC"),
    ANDORRA("AD", "AND", "376", "ca_AD"),
    UNITED_ARAB_EMIRATES("AE", "ARE", "971", "ar_AE"),
    AFGHANISTAN("AF", "AFG", "93", "ps_AF"),
    ANTIGUA_AND_BARBUDA("AG", "ATG", "1-268", "en_AG"),
    ANGUILLA("AI", "AIA", "1-264", "en_AI"),
    ALBANIA("AL", "ALB", "355", "sq_AL"),
    ARMENIA("AM", "ARM", "374", "hy_AM"),
    ANGOLA("AO", "AGO", "244", "pt_AO"),
    ANTARCTICA("AQ", "ATA", "672", "en_AQ"),
    ARGENTINA("AR", "ARG", "54", "es_AR"),
    AMERICAN_SAMOA("AS", "ASM", "1-684", "en_AS"),
    AUSTRIA("AT", "AUT", "43", "de_AT"),
    AUSTRALIA("AU", "AUS", "61", "en_AU"),
    ARUBA("AW", "ABW", "297", "nl_AW"),
    ALAND_ISLANDS("AX", "ALA", "358", "sv_AX"),
    AZERBAIJAN("AZ", "AZE", "994", "az_AZ"),
    BOSNIA_AND_HERZEGOVINA("BA", "BIH", "387", "bs_BA"),
    BARBADOS("BB", "BRB", "1-246", "en_BB"),
    BANGLADESH("BD", "BGD", "880", "bn_BD"),
    BELGIUM("BE", "BEL", "32", "nl_BE"),
    BURKINA_FASO("BF", "BFA", "226", "fr_BF"),
    BULGARIA("BG", "BGR", "359", "bg_BG"),
    BAHRAIN("BH", "BHR", "973", "ar_BH"),
    BURUNDI("BI", "BDI", "257", "rn_BI"),
    BENIN("BJ", "BEN", "229", "fr_BJ"),
    SAINT_BARTHELEMY("BL", "BLM", "590", "fr_BL"),
    BERMUDA("BM", "BMU", "1-441", "en_BM"),
    BRUNEI("BN", "BRN", "673", "ms_BN"),
    BOLIVIA("BO", "BOL", "591", "es_BO"),
    CARIBBEAN_NETHERLANDS("BQ", "BES", "599", "nl_BQ"),
    BRAZIL("BR", "BRA", "55", "pt_BR"),
    BAHAMAS("BS", "BHS", "1-242", "en_BS"),
    BHUTAN("BT", "BTN", "975", "dz_BT"),
    BOUVET_ISLAND("BV", "BVT", "47", "no_BV"),
    BOTSWANA("BW", "BWA", "267", "en_BW"),
    BELARUS("BY", "BLR", "375", "be_BY"),
    BELIZE("BZ", "BLZ", "501", "en_BZ"),
    CANADA("CA", "CAN", "1", "en_CA"),
    COCOS_ISLANDS("CC", "CCK", "61", "en_CC"),
    DEMOCRATIC_REPUBLIC_OF_THE_CONGO("CD", "COD", "243", "fr_CD"),
    CENTRAL_AFRICAN_REPUBLIC("CF", "CAF", "236", "fr_CF"),
    REPUBLIC_OF_THE_CONGO("CG", "COG", "242", "fr_CG"),
    SWITZERLAND("CH", "CHE", "41", "de_CH"),
    COTE_D_IVOIRE("CI", "CIV", "225", "fr_CI"),
    COOK_ISLANDS("CK", "COK", "682", "en_CK"),
    CHILE("CL", "CHL", "56", "es_CL"),
    CAMEROON("CM", "CMR", "237", "fr_CM"),
    CHINA("CN", "CHN", "86", "zh_CN"),
    COLOMBIA("CO", "COL", "57", "es_CO"),
    COSTA_RICA("CR", "CRI", "506", "es_CR"),
    CUBA("CU", "CUB", "53", "es_CU"),
    CAPE_VERDE("CV", "CPV", "238", "pt_CV"),
    CURACAO("CW", "CUW", "599", "nl_CW"),
    CHRISTMAS_ISLAND("CX", "CXR", "61", "en_CX"),
    CYPRUS("CY", "CYP", "357", "el_CY"),
    CZECHIA("CZ", "CZE", "420", "cs_CZ"),
    GERMANY("DE", "DEU", "49", "de_DE"),
    DJIBOUTI("DJ", "DJI", "253", "fr_DJ"),
    DENMARK("DK", "DNK", "45", "da_DK"),
    DOMINICA("DM", "DMA", "1-767", "en_DM"),
    DOMINICAN_REPUBLIC("DO", "DOM", "1-809", "es_DO"),
    ALGERIA("DZ", "DZA", "213", "ar_DZ"),
    ECUADOR("EC", "ECU", "593", "es_EC"),
    ESTONIA("EE", "EST", "372", "et_EE"),
    EGYPT("EG", "EGY", "20", "ar_EG"),
    WESTERN_SAHARA("EH", "ESH", "212", "ar_EH"),
    ERITREA("ER", "ERI", "291", "ti_ER"),
    SPAIN("ES", "ESP", "34", "es_ES"),
    ETHIOPIA("ET", "ETH", "251", "am_ET"),
    FINLAND("FI", "FIN", "358", "fi_FI"),
    FIJI("FJ", "FJI", "679", "en_FJ"),
    FALKLAND_ISLANDS("FK", "FLK", "500", "en_FK"),
    MICRONESIA("FM", "FSM", "691", "en_FM"),
    FAROE_ISLANDS("FO", "FRO", "298", "fo_FO"),
    FRANCE("FR", "FRA", "33", "fr_FR"),
    GABON("GA", "GAB", "241", "fr_GA"),
    UNITED_KINGDOM("GB", "GBR", "44", "en_GB"),
    GRENADA("GD", "GRD", "1-473", "en_GD"),
    GEORGIA("GE", "GEO", "995", "ka_GE"),
    FRENCH_GUIANA("GF", "GUF", "594", "fr_GF"),
    GUERNSEY("GG", "GGY", "44-1481", "en_GG"),
    GHANA("GH", "GHA", "233", "en_GH"),
    GIBRALTAR("GI", "GIB", "350", "en_GI"),
    GREENLAND("GL", "GRL", "299", "kl_GL"),
    GAMBIA("GM", "GMB", "220", "en_GM"),
    GUINEA("GN", "GIN", "224", "fr_GN"),
    GUADELOUPE("GP", "GLP", "590", "fr_GP"),
    EQUATORIAL_GUINEA("GQ", "GNQ", "240", "es_GQ"),
    GREECE("GR", "GRC", "30", "el_GR"),
    GUATEMALA("GT", "GTM", "502", "es_GT"),
    GUAM("GU", "GUM", "1-671", "en_GU"),
    GUINEA_BISSAU("GW", "GNB", "245", "pt_GW"),
    GUYANA("GY", "GUY", "592", "en_GY"),
    HONG_KONG("HK", "HKG", "852", "zh_HK"),
    HEARD_ISLAND_AND_MCDONALD_ISLANDS("HM", "HMD", "672", "en_HM"),
    HONDURAS("HN", "HND", "504", "es_HN"),
    CROATIA("HR", "HRV", "385", "hr_HR"),
    HAITI("HT", "HTI", "509", "fr_HT"),
    HUNGARY("HU", "HUN", "36", "hu_HU"),
    INDONESIA("ID", "IDN", "62", "id_ID"),
    IRELAND("IE", "IRL", "353", "en_IE"),
    ISRAEL("IL", "ISR", "972", "he_IL"),
    ISLE_OF_MAN("IM", "IMN", "44-1624", "en_IM"),
    INDIA("IN", "IND", "91", "hi_IN"),
    BRITISH_INDIAN_OCEAN_TERRITORY("IO", "IOT", "246", "en_IO"),
    IRAQ("IQ", "IRQ", "964", "ar_IQ"),
    IRAN("IR", "IRN", "98", "fa_IR"),
    ICELAND("IS", "ISL", "354", "is_IS"),
    ITALY("IT", "ITA", "39", "it_IT"),
    JERSEY("JE", "JEY", "44-1534", "en_JE"),
    JAMAICA("JM", "JAM", "1-876", "en_JM"),
    JORDAN("JO", "JOR", "962", "ar_JO"),
    JAPAN("JP", "JPN", "81", "ja_JP"),
    KENYA("KE", "KEN", "254", "sw_KE"),
    KYRGYZSTAN("KG", "KGZ", "996", "ky_KG"),
    CAMBODIA("KH", "KHM", "855", "km_KH"),
    KIRIBATI("KI", "KIR", "686", "en_KI"),
    COMOROS("KM", "COM", "269", "ar_KM"),
    SAINT_KITTS_AND_NEVIS("KN", "KNA", "1-869", "en_KN"),
    NORTH_KOREA("KP", "PRK", "850", "ko_KP"),
    SOUTH_KOREA("KR", "KOR", "82", "ko_KR"),
    KUWAIT("KW", "KWT", "965", "ar_KW"),
    CAYMAN_ISLANDS("KY", "CYM", "1-345", "en_KY"),
    KAZAKHSTAN("KZ", "KAZ", "7", "kk_KZ"),
    LAOS("LA", "LAO", "856", "lo_LA"),
    LEBANON("LB", "LBN", "961", "ar_LB"),
    SAINT_LUCIA("LC", "LCA", "1-758", "en_LC"),
    LIECHTENSTEIN("LI", "LIE", "423", "de_LI"),
    SRI_LANKA("LK", "LKA", "94", "si_LK"),
    LIBERIA("LR", "LBR", "231", "en_LR"),
    LESOTHO("LS", "LSO", "266", "st_LS"),
    LITHUANIA("LT", "LTU", "370", "lt_LT"),
    LUXEMBOURG("LU", "LUX", "352", "lb_LU"),
    LATVIA("LV", "LVA", "371", "lv_LV"),
    LIBYA("LY", "LBY", "218", "ar_LY"),
    MOROCCO("MA", "MAR", "212", "ar_MA"),
    MONACO("MC", "MCO", "377", "fr_MC"),
    MOLDOVA("MD", "MDA", "373", "ro_MD"),
    MONTENEGRO("ME", "MNE", "382", "sr_ME"),
    SAINT_MARTIN("MF", "MAF", "590", "fr_MF"),
    MADAGASCAR("MG", "MDG", "261", "mg_MG"),
    MARSHALL_ISLANDS("MH", "MHL", "692", "en_MH"),
    NORTH_MACEDONIA("MK", "MKD", "389", "mk_MK"),
    MALI("ML", "MLI", "223", "fr_ML"),
    MYANMAR("MM", "MMR", "95", "my_MM"),
    MONGOLIA("MN", "MNG", "976", "mn_MN"),
    MACAO("MO", "MAC", "853", "zh_MO"),
    NORTHERN_MARIANA_ISLANDS("MP", "MNP", "1-670", "en_MP"),
    MARTINIQUE("MQ", "MTQ", "596", "fr_MQ"),
    MAURITANIA("MR", "MRT", "222", "ar_MR"),
    MONTSERRAT("MS", "MSR", "1-664", "en_MS"),
    MALTA("MT", "MLT", "356", "mt_MT"),
    MAURITIUS("MU", "MUS", "230", "en_MU"),
    MALDIVES("MV", "MDV", "960", "dv_MV"),
    MALAWI("MW", "MWI", "265", "en_MW"),
    MEXICO("MX", "MEX", "52", "es_MX"),
    MALAYSIA("MY", "MYS", "60", "ms_MY"),
    MOZAMBIQUE("MZ", "MOZ", "258", "pt_MZ"),
    NAMIBIA("NA", "NAM", "264", "en_NA"),
    NEW_CALEDONIA("NC", "NCL", "687", "fr_NC"),
    NIGER("NE", "NER", "227", "fr_NE"),
    NORFOLK_ISLAND("NF", "NFK", "672", "en_NF"),
    NIGERIA("NG", "NGA", "234", "en_NG"),
    NICARAGUA("NI", "NIC", "505", "es_NI"),
    NETHERLANDS("NL", "NLD", "31", "nl_NL"),
    NORWAY("NO", "NOR", "47", "no_NO"),
    NEPAL("NP", "NPL", "977", "ne_NP"),
    NAURU("NR", "NRU", "674", "en_NR"),
    NIUE("NU", "NIU", "683", "en_NU"),
    NEW_ZEALAND("NZ", "NZL", "64", "en_NZ"),
    OMAN("OM", "OMN", "968", "ar_OM"),
    PANAMA("PA", "PAN", "507", "es_PA"),
    PERU("PE", "PER", "51", "es_PE"),
    FRENCH_POLYNESIA("PF", "PYF", "689", "fr_PF"),
    PAPUA_NEW_GUINEA("PG", "PNG", "675", "en_PG"),
    PHILIPPINES("PH", "PHL", "63", "tl_PH"),
    PAKISTAN("PK", "PAK", "92", "ur_PK"),
    POLAND("PL", "POL", "48", "pl_PL"),
    SAINT_PIERRE_AND_MIQUELON("PM", "SPM", "508", "fr_PM"),
    PUERTO_RICO("PR", "PRI", "1-787", "es_PR"),
    PALESTINE("PS", "PSE", "970", "ar_PS"),
    PORTUGAL("PT", "PRT", "351", "pt_PT"),
    PALAU("PW", "PLW", "680", "en_PW"),
    PARAGUAY("PY", "PRY", "595", "es_PY"),
    QATAR("QA", "QAT", "974", "ar_QA"),
    REUNION("RE", "REU", "262", "fr_RE"),
    ROMANIA("RO", "ROU", "40", "ro_RO"),
    SERBIA("RS", "SRB", "381", "sr_RS"),
    RUSSIA("RU", "RUS", "7", "ru_RU"),
    RWANDA("RW", "RWA", "250", "rw_RW"),
    SAUDI_ARABIA("SA", "SAU", "966", "ar_SA"),
    SOLOMON_ISLANDS("SB", "SLB", "677", "en_SB"),
    SEYCHELLES("SC", "SYC", "248", "en_SC"),
    SUDAN("SD", "SDN", "249", "ar_SD"),
    SWEDEN("SE", "SWE", "46", "sv_SE"),
    SINGAPORE("SG", "SGP", "65", "zh_SG"),
    SAINT_HELENA("SH", "SHN", "290", "en_SH"),
    SLOVENIA("SI", "SVN", "386", "sl_SI"),
    SVALBARD_AND_JAN_MAYEN("SJ", "SJM", "47", "no_SJ"),
    SLOVAKIA("SK", "SVK", "421", "sk_SK"),
    SIERRA_LEONE("SL", "SLE", "232", "en_SL"),
    SAN_MARINO("SM", "SMR", "378", "it_SM"),
    SENEGAL("SN", "SEN", "221", "fr_SN"),
    SOMALIA("SO", "SOM", "252", "so_SO"),
    SURINAME("SR", "SUR", "597", "nl_SR"),
    SOUTH_SUDAN("SS", "SSD", "211", "en_SS"),
    SAO_TOME_AND_PRINCIPE("ST", "STP", "239", "pt_ST"),
    EL_SALVADOR("SV", "SLV", "503", "es_SV"),
    SINT_MAARTEN("SX", "SXM", "1-721", "nl_SX"),
    SYRIA("SY", "SYR", "963", "ar_SY"),
    ESWATINI("SZ", "SWZ", "268", "en_SZ"),
    TRISTAN_DA_CUNHA("TA", "TAA", "290", "en_TA"),
    TURKS_AND_CAICOS_ISLANDS("TC", "TCA", "1-649", "en_TC"),
    CHAD("TD", "TCD", "235", "fr_TD"),
    FRENCH_SOUTHERN_TERRITORIES("TF", "ATF", "262", "fr_TF"),
    TOGO("TG", "TGO", "228", "fr_TG"),
    THAILAND("TH", "THA", "66", "th_TH"),
    TAJIKISTAN("TJ", "TJK", "992", "tg_TJ"),
    TOKELAU("TK", "TKL", "690", "en_TK"),
    TIMOR_LESTE("TL", "TLS", "670", "pt_TL"),
    TURKMENISTAN("TM", "TKM", "993", "tk_TM"),
    TUNISIA("TN", "TUN", "216", "ar_TN"),
    TONGA("TO", "TON", "676", "en_TO"),
    TURKEY("TR", "TUR", "90", "tr_TR"),
    TRINIDAD_AND_TOBAGO("TT", "TTO", "1-868", "en_TT"),
    TUVALU("TV", "TUV", "688", "en_TV"),
    TAIWAN("TW", "TWN", "886", "zh_TW"),
    TANZANIA("TZ", "TZA", "255", "sw_TZ"),
    UKRAINE("UA", "UKR", "380", "uk_UA"),
    UGANDA("UG", "UGA", "256", "en_UG"),
    UNITED_STATES_MINOR_OUTLYING_ISLANDS("UM", "UMI", "1", "en_UM"),
    UNITED_STATES("US", "USA", "1", "en_US"),
    URUGUAY("UY", "URY", "598", "es_UY"),
    UZBEKISTAN("UZ", "UZB", "998", "uz_UZ"),
    VATICAN_CITY("VA", "VAT", "39-06", "it_VA"),
    SAINT_VINCENT_AND_THE_GRENADINES("VC", "VCT", "1-784", "en_VC"),
    VENEZUELA("VE", "VEN", "58", "es_VE"),
    BRITISH_VIRGIN_ISLANDS("VG", "VGB", "1-284", "en_VG"),
    UNITED_STATES_VIRGIN_ISLANDS("VI", "VIR", "1-340", "en_VI"),
    VIETNAM("VN", "VNM", "84", "vi_VN"),
    VANUATU("VU", "VUT", "678", "bi_VU"),
    WALLIS_AND_FUTUNA("WF", "WLF", "681", "fr_WF"),
    SAMOA("WS", "WSM", "685", "sm_WS"),
    KOSOVO("XK", "XKX", "383", "sq_XK"),
    YEMEN("YE", "YEM", "967", "ar_YE"),
    MAYOTTE("YT", "MYT", "262", "fr_YT"),
    SOUTH_AFRICA("ZA", "ZAF", "27", "en_ZA"),
    ZAMBIA("ZM", "ZMB", "260", "en_ZM"),
    ZIMBABWE("ZW", "ZWE", "263", "en_ZW");

    /**
     * ISO-3166-1 Alpha-2 code of this region.
     */
    private final String abbreviation;

    /**
     * ISO-3166-1 Alpha-3 code of this region.
     */
    private final String code;

    /**
     * Telephone region codes according to E.123 and E.164 defined by International
     * Telecommunication Union (ITU) of this region.
     */
    private final String callingCode;

    /**
     * Default locale of this region.
     */
    private final String locale;

    /**
     * Default private constructor.
     *
     * @param abbreviation ISO-3166-1 Alpha-2 code of this region
     * @param code         ISO-3166-1 Alpha-3 code of this region
     * @param callingCode  telephone region codes according to E.123 and E.164 defined by
     *                     International Telecommunication Union (ITU) of this region
     * @param locale       default locale of this region
     */
    Region(String abbreviation, String code, String callingCode, String locale) {
        this.abbreviation = abbreviation;
        this.code = code;
        this.callingCode = callingCode;
        this.locale = locale;
    }

    /**
     * Get ISO-3166-1 Alpha-2 code of this region.
     *
     * @return ISO-3166-1 Alpha-2 code of this region
     */
    public String getAbbreviation() {
        return abbreviation;
    }

    /**
     * Get ISO-3166-1 Alpha-3 code of this region.
     *
     * @return ISO-3166-1 Alpha-3 code of this region
     */
    public String getCode() {
        return code;
    }

    /**
     * Get telephone region codes according to E.123 and E.164 defined by International
     * Telecommunication Union (ITU) of this region.
     *
     * @return telephone region codes according to E.123 and E.164 defined by International
     * Telecommunication Union (ITU) of this region
     */
    public String getCallingCode() {
        return callingCode;
    }

    /**
     * Get default locale of this region.
     *
     * @return default locale of this region.
     */
    public String getLocale() {
        return locale;
    }

    private static final Region[] ARR_REGIONS = values();
    private static final Set<Region> REGIONS;
    private static final Set<String> ABBREVIATIONS;
    private static final Set<String> CODES;
    private static final Map<String, Region> CODE_MAP;
    private static final Map<String, Region> ABBREVIATION_MAP;

    static {
        Set<Region> regions = new HashSet<>();
        Set<String> abbreviations = new HashSet<>();
        Set<String> codes = new HashSet<>();
        Map<String, Region> abbreviationMap = new HashMap<>();
        Map<String, Region> codeMap = new HashMap<>();

        for (Region region : ARR_REGIONS) {
            regions.add(region);
            abbreviations.add(region.abbreviation);
            codes.add(region.code);
            abbreviationMap.put(region.abbreviation, region);
            codeMap.put(region.code, region);
        }

        REGIONS = Collections.unmodifiableSet(regions);
        ABBREVIATIONS = Collections.unmodifiableSet(abbreviations);
        CODES = Collections.unmodifiableSet(codes);
        ABBREVIATION_MAP = Collections.unmodifiableMap(abbreviationMap);
        CODE_MAP = Collections.unmodifiableMap(codeMap);
    }

    /**
     * Get all regions.
     *
     * @return all regions
     */
    public static Set<Region> getRegions() {
        return REGIONS;
    }

    /**
     * Verify that the given ISO 3166-1 alpha-2 code is correct.
     *
     * @param abbreviation the given ISO 3166-1 alpha-2 code
     * @return {@code true} if the given code is a valid ISO 3166-1 alpha-2 code
     */
    public static boolean isValidAbbreviation(String abbreviation) {
        if (Objects.isNull(abbreviation) || abbreviation.isEmpty()) return false;
        return ABBREVIATIONS.contains(abbreviation);
    }

    /**
     * Verify that the given ISO 3166-1 alpha-3 code is correct.
     *
     * @param code the given ISO 3166-1 alpha-3 code
     * @return {@code true} if the given code is a valid ISO 3166-1 alpha-3 code
     */
    public static boolean isValidCode(String code) {
        if (Objects.isNull(code) || code.isEmpty()) return false;
        return CODES.contains(code);
    }

    /**
     * Get region information by ISO 3166-1 alpha-2 code.
     *
     * @param abbreviation an ISO 3166-1 alpha-2 code
     * @return mapped region
     */
    public static Region fromAbbreviation(String abbreviation) {
        return ABBREVIATION_MAP.get(abbreviation);
    }

    /**
     * Get region information by ISO 3166-1 alpha-3 code.
     *
     * @param code an ISO 3166-1 alpha-3 code
     * @return mapped region
     */
    public static Region fromCode(String code) {
        return CODE_MAP.get(code);
    }
}
