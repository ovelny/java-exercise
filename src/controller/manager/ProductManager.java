package controller.manager;


public class ProductManager {

	private int idProduct;

	public static ArrayList<Product> getProducts() {
		// TODO
	}

	public static ArrayList<Product> getProductsByCategory(Category category) {
		// TODO
	}

	public static Product getProductById(int id) {
		// TODO
	}

	public static ArrayList<Product> searchProductsByName(String searchString) {
		// TODO
	}

	public static Product createProduct(String name, String description, float purchasingPrice, int quantity, Category category) {
		// TODO
	}

	public static Product addProduct(int id, String name, String description, float purchasingPrice, int quantity, Category category) {
		// TODO
	}

	public static Product updateProduct(Product product, String name, String description, float purchasingPrice, int quantity, Category category) {
		// TODO
	}

	public static Product deleteProduct(Product product) {
		// TODO
	}

	public static void saveProductToFile(Product product) {

	}

}
