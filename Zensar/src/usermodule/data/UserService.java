package usermodule.data;

public class UserService {
    User u;
	public void signUp(String username, String password, String securityQ, String securityA)
	{ 
		 u=new User(username,password,securityQ,securityA);
		
	}
	public String signIn(String userName, String password)
	{
		String name=u.getUserName();
		String pass=u.getPass();
		if(name==userName && pass==password)
		{
			System.out.println("successfully logged in!");
			
		}
		else
			System.out.println("wrong credentials!");
		return name;
	}
    public void resetPass(String user, String password, String newPass)
    {   String name=u.getUserName();
	    String pass=u.getPass();
	    if(user==name && pass==password)
	    {u.setPass(newPass);
	    }
	    else
	    	System.out.println("account doesnt exist!");
    }
    public String forgetPass(String user,String securityQ, String securityA)
    {    String name=u.getUserName();
          String Question=u.getSecurityQ();
          String Answer=u.getSecurityA();
     if(name==user && Question==securityQ && Answer==securityA)
     {
    	 System.out.println("new password is ANU");
    	 u.setPass("ANU");
     }
     return user;
    }
    
    public String details(){
    	return u.toString();
    }
	public static void main(String[] args) {
		UserService s=new UserService();
		s.signUp("ankan", "ankana123", "Hey?", "Hi! ");
       String d=s.details();
       System.out.println(d);
       s.signIn("ankan", "ankana123");
	}

}
