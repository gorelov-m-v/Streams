package optionlsfinal;

import java.util.*;

class PrintLoginQuiz {

    public static void printLoginIfPro(Set<User> users, String id) {
        Optional<User> targetUser = users.stream()
                .filter(user -> user.getAccount().get().getId().equals(id))
                .filter(user -> user.getAccount().get().getType().equals("pro"))
                .findAny();

        targetUser.ifPresent(u -> System.out.println(u.getLogin()));
    }
}

class Account {
    private String id;
    private String type;

    public Account(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }
}

class User {
    private String login;
    private Account account;

    public User(String login, Account account) {
        this.login = login;
        this.account = account;
    }

    public String getLogin() {
        return login;
    }

    public Optional<Account> getAccount() {
        return Optional.ofNullable(account);
    }
}