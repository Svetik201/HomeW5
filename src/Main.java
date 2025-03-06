public class Main {
    public static void main(String[] args) {

        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println(" Установите версию приложения для IOS по ссылке .");
            if (clientOS <= 1) {
                System.out.println(" Установите приложение для Android по ссылке .");
            } else {
                System.out.println(" Не работает 0.");
            }
        } else if (clientOS < 1) {
        } else {
            System.out.println(" Не работает .");
        }

        int clientDeviceYear = 2015;
        if (clientDeviceYear == 2015) {
            System.out.println(" Установите облегченную версию приложения для IOS по ссылке .");
            if (clientDeviceYear <= 2015) {
                System.out.println(" Установите обновленную версию приложения для Android по ссылке . ");
            } else {
                System.out.println(" не устонавливайте это приложение .");
            }
        } else if (clientDeviceYear >= 2015) {
            System.out.println(" Установите обновленную версию для Android по ссылке .");
        } else {
            System.out.println(" Не подходит .");
        }

        int year = 2020;
        if (year <= 2020) {
            System.out.println(" 2020 Год является високостным .");
            if (year >= 2016) {
                System.out.println(" 2016 Год високосный .");
            } else if (year <= 2012) {
                System.out.println(" 2012 Год високосный. ");
            } else {
                System.out.println(" 2012 Год не високосный .");
            }
        }

        int deliveryDistance = 95;
        if (deliveryDistance >= 20) {
            System.out.println(" Срок доставки составит 1 день .");
            if (deliveryDistance == 20 && deliveryDistance <= 60) {
                System.out.println(" Потребуется 2 дня , срок доставки .");
            } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                System.out.println(" Потребуется 3 дня , срок доставки .");
            } else {
                System.out.println(" Доставка не возможна");
            }

            int monthNumber = 12;
            switch (monthNumber) {
                case 1:
                    System.out.println(" 1 месяц Январь , время года зима .");
                    break;
                case 2:
                    System.out.println(" 2 месяц Февраль , время года зима .");
                    break;
                case 3:
                    System.out.println(" 3 месяц Март , время года весна .");
                    break;
                case 4:
                    System.out.println(" 4 месяц Апрель , время года весна .");
                    break;
                case 5:
                    System.out.println(" 5 месяц Май , время года весна .");
                    break;
                case 6:
                    System.out.println(" 6 месяц Июнь , время года лето .");
                    break;
                case 7:
                    System.out.println(" 7 месяц Июль , время года лето .");
                    break;
                case 8:
                    System.out.println(" 8 месяц Август , время года лето .");
                    break;
                case 9:
                    System.out.println(" 9 месяц Сентябрь , время года осень .");
                    break;
                case 10:
                    System.out.println(" 10 месяц Октябрь , время года осень .");
                    break;
                case 11:
                    System.out.println(" 11 месяц Ноябрь , время года осень .");
                    break;
                case 12:
                    System.out.println(" 12 месяц Декабрь , время года зима .");
                    break;
                default:
                    System.out.println(" 13 месяца не существует !");
            }
        }
    }
}




