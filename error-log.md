
<p>When reading from precompiled classes using below code. </p> 

<code>
templateEngine = TemplateEngine.createPrecompiled(Path.of("jte-classes"),ContentType.Html);
</code>


<br><br>

<div style="background-color: #f0f8ff; border-left: 4px solid #2196F3; padding: 10px;">
	<strong>Note:</strong> The below  error is occuring 
</div>
 
 <br>
<img src="src/main/webapp/assets/error.jpg" alt="Error Log" width="500" height="300"/>




<br>

<p> when using code resolver syntax. </p>

<code>
CodeResolver codeResolver = new DirectoryCodeResolver(Path.of("src/main/jte"));<br>
templateEngine = TemplateEngine.create(codeResolver, ContentType.Html);
</code>


<br><br>
<strong>Note:</strong> The below  error is occuring <br>

<code>index.jte not found (tried to load file at ${STS_INSTALLATION_LOC}\src\main\jte\index.jte)</code>

