package practicum.phonebook;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class PhoneBook {
    private final Map<String, Collection<PhoneNumber>> nameToPhoneNumbersMap = new HashMap<>();

    public void addNewPhoneNumbers(String name, Collection<PhoneNumber> numbers) {
        if (!nameToPhoneNumbersMap.containsKey(name)){
            nameToPhoneNumbersMap.put(name, numbers);
        } else {
            nameToPhoneNumbersMap.computeIfPresent(name, (a, b) ->
            {
                b.addAll(numbers);
                return b;
            });
        }
    }

    public void printPhoneBook() {
        for (Map.Entry<String, Collection<PhoneNumber>> n : nameToPhoneNumbersMap.entrySet()) {
            System.out.println(n.getKey());
            n.getValue().forEach(p-> System.out.printf("%s: %s\n", p.getType(), p.getNumber()));
        }
    }
}

enum PhoneNumberType {
    MOBILE, HOME, WORK,
}

class PhoneNumber {

    private PhoneNumberType type;
    private String number;

    public PhoneNumber(PhoneNumberType type, String number) {
        this.type = type;
        this.number = number;
    }

    public PhoneNumberType getType() {
        return type;
    }

    public String getNumber() {
        return number;
    }
}