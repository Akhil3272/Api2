package getuser;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Endpoints {
	
	
	public static Response getuser(int page,int id)
	{
		Response res=given()
		.queryParam("page",2)
		.queryParam("id",9)
		.when()
		.get(GetUserData.base);
		return res;
		
	    
		
	}
	
	public class Tests {
		
		@Test
		public void testgetuser()
		
		{
			Response res=Endpoints.getuser(2,2);
			res.then().log().all();
			Assert.assertEquals(res.getStatusCode(),200);
		
		

	}
	}
	

}

