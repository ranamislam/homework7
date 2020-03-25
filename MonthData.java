package Homework_7;
public class MonthData
{
    Months months;

    public MonthData() {}

    public MonthData(Months months)
    {
        this.months = months;
    }

    public void getMonthData()
    {
        switch (months)
        {
            case JANUARY:
                System.out.println("Name of the month: January");
                break;
            case FEBRUARY:
                System.out.println("Name of the month: February");
                break;
            case MARCH:
                System.out.println("Name of the month: March");
                break;
            case APRIL:
                System.out.println("Name of the month: April");
                break;
            case MAY:
                System.out.println("Name of the month: May");
                break;
            case JUNE:
                System.out.println("Name of the month: June");
                break;
            case JULY:
                System.out.println("Name of the month: July");
                break;
            case AUGUST:
                System.out.println("Name of the month: August");
                break;
            case SEPTEMBER:
                System.out.println("Name of the month: September");
                break;
            case OCTOBER:
                System.out.println("Name of the month: October");
                break;
            case NOVEMBER:
                System.out.println("Name of the month: November");
                break;
            case DECEMBER:
                System.out.println("Name of the month: December");
        }
    }
}




