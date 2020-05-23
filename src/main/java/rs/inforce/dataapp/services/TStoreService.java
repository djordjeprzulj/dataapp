package rs.inforce.dataapp.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import rs.inforce.dataapp.domain.TStore;

public interface TStoreService {

    Iterable<TStore> findAll();

    Iterable<TStore> getOrderedStores();

    Page<TStore> getPagedOrderedStores(Pageable pageable);
}
