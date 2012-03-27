package api.cloudfoundry.com;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import javax.servlet.ServletException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Handles requests for the application home page.
 */
@Controller
@RequestMapping(value = "/kyouhananohi")
public class HomeController {

	private static final Logger logger = LoggerFactory
			.getLogger(HomeController.class);

	private FormBean form;
	
	public FormBean getForm() {
		return form;
	}
	public void setForm(FormBean form) {
		this.form = form;
	}


	@RequestMapping(method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! the client locale is " + locale.toString());

		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG,
				DateFormat.LONG, locale);

		String formattedDate = dateFormat.format(date);

		model.addAttribute("serverTime", formattedDate);

		return "home";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String home(FormBean form, BindingResult result, Model model)
			throws ServletException {
//		logger.info("form: " + form.getName() + "," + form.getMail());	
		String re = "name: " + form.getHiduke() + "<br>mail: " + form.getTodo();
		model.addAttribute("command", form);
		model.addAttribute("message", re);
		return "home";
	}

}
