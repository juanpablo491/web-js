/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase2;

/**
 *
 * @author WINDOWS
 */
public class Login extends UserLogin{
    void login(String userName, String password){
    User user = DataBase.findUserByUserName(userName);
    if (user == null){
        //do something
    }
    //login process
    }
}
