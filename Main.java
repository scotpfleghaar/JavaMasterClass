public class Main {
    public static void main(String[] args){
        Account bobsAccount = new Account(); //("12345",0.00,"Bob Brown","email@email.com","(555) 555-5555");
        
        System.out.println(bobsAccount.getNumber());
        bobsAccount.deposit(50.0);
        bobsAccount.deposit(51.0);
        bobsAccount.withdrawl(100.0);

        Account scotsAccount = new Account("Scot", "123456789", "hello@hello.com");
        System.out.println(scotsAccount.getNumber());
        
        
    }
}
// clear && javac Main.java && java Main