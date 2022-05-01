package site.whatsblog.pojo;

import java.util.Date;

/**
 * <strong>
 * description :
 * </strong>
 * <br/>
 * <p>date : 2022/5/1 13:04</p>
 * <p>site : <a href="https://www.whatsblog.site/">What's Blog.</a></p>
 *
 * @author Suk-Lee
 */
public class User {
    private String username;
    private String password;
    private Date loginDate;

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", loginDate=" + loginDate +
                '}';
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

    public Date getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Date loginDate) {
        this.loginDate = loginDate;
    }

    public User(String username, String password, Date loginDate) {
        this.username = username;
        this.password = password;
        this.loginDate = loginDate;
    }
}
