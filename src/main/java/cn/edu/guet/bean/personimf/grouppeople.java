package cn.edu.guet.bean.personimf;

public class grouppeople {
    private String username;
    private String  imge;
    private String gcount;

    public grouppeople() {
    }

    public grouppeople(String username, String imge, String gcount) {
        this.username = username;
        this.imge = imge;
        this.gcount = gcount;
    }

    public String getGcount() {
        return gcount;
    }

    public void setGcount(String gcount) {
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
