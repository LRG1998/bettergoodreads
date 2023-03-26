<script>
    import '../style/app.css'
</script>


<head>
	<meta charset="utf-8" />
    <link rel="icon" href="%sveltekit.assets%/favicon.png" />
    <link rel = "stylesheet" href="style/app.css">
    <meta name="viewport" content="width=device-width" />
</head>

<body data-sveltekit-preload-data="hover">
    
    <div id="header">
        <div id="title">
            <img src = "./images/logo.png" alt="logo" id="logo">
        </div>
            <a id = "user" href="#">
                <img src="./images/default.png" alt="User Icon" id = "usericon">
                <p id = "username">%Username%</p>
            </a>
    </div>

    <div id = "topbar">
        <a href="../" id = "active">Home</a>
        <a href="../about/">About</a>
        <a href="#">Hover test</a>
        <input type="text" placeholder="Search...">
        <button id="SearchButton">Ask the librarian</button>
    </div>
    <div id="content">
        <p>
            test of the content border
        </p>
    </div>
    <div id="content">
        <p>
            test of the content border
        </p>
    </div>
    <div id="content">
        <p>
            test of the content border
        </p>
    </div>
    </body>
    <footer>
        <p>
            &copy 2023
        </p>
    </footer>
