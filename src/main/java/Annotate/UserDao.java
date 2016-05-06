package Annotate;

/**
 * Created by helmeter on 4/19/16.
 */
public class UserDao {

    @Colum(name = "name",i=10)
    private String userName;

    @Colum(name = "title",i=11)
    private String userTitle;

    private int loginTimes;

    private String empId;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserTitle() {
        return userTitle;
    }

    public void setUserTitle(String userTitle) {
        this.userTitle = userTitle;
    }

    public int getLoginTimes() {
        return loginTimes;
    }

    public void setLoginTimes(int loginTimes) {
        this.loginTimes = loginTimes;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
}