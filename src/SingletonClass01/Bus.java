package SingletonClass01;
// Demonstration of String Class
public class Bus {
	private static Bus instance = null;
	private Bus()  // to prevent creation of an object in other class
	{}

	public static Bus getInstance()   // helps to create are object in other class
	{
		if (instance == null){
			instance = new Bus();
			return instance ;
		}
		else return instance;
	}
}



