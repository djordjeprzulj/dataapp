package rs.inforce.dataapp.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import rs.inforce.dataapp.domain.TStore;
import rs.inforce.dataapp.repositories.TStoreRepository;

@Service
public class TStoreServiceImpl implements TStoreService {

    private TStoreRepository tStoreRepository;

    public TStoreServiceImpl(TStoreRepository tStoreRepository) {
        this.tStoreRepository = tStoreRepository;
    }

    @Override
    public Iterable<TStore> findAll() {
        return this.tStoreRepository.findAll();
    }

    @Override
    public Iterable<TStore> getOrderedStores() {
        return this.tStoreRepository.findAll(Sort.by("name")
                                            .and(Sort.by("id").descending()));
    }

    public Page<TStore> getPagedOrderedStores(Pageable pageable) {
        return this.tStoreRepository.findAll(pageable);
    }
}
