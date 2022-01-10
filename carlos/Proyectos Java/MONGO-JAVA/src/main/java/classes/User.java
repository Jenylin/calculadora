
package classes;


public class User {
    private int idUser;
    private String userNames;
    private String lastNames;
    private String email;
    private String cellPhone;
    
    public User () {
        
    }

  
    public User(int idUser) {
        this.idUser = idUser;
    }

    public User(int idUser, String userNames, String lastNames, String email, String cellPhone) {
        this.idUser = idUser;
        this.userNames = userNames;
        this.lastNames = lastNames;
        this.email = email;
        this.cellPhone = cellPhone;
    }

    public User(String userNames, String lastNames, String email, String cellPhone) {
        this.userNames = userNames;
        this.lastNames = lastNames;
        this.email = email;
        this.cellPhone = cellPhone;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUserNames() {
        return userNames;
    }

    public void setUserNames(String userNames) {
        this.userNames = userNames;
    }

    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    @Override
    public String toString() {
        return "User{" + "idUser=" + idUser + ", userNames=" + userNames + ", lastNames=" + lastNames + ", email=" + email + ", "
                + "cellPhone=" + cellPhone + '}';
    }

    
    
    
    
}
