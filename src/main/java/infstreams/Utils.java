package infstreams;

import java.util.stream.Stream;

final class Utils {

    private Utils() { }

    public static Stream<User> generateUsers(int numberOfUsers) {
        return Stream.iterate(0, (id) -> id + 1)
                .limit(numberOfUsers)
                .map(id -> new User(id, String.format("user%s@gmail.com", id)))
                .distinct();
        // write your code here
    }

    public static void main(String[] args) {
        generateUsers(20).forEach(n -> System.out.println(n.getEmail() + "    " + n.getId()));
    }
}

class User {
    private final long id;
    private final String email;

    User(long id, String email) {
        this.id = id;
        this.email = email;
    }

    public long getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }
}