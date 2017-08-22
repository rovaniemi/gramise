package gramise.domain.person;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.Entity;
import javax.validation.constraints.Min;

@Entity
public class Person extends AbstractPersistable<Long> {

    @NotBlank
    @Length(min = 1, max = 35)
    private String firstName;

    @NotBlank
    @Length(min = 1, max = 65)
    private String lastName;

    @NotBlank
    @Length(min = 1, max = 65)
    private String username;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    @Length(min = 6, max = 300)
    private String password;

    @Min(0)
    private int points;

    private ProfilePicture profilePicture;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public ProfilePicture getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(ProfilePicture profilePicture) {
        this.profilePicture = profilePicture;
    }
}
