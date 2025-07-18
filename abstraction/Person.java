package abstraction;

public abstract class Person implements UniversityMember {
String name;
int id;
public Person(String name,int id) {
	this.name=name;
	this.id=id;
}
}
