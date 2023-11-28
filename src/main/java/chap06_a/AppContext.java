package chap06_a;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext
{
	@Bean
	public Client client()
	{
		Client client = new Client();
		client.setHost("127.0.0.1");
		return client;
	}
	
	@Bean(destroyMethod = "close")
	public ClientWrapper clientWrapper()
	{
		ClientWrapper client = new ClientWrapper();
		client.setHost("127.0.0.1");
		client.connect();
		return client;
	}
}
