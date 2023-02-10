package by.itacademy.moiseenkolydia.javabasics.oop;

import com.github.javafaker.Faker;

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

        Book firstBook = new Book();
        firstBook.setId(faker.number().numberBetween(1, Integer.MAX_VALUE));
        firstBook.setTitle("The Picture of Dorian Gray");
        firstBook.setAuthor("Oscar Fingal O`Flahertie Wills Wilde");
        firstBook.setPublisher("АСТ");
        firstBook.setPublishDate(2019);
        firstBook.setNumberOfPages(320);
        firstBook.setPrice(8.04);

        System.out.println(firstBook.getId() + ", " +
                firstBook.getTitle() + ", " + firstBook.getAuthor() + ", " +
                firstBook.getPublisher() + ", " +
                firstBook.getPublishDate() + " г. " +
                firstBook.getNumberOfPages() + " стр. " + firstBook.getPrice() + "руб.");

        Car firstCar = new Car();
        firstCar.setId(101985009);
        firstCar.setBrand("Mazda");
        firstCar.setModel("RX-7 II");
        firstCar.setProductionYear(1988);
        firstCar.setColor("красный");
        firstCar.setLicensePlate("1234 AA-3");
        firstCar.setPrice(19_377);
        System.out.println(firstCar.getId() + ", " +
                firstCar.getBrand() + ", " + firstCar.getModel() + ", " +
                firstCar.getProductionYear() + "г., " +
                firstCar.getColor() + ", " +
                firstCar.getLicensePlate() + ", " + firstCar.getPrice() + "руб.");
    }
}
