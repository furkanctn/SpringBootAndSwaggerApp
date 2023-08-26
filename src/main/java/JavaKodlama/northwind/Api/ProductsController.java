package JavaKodlama.northwind.Api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import JavaKodlama.northwind.Business.Abstract.CustomerService;
import JavaKodlama.northwind.Core.utilities.results.DataResult;
import JavaKodlama.northwind.Core.utilities.results.SuccessDataResult;
import JavaKodlama.northwind.Core.utilities.results.result;
import JavaKodlama.northwind.Entities.Concretes.Product;
import JavaKodlama.northwind.Entities.dtos.ProductWithCategoryDto;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
	
	private CustomerService productService;
	
	@Autowired
	public ProductsController(CustomerService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/getall")
	public DataResult<List<Product>> getAll(){
		return this.productService.getAll();
	}
	@PostMapping("/add")
	public result add(@RequestBody Product product) {
		return this.productService.add(product);
	}
	@GetMapping("/getByProductName")
	public DataResult<Product>getByProductName(@RequestParam String productName){
		return this.productService.getByProductName(productName);
	}
	@GetMapping("/getByProductNameAndCategoryId")

	public DataResult<Product>getByProductNameAndCategoryId(@RequestParam ("productName")String productName,@RequestParam("categoryId") int categoryId){
		return this.productService.getByProductNameAndCategory(productName,categoryId);
	}
	@GetMapping("/getByProductNameContains")
	public DataResult<List<Product>> getByProductNameContains(@RequestParam String productName) {
		return this.productService.getByProductNameContains(productName);

	}
	@GetMapping("/getAllByPage")
	public DataResult<List<Product>> getAll(int pageno,int pageSize) {
		return this.productService.getAll(pageno,pageSize);

	}
	@GetMapping("/getAllSorted")
	public DataResult<List<Product>> getAllSorted(){
		return this.productService.getAllSorted(); 
	}
	@GetMapping("/getProductWithCategoriyDetails")
	public DataResult<List<ProductWithCategoryDto>> getProductWithCategoriyDetails(){
		return this.productService.getProductWithCategoriyDetails();
	}
}
