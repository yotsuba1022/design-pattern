package idv.design.pattern.builder.example1;

import java.util.Collection;
import java.util.Map;

/**
 * @author Carl Lu
 */
public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(ExportHeaderModel headerModel,
                          Map<String, Collection<ExportDataModel>> bodyData,
                          ExportFooterModel footerModel) {
        builder.buildHeader(headerModel);
        builder.buildBody(bodyData);
        builder.buildFooter(footerModel);
    }

}
