package empl.service;



import empl.bean.Empl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

@Service
public class EmpService implements IEmplService {

    @Autowired
    private JdbcTemplate jtm;

    //@Override
    public List<Empl> findAll() {

        String sql = "SELECT * FROM EMP";

        List<Empl> cities = jtm.query(sql, new BeanPropertyRowMapper(Empl.class));

        return cities;
    }

   // @Override
    public Empl findById(Long id) {

        String sql = "SELECT * FROM EMP WHERE ID=?";

        Empl empl = (Empl) jtm.queryForObject(sql, new Object[]{id},
                new BeanPropertyRowMapper(Empl.class));

        return empl;
    }
}
