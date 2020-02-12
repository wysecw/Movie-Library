<!-- 
    Document   : searchResult.jsp
    Created on : Dec 7, 2018, 12:21:02 PM
    Author     : Craig Wyse
-->
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean scope="session" id="movie" class="proj4.Movie" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <title>Movie Search</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <style>
            form{
                background-color: black;
                color: white;
                height: 250px;
                width: 500px;
                margin: auto;
                padding-top: 50px;
                padding-bottom: 50px; 
                box-sizing: border-box;

            }
            fieldset{
                margin-left: 50px;
                margin-right: 50px;
                padding-top: 50px;
                padding-bottom: 50px; 
                box-sizing: border-box;

            }
            div.output{
                 margin: auto;
                 width: 25%;
                 border: 3px solid black;
                 padding: 10px; 
            }

        </style>
    </head>
    <body style="background-color:gray">
        <div>
            <form id="searchForm" method="post" action="movieList">
                <fieldset> 
                    <legend align="center">Movie Search</legend>
                    <label for="keyword">Enter Keyword:</label>
                    <input type="text" name="keyword" id="keyword">
                    <input type="submit" value="Submit">
                </fieldset>
            </form>
        </div>
        
        <div class="output" id="d1">
            <p text-align="left" >Title: ${movie.title}</p>
            <p>Director: ${movie.dirName}</p>
            <p>Director DOB: ${movie.dirDOB}</p>
            <p>Studio: ${movie.studio}</p>
            <p>Running Time: ${movie.runTime}</p>
            <p>Year: ${movie.year}</p>
            <p>IMDB: 
            <a href="${movie.imdbURL}">${movie.refNum}</a></p>
            <p>MetaScore: ${movie.metascore}</p>
            <p>Rotten Tomatoes: ${movie.rottenTom}</p>
            <p>Keywords:</p>
            <ul>
            <li>${movie.kw1}</li>
            <li>${movie.kw2}</li>
            <li>${movie.kw3}</li>
            </ul>
            </div>

    </body>
</html>

