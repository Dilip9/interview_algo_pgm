package org.example.interviewedpgm;

public class Loxigrid {
    // Scenario based questions.
    //sql query
    /**
     * Design an entity model for a Logistics Management System with the following relationships:
     * Entities:
     *      Order: Represents a customer's order.
     *      Customer: Stores customer information.
     *      Product: Represents products available for orders.
     *      Warehouse: Represents the storage location of products.
     *      Shipment: Tracks the delivery of orders.
     * Relationships:
     *      An Order is placed by a single Customer but can contain multiple Products.
     *      Each Product is stored in one Warehouse, but a Warehouse can store multiple Products.
     *      Each Order generates a Shipment, and a Shipment is linked to one Order.
     * Database Schema:
     *      Customer: CustomerID (PK), Name, Email, Phone
     *      Order: OrderID (PK), CustomerID (FK), OrderDate, TotalAmount
     *      Product: ProductID (PK), ProductName, Price, WarehouseID (FK)
     *      Warehouse: WarehouseID (PK), Location, Capacity
     *      Shipment: ShipmentID (PK), OrderID (FK), ShipmentDate, Status
     *
     * Question A) Write a query to find all products stored in a specific warehouse, including their price and warehouse location.
     * Question B) How would you calculate the total number of products in each warehouse?
     * Question C) How would you create a trigger to automatically update the Status of a Shipment to "Shipped" when the shipment date is set?
     * Answer
     *          A) select p.ProductName, p.Price, w.Location from Product p join warehouse w on p.WarehouseID = w.WarehouseID where w.Location = 'specific_location';
     *          B) select w.warehouseId, count(p.productId) as TotalProducts from warehouse w left join product p on w.warehouseId = p.warehouseId group by w.warehouseId;
     *          C) create trigger update_shipment_status before insert on shipment for each row begin if new.shipmentDate is not null then set new.status = "Shipped"; end if; end;
     * **/
    public static void main(String[] args) {

        /**
         *The system should include an inner class Transaction within BankAccount to log each transaction (deposit or withdrawal). The Transaction class should store details like the transaction type, amount, and timestamp.
         * Question A)  write a Java program to implement the above requirements.
         *      Your code should:
         *              Define the classes and their relationships.
         *              Include proper method overrides and exception handling.
         *              Demonstrate polymorphism by printing account details for different account types.
         *              Use the inner class Transaction to log at least one deposit and one withdrawal.
         *
         */




    }


}
