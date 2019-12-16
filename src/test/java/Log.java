import org.openqa.selenium.WebDriver;

public class Log {
    private WebDriver driver;
    public Log(WebDriver driver) {this.driver = driver; }

    String auth = "Authentication functional test ";

    String tc = "Test case ";
    String fail = " failed. Registration is not passed";
    String ps = " passed successful";
    String e = "Entering ";
    String msgIs = " field. Error message is...";

    public void missing() {System.out.println("  missing!");}

    //Test case 1
    public void test1start () {System.out.println (auth+"1, all valid data");}
    public void test1fail () {System.out.println (tc+"1"+fail);notify ();}
    public void test1finish () {System.out.println (tc+"1"+ps);}
    //Test case 2
    String tstFail = "\n" + "Test case 2 failed";
    String error = "Field cannot be empty";
    String errMsg = " field error message is...";
    public void test2start () {System.out.println (auth+"2, 'All fields are required to fill'");}
    public void errorShown (){System.out.println ("  visible");}
    public void test2fail () {System.out.println ("  missing!" + tstFail);notify ();}
    public void test2finish () {System.out.println (tc+"2"+ps);}
    //Test case 3
    public void test3start () {System.out.println (auth+"3, Emaill address field");}
    String email = "in Email address";
    public void test3numbers () {System.out.println (e+"'numbers_only'"+email+msgIs);}
    public void test3symbols () {System.out.println (e+"'symbols_only'"+email+msgIs);}
    public void test3letters () {System.out.println (e+"'letters_only'"+email+msgIs);}
    public void test3fail () {System.out.println (tc+"3"+fail);notify ();}
    public void test3finish () {System.out.println (tc+"3"+ps);}
    //Test case 4
    String firstName = "in FirstName";
    public void test4start () {System.out.println (auth+"4, FirstName field");}
    public void test4lowReg () {System.out.println (e+"'lower_register'"+firstName+msgIs);}
    public void test4symbols () {System.out.println (e+"'symbols_only'"+firstName+msgIs);}
    public void test4numbers () {System.out.println (e+"'numbers_only'"+firstName+msgIs);}
    public void test4letters40 () {System.out.println (e+"'40_letters'"+firstName+msgIs);}
    public void test4fail () {System.out.println (tc+"4"+fail);notify ();}
    public void test4finish () {System.out.println (tc+"4"+ps);}
    //Test case 5
    String lastname = "in LastName";
    public void test5start () {System.out.println (auth+"5, LastName field");}
    public void test5lowReg () {System.out.println (e+"'lower_register'"+lastname+msgIs);}
    public void test5symbols () {System.out.println (e+"'symbols_only'"+lastname+msgIs);}
    public void test5numbers () {System.out.println (e+"'numbers_only'"+lastname+msgIs);}
    public void test5letters20 () {System.out.println (e+"'20_letters'"+lastname+msgIs);}
    public void test5fail () {System.out.println (tc+"5"+fail);notify ();}
    public void test5finish () {System.out.println (tc+"5"+ps);}
    //Test case 6
    String password = " in UserPassword field. Password perceived as...";
    public void test6pwdWeak() {System.out.println("  weak");}
    public void test6start () {System.out.println (auth+"6, Password strength recognition");}
    public void test6strong () {System.out.println (e+"'strong_password'"+password);}
    public void test6weak () {System.out.println (e+"'weak_password'"+password);}
    public void test6normal () {System.out.println (e+"'normal_password'"+password);}
    public void test6lowerletters11 () {System.out.println (e+"'11_lower_letters'(weak password)"+password);}
    public void test6numbers11 () {System.out.println (e+"'11_numbers'(weak password)"+password);}
    public void test6finish () {System.out.println (tc+"6"+ps);}
    //Test case 7
    String phone = " in Phone";
    public void test7start () {System.out.println (auth+"7, Phone field");}
    public void test7numbers11 () {System.out.println (e+"'11_numbers'"+phone+msgIs);}
    public void test7numbers10 () {System.out.println (e+"'10_numbers'"+phone+msgIs);}
    public void test7letters () {System.out.println (e+"'letters'"+phone+msgIs);}
    public void test7symbols () {System.out.println (e+"'symbols'"+phone+msgIs);}
    public void test7fail () {System.out.println (tc+"7"+fail);notify ();}
    public void test7finish () {System.out.println (tc+"7"+ps);}
    //Test case 8
    String organization = "in Organisation";
    public void test8start () {System.out.println (auth+"8, Organisation field");}
    public void test8symbols () {System.out.println (e+"'lower_register'"+firstName+msgIs);}
    public void test8numbers () {System.out.println (e+"'lower_register'"+firstName+msgIs);}
    public void test8letters40 () {System.out.println (e+"'lower_register'"+firstName+msgIs);}
    public void test8fail () {System.out.println (tc+"8"+fail);notify ();}
    public void test8finish () {System.out.println (tc+"8"+ps);}
}
