package com.springJWT.reqrest;
import com.springJWT.model.KisiRole;
import lombok.Getter;
import lombok.Setter;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;


public class RegisterRequest {
    @NotBlank
    private String username;

    @NotBlank
    @Size(min=6, max=40)
    private String password;
    private String email;
    private Set<String> roller;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Set<String> getRoller() {
        return roller;
    }

    public void setRoller(Set<String> roller) {
        this.roller = roller;
    }
}