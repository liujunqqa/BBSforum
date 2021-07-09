package cn.edu.guet.bean.collectpostbean;

public class collectpost {
    private String userid;
    private String username;
    private String pid;
    private String ptitle;
    private String ptime;
    private String ptype;
    private String pcontent;
    private String pstatus;

    public collectpost() {
    }


    public collectpost(String userid, String username, String pid, String ptitle, String ptime, String ptype, String pcontent, String pstatus) {
        this.userid = userid;
        this.username = username;
        this.pid = pid;
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

}
