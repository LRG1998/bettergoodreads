<script>
    import '../../style/app.css'
</script>


<head>
	<meta charset="utf-8" />
    <link rel="icon" href="%sveltekit.assets%/favicon.png" />
    <link rel = "stylesheet" href="style/app.css">
    <meta name="viewport" content="width=device-width" />
</head>

<body data-sveltekit-preload-data = "hover">
    <div id="header">
        <h1>The Librarian</h1>
        <h3>The Internet Librarian</h3>
    </div>
    <div id = "topbar">
        <a href="../">Home</a>
        <a href="../about/" id = "active">About</a>
        <a href="#">Hover test</a>
        <input type="text" placeholder="Search...">
        <button id="SearchButton">Ask the librarian</button>
    </div>
    <div id = "body">
        <h2> About</h2>
        <span>
            The Librarian is an alternative to goodreads which was built on the idea of providing a better alternative to that platform. <br>
            The page as of writing is still under construction.
        </span>
    </div>
</body>