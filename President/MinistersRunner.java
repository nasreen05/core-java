package President;

public class MinistersRunner {

    public static void main(String[] args) {

                ChiefMinister cm1 = new ChiefMinister("Mr.Rajendra Prasad", 1,
                        "Mr.Jawaharlal Nehru PrimeMinister", 101,
                        "Mr.N.Chandrababu", 1001,
                        "Andhra Pradesh");
                cm1.showChiefMinisterDetails();

                System.out.println("----------------------------------");

                ChiefMinister cm2 = new ChiefMinister("Dr.Sarvepalli Radhakrishnan", 1,
                        "Mr.Lal Bahadur Shastri", 102,
                        "Mr.Pema Khandu", 1002,
                        "assam");
                cm2.showChiefMinisterDetails();

                System.out.println("----------------------------------");

                ChiefMinister cm3 = new ChiefMinister("Dr.Zakir Husain ", 1,
                        "Mr. Rajib Gandhi", 103,
                        "Mr.Eknath Shinde", 1003,
                        "Maharashtra");
                cm3.showChiefMinisterDetails();

                System.out.println("----------------------------------");

                ChiefMinister cm4 = new ChiefMinister("Dr. A.P.J. Abdul kalam", 1,
                        "Mr.Atal Bihari Vajpayee", 104,
                        "Mamata Banerjee", 1004,
                        "West Bengal");
                cm4.showChiefMinisterDetails();

                System.out.println("----------------------------------");

                ChiefMinister cm5 = new ChiefMinister("Mr. Pranab Mukherjee", 1,
                        "Dr. Monmohon Singh", 105,
                        "Mohan Charan Majhi", 1005,
                        "Odisha");
                cm5.showChiefMinisterDetails();

            }
        }


