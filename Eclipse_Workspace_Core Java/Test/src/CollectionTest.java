import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


public class CollectionTest {

	public static void main(String[] args) {

		List<Customer> customerList = readCustomerOrderDetails();
		System.out.println(customerList);
		
		reportOfCustomerFinalOrders(customerList);
	}

	private static void reportOfCustomerFinalOrders(List<Customer> customerList) {
		Map<Customer,Integer> customerMap = new HashMap<Customer,Integer>();
		
		for(Customer customer : customerList) {
			if (customerMap.get(customer) != null ){
				Integer qty = customerMap.get(customer);
				customerMap.put(customer, customer.getQuantity()+qty);
			}
			else{
				customerMap.put(customer, customer.getQuantity());
			}
		}
		System.out.println(customerMap);
	}

	private static List<Customer> readCustomerOrderDetails() {
		//read all customer order details from keyboard.
		
		System.out.println("How many customer orders do"
				+ " you have ?");
		Scanner inputData = new Scanner(System.in);
		int noOfOrders = inputData.nextInt();

		List<Customer> customerList = new ArrayList<Customer>();
	
		for(int i=0; i<noOfOrders ; i++){
			//read customer order details of a specific customer and populate
			//customer object.
			
			System.out.println("Enter customer Id::");
			String customerId = inputData.next();
			System.out.println("Enter customer Name::");
			String customerName = inputData.next();
			System.out.println("Enter Customer Location::");
			String customerLocation = inputData.next();
			System.out.println("Enter ProductQty::");
			int productQty = inputData.nextInt();
			System.out.println("Enter Product Name::");
			String productName = inputData.next();
			
			Customer customer = new Customer();
			
			customer.setCustomerId(customerId);
			customer.setCustomerLocation(customerLocation);
			customer.setCustomerName(customerName);
			customer.setQuantity(productQty);
			customer.setProductName(productName);
			
			customerList.add(customer);
			
		}
		
		return customerList;
	}

}
