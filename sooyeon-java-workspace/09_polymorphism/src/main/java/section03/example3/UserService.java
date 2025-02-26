package section03.example3;

public interface UserService {
    void registerUser(String name, int age);

    void signinUser(String id, String pwd);

    void modifyUser(String id, String pwd, int age);

}
