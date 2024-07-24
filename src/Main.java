public class Main {
    public static void main(String[] args) {
        //Task 1
        int totalMouth = 0;
        int salary = 15000;
        int accumulation = 0;
        int requiredAmount = 2459000;
        while (accumulation < requiredAmount) {
            accumulation += salary;
            totalMouth++;
            System.out.println("Месяц " + totalMouth + ". Накоплений: "+ accumulation + " рублей");
        }
        float total = (float) totalMouth/ 12;
        System.out.println("Понадобится: " + String.format("%.2f",total) + " лет.");

        //Task 2
        System.out.println("");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println("");
        while (i > 1) {
            i--;
            System.out.print(i + " ");
        }

        //Task 3
        System.out.println("\n");
        int population = 12000000;
        int birthRate = 17;
        int mortality = 8;
        int year = 1;
        while (year <= 10) {
            population = population + (population / 1000 * birthRate) - (population / 1000 * mortality);
            String str;
            switch (year) {
                case 1:
                    str = "год";
                    break;
                case 2:
                case 3:
                case 4:
                    str = "года";
                    break;
                default:
                    str = "лет";
                    break;
            }
            System.out.println("Через " + year + " " + str + " насление составит: " + population + " человек");
            year++;
        }


        //Task 4
        System.out.println("");
        int needSum = 15000000;
        float amount = 15000.0f;
        float percent = 1.07f;
        int z = 1;
        do {
            System.out.println("В " + z + " месяц сумма накоплений составит " + String.format("%.2f",amount) + " рублей");
            amount = amount * percent;
            z++;
        } while (needSum > amount); // Будем считать, что проценты тикают со 2 месяца
        float needYears = (float) z / 12;
        System.out.println("Понадобится: " + String.format("%.2f",needYears) + " лет");

        //Task 5
        System.out.println("");
        int needSum2 = 15000000;
        float amount2 = 15000.0f;
        float percent2 = 1.07f;
        int z2 = 1;
        do {
            if (z2 % 6 == 0) {
                System.out.println("В " + z2 + " месяц сумма накоплений составит " + String.format("%.2f", amount2) + " рублей");
            }
            amount2 = amount2 * percent2;
            z2++;
        } while (needSum2 > amount2);

        //Task 6
        System.out.println("");
        float saveMoney = 15000.00f;
        float percentBank = 1.07f;
        int monthSave = 12 * 9;
        int currentMonth = 1;
        String strMouth = "Месяцев";
        while (currentMonth <= monthSave) {
            currentMonth++;// Сделаем также, проценты со второго месяца
            if (currentMonth != 12 && currentMonth != 11 && currentMonth != 13 && currentMonth != 14) {
                switch (currentMonth % 10) {
                    case 1:
                        strMouth = "месяц";
                        break;
                    case 2:
                    case 3:
                    case 4:
                        strMouth = "месяца";
                        break;
                    default:
                        strMouth = "месяцев";
                        break;
                }
            }
            saveMoney = (saveMoney * percentBank);
            if (currentMonth % 6 == 0) {
                System.out.println("Через " + currentMonth + " " + strMouth + " сумма накоплений составит " + String.format("%.2f", saveMoney) + " рублей");
            }
        }
        //Task 7
        System.out.println("");
        int today = 1;
        int dayOfWeek = 4;
        while (today <= 31) {
            if (dayOfWeek == 5)
                System.out.println("Сегодня пятница " + today + " число нужно подготовить отчет");

            dayOfWeek++;
            if (dayOfWeek == 8)
                dayOfWeek = 1;

            today++;
        }
        //Task 8
        System.out.println("");
        int cometToday = 0;
        int cometEvery = 79;
        int yearToday = 2024;
        int yearAfter = yearToday + 100;
        int yearBefore = yearToday - 200;
        while (cometToday <= yearAfter) {
            if(cometToday % cometEvery == 0 && cometToday >= yearBefore) {
                System.out.println(cometToday);
            }
            cometToday++;
        }

    }
}