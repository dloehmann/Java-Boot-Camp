package lesson4_5constructor_this;

public class Dog {
    private String name;
    private int age;
    private Person owner;

    
    public Dog(String name, int age, Person owner) {
		super();
		this.name = name;
		this.age = age;
		this.owner = owner;
	}

	public Person getOwner() {
		return owner;
	}

	public void setOwner(Person owner) {
		this.owner = owner;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    
    public void speak() {
        System.out.println("Woof");
    }
}