package JavaKodlama.northwind.Business.Abstract;

import java.util.List;


import JavaKodlama.northwind.Core.utilities.results.DataResult;
import JavaKodlama.northwind.Core.utilities.results.result;
import JavaKodlama.northwind.Entities.Concretes.Product;
import JavaKodlama.northwind.Entities.dtos.ProductWithCategoryDto;

public interface CustomerService {
	DataResult <List< Product>>getAll();
	DataResult <List< Product>>getAllSorted();
	DataResult <List< Product>>getAll(int pageNo, int pageSize);

	result add(Product product);
	
	DataResult<Product> getByProductName(String productName);
	
	DataResult<Product> getByProductNameAndCategory(String productName,int categoryId);
	
	DataResult <List< Product>> getByProductNameOrCategory(String productName,int categoryId);
	
	DataResult <List< Product>> getByCategoryIn(List<Integer>categories);
	
	DataResult <List< Product>>getByProductNameContains(String productName);
	
	DataResult <List< Product>>getByProductNameStartsWith(String productName);
	
	DataResult <List< Product>>getByNameAndCategory(String productName,int categoryId);
	
	DataResult <List<ProductWithCategoryDto>> getProductWithCategoriyDetails();

	

}
