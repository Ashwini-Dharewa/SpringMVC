package details;

public class UserDetails 
{
 public String username;
 public String password;
 String t;
  
 public UserDetails(String username,String password,String t)
 {
	 this.username=username;
	 this.password=password;
	 this.t=t;
 }

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public String getT() {
	return t;
}

public void setT(String t) {
	this.t = t;
}
 


}
