package de.stefanschade;

public class Main {

    public static void main(String[] args) {


        Account ac01 = new Account("Stefan Schade", "+49(176)2527943", "stefan.schade@abc.com");
        Account ac02 = new Account("Alexia");
        Account ac03 = new Account("Thomas");
        Account ac04 = new Account("Frank");
        Account ac05 = new Account("Emil");
        Account ac06 = new Account("Tim");

        ac01.depositFund(231.23);
        ac02.depositFund(1231.23);
        ac03.depositFund(234231.23);
        ac04.depositFund(23231.23);
        ac05.depositFund(23231.23);
        ac06.depositFund(23231.23);

        ac01.depositFund(1.23);
        ac02.depositFund(4.56);
        ac03.depositFund(7.0);
        ac04.depositFund(8.0);
        ac05.depositFund(9.0);
        ac06.depositFund(10.0);


        System.out.println("A1 " + ac01.getCustomerName() + " - " + ac01.getBalance() );
        System.out.println("A2 " + ac02.getCustomerName() + " - " + ac02.getBalance() );
        System.out.println("A3 " + ac03.getCustomerName() + " - " + ac03.getBalance() );
        System.out.println("A4 " + ac04.getCustomerName() + " - " + ac04.getBalance() );
        System.out.println("A5 " + ac05.getCustomerName() + " - " + ac05.getBalance() );
        System.out.println("A6 " + ac06.getCustomerName() + " - " + ac06.getBalance() );


        ac01.withdrawFund(2000.23);
        ac03.withdrawFund(2000.23);
        ac03.withdrawFund(2000.23);
        ac04.withdrawFund(12000.23);
        ac05.withdrawFund(12000.23);
        ac06.withdrawFund(12000.23);
        ac06.withdrawFund(12000.23);

        System.out.println("A1 " + ac01.getCustomerName() + " - " + ac01.getBalance() );
        System.out.println("A2 " + ac02.getCustomerName() + " - " + ac02.getBalance() );
        System.out.println("A3 " + ac03.getCustomerName() + " - " + ac03.getBalance() );
        System.out.println("A4 " + ac04.getCustomerName() + " - " + ac04.getBalance() );
        System.out.println("A5 " + ac05.getCustomerName() + " - " + ac05.getBalance() );
        System.out.println("A6 " + ac06.getCustomerName() + " - " + ac06.getBalance() );


        ac01.withdrawFund(231.23);
        ac02.withdrawFund(1231.23);
        ac03.withdrawFund(230230.77);
        ac04.withdrawFund(11231.0);
        ac05.withdrawFund(11231.0);
        ac06.withdrawFund(11231.0);

        System.out.println("A1 " + ac01.getCustomerName() + " - " + ac01.getBalance() );
        System.out.println("A2 " + ac02.getCustomerName() + " - " + ac02.getBalance() );
        System.out.println("A3 " + ac03.getCustomerName() + " - " + ac03.getBalance() );
        System.out.println("A4 " + ac04.getCustomerName() + " - " + ac04.getBalance() );
        System.out.println("A5 " + ac05.getCustomerName() + " - " + ac05.getBalance() );
        System.out.println("A6 " + ac06.getCustomerName() + " - " + ac06.getBalance() );


    }


}
