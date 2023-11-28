package chap06_b;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx
			= new AnnotationConfigApplicationContext(AppContext.class);
		Client client_0 = ctx.getBean(Client.class);
		Client client_1 = ctx.getBean(Client.class);
		ctx.close();
	}
}
