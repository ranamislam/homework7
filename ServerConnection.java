package Homework_7;
public class ServerConnection
{
    private static ServerConnection serverConnection = null;

    private ServerConnection() {}

    public static ServerConnection getServerConnection()
    {
        serverConnection = new ServerConnection();
        return serverConnection;
    }

    public void connectToPort()
    {
        System.out.println("Server connected to PORT: 80");
    }

}
