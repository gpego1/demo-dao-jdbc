package application;
import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.dao.SellerDAO;
import model.entities.Seller;

import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Type the id seller you wanna search for: ");
        Integer idSeller = sc.nextInt();

        SellerDAO sellerDAO = DaoFactory.createSellerDao();
        Seller seller = sellerDAO.findById(idSeller);
        System.out.println(seller);

        DepartmentDAO departmentDAO = DaoFactory.createDepartmentDao();

    }
}
