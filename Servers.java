package Homework_7;
public class Servers
{
    WindowsServer windowsServer = new WindowsServer();
    FileServer fileServer = new FileServer();
    EmailServer emailServer = new EmailServer();
    PayrollServer payrollServer = new PayrollServer();

    public void getWindowsServerInfo()
    {
        windowsServer.getWindowsServerData();
    }

    public void getFileServerInfo()
    {
        fileServer.getFileServerData();
    }

    public void getEmailServerInfo()
    {
        emailServer.getEmailServerData();
    }

    public void getPayrollServerInfo()
    {
        payrollServer.getPayrollServerData();
    }

    public class WindowsServer
    {
        private void getWindowsServerData()
        {
            System.out.println("\t\t Windows");
        }

    }

    public class FileServer
    {
        private void getFileServerData()
        {
            System.out.println("\t\t File");
        }
    }

    private class EmailServer
    {
        private void getEmailServerData()
        {
            System.out.println("\t\t Email");
        }
    }

    private class PayrollServer
    {
        private void getPayrollServerData()
        {
            System.out.println("\t\t Payroll");
        }
    }
}
