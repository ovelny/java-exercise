package controller;

public class StockController {
	public static getCategories() {
		return Category[];
	}
	
	public static getCategoryById(int id) {
		return Category;
	}
	
	public static createCategory(String label) {
		return Category;
	}
	
	public static updateCategory(Category category, String label) {
		return Category;
	}
	
	public static void deleteCategory(Category category) {
		
	}
	
	public static getProducts() {
		return Product[];
	}
	
	public static getProductsByCategory(Category category) {
		return Product[];
	}
	
	public static getProductById(int id) {
		return Product;
	}
	
	public static createProduct(String name, String description, float purchasingPrice, int quantity, Category category) {
		return Product;
	}
	
	public static updateProduct (Product product, String name, String description, float purchasingPrice, int quantity, Category category) {
		return Product;
	}
	
	public static deleteProduct(Product product) {
		return Product;
	}
	
	public static void loadProductsFromFile() {
		
	}
}
