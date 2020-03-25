package Homework_7;
public class Data
{
    public static void main(String[] args)
    {
        MonthData month = new MonthData(Months.DECEMBER);
        month.getMonthData();

        ServerConnection serverConnection = ServerConnection.getServerConnection();
        serverConnection.connectToPort();

        Servers server = new Servers();
        System.out.println("Servers: ");
        server.getWindowsServerInfo();
        server.getFileServerInfo();
        server.getEmailServerInfo();
        server.getPayrollServerInfo();
    }
}
