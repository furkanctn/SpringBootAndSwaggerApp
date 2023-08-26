package JavaKodlama.northwind.Business.Abstract;

import JavaKodlama.northwind.Core.entities.User;
import JavaKodlama.northwind.Core.utilities.results.DataResult;
import JavaKodlama.northwind.Core.utilities.results.result;

public interface UserService {
	result add(User user);
	DataResult<User> findByEmail(String email);
}
