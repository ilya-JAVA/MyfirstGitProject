package newLambdas;

@FunctionalInterface
public interface UserCreator {
    User createUser(String login, String password);
}
