package cubes.main.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import cubes.main.dao.CategoryDAO;
import cubes.main.dao.EmployeeDAO;
import cubes.main.dao.ProductDAO;
import cubes.main.dao.ReservationDAO;
import cubes.main.dao.TagDAO;
import cubes.main.entity.Category;
import cubes.main.entity.Employee;
import cubes.main.entity.Product;
import cubes.main.entity.Reservation;
import cubes.main.entity.Tag;
import cubes.main.exceptions.NotFoundException;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/api")
public class RestController {
	
	
	@Autowired
	private CategoryDAO categoryDAO;	
	
	@Autowired
	private TagDAO tagDAO;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Autowired
	private ReservationDAO reservationDAO;

	
	@GetMapping("/categories")
	public List<Category> getCategories() {
		
		List<Category> list = categoryDAO.getCategoryList();
		
		return list;
	}
	
	@GetMapping("/categories/{id}")
	public Category getCategoriyById(@PathVariable int id) {
		
		Category category = categoryDAO.getCategory(id);
		
		if (category == null) {
			throw new NotFoundException("There is no category for the selected id - "+id);
		}
		
		return category;
	}	
	
	@PostMapping("/categories")
	public Category addCategory(@RequestBody Category category) {
		
		category.setId(0);		
		categoryDAO.saveCategory(category);
		
		return category;
	}
	
	@PutMapping("/categories")
	public Category updateCategory(@RequestBody Category category) {		
	
		categoryDAO.saveCategory(category);
		
		return category;
	}	
	
	@DeleteMapping("/categories/{id}")
	public MessageResponse deleteCategory(@PathVariable int id) {		
	
		Category category = categoryDAO.getCategory(id);
		
		if (category == null) {
			throw new NotFoundException("No category");
		}
		
		categoryDAO.deleteCategory(id);
		
		return new MessageResponse(HttpStatus.OK.value(), "Delete success", System.currentTimeMillis());
	}	
	
	//////////////////////	
	
	
	@GetMapping("/tags")
	public List<Tag> getTags() {
		
		List<Tag> list = tagDAO.getTagList();
		
		return list;
	}
	
	@GetMapping("/tags/{id}")
	public Tag getTagById(@PathVariable int id) {
		
		Tag tag = tagDAO.getTag(id);
		
		if (tag == null) {
			throw new NotFoundException("There is no tag for the selected id - "+id);
		}
		
		return tag;
	}	
	
	@PostMapping("/tags")
	public Tag addTag(@RequestBody Tag tag) {
		
		tag.setId(0);		
		tagDAO.saveTag(tag);
		
		return tag;
	}
	
	@PutMapping("/tags")
	public Tag updateTag(@RequestBody Tag tag) {		
	
		tagDAO.saveTag(tag);
		
		return tag;
	}
	
	@DeleteMapping("/tags/{id}")
	public MessageResponse deleteTag(@PathVariable int id) {		
	
		Tag tag = tagDAO.getTag(id);
		
		if (tag == null) {
			throw new NotFoundException("No tag");
		}
		
		tagDAO.deleteTag(id);
		
		return new MessageResponse(HttpStatus.OK.value(), "Delete success", System.currentTimeMillis());
	}
	
	//////////////////////
	
	
	@GetMapping("/products")
	public List<Product> getProducts() {
		
		List<Product> list = productDAO.getProductList();
		
		return list;
	}
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable int id) {
		
		Product product = productDAO.getProduct(id);
		
		if (product == null) {
			throw new NotFoundException("There is no product for the selected id - "+id);
		}
		
		return product;
	}	
	
	@PostMapping("/products")
	public Product addProduct(@RequestBody Product tag) {
		
		tag.setId(0);		
		productDAO.saveProduct(tag);
		
		return tag;
	}
	
	@PutMapping("/products")
	public Product updateProduct(@RequestBody Product tag) {		
	
		productDAO.saveProduct(tag);
		
		return tag;
	}
	
	@DeleteMapping("/products/{id}")
	public MessageResponse deleteProduct(@PathVariable int id) {		
	
		Product product = productDAO.getProduct(id);
		
		if (product == null) {
			throw new NotFoundException("No product");
		}
		
		productDAO.deleteProduct(id);
		
		return new MessageResponse(HttpStatus.OK.value(), "Delete success", System.currentTimeMillis());
	}
	
	//////////////////////
	
	
	@GetMapping("/employee")
	public List<Employee> getEmployee() {
		
		List<Employee> list = employeeDAO.getEmployeeList();
		
		return list;
	}
	
	@GetMapping("/employee/{id}")
	public Employee getEmployeeById(@PathVariable int id) {
		
		Employee employee = employeeDAO.getEmployee(id);
		
		if (employee == null) {
			throw new NotFoundException("There is no employee for the selected id - "+id);
		}
		
		return employee;
	}	
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		
		employee.setId(0);		
		employeeDAO.saveEmployee(employee);
		
		return employee;
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {		
	
		employeeDAO.saveEmployee(employee);
		
		return employee;
	}
	
	@DeleteMapping("/employee/{id}")
	public MessageResponse deleteEmployee(@PathVariable int id) {		
	
		Employee employee = employeeDAO.getEmployee(id);
		
		if (employee == null) {
			throw new NotFoundException("No product");
		}
		
		employeeDAO.deleteEmployee(id);
		
		return new MessageResponse(HttpStatus.OK.value(), "Delete success", System.currentTimeMillis());
	}
	
	//////////////////////
	
	
	@GetMapping("/reservations/{id}")
	public Reservation getReservationById(@PathVariable int id) {
		
		Reservation reservation = reservationDAO.getReservation(id);
		
		if (reservation == null) {
			throw new NotFoundException("There is no category for the selected id - "+id);
		}
		
		return reservation;
	}	
	
	
	

}
