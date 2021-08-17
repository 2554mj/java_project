package 상속;

public class GiantBaby extends Baby{
    int weight;
    
	public void growth() {
		System.out.println("성장을 잘한다>0<");
	}

	@Override
	public String toString() {
		return "GiantBaby [weight=" + weight + ", young=" + young + ", name=" + name + ", age=" + age + "]";
	}

}
