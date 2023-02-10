package by.itacademy.moiseenkolydia.javabasics.oop;

public class Customer {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private String address;
    private String cardNumber;
    private  String accountNumber;
    public void setId(int newId){
        if (newId <=0)
            System.out.println("id не может быть меньше или равен 0");
        else id = newId;
    }

    public void setLastName(String lastName) {
        if (lastName.isEmpty())
            System.out.println("Фамилия не может быть пустой");
        else
            this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        if (firstName.isEmpty())
            System.out.println("Имя не может быть пустым");
        else
        this.firstName = firstName;
    }

    public void setMiddleName(String middleName) {
        if (middleName.isEmpty())
            System.out.println("Отчество не может быть пустым");
        else
        this.middleName = middleName;
    }

    public void setAddress(String address) {
        if (address.isEmpty())
            System.out.println("Адрес не может быть пустым");
        else
        this.address = address;
    }
    public void setCardNumber(String cardNumber) {
        if (cardNumber.isEmpty())
            System.out.println("Номер карты не может быть пустым");
        else
        this.cardNumber = cardNumber;
    }

    public void setAccountNumber(String accountNumber) {
        if (accountNumber.isEmpty())
            System.out.println("Номер банковского счета не может быть пустым");
        else
        this.accountNumber = accountNumber;
    }

    public int getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }
    public String getAddress() {return address;}

    public String getCardNumber() {
        return cardNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}
