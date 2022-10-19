package tobi.tobiexercise03.dao;

public class UserDaoFactory {

    public UserDao awsUserDao(){
        AWSConnectionMaker awsConnectionMaker = new AWSConnectionMaker();
        UserDao userDao = new UserDao(awsConnectionMaker);
        return userDao;
    }

    /*public UserDao localUserDao(){
        UserDao userDao = new UserDao((ConnectionMaker) new LocalConnectionMaker());
    }*/

}
