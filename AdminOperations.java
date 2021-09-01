public class AdminOperations {
    void login(){
        IDandPasswords idandPasswords = new IDandPasswords();
        
        TempLoginPage loginPage = new TempLoginPage(idandPasswords.getLoginInfo());
    }
}
