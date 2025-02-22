<body>

	<%@ include file="common/header.jspf"%>
	<%@ include file="common/navigation.jspf"%>

	<div class="container">
	
		<h1 style="color: #f9851f">Enter Todo Details!</h1>
	
		<form:form method="post" modelAttribute="todo">

			<fieldset class="mb-3">
				<form:label path="description">
					<b>Description</b>
				</form:label>
				<form:input type="text" path="description" required="required" />
				<form:errors path="description" cssClass="text-warning" />
			</fieldset>

			<fieldset class="mb-3">
				<form:label path="targetDate">
					<b>Target Date</b>
				</form:label>
				<form:input type="text" path="targetDate" required="required" />
				<form:errors path="targetDate" cssClass="text-warning" />
			</fieldset>

			<form:input type="hidden" path="id" />
			<form:input type="hidden" path="done" />
			<input type="submit" class="btn btn-success" />

		</form:form>

	</div>

	<%@ include file="common/footer.jspf"%>


	<script type="text/javascript">
		$('#targetDate').datepicker({
			format : 'yyyy-mm-dd'
		});
	</script>


</body>
</html>