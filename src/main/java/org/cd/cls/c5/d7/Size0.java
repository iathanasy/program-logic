package org.cd.cls.c5.d7;

/**
 * @description: 枚举典型场景
 * @author: Mr.Wang
 * @create: 2019-09-02 22:15
 **/
public enum Size0 {

    SMALL("S","小号"),
    MEDIUM("M", "中号"),
    LARGE("L", "大号")
    ;

    private String abbr;
    private String title;

    private Size0(String abbr, String title) {
        this.abbr = abbr;
        this.title = title;
    }
    public String getAbbr() {
        return abbr;
    }

    public String getTitle() {
        return title;
    }

    public static Size0 fromAbbr(String abbr){
        for(Size0 s: Size0.values()){
            if(s.getAbbr().equals(abbr)){
                return s;
            }
        }
        return null;
    }
}
