<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="com" class="com.OpennlpParser" scope="session" />
<jsp:setProperty name="com" property="*" />

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet">

<!-- Fav and touch icons -->
<link rel="apple-touch-icon-precomposed" sizes="144x144"
	href="img/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114"
	href="img/apple-touch-icon-114-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="72x72"
	href="img/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed"
	href="img/apple-touch-icon-57-precomposed.png">
<link rel="shortcut icon" href="img/favicon.png">

<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/scripts.js"></script>
<script type="text/javascript" src="js/custom.js"></script>

<title>HAM</title>
</head>
<body style="background-color:#D6EBFF">
	<div class="container">
		<div class="row clearfix">
			<br>
			<div class="col-md-12 column">
				<div class="tabbable" id="tabs-750021">
					<ul class="nav nav-tabs">
						<li class="active"><a href="#panel-281066" data-toggle="tab">Natural
								Language Processing </a></li>
						<li>
						<a href="#panel-865664" data-toggle="tab">Domain Specific Language </a>
					</li>
					</ul>

					<div class="tab-content">
						<br>
						<div class="tab-pane active" id="panel-281066">
							<div class="container">
								<div class="row clearfix">
									<div class="col-md-1 column"></div>
									<div class="col-md-8 column">

										<form role="form" METHOD=POST action="link.jsp">
											<div class="form-group">
												<label for="powerInput">Add / Search Incidents</label><input
													value="retrieve robbery in area 121 reported by user 435"
													type="text" class="form-control" id="myCommand"
													name="myCommand" />
											</div>

											<button type="submit" class="btn btn-default">Submit</button>
										</form>


									</div>
									<div class="col-md-3 column"></div>
								</div>
							</div>


						</div>
						<div class="tab-pane" id="panel-865664">
							<div class="container">
								<div class="row clearfix">
									<div class="col-md-1 column"></div>
									<div class="col-md-7 column">
										<form role="form" action="MyServlet">
											<div class="form-group">
												<label for="incidentInput">Incident</label><input
													value="Robbery" type="text" class="form-control"
													id="incidentInput" />
											</div>
											<div class="form-group">
												<label for="locationInput">Location</label><input
													value="area 121" type="text" class="form-control"
													id="locationInput" />
											</div>
											<div class="form-group">
												<label for="userInput">User</label><input value="user 435"
													type="text" class="form-control" id="userInput" />
											</div>

											<button type="submit" class="btn btn-default">Submit</button>
										</form>
									</div>
									<div class="col-md-4 column"></div>
								</div>
							</div>
						</div>


					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>