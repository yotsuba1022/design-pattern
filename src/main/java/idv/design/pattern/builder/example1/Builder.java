package idv.design.pattern.builder.example1;

import java.util.Collection;
import java.util.Map;

/**
 * @author Carl Lu
 */
public interface Builder {

    public void buildHeader(ExportHeaderModel exportHeaderModel);

    public void buildBody(Map<String, Collection<ExportDataModel>> bodyData);

    public void buildFooter(ExportFooterModel exportFooterModel);

}
