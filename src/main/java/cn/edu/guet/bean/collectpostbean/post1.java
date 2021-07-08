package cn.edu.guet.bean.collectpostbean;

public class post1 {
    private String userid;
    private String pid;
    private String upstatus;
    private String ptitle;
    private String ptime;
    private String ptype;
    private String pcontent;
    private String pstatus;

    public post1() {
    }


    public post1(String userid, String pid, String upstatus, String ptitle, String ptime, String ptype, String pcontent, String pstatus) {
        this.userid = userid;
        this.pid = pid;
        this.upstatus = upstatus;
        this.ptitle = ptitle;
        this.ptime = ptime;
        this.ptype = ptype;
        this.pcontent = pcontent;
        this.pstatus = pstatus;
    }
    public String getPtitle() {
        return ptitle;
    }

    public void setPtitle(String ptitle) {
        this.ptitle = ptitle;
    }

    public String getPtime() {
        return ptime;
    }

    public void setPtime(String ptime) {
        this.ptime = ptime;
    }

    public String getPtype() {
        return ptype;
    }

    public void setPtype(String ptype) {
        this.ptype = ptype;
    }

    public String getPcontent() {
        return pcontent;
    }

    public void setPcontent(String pcontent) {
        this.pcontent = pcontent;
    }

    public String getPstatus() {
        return pstatus;
    }

    public void setPstatus(String pstatus) {
        this.pstatus = pstatus;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getUpstatus() {
        return upstatus;
    }

    public void setUpstatus(String upstatus) {
        this.upstatus = upstatus;
    }
}
