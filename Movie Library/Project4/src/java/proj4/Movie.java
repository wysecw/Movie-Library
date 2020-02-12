package proj4;


import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * DSA Project 4
 * @author Craig Wyse
 */

/*
* Movie class to build object from database 
*    search results
*/
public class Movie implements Serializable{
    
    private static Statement stmt = null;
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost/mysql?user=root&password=";  
    
//establish database connection
    static {
        try {
            Class.forName(DRIVER_NAME);
            Connection conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Movie.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private String id;
    private String title;
    private String dirName;
    private String dirDOB;
    private String studio;
    private String runTime;
    private String year;
    private String imdbURL;
    private String refNum;
    private String metascore;
    private String rottenTom;
    private String kw1;
    private String kw2;
    private String kw3;
   
    //no arg constructor so it can be a bean
    public Movie() throws ClassNotFoundException, SQLException {}
    
    //search the database for movie that matches keyword
    public void movieSearch(String keyword) {

        if (stmt == null) {
            return;
        }
        String query = "SELECT * from cww22.playlistcww22  WHERE keyword1 = " + "'" + keyword + "'" 
                + " OR keyword2 = " + "'" + keyword + "'" + " OR keyword3 = " + "'" + keyword + "'" + "";
        
        try {
            ResultSet rs = stmt.executeQuery(query);
            if (rs.next()) {
                setId(rs.getString(1));
                setTitle(rs.getString(2));
                setDirName(rs.getString(3));
                setDirDOB(rs.getString(4));
                setStudio(rs.getString(5));
                setRunTime(rs.getString(6));
                setYear(rs.getString(7));
                setImdbURL(rs.getString(8));
                setRefNum(rs.getString(9));
                setMetascore(rs.getString(10));
                setRottenTom(rs.getString(11));
                setKw1(rs.getString(12));
                setKw2(rs.getString(13));
                setKw3(rs.getString(14));
            }
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }

    /**
     * @return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @return the dirName
     */
    public String getDirName() {
        return dirName;
    }

    /**
     * @return the dirDOB
     */
    public String getDirDOB() {
        return dirDOB;
    }

    /**
     * @return the studio
     */
    public String getStudio() {
        return studio;
    }

    /**
     * @return the runTime
     */
    public String getRunTime() {
        return runTime;
    }

    /**
     * @return the year
     */
    public String getYear() {
        return year;
    }

    /**
     * @return the imdbURL
     */
    public String getImdbURL() {
        return imdbURL;
    }

    /**
     * @return the refNum
     */
    public String getRefNum() {
        return refNum;
    }

    /**
     * @return the metascore
     */
    public String getMetascore() {
        return metascore;
    }

    /**
     * @return the rottenTom
     */
    public String getRottenTom() {
        return rottenTom;
    }

    /**
     * @return the kw1
     */
    public String getKw1() {
        return kw1;
    }

    /**
     * @return the kw2
     */
    public String getKw2() {
        return kw2;
    }

    /**
     * @return the kw3
     */
    public String getKw3() {
        return kw3;
    }
    
     /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @param dirName the dirName to set
     */
    public void setDirName(String dirName) {
        this.dirName = dirName;
    }

    /**
     * @param dirDOB the dirDOB to set
     */
    public void setDirDOB(String dirDOB) {
        this.dirDOB = dirDOB;
    }

    /**
     * @param studio the studio to set
     */
    public void setStudio(String studio) {
        this.studio = studio;
    }

    /**
     * @param runTime the runTime to set
     */
    public void setRunTime(String runTime) {
        this.runTime = runTime;
    }

    /**
     * @param year the year to set
     */
    public void setYear(String year) {
        this.year = year;
    }

    /**
     * @param imdbURL the imdbURL to set
     */
    public void setImdbURL(String imdbURL) {
        this.imdbURL = imdbURL;
    }

    /**
     * @param refNum the refNum to set
     */
    public void setRefNum(String refNum) {
        this.refNum = refNum;
    }

    /**
     * @param metascore the metascore to set
     */
    public void setMetascore(String metascore) {
        this.metascore = metascore;
    }

    /**
     * @param rottenTom the rottenTom to set
     */
    public void setRottenTom(String rottenTom) {
        this.rottenTom = rottenTom;
    }

    /**
     * @param kw1 the kw1 to set
     */
    public void setKw1(String kw1) {
        this.kw1 = kw1;
    }

    /**
     * @param kw2 the kw2 to set
     */
    public void setKw2(String kw2) {
        this.kw2 = kw2;
    }

    /**
     * @param kw3 the kw3 to set
     */
    public void setKw3(String kw3) {
        this.kw3 = kw3;
    }
    

    
}
