package by.itacademy.moiseenkolydia.javabasics.oop;

import com.github.javafaker.Faker;

import java.util.Scanner;

public class DemoOOP {
    public static void main(String[] args) {
        Faker faker = new Faker();

        Customer firstCustomer = new Customer();
        firstCustomer.setId(faker.number().numberBetween(1, Integer.MAX_VALUE));
        firstCustomer.setFirstName(faker.name().firstName());
        firstCustomer.setLastName(faker.name().lastName());
        firstCustomer.setMiddleName(faker.name().firstName());
        firstCustomer.setAddress(faker.address().fullAddress());
        firstCustomer.setCardNumber(faker.business().creditCardNumber());
        firstCustomer.setAccountNumber(faker.finance().iban());

        System.out.println(firstCustomer.getId() + ", " +
                firstCustomer.getFirstName() + " " + firstCustomer.getLastName() + " " +
                firstCustomer.getMiddleName() + ", " +
                firstCustomer.getAddress() + ", " +
                firstCustomer.getCardNumber() + ", " + firstCustomer.getAccountNumber());

        Customer secondCustomer = new Customer();
        secondCustomer.setId(0);
        secondCustomer.setFirstName("");
        secondCustomer.setLastName(faker.name().lastName());
        secondCustomer.setMiddleName(faker.name().firstName());
        secondCustomer.setAddress(faker.address().fullAddress());
        secondCustomer.setCardNumber(faker.business().creditCardNumber());
        secondCustomer.setAccountNumber(faker.finance().iban());
        System.out.println(secondCustomer.getId() + ", " +
                secondCustomer.getFirstName() + " " + secondCustomer.getLastName() + " " +
                secondCustomer.getMiddleName() + ", " +
                secondCustomer.getAddress() + ", " +
                secondCustomer.getCardNumber() + ", " + secondCustomer.getAccountNumber());

        Book firstBook = new Book();
        firstBook.setId(faker.number().numberBetween(1, Integer.MAX_VALUE));
        firstBook.setTitle("The Picture of Dorian Gray");
        firstBook.setAuthor("Oscar Fingal O`Flahertie Wills Wilde");
        firstBook.setPublisher("??????");
        firstBook.setPublishDate(2019);
        firstBook.setNumberOfPages(320);
        firstBook.setPrice(8.04);

        System.out.println(firstBook.getId() + ", " +
                firstBook.getTitle() + ", " + firstBook.getAuthor() + ", " +
                firstBook.getPublisher() + ", " +
                firstBook.getPublishDate() + " ??. " +
                firstBook.getNumberOfPages() + " ??????. " + firstBook.getPrice() + "??????.");

        Car firstCar = new Car();
        firstCar.setId(101985009);
        firstCar.setBrand("Mazda");
        firstCar.setModel("RX-7 II");
        firstCar.setProductionYear(1988);
        firstCar.setColor("??????????????");
        firstCar.setLicensePlate("1234 AA-3");
        firstCar.setPrice(19_377);
        System.out.println(firstCar.getId() + ", " +
                firstCar.getBrand() + ", " + firstCar.getModel() + ", " +
                firstCar.getProductionYear() + "??., " +
                firstCar.getColor() + ", " +
                firstCar.getLicensePlate() + ", " + firstCar.getPrice() + "??????.");

        Student firstStudent = new Student();
        firstStudent.setGrant(500);
        System.out.println(firstStudent.getGrant() + " ??????.");
        Person firstPerson = new Person();
        firstPerson.setName("??????????");
        firstPerson.setSalary(200);
        System.out.println(firstPerson.getName() + ", ?????????? - " +  firstPerson.getIncome() + " ??????.");

        Person secondPerson = new Person();
        Scanner scan = new Scanner(System.in);
        System.out.println("?????????????? ??????");
        secondPerson.setName(scan.nextLine());
        System.out.println("??????????????????");
        secondPerson.setGrant(scan.nextInt());
        System.out.println("????????????????");
        secondPerson.setSalary(scan.nextInt());
        System.out.println(secondPerson.getName() + ", ?????????? - " +  secondPerson.getIncome() + " ??????.");

    }
}
