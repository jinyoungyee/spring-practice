package sample1;

import java.io.IOException;

public class MessageBeanImpl implements MessageBean {
	private String greeting;
	private String name;
	private Outputter outputter;
	
	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public void sayHello() {
		String message = greeting + name + "!";
		System.out.println(message);
		try{
			outputter.output(message);
		} catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public void setOutputter(Outputter outputter){
		this.outputter = outputter;
	}
	
}
