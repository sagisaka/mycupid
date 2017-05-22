package mycupid;

import java.io.IOException;

import javax.script.ScriptException;

import mycupid.delivery.Deliverd;

@SuppressWarnings("restriction")
public class Main {
	public void run() throws IOException, ScriptException{
		Deliverd del = new Deliverd();
		System.out.println("x");
		del.deliverd();
	}
	public static void main(String[] args) throws IOException, ScriptException{
		Main main = new Main();
		main.run();
	}
}
