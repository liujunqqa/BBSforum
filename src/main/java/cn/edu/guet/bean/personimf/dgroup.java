package cn.edu.guet.bean.personimf;

public class dgroup {
    private String gid;
    private String gname;
    private String gcount;

    public dgroup() {
    }

    public dgroup(String gid, String gname, String gcount) {
        this.gid = gid;
        this.gname = gname;
        this.gcount = gcount;
    }

    public String getGid() {
        return gid;
    }

    public void setGid(String gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public String getGcount() {
        return gcount;
    }

    public void setDcount(String Gcount) {
        this.gcount = gcount;
    }
}
