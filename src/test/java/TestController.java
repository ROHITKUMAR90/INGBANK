import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public LoanDetails firstPage() {

		LoanDetails loan= new LoanDetails();
		loan.setId(1);
		loan.setLoanAccNum(1234);
		loan.setSecurityAddr("bangalore");
		loan.setSecurityValue(3000);
		loan.setLoanStatus("Pending");
		loan.setLoanAmount(10000.00);

		return loan;
	}
}