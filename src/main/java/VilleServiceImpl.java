import com.example.demo.deo.VilleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class VilleServiceImpl {
    @Autowired
    private VilleRepository villeRepository;

}
