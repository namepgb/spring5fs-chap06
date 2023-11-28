package chap06_a;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		AnnotationConfigApplicationContext ctx
			= new AnnotationConfigApplicationContext(AppContext.class);
		ClientWrapper client = ctx.getBean(ClientWrapper.class);
		client.send();
		ctx.close();
	}
}
