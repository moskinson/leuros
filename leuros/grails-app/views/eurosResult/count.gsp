<html>
<head>
		<meta name="layout" content="main"/>
		<title>List of results</title>
</head>
<body>
<span class="menuButton">
<a class="home" href="${resource(dir:'')}">Home</a>
</span>
<ul>
	<g:each in="${(2004..<2013)}" var="item">
	<li class="controller"><g:link controller="eurosResult" action="listCounts" params="[season : item]">${ item }</g:link></li>
	</g:each>
	<li class="controller"><g:link controller="eurosResult" action="listCounts" params="[season : 0]">All</g:link></li>
</ul>

	<div class="body">
	<table>
	<thead ALIGN="CENTER">
		<th>BALL</th>
		<th>Nº repeats</th>	
		</thead>
		<tbody ALIGN="CENTER">
		<g:each in="${InstanceResult}" status="i" var="item">
			<tr>
				<td>
					${item.key}
				</td>
				<td>
					${item.value}
				</td>
			</tr>
		</g:each>
		</tbody>
	</table>
	</div>
</body>