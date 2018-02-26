package ir.moke.beans;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class LoginBean {

    private String username;
    private String password;
    private boolean remember;

    public void action() {
        System.out.println("Username : " + username);
        System.out.println("Password : " + password);
        System.out.println("remember : " + remember);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isRemember() {
        return remember;
    }

    public void setRemember(boolean remember) {
        this.remember = remember;
    }
}
