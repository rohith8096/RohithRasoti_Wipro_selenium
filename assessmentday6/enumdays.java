package assessmentday6;


import Enum_practice.enumdays.Day;

public class enumdays {
    enum Day { Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday }

    public static void main(String[] args) {
        Day D = Day.Saturday;

        switch (D) {
            case Monday:
                System.out.println("It is Monday");
                break;
            case Tuesday:
                System.out.println("It is Tuesday");
                break;
            case Wednesday:
                System.out.println("It is Wednesday");
                break;
            case Thursday:
                System.out.println("It is Thursday");
                break;
            case Friday:
                System.out.println("It is Friday");
                break;
            case Saturday:
                System.out.println("It is Saturday");
                break;
            case Sunday:
                System.out.println("It is Sunday");
                break;
        }

        if (D == Day.Saturday || D == Day.Sunday) {
            System.out.println("Weekend");
        } else {
            System.out.println("Weekday");
        }
    }
}


