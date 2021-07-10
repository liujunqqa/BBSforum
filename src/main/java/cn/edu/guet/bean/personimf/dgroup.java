package cn.edu.guet.bean.personimf;

public class dgroup {
    private String gid;
    private String gname;
    private String dgroup;

    public dgroup() {
    }

    public dgroup(String gid, String gname, String dgroup) {
        this.gid = gid;
        this.gname = gname;
        this.dgroup = dgroup;
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

    public String getDgroup() {
        return dgroup;
    }

    public void setDgroup(String dgroup) {
        this.dgroup = dgroup;
    }
}
