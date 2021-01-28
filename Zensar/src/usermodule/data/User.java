package usermodule.data;

public class User 
{
     String userName;
     String password;
     String securityQ;
     String securityA;
     
     public User(String userName, String password, String securityQ, String securityA)
     {
    	 setUserName(userName);
    	 setPass(password);
    	 this.securityQ=securityQ;
    	 this.securityA=securityA;
     }
     
     public void setUserName(String userName)
     {    String name=userName;
     
    	 if(name.length()>5)
    	 {
    		 System.out.println("username too long!");
    	 }
    	 
    	 else
    		 this.userName=userName;
     }
     

     public void setPass(String password)
     { String pass=password;
    	 if(pass.length()>15)
    	 {
    		 System.out.println("password too long!");
    	 }
    	 else
    		 this.password=password;
     }

     public void setSecurityQ(String securityQ)
     {
    	 this.securityQ=securityQ;
     }
     public void setSecurityA(String securityA)
     {
    	 this.securityA=securityA;
     }
     
     public String getUserName()
     {
    	 return userName;
     }
     

     public String getPass()
     {

    	 return password;
     }

     public String getSecurityQ()
     {
    	 return securityQ;
     }
     public String getSecurityA()
     {
    	 return securityA;
     }
     
     public String toString()
     {
    	 return "username:" +userName+ "\n"+"password:"+password+"\n"+"security question"+securityQ+"\n"+"security answer"+securityA;
     }
}
