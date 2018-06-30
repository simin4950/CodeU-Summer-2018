package codeu.controller;

import java.io.IOException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import codeu.controller.AdminServlet;
import codeu.model.data.Conversation;
import codeu.model.data.Message;
import codeu.model.data.User;
import codeu.model.store.basic.ConversationStore;
import codeu.model.store.basic.MessageStore;
import codeu.model.store.basic.UserStore;

public class AdminServletTest {
	  private AdminServlet adminServlet;
	  private HttpServletRequest mockRequest;
	  private HttpServletResponse mockResponse;
	  private RequestDispatcher mockRequestDispatcher;
	  
	  @Before
	  public void setup() {
	   adminServlet = new AdminServlet(); 
	   mockRequest = Mockito.mock(HttpServletRequest.class);
	   mockResponse = Mockito.mock(HttpServletResponse.class);
	   mockRequestDispatcher = Mockito.mock(RequestDispatcher.class);
	   Mockito.when(mockRequest.getRequestDispatcher("/WEB-INF/view/admin")).thenReturn(mockRequestDispatcher);
	  }

	  @Test
	  public void testDoGet() throws IOException, ServletException {
		adminServlet.doGet(mockRequest, mockResponse);
		Mockito.verify(mockRequestDispatcher).forward(mockRequest, mockResponse);
	  }
	  
}
