package rs.inforce.dataapp.controllers;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import rs.inforce.dataapp.domain.TStore;
import rs.inforce.dataapp.services.TStoreService;

@RestController
public class TStoreController {

    private TStoreService tStoreService;

    public TStoreController(TStoreService tStoreService) {
        this.tStoreService = tStoreService;
    }

    @GetMapping("/stores")
    public Iterable<TStore> findAll() {
        return this.tStoreService.findAll();
    }

    @GetMapping("/storesOrdered")
    public Iterable<TStore> getOrdered() {
        return this.tStoreService.getOrderedStores();
    }

    @GetMapping("/storesPagedOrdered")
    public Page<TStore> getPagedOrderedStores(Pageable pageable) {
        return this.tStoreService.getPagedOrderedStores(pageable);
    }
}
