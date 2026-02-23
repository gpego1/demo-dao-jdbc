package application;
import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.dao.SellerDAO;


public class Program {
    public static void main(String[] args) {

        SellerDAO sellerDAO = DaoFactory.createSellerDao();
        DepartmentDAO departmentDAO = DaoFactory.createDepartmentDao();

    }
}
