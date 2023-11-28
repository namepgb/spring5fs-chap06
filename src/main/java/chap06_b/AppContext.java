package chap06_b;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppContext
{
	@Bean
	@Scope("prototype")
	public Client client()
	{
		Client client = new Client();
		client.setHost("127.0.0.1");
		return client;
	}
	
	@Bean(destroyMethod = "close")
	@Scope("singleton")
	public ClientWrapper clientWrapper()
	{
		ClientWrapper client = new ClientWrapper();
		client.setHost("127.0.0.1");
		client.connect();
		return client;
	}
}
