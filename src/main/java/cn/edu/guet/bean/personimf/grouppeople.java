package cn.edu.guet.bean.personimf;

public class grouppeople {
    private String userid;
    private String username;
    private String  imge;
    private int gcount;
    private int page;

    public grouppeople() {
    }

    public grouppeople(String userid, String username, String imge, int gcount, int page) {
        this.userid = userid;
        this.username = username;
        this.imge = imge;
        this.gcount = gcount;
        this.page = page;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getGcount() {
        return gcount;
    }

    public void setGcount(int gcount) {
        this.gcount = gcount;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getImge() {
        return imge;
    }

    public void setImge(String imge) {
        this.imge = imge;
    }
}
