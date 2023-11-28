package chap06_b;

public class ClientWrapper
{
	private String host;
	
	public void setHost(String host)
	{
		this.host = host;
	}
	
	public void connect()
	{
		System.out.println("ClientWrapper.connect() 실행");
	}
	
	public void send()
	{
		System.out.println("ClientWrapper.send() to " + host);
	}
	
	public void close()
	{
		System.out.println("ClientWrapper.close() 실행");
	}
}
