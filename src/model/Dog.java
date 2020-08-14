package model;

public class Dog implements Animial{
    private String name="dddd";
    private Integer age;
    private String food;
    private String tool;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}	
	
    public String getTool() {
		return tool;
	}
	public void setTool(String tool) {
		this.tool = tool;
	}
	public void feed(String name,String food){
    	System.out.println("小狗的名字："+name+",喜欢吃"+food);
    }
    public void play(String name,String tool){
    	System.out.println("小狗的名字："+name+",喜欢的玩具是："+tool);
    }

	public void habit() {
		// TODO Auto-generated method stub
		System.out.println("小狗的爱好！");
	}
	public void habit1(String habit) {
		// TODO Auto-generated method stub
		System.out.println("小狗的爱好:"+habit);
	}
	public Dog(String name, Integer age, String food, String tool) {
		super();
		this.name = name;
		this.age = age;
		this.food = food;
		this.tool = tool;
	}
	public Dog() {
		super();
	}
	@Override
	public String toString() {
		return "Dog [name=" + name + ", age=" + age + ", food=" + food + ", tool=" + tool + "]";
	}
	
	
}
