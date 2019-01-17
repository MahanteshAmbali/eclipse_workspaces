<%@page isELIgnored="false"%>
<%@taglib prefix="c" uri="http://www.springframework.org/tags"%>
<%@taglib prefix="f" uri="http://www.springframework.org/tags/form"%>

<f:form commandName="loginForm">
	<c:message code="loginForm.username" />
	<c:bind path="loginForm.username">
		<input type="text" name="username" value='${status.value}' />${status.errorMessage}</br>
	</c:bind>
	</br>

	<c:message code="loginForm.password" />
	<c:bind path="loginForm.password">
		<input type="password" name="password" value='${status.value}' />${status.errorMessage}</br>
	</c:bind>
	</br>

	<input type='submit' value="Login">
</f:form>