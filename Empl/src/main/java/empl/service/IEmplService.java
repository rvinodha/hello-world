

package empl.service;

import empl.bean.Empl;
import java.util.List;

public interface IEmplService {

    public List<Empl> findAll();
    public Empl findById(Long id);
}