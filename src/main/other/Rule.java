package main.other;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by Forrest Jones on 6/7/2016.
 */

public class Rule {

    private String prefix;
    public String getPrefix() { return prefix; }
    @XmlElement( name = "prefix" )
    public void setPrefix(String value) { prefix = value; }

    private String keyword;
    public String getKeyword() { return keyword; }
    @XmlElement( name = "keyword" )
    public void setKeyword(String value) { keyword = value; }

    private String outputFolder;
    public String getOutputFolder() { return outputFolder; }
    @XmlElement( name = "output_folder" )
    public void setOutputFolder(String value) { outputFolder = value; }

    private boolean dateSubfolder;
    public boolean getDateSubfolder() { return dateSubfolder; }
    @XmlElement ( name = "date_subfolder" )
    public void setDateSubfolder(boolean value) { dateSubfolder = value; }

    public Rule() {     }
    public Rule(String prefix, String keyword, String outputFolder, boolean dateSubfolder) {
        this.prefix = prefix;
        this.keyword = keyword;
        this.outputFolder = outputFolder;
        this.dateSubfolder = dateSubfolder;
    }
}