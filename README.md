# ProductManagementSystem

## Description

This is a simple Product Management System implemented in Java using stream API. It allows you to add products with their details, such as name, type, place, and warranty. You can then perform two operations on the products:

1. Get products below a certain warranty year: You can retrieve a list of products whose warranty is less than a specified year.
2. Get products by place: You can retrieve a list of products located in a specific place.

## How it Works

The program consists of two main classes: `Main` and `ProductService`. The `Product` class represents a product and stores its attributes. The `ProductService` class is responsible for managing the products and provides methods to add products, retrieve products below a certain warranty year, and retrieve products by place.

To use the program, you can create an instance of the `ProductService` class and add products using the `addProduct` method. Then, you can call the `getProductsBelowWarranty` method and pass a year to retrieve products with warranty below that year. Similarly, you can call the `getProductsByPlace` method and pass a place to retrieve products located in that place.

The program includes a sample usage in the `main` method of the `Main` class. It adds several products, demonstrates retrieving products below a warranty year, and retrieving products by place.

The getProductsBelowWarranty and getProductsByPlace methods in the ProductService class use the Stream API's filter operation to perform the filtering. The toList method is used to collect the filtered elements into a new list.It enhances readability, promotes code reusability, and can potentially improve performance.


## Contributing

Contributions are welcome
