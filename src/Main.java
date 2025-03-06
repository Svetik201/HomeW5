public class Main {
    public static void main(String[] args) {

        int clientOS = 0;
        if (clientOS >=0) {
            System.out.println(" Установите версию приложения для IOS по ссылке .");
            if (clientOS <=1) {
                System.out.println(" Установите версию приложения для Android по ссылке .");
            } else {
                System.out.println(" Обновите приложение ");
            }
        }

            int clientDeviceYear = 2015;
            if (clientDeviceYear == 2015) {
                System.out.println(" Установите облегченную версию приложения для IOS по ссылке .");
                if (clientDeviceYear >= 2015) {
                    System.out.println(" Установите обновленную версию приложения для Android по ссылке . ");
                } else {
                    System.out.println(" не устонавливайте это приложение .");
                }

                int year = 2020;
                switch (year) {
                    case 2020:
                        System.out.println(" 2020 Год является високосным .");
                        break;
                    case 2016:
                        System.out.println(" 2016 Год является високосным .");
                        break;
                    case 2012:
                        System.out.println(" 2012 Год является високосным .");
                        break;
                    default:
                        System.out.println(" 2021 Год не висикосный .");
                }

                int deliveryDistance = 95;
                if (deliveryDistance == 20) {
                    System.out.println(" Срок доставки составит 1 день .");
                    if (deliveryDistance >= 20 && deliveryDistance <=60) {
                        System.out.println(" Потребуется 2 дня , срок доставки .");
                    } else {
                        System.out.println(" Доставка не возможна .");
                    }
                    } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                        System.out.println(" Потребуется 3 дня , срок доставки .");
                    }

                int monthNumber = 12;
                switch (monthNumber) {
                    case 12:
                    case 1:
                    case 2:
                        System.out.println(" 12 месяц , 1 месяц , 2 месяц относятся ко времени года зима .");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println(" 3 месяц , 4 месяц , 5 месяц относятся ко времени года весна .");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println(" 6 месяц , 7 месяц , 8 месяц относятся ко времени года лето .");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println(" 9 месяц , 10 месяц , 11 месяц относятся ко времени года осень .");
                        break;
                    default:
                        System.out.println(" 13 месяца не существует !");
                }
                }
                }

            }


