package bao;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.annotation.ModelAndViewResolver;
@Controller
public class AdditionController {
	@RequestMapping("/add")
	public String add()
	{
		return "addition";
	}
	  @RequestMapping("/addlogic")
	public ModelAndView addlogic(HttpServletRequest request,HttpServletResponse response)
	{
		int num1=Integer.parseInt(request.getParameter("txtnum1"));
		int num2=Integer.parseInt(request.getParameter("txtnum2"));
		int num3=num1+num2;
		return new ModelAndView("addition","key",num3);
	}
}
