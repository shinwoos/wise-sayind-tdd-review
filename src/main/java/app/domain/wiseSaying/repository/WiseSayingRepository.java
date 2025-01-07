package app.domain.wiseSaying.repository;

import app.domain.wiseSaying.WiseSaying;

import java.util.List;
import java.util.Optional;

public interface WiseSayingRepository {

    public WiseSaying save(WiseSaying wiseSaying);
    public List<WiseSaying> findAll();
    public boolean deleteById(int id);
    public Optional<WiseSaying> findById(int id);
}
