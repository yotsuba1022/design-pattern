package idv.design.pattern.adapter.example2;

import java.util.List;

/**
 * @author Carl Lu
 */
public interface LogFileOperateApi {

    public List<LogModel> readLogFile();

    public void writeLogFile(List<LogModel> list);

}
