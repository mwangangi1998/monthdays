import java.util.Scanner;


public class Main {
    public class MonthDays{
        public static int getMonthNumber(int month){
            int monthNumber;

            switch (month) {
                case 1:
                    monthNumber = 1;
                    break;
                case 2:
                    monthNumber = 2;
                    break;
                case 3:
                    monthNumber = 3;
                    break;
                case 4:
                    monthNumber = 4;
                    break;
                case 5:
                    monthNumber = 5;
                    break;
                case 6:
                    monthNumber = 6;
                    break;
                case 7:
                    monthNumber = 7;
                    break;
                case 8:
                    monthNumber = 8;
                    break;
                case 9:
                    monthNumber = 9;
                    break;
                case 10:
                    monthNumber = 10;
                    break;
                case 11 :
                    monthNumber = 11;
                    break;
                case 12:
                    monthNumber = 12;
                    break;
                default:
                    monthNumber = 0;
                    break;
            }

            return monthNumber;
        }

    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a month number: " );
        int month = sc.nextInt();
        sc.close();
      int days=getMD(month);


if (days>0)
    System.out.println("Days number of month" + "\t "+month +":"+"\t"+ days);
else {
    System.out.println("you have entered an invalid month days ");
}

    }

    private static int getMD(int month) {
        switch (month){
            case 1:return 31;
            case 2:return 28;
            case 3:return 31;
            case 4: return 30;
            case 5: return 31;
            case 6: return 30;
            case 7: return 31;
            case 8: return 31;
            case 9: return 30;
            case 10: return 31;
            case 11: return 30;
            case 12: return 31;
            default: return 0;
        }
    }

}