package stepdefs;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import app.Calculator;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Calculatorstepdefs {
	Calculator calc;
	int result;

	@Given("I have the Calculator")
	public void i_have_the_Calculator() {
	    // Write code here that turns the phrase above into concrete actions
		calc = new Calculator();
	   
	}

	@When("I add {int} and {int}")
	public void i_add_and(Integer num1, Integer num2 ) {
	    // Write code here that turns the phrase above into concrete actions
		result = calc.Add(num1, num2);

	
	}

	@Then("Should get the Result as {int}")
	public void should_get_the_Result_as(int expResult) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(expResult, result);
	  
	}
	@When("I sub {int} and {int}")
	public void i_sub_and(Integer num1, Integer num2) {
	    // Write code here that turns the phrase above into concrete actions
		result = calc.Sub(num1, num2);

	
	}
	@When("Add below Nembers")
	public void add_below_Nembers(List<Integer> numbers) {
		
		for(int num:numbers) {
			
			result = calc.Add(num, result); //88
			
		}

	}
	@When("Buying below items with given price")
	public void buying_below_items_with_given_price(Map<String,Integer>items ) {
		
     for(int value:items.values()) {
			
			result = calc.Add(value, result);
		}
	   
		
	}
	@When("Buying below items with given price and quantity")
	public void buying_below_items_with_given_price_and_quantity(io.cucumber.datatable.DataTable dataTable) {
	    int rows=dataTable.height();
     for(int i=0;i<rows;i++) {
			
			int qnt = Integer.parseInt(dataTable.cell(i, 1));
			int price = Integer.parseInt(dataTable.cell(i,2));
			
			result = calc.Add( qnt*price , result);
		}

	}

	
	}



	



