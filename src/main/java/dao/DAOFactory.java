package dao;

public class DAOFactory {


    private static DAOFactory daofactory;

    public static synchronized DAOFactory getInstance() throws Exception {
        if (daofactory == null)
            daofactory = new DAOFactory();
        return daofactory;
    }

    public synchronized UserDAOImpl getUserDAOImpl() {
        return new UserDAOImpl();
    }


}
