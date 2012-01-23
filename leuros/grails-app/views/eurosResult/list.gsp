<html>
<head>
		<meta name="layout" content="main"/>
		<title>List of results</title>
</head>
<body>
<span class="menuButton">
<a class="home" href="${resource(dir:'')}">Home</a>
</span>


	<div class="body">
	<table>
	<thead ALIGN="CENTER">
		<th>Season</th>
		<th>Date</th>
		<th>Day</th>
		<th>1st</th>
		<th>2st</th>
		<th>3st</th>
		<th>4st</th>
		<th>5st</th>
		<th>Star1</th>
		<th>Star2</th>
		
		</thead>
		<tbody ALIGN="CENTER">
		<g:each in="${InstanceResult}" status="i" var="item">
			<tr>
				<td>
					${item.season}
				</td>
				<td>
					${item.date}
				</td>
				<td>
					${item.day}
				</td>
				<td>
					${item.ball1}
				</td>
				<td>
					${item.ball2}
				</td>
				<td>
					${item.ball3}
				</td>
				<td>
					${item.ball4}
				</td>
				<td>
					${item.ball5}
				</td>
				<td>
					${item.star1}
				</td>
				<td>
					${item.star2}
				</td>
			</tr>
		</g:each>
		</tbody>
	</table>
	</div>
</body>