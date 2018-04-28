
public class Hello {
private String name;
private String emailId;


@Override
public String toString() {
	return "Hello [name=" + name + ", emailId=" + emailId + "]";
}

public String getEmailId() {
	return emailId;
}

public void setEmailId(String emailId) {
	this.emailId = emailId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public void printHello(){
	System.out.println("hello" + name);
}
}
