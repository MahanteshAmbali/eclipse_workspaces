<%@ page import = "java.sql.*" %>
<%
	String userName=request.getParameter("username");
	String passWord=request.getParameter("password");
	String errMsg="";

	if(userName!=null&&userName.length()!=0&&passWord!=null&&passWord.length()!=0){
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		boolean status = false;

		try{
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "Password123#");

			stmt = con.createStatement();

			String sql = "select * from users where username= '"+userName+"' and password= '"+passWord+"'";

			rs = stmt.executeQuery(sql);
			status = rs.next();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			try{
				if(stmt != null){
					stmt.close();
					stmt = null;
				}
			}catch(Exception e){
				e.printStackTrace();
			}

			/* try{
				if(con != null){
					con.close();
					con = null;
				}
			}catch(Excpetion e){
				e.printStactTrace();
			} */ 
		}if(status){
			RequestDispatcher rd= request.getRequestDispatcher("loginSuccess.jsp");
			rd.forward(request, response);
		}else{
			errMsg = "login failed";
		}

	}
%>

<%=errMsg %>

<form>
	Username: 
		<input type = 'text' name = 'username'/></br></br>
	Password:
		<input type = 'password' name = 'password'></br></br>

		<input type = 'submit' value = 'Submit'>
</form>