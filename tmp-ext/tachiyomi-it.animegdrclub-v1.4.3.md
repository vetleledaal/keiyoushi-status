# Extension Validation Report

- Extension: tachiyomi-it.animegdrclub-v1.4.3
- Input artifact: JAR
- Generated at: 2026-09-09T19:00:00Z
- Commit: 631f55126bc39db8917c5b02dcc9d2135849c1b7+dirty
- Passed: 29
- Lint: 2
- Warnings: 1
- Skipped: 4
- Failed: 1
- Retry disposition: DO_NOT_RETRY

## Runtime Evidence

- Extension library: 1.4
- Entry point: keiyoushi.source.Generated
- Source implementation: keiyoushi.source.Generated
- Source ID: 726858430404746545
- Source name: Anime GDR Club
- Source language: it
- Selected manga input: latest offset 0: Mushoku Tensei - Isekai Ittara Honki Dasu (`.../progetto.php <redacted query values: nome>`)

| Operation | Method | Result | Entries | Selected manga | Exception | Duration |
| --- | --- | --- | ---: | --- | --- | ---: |
| popular | `fetchPopularManga(1)` | success | 133 | Absolute Duo (`.../progetto.php <redacted query values: nome>`) |  | 1-10s |
| popular_next | `fetchPopularManga(2)` | skipped | 0 |  |  | <1s |
| latest | `fetchLatestUpdates(1)` | success | 8 | Mushoku Tensei - Isekai Ittara Honki Dasu (`.../progetto.php <redacted query values: nome>`) |  | <1s |
| latest_next | `fetchLatestUpdates(2)` | skipped | 0 |  |  | <1s |
| search | `fetchSearchManga(1, query, getFilterList())` | success | 1 | Mushoku Tensei - Isekai Ittara Honki Dasu (`.../progetto.php <redacted query values: nome>`) |  | <1s |
| details | `fetchMangaDetails(manga)` | success | 1 | Mushoku Tensei - Isekai Ittara Honki Dasu (`.../progetto.php <redacted query values: nome>`) |  | 1-10s |
| chapters | `fetchChapterList(manga)` | success | 107 | Capitolo 1 (`.../readerr.php <redacted query values: nome, numcap, and nomecompleto>`) |  | 1-10s |
| pages | `fetchPageList(chapter)` | success | 41 |  |  | 1-10s |

| Check | Result | Details | Retry disposition | Retry reason | Retry condition |
| --- | --- | --- | --- | --- | --- |
| popular operation | PASS |  |  |  |  |
| popular_next operation | SKIP | hasNextPage = false |  |  |  |
| latest operation | PASS |  |  |  |  |
| latest_next operation | SKIP | hasNextPage = false |  |  |  |
| search operation | PASS |  |  |  |  |
| details operation | PASS |  |  |  |  |
| chapters operation | PASS |  |  |  |  |
| pages operation | PASS |  |  |  |  |
| popular listing | PASS | 133 entries |  |  |  |
| latest listing | PASS | 8 entries |  |  |  |
| search listing | LINT | Matched selected manga by title at result offset 0: title=Mushoku Tensei - Isekai Ittara Honki Dasu, URL=`progetto.php?nome=mushoku` |  |  |  |
| latest differs from popular | PASS |  |  |  |  |
| popular pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| latest pagination | SKIP | Page 1 does not advertise a next page |  |  |  |
| listing duplicates | FAIL | Latest page 1 repeats 3 manga entries | DO_NOT_RETRY | DETERMINISTIC_FAILURE |  |
| manga title and URL | PASS | 142/142 listing manga have titles and relative URLs |  |  |  |
| thumbnail URLs | PASS | 142/142 manga have thumbnail URLs |  |  |  |
| duplicate thumbnail URLs | UNUSUAL | Thumbnail URLs used by different manga URLs: `http://www.agcscanlation.it/.../houseki.jpg` -> 2 manga URLs (examples: `progetto.php?nome=houseki`, `.../progetto.php <redacted query values: nome>`), `http://www.agcscanlation.it/.../skeleton.jpg` -> 2 manga URLs (examples: `progetto.php?nome=skeleton`, `.../progetto.php <redacted query values: nome>`), `http://www.agcscanlation.it/.../slow.jpg` -> 2 manga URLs (examples: `progetto.php?nome=slow`, `.../progetto.php <redacted query values: nome>`), `http://www.agcscanlation.it/.../mushoku.jpg` -> 2 manga URLs (examples: `progetto.php?nome=mushoku`, `.../progetto.php <redacted query values: nome>`), `http://www.agcscanlation.it/.../sentouin.jpg` -> 2 manga URLs (examples: `progetto.php?nome=sentouin`, `.../progetto.php <redacted query values: nome>`) |  |  |  |
| thumbnail | PASS | `http://www.agcscanlation.it/.../mushoku.jpg` (image/jpeg, 79409 bytes, 300x424) |  |  |  |
| details identity | PASS | Details preserved selected URL `.../progetto.php <redacted query values: nome>` |  |  |  |
| details thumbnail URL | PASS | null |  |  |  |
| details author | PASS | null |  |  |  |
| details artist | PASS | null |  |  |  |
| details genres | PASS | Avventura, Commedia, Ecchi, Harem, Isekai, Fantasy |  |  |  |
| details status | PASS | ON_HIATUS (6) |  |  |  |
| details description | PASS | Un otaku NEET di 34 anni viene cacciato di casa dalla sua famiglia. Il ragazzo, senza uno spicciolo e poco attarente, conclude che quella sia la fine della sua vita, tuttavia realizza che potrebbe essere molto meglio se potesse superare questo lato oscuro della sua esistenza. Quando era sul punto di pentirsene, vede un camion muoversi a grande velocità e 3 studenti proprio sulla sua strada. Tirando fuori tutta la sua forza di volontà, il nostro protagonista tenta di salvarli, ma viene investito dal camion, finendo per morire. Quando riapre gli occhi, scopre di essersi reincarnato in un mondo di spade e magie come "Rudeus Greirad". Nato in un nuovo mondo, Rudeus decide di non perdere l'opportunità di vivere una nuova vita piena e soddisfacente. Così inzia l'avventura di un uomo che deve re-imparare a vivere! La battaglia tra il signore dei demoni e l'eroe continua. Quando la loro più potente magia si scontra, l'esplosione attraversa le dimensioni finendo per distruggere una classe di studenti delle superiori. Le vittime rimaste uccise,... Il protagonista Akagi Kanata, che è stato trasportato indietro nel tempo di 75 anni, dovrà partecipare a suo malgrado ad una guerra del santo Graal nel bel mezzo della seconda guerra mondiale. Leon, un ex-scrittore giapponese, si è reincarnato dentro un mondo da "otome game", disperandosi di come in questo luogo le donne dominano sugli uomini. Infatti in questo luogo gli uomini sono tutti trattati dalle ragazze come dell... Un anello fluttuante viene tramandato per generezioni nella famiglia di mikko. Suo nonno le disse che l'anello permette di riunirsi con quelli andati in un "altro mondo". Mikko inizia ad esplorare il suo mondo, un insieme ... |  |  |  |
| metadata trimming | PASS |  |  |  |  |
| chapters | PASS | 107 chapters |  |  |  |
| chapter dates | LINT | All 107 chapters lack a usable source upload timestamp: 0 (not provided or parsing failed; host uses a default date)=107 |  |  |  |
| chapter titles | PASS |  |  |  |  |
| chapter URLs | PASS |  |  |  |  |
| duplicate chapter URLs | PASS |  |  |  |  |
| page indices | PASS |  |  |  |  |
| page URLs | PASS | 41 HTTP page URLs |  |  |  |
| duplicate page URLs | PASS |  |  |  |  |
| redirects | PASS | No redirects followed |  |  |  |
| page load | PASS | `http://www.agcscanlation.it/.../1.jpg` (image/jpeg, 263344 bytes, 721x1024) |  |  |  |
