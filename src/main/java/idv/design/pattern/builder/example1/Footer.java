package idv.design.pattern.builder.example1;

/**
 * @author Carl Lu
 */
public class Footer {

    public String genHeader(ExportFooterModel footerModel){
        String str = "  <Footer>" + System.lineSeparator();
        str+="    <ExportUser>"+footerModel.getExportUser()+"</ExportUser>" + System.lineSeparator();
        str+="  </Footer>" + System.lineSeparator();
        str+="</Report>" + System.lineSeparator();
        return str;
    }

}
