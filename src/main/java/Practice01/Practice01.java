package Practice01;

public class Practice01 {
    @NotNull(message = "UserName cannot be Empty!")
    @MaxLength(maxLength = 16, message = "UserName must be shorter than 16bit!")
    private String username;
    @NotNull(message = "Password cannot be Empty!")
    @MaxLength(maxLength = 32, message = "Password must be shorter than 32bit!")
    @Password(message = "Password is Illegal!")
    private String password;

    public Practice01(String username, String password){
        this.username = username;
        this.password = password;
    }
}
