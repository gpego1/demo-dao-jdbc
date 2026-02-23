package application;
import model.dao.DaoFactory;
import model.dao.DepartmentDAO;
import model.dao.SellerDAO;
import model.entities.Department;
import model.entities.Seller;

import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class Program {
    public static void main(String[] args) {
        var sc = new Scanner(System.in);
//
//        System.out.println("Type the id seller you wanna search for: ");
//        Integer idSeller = sc.nextInt();

        SellerDAO sellerDAO = DaoFactory.createSellerDao();
//        Seller seller = sellerDAO.findById(idSeller);
//        System.out.println(seller);
//
//        System.out.println("\n=== TEST: Seller: findByDepartment =======");
        var department = new Department(2, null);
//        List<Seller> listSellers = sellerDAO.findByDepartment(department);
//        System.out.println(listSellers);
//
//        System.out.println("\n=== TEST: Seller: findAll =======");
//        List<Seller> findAll = sellerDAO.findAll();
//        System.out.println(findAll);

        System.out.println("\n=== TEST: Seller: INSERT =======");
        var newSeller = new Seller(null, "greg","greg@email.com",new Date(), 400.00, department);
        sellerDAO.insert(newSeller);
        System.out.println("created seller: " + newSeller.getId());


    }
}
