class User {
    private String username;
    private String password;

    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    public void login(String username, String password){
        if(this.username.toLowerCase().equals(username.toLowerCase()) && this.password.equals(password))
        {
            System.out.println("Access granted to " + this.username );
        }
        else{
            System.out.println("Invalid credentials!");
        }
    }
}

class Main{
    public static void main(String args[]){
        //This creates a new user with id and password provided by user
        User access = new User("GiveAccess", "noclue");
        //authenticates the credentials and allows access if credentials are verified which is the case below
        access.login("GiveAccess","noclue");
        // the credentials are invalid so will not give access
        access.login("GiveAccess","nahibatayega");

    }
}


