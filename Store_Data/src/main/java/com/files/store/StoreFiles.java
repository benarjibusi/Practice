package com.files.store;

import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;



/**
 * Servlet implementation class StoreFiles
 */
@WebServlet("/StoreFiles")
@MultipartConfig(maxFileSize = 16177215)
public class StoreFiles extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	public StoreFiles() {
		System.out.println(" Haiii");
		
		// TODO Auto-generated constructor stub
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int uid = Integer.parseInt(request.getParameter("uid"));
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		InputStream inputStream = null; // input stream of the upload file

		// obtains the upload file part in this multipart request
		Part filePart = request.getPart("photo");
		if (filePart != null) {
			// prints out some information for debugging
			System.out.println(filePart.getName());
			System.out.println(filePart.getSize());
			System.out.println(filePart.getContentType());

			// obtains input stream of the upload file
			inputStream = filePart.getInputStream();
		}


		

		try {
			// connects to the database
			Class.forName("oracle.jdbc.driver.OracleDriver");
			java.sql.Connection connection =DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","Ben","Ben");
			

			// constructs SQL statement
			String sql = "INSERT INTO storefiles  values (?, ?, ?, ?)";
			PreparedStatement statement = connection.prepareStatement(sql);
			statement.setInt(1, uid);
			statement.setString(2, name);
			statement.setString(3, email);

			if (inputStream != null) {
				// fetches input stream of the upload file for the blob column
				statement.setBlob(4, inputStream);
			}

			// sends the statement to the database server
			int row = statement.executeUpdate();
			if (row > 0) {
				String message = "File uploaded and saved into database";
			}
		} catch (SQLException | ClassNotFoundException ex) {
			String message = "ERROR: " + ex.getMessage();
			ex.printStackTrace();
		} finally {
//			if (connection != null) {
//				// closes the database connection
//				try {
//					conn.close();
//				} catch (SQLException ex) {
//					ex.printStackTrace();
//				}
			}

			// sets the message in request scope
			

			// forwards to the message page
			getServletContext().getRequestDispatcher("/Storefiles.jsp").forward(request, response);
		}
	}


