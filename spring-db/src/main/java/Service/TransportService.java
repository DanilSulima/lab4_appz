package Service;
import Entity.Transport;
import Repository.TransportRepository;
import com.sun.jdi.connect.spi.TransportService;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TransportServiceImpl implements TransportService {
    private final TransportRepository studentRepository;
    @Override
    public List<Transport> findAll() {
        return TransportRepository.findAll();
    }
}

