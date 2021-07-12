package cn.edu.guet.bean.personimf;

public class Users {
    private String userid;
    private String username;
    private String password;
    private String realname;
    private String stunumber;
    private String sex;
    private String age;
    private String phone;
    private String email;
    private String major;
    private String grade;
    private String college;

    public Users() {
    }

    public Users(String userid, String username, String password, String realname, String stunumber, String sex, String age, String phone, String email, String major, String grade, String college) {
        this.userid = userid;
        this.username = username;
        this.password = password;
        this.realname = realname;
        this.stunumber = stunumber;
        this.sex = sex;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.major = major;
        this.grade = grade;
        this.college = college;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getStunumber() {
        return stunumber;
    }

    public void setStunumber(String stunumber) {
        this.stunumber = stunumber;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }
}
